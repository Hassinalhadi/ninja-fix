package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableFlatMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
    final int maxConcurrency;

    /* loaded from: classes2.dex */
    public static final class InnerObserver<T, U> extends AtomicReference<Disposable> implements Observer<U> {
        private static final long serialVersionUID = -4606175640614850599L;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id, reason: collision with root package name */
        final long f12837id;
        final MergeObserver<T, U> parent;
        volatile SimpleQueue<U> queue;

        public InnerObserver(MergeObserver<T, U> mergeObserver, long j5) {
            this.f12837id = j5;
            this.parent = mergeObserver;
        }

        public void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.parent.errors.addThrowable(th)) {
                MergeObserver<T, U> mergeObserver = this.parent;
                if (!mergeObserver.delayErrors) {
                    mergeObserver.disposeAll();
                }
                this.done = true;
                this.parent.drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(U u4) {
            if (this.fusionMode == 0) {
                this.parent.tryEmit(u4, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion(7);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MergeObserver<T, U> extends AtomicInteger implements Disposable, Observer<T> {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super U> downstream;
        final AtomicThrowable errors = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends ObservableSource<? extends U>> mapper;
        final int maxConcurrency;
        final AtomicReference<InnerObserver<?, ?>[]> observers;
        volatile SimplePlainQueue<U> queue;
        Queue<ObservableSource<? extends U>> sources;
        long uniqueId;
        Disposable upstream;
        int wip;
        static final InnerObserver<?, ?>[] EMPTY = new InnerObserver[0];
        static final InnerObserver<?, ?>[] CANCELLED = new InnerObserver[0];

        public MergeObserver(Observer<? super U> observer, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z2, int i4, int i5) {
            this.downstream = observer;
            this.mapper = function;
            this.delayErrors = z2;
            this.maxConcurrency = i4;
            this.bufferSize = i5;
            if (i4 != Integer.MAX_VALUE) {
                this.sources = new ArrayDeque(i4);
            }
            this.observers = new AtomicReference<>(EMPTY);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean addInner(InnerObserver<T, U> innerObserver) {
            while (true) {
                InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                if (innerObserverArr == CANCELLED) {
                    innerObserver.dispose();
                    return false;
                }
                int length = innerObserverArr.length;
                InnerObserver[] innerObserverArr2 = new InnerObserver[length + 1];
                System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                innerObserverArr2[length] = innerObserver;
                AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                while (!atomicReference.compareAndSet(innerObserverArr, innerObserverArr2)) {
                    if (atomicReference.get() != innerObserverArr) {
                        break;
                    }
                }
                return true;
            }
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                return true;
            }
            Throwable th = this.errors.get();
            if (!this.delayErrors && th != null) {
                disposeAll();
                Throwable terminate = this.errors.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Throwable terminate;
            if (!this.cancelled) {
                this.cancelled = true;
                if (disposeAll() && (terminate = this.errors.terminate()) != null && terminate != ExceptionHelper.TERMINATED) {
                    RxJavaPlugins.onError(terminate);
                }
            }
        }

        public boolean disposeAll() {
            InnerObserver<?, ?>[] andSet;
            this.upstream.dispose();
            InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
            InnerObserver<?, ?>[] innerObserverArr2 = CANCELLED;
            if (innerObserverArr == innerObserverArr2 || (andSet = this.observers.getAndSet(innerObserverArr2)) == innerObserverArr2) {
                return false;
            }
            for (InnerObserver<?, ?> innerObserver : andSet) {
                innerObserver.dispose();
            }
            return true;
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
        
            if (r10 != null) goto L99;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e3, code lost:
        
            r10 = r6.done;
            r11 = r6.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00e7, code lost:
        
            if (r10 == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
        
            if (r11 == null) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
        
            if (r11.isEmpty() == false) goto L87;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00f1, code lost:
        
            removeInner(r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        
            if (checkTerminate() == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00fb, code lost:
        
            r4 = r4 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
        
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
        
            if (r9 != r8) goto L127;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0101, code lost:
        
            r9 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0102, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00b5, code lost:
        
            r11 = r10.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00b9, code lost:
        
            if (r11 != null) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x00bc, code lost:
        
            r0.onNext(r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x00c3, code lost:
        
            if (checkTerminate() == false) goto L129;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00c6, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00c7, code lost:
        
            io.reactivex.exceptions.Exceptions.throwIfFatal(r10);
            r6.dispose();
            r13.errors.addThrowable(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00d6, code lost:
        
            if (checkTerminate() != false) goto L112;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x00d9, code lost:
        
            removeInner(r6);
            r4 = r4 + 1;
            r9 = r9 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x00e0, code lost:
        
            if (r9 != r8) goto L126;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:?, code lost:
        
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            int i4;
            Observer<? super U> observer = this.downstream;
            int i5 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                int i10 = 0;
                if (simplePlainQueue != null) {
                    while (!checkTerminate()) {
                        U poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                            i10++;
                        }
                    }
                    return;
                }
                if (i10 != 0) {
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(i10);
                    }
                } else {
                    boolean z2 = this.done;
                    SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                    InnerObserver<?, ?>[] innerObserverArr = this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            i4 = this.sources.size();
                        }
                    } else {
                        i4 = 0;
                    }
                    if (z2 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0 && i4 == 0)) {
                        Throwable terminate = this.errors.terminate();
                        if (terminate != ExceptionHelper.TERMINATED) {
                            if (terminate == null) {
                                observer.onComplete();
                                return;
                            } else {
                                observer.onError(terminate);
                                return;
                            }
                        }
                        return;
                    }
                    if (length != 0) {
                        long j5 = this.lastId;
                        int i11 = this.lastIndex;
                        if (length <= i11 || innerObserverArr[i11].f12837id != j5) {
                            if (length <= i11) {
                                i11 = 0;
                            }
                            for (int i12 = 0; i12 < length && innerObserverArr[i11].f12837id != j5; i12++) {
                                i11++;
                                if (i11 == length) {
                                    i11 = 0;
                                }
                            }
                            this.lastIndex = i11;
                            this.lastId = innerObserverArr[i11].f12837id;
                        }
                        int i13 = 0;
                        while (i13 < length) {
                            if (!checkTerminate()) {
                                InnerObserver<T, U> innerObserver = innerObserverArr[i11];
                                SimpleQueue<U> simpleQueue = innerObserver.queue;
                            } else {
                                return;
                            }
                        }
                        this.lastIndex = i11;
                        this.lastId = innerObserverArr[i11].f12837id;
                    }
                    if (i10 != 0) {
                        if (this.maxConcurrency != Integer.MAX_VALUE) {
                            subscribeMore(i10);
                        }
                    } else {
                        i5 = addAndGet(-i5);
                        if (i5 == 0) {
                            return;
                        }
                    }
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else if (this.errors.addThrowable(th)) {
                this.done = true;
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            try {
                ObservableSource<? extends U> observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null ObservableSource");
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i4 = this.wip;
                            if (i4 == this.maxConcurrency) {
                                this.sources.offer(observableSource);
                                return;
                            }
                            this.wip = i4 + 1;
                        } finally {
                        }
                    }
                }
                subscribeInner(observableSource);
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.dispose();
                onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerObserver<T, U> innerObserver) {
            InnerObserver<?, ?>[] innerObserverArr;
            while (true) {
                InnerObserver<?, ?>[] innerObserverArr2 = this.observers.get();
                int length = innerObserverArr2.length;
                if (length != 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (innerObserverArr2[i4] == innerObserver) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 < 0) {
                        return;
                    }
                    if (length == 1) {
                        innerObserverArr = EMPTY;
                    } else {
                        InnerObserver<?, ?>[] innerObserverArr3 = new InnerObserver[length - 1];
                        System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i4);
                        System.arraycopy(innerObserverArr2, i4 + 1, innerObserverArr3, i4, (length - i4) - 1);
                        innerObserverArr = innerObserverArr3;
                    }
                    AtomicReference<InnerObserver<?, ?>[]> atomicReference = this.observers;
                    while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                        if (atomicReference.get() != innerObserverArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
        }

        public void subscribeInner(ObservableSource<? extends U> observableSource) {
            boolean z2;
            while (observableSource instanceof Callable) {
                if (tryEmitScalar((Callable) observableSource) && this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            observableSource = this.sources.poll();
                            if (observableSource == null) {
                                z2 = true;
                                this.wip--;
                            } else {
                                z2 = false;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (z2) {
                        drain();
                        return;
                    }
                } else {
                    return;
                }
            }
            long j5 = this.uniqueId;
            this.uniqueId = 1 + j5;
            InnerObserver<T, U> innerObserver = new InnerObserver<>(this, j5);
            if (addInner(innerObserver)) {
                observableSource.subscribe(innerObserver);
            }
        }

        public void subscribeMore(int i4) {
            while (true) {
                int i5 = i4 - 1;
                if (i4 != 0) {
                    synchronized (this) {
                        try {
                            ObservableSource<? extends U> poll = this.sources.poll();
                            if (poll == null) {
                                this.wip--;
                            } else {
                                subscribeInner(poll);
                            }
                        } finally {
                        }
                    }
                    i4 = i5;
                } else {
                    return;
                }
            }
        }

        public void tryEmit(U u4, InnerObserver<T, U> innerObserver) {
            if (get() == 0 && compareAndSet(0, 1)) {
                this.downstream.onNext(u4);
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue = innerObserver.queue;
                if (simpleQueue == null) {
                    simpleQueue = new SpscLinkedArrayQueue(this.bufferSize);
                    innerObserver.queue = simpleQueue;
                }
                simpleQueue.offer(u4);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public boolean tryEmitScalar(Callable<? extends U> callable) {
            try {
                U call = callable.call();
                if (call == null) {
                    return true;
                }
                if (get() == 0 && compareAndSet(0, 1)) {
                    this.downstream.onNext(call);
                    if (decrementAndGet() == 0) {
                        return true;
                    }
                } else {
                    SimplePlainQueue<U> simplePlainQueue = this.queue;
                    if (simplePlainQueue == null) {
                        if (this.maxConcurrency == Integer.MAX_VALUE) {
                            simplePlainQueue = new SpscLinkedArrayQueue<>(this.bufferSize);
                        } else {
                            simplePlainQueue = new SpscArrayQueue<>(this.maxConcurrency);
                        }
                        this.queue = simplePlainQueue;
                    }
                    if (!simplePlainQueue.offer(call)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return true;
                    }
                    if (getAndIncrement() != 0) {
                        return false;
                    }
                }
                drainLoop();
                return true;
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.errors.addThrowable(th);
                drain();
                return true;
            }
        }
    }

    public ObservableFlatMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends U>> function, boolean z2, int i4, int i5) {
        super(observableSource);
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i4;
        this.bufferSize = i5;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new MergeObserver(observer, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
