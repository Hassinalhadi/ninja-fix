package io.reactivex.internal.operators.observable;

import A0.c;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservableSwitchMap<T, R> extends AbstractObservableWithUpstream<T, R> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends ObservableSource<? extends R>> mapper;

    /* loaded from: classes2.dex */
    public static final class SwitchMapInnerObserver<T, R> extends AtomicReference<Disposable> implements Observer<R> {
        private static final long serialVersionUID = 3837284832786408377L;
        final int bufferSize;
        volatile boolean done;
        final long index;
        final SwitchMapObserver<T, R> parent;
        volatile SimpleQueue<R> queue;

        public SwitchMapInnerObserver(SwitchMapObserver<T, R> switchMapObserver, long j5, int i4) {
            this.parent = switchMapObserver;
            this.index = j5;
            this.bufferSize = i4;
        }

        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (this.index == this.parent.unique) {
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.Observer
        public void onNext(R r4) {
            if (this.index == this.parent.unique) {
                if (r4 != null) {
                    this.queue.offer(r4);
                }
                this.parent.drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                if (disposable instanceof QueueDisposable) {
                    QueueDisposable queueDisposable = (QueueDisposable) disposable;
                    int requestFusion = queueDisposable.requestFusion(7);
                    if (requestFusion == 1) {
                        this.queue = queueDisposable;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.queue = queueDisposable;
                        return;
                    }
                }
                this.queue = new SpscLinkedArrayQueue(this.bufferSize);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SwitchMapObserver<T, R> extends AtomicInteger implements Observer<T>, Disposable {
        static final SwitchMapInnerObserver<Object, Object> CANCELLED;
        private static final long serialVersionUID = -3491074160481096299L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final Observer<? super R> downstream;
        final Function<? super T, ? extends ObservableSource<? extends R>> mapper;
        volatile long unique;
        Disposable upstream;
        final AtomicReference<SwitchMapInnerObserver<T, R>> active = new AtomicReference<>();
        final AtomicThrowable errors = new AtomicThrowable();

        static {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver = new SwitchMapInnerObserver<>(null, -1L, 1);
            CANCELLED = switchMapInnerObserver;
            switchMapInnerObserver.cancel();
        }

        public SwitchMapObserver(Observer<? super R> observer, Function<? super T, ? extends ObservableSource<? extends R>> function, int i4, boolean z2) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i4;
            this.delayErrors = z2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.dispose();
                disposeInner();
            }
        }

        public void disposeInner() {
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = this.active.get();
            SwitchMapInnerObserver<Object, Object> switchMapInnerObserver3 = CANCELLED;
            if (switchMapInnerObserver2 != switchMapInnerObserver3 && (switchMapInnerObserver = (SwitchMapInnerObserver) this.active.getAndSet(switchMapInnerObserver3)) != switchMapInnerObserver3 && switchMapInnerObserver != null) {
                switchMapInnerObserver.cancel();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:79:0x0119 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0010 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drain() {
            SimpleQueue<R> simpleQueue;
            c cVar;
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                Observer<? super R> observer = this.downstream;
                AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                boolean z11 = this.delayErrors;
                int i4 = 1;
                while (!this.cancelled) {
                    if (this.done) {
                        if (atomicReference.get() == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11) {
                            if (z10) {
                                Throwable th = this.errors.get();
                                if (th != null) {
                                    observer.onError(th);
                                    return;
                                } else {
                                    observer.onComplete();
                                    return;
                                }
                            }
                        } else if (this.errors.get() != null) {
                            observer.onError(this.errors.terminate());
                            return;
                        } else if (z10) {
                            observer.onComplete();
                            return;
                        }
                    }
                    SwitchMapInnerObserver<T, R> switchMapInnerObserver = atomicReference.get();
                    if (switchMapInnerObserver != null && (simpleQueue = switchMapInnerObserver.queue) != null) {
                        if (switchMapInnerObserver.done) {
                            boolean isEmpty = simpleQueue.isEmpty();
                            if (z11) {
                                if (isEmpty) {
                                    while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                    }
                                }
                            } else if (this.errors.get() != null) {
                                observer.onError(this.errors.terminate());
                                return;
                            } else if (isEmpty) {
                                while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                }
                            }
                        }
                        boolean z12 = false;
                        while (!this.cancelled) {
                            if (switchMapInnerObserver == atomicReference.get()) {
                                if (!z11 && this.errors.get() != null) {
                                    observer.onError(this.errors.terminate());
                                    return;
                                }
                                boolean z13 = switchMapInnerObserver.done;
                                try {
                                    cVar = simpleQueue.poll();
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    this.errors.addThrowable(th2);
                                    while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                    }
                                    if (!z11) {
                                        disposeInner();
                                        this.upstream.dispose();
                                        this.done = true;
                                    } else {
                                        switchMapInnerObserver.cancel();
                                    }
                                    z12 = true;
                                    cVar = null;
                                }
                                if (cVar == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z13 && z2) {
                                    while (!atomicReference.compareAndSet(switchMapInnerObserver, null) && atomicReference.get() == switchMapInnerObserver) {
                                    }
                                } else if (z2) {
                                    if (!z12) {
                                        continue;
                                    }
                                } else {
                                    observer.onNext(cVar);
                                }
                            }
                            z12 = true;
                            if (!z12) {
                            }
                        }
                        return;
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }

        public void innerError(SwitchMapInnerObserver<T, R> switchMapInnerObserver, Throwable th) {
            if (switchMapInnerObserver.index == this.unique && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    this.upstream.dispose();
                    this.done = true;
                }
                switchMapInnerObserver.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.cancelled;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                drain();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            if (!this.done && this.errors.addThrowable(th)) {
                if (!this.delayErrors) {
                    disposeInner();
                }
                this.done = true;
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t5) {
            long j5 = this.unique + 1;
            this.unique = j5;
            SwitchMapInnerObserver<T, R> switchMapInnerObserver = this.active.get();
            if (switchMapInnerObserver != null) {
                switchMapInnerObserver.cancel();
            }
            try {
                ObservableSource observableSource = (ObservableSource) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The ObservableSource returned is null");
                SwitchMapInnerObserver<T, R> switchMapInnerObserver2 = new SwitchMapInnerObserver<>(this, j5, this.bufferSize);
                while (true) {
                    SwitchMapInnerObserver<T, R> switchMapInnerObserver3 = this.active.get();
                    if (switchMapInnerObserver3 == CANCELLED) {
                        return;
                    }
                    AtomicReference<SwitchMapInnerObserver<T, R>> atomicReference = this.active;
                    while (!atomicReference.compareAndSet(switchMapInnerObserver3, switchMapInnerObserver2)) {
                        if (atomicReference.get() != switchMapInnerObserver3) {
                            break;
                        }
                    }
                    observableSource.subscribe(switchMapInnerObserver2);
                    return;
                }
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
    }

    public ObservableSwitchMap(ObservableSource<T> observableSource, Function<? super T, ? extends ObservableSource<? extends R>> function, int i4, boolean z2) {
        super(observableSource);
        this.mapper = function;
        this.bufferSize = i4;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super R> observer) {
        if (ObservableScalarXMap.tryScalarXMapSubscribe(this.source, observer, this.mapper)) {
            return;
        }
        this.source.subscribe(new SwitchMapObserver(observer, this.mapper, this.bufferSize, this.delayErrors));
    }
}
