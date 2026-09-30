package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableFlatMap<T, U> extends AbstractFlowableWithUpstream<T, U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;

    /* loaded from: classes2.dex */
    public static final class InnerSubscriber<T, U> extends AtomicReference<d> implements FlowableSubscriber<U>, Disposable {
        private static final long serialVersionUID = -4606175640614850599L;
        final int bufferSize;
        volatile boolean done;
        int fusionMode;

        /* renamed from: id, reason: collision with root package name */
        final long f12813id;
        final int limit;
        final MergeSubscriber<T, U> parent;
        long produced;
        volatile SimpleQueue<U> queue;

        public InnerSubscriber(MergeSubscriber<T, U> mergeSubscriber, long j5) {
            this.f12813id = j5;
            this.parent = mergeSubscriber;
            int i4 = mergeSubscriber.bufferSize;
            this.bufferSize = i4;
            this.limit = i4 >> 2;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() == SubscriptionHelper.CANCELLED) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            lazySet(SubscriptionHelper.CANCELLED);
            this.parent.innerError(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(U u4) {
            if (this.fusionMode != 2) {
                this.parent.tryEmit(u4, this);
            } else {
                this.parent.drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.fusionMode = requestFusion;
                        this.queue = queueSubscription;
                    }
                }
                dVar.request(this.bufferSize);
            }
        }

        public void requestMore(long j5) {
            if (this.fusionMode != 1) {
                long j6 = this.produced + j5;
                if (j6 >= this.limit) {
                    this.produced = 0L;
                    get().request(j6);
                } else {
                    this.produced = j6;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class MergeSubscriber<T, U> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -2117620485640801370L;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final c downstream;
        final AtomicThrowable errs = new AtomicThrowable();
        long lastId;
        int lastIndex;
        final Function<? super T, ? extends b> mapper;
        final int maxConcurrency;
        volatile SimplePlainQueue<U> queue;
        final AtomicLong requested;
        int scalarEmitted;
        final int scalarLimit;
        final AtomicReference<InnerSubscriber<?, ?>[]> subscribers;
        long uniqueId;
        d upstream;
        static final InnerSubscriber<?, ?>[] EMPTY = new InnerSubscriber[0];
        static final InnerSubscriber<?, ?>[] CANCELLED = new InnerSubscriber[0];

        public MergeSubscriber(c cVar, Function<? super T, ? extends b> function, boolean z2, int i4, int i5) {
            AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = new AtomicReference<>();
            this.subscribers = atomicReference;
            this.requested = new AtomicLong();
            this.downstream = cVar;
            this.mapper = function;
            this.delayErrors = z2;
            this.maxConcurrency = i4;
            this.bufferSize = i5;
            this.scalarLimit = Math.max(1, i4 >> 1);
            atomicReference.lazySet(EMPTY);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean addInner(InnerSubscriber<T, U> innerSubscriber) {
            while (true) {
                InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
                if (innerSubscriberArr == CANCELLED) {
                    innerSubscriber.dispose();
                    return false;
                }
                int length = innerSubscriberArr.length;
                InnerSubscriber[] innerSubscriberArr2 = new InnerSubscriber[length + 1];
                System.arraycopy(innerSubscriberArr, 0, innerSubscriberArr2, 0, length);
                innerSubscriberArr2[length] = innerSubscriber;
                AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                while (!atomicReference.compareAndSet(innerSubscriberArr, innerSubscriberArr2)) {
                    if (atomicReference.get() != innerSubscriberArr) {
                        break;
                    }
                }
                return true;
            }
        }

        @Override // qg.d
        public void cancel() {
            SimplePlainQueue<U> simplePlainQueue;
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                disposeAll();
                if (getAndIncrement() == 0 && (simplePlainQueue = this.queue) != null) {
                    simplePlainQueue.clear();
                }
            }
        }

        public boolean checkTerminate() {
            if (this.cancelled) {
                clearScalarQueue();
                return true;
            }
            if (!this.delayErrors && this.errs.get() != null) {
                clearScalarQueue();
                Throwable terminate = this.errs.terminate();
                if (terminate != ExceptionHelper.TERMINATED) {
                    this.downstream.onError(terminate);
                }
                return true;
            }
            return false;
        }

        public void clearScalarQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue != null) {
                simplePlainQueue.clear();
            }
        }

        public void disposeAll() {
            InnerSubscriber<?, ?>[] andSet;
            InnerSubscriber<?, ?>[] innerSubscriberArr = this.subscribers.get();
            InnerSubscriber<?, ?>[] innerSubscriberArr2 = CANCELLED;
            if (innerSubscriberArr != innerSubscriberArr2 && (andSet = this.subscribers.getAndSet(innerSubscriberArr2)) != innerSubscriberArr2) {
                for (InnerSubscriber<?, ?> innerSubscriber : andSet) {
                    innerSubscriber.dispose();
                }
                Throwable terminate = this.errs.terminate();
                if (terminate != null && terminate != ExceptionHelper.TERMINATED) {
                    RxJavaPlugins.onError(terminate);
                }
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
        
            if (r7[r0].f12813id != r10) goto L52;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            boolean z2;
            boolean z10;
            long j5;
            long j6;
            boolean z11;
            long j7;
            InnerSubscriber<T, U>[] innerSubscriberArr;
            U u4;
            c cVar = this.downstream;
            int i4 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue<U> simplePlainQueue = this.queue;
                long j10 = this.requested.get();
                if (j10 == Long.MAX_VALUE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j11 = 0;
                if (simplePlainQueue != null) {
                    j5 = 0;
                    do {
                        long j12 = 0;
                        u4 = null;
                        while (true) {
                            if (j10 != 0) {
                                z10 = true;
                                U poll = simplePlainQueue.poll();
                                if (!checkTerminate()) {
                                    if (poll == null) {
                                        u4 = poll;
                                        break;
                                    }
                                    cVar.onNext(poll);
                                    j5++;
                                    j12++;
                                    j10--;
                                    u4 = poll;
                                } else {
                                    return;
                                }
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        if (j12 != 0) {
                            if (z2) {
                                j10 = Long.MAX_VALUE;
                            } else {
                                j10 = this.requested.addAndGet(-j12);
                            }
                        }
                        if (j10 == 0) {
                            break;
                        }
                    } while (u4 != null);
                } else {
                    z10 = true;
                    j5 = 0;
                }
                boolean z12 = this.done;
                SimplePlainQueue<U> simplePlainQueue2 = this.queue;
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (z12 && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                    Throwable terminate = this.errs.terminate();
                    if (terminate != ExceptionHelper.TERMINATED) {
                        if (terminate == null) {
                            cVar.onComplete();
                            return;
                        } else {
                            cVar.onError(terminate);
                            return;
                        }
                    }
                    return;
                }
                if (length != 0) {
                    long j13 = this.lastId;
                    int i5 = this.lastIndex;
                    if (length > i5) {
                        j7 = 1;
                    } else {
                        j7 = 1;
                    }
                    if (length <= i5) {
                        i5 = 0;
                    }
                    for (int i10 = 0; i10 < length && innerSubscriberArr2[i5].f12813id != j13; i10++) {
                        i5++;
                        if (i5 == length) {
                            i5 = 0;
                        }
                    }
                    this.lastIndex = i5;
                    this.lastId = innerSubscriberArr2[i5].f12813id;
                    int i11 = i5;
                    boolean z13 = false;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            if (!checkTerminate()) {
                                InnerSubscriber<T, U> innerSubscriber = innerSubscriberArr2[i11];
                                U u10 = null;
                                while (!checkTerminate()) {
                                    SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                                    if (simpleQueue == null) {
                                        innerSubscriberArr = innerSubscriberArr2;
                                        j6 = j11;
                                    } else {
                                        j6 = j11;
                                        while (j10 != j6) {
                                            try {
                                                u10 = simpleQueue.poll();
                                                if (u10 == null) {
                                                    break;
                                                }
                                                cVar.onNext(u10);
                                                if (!checkTerminate()) {
                                                    j10 -= j7;
                                                    j11 += j7;
                                                } else {
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                Exceptions.throwIfFatal(th);
                                                innerSubscriber.dispose();
                                                this.errs.addThrowable(th);
                                                if (!this.delayErrors) {
                                                    this.upstream.cancel();
                                                }
                                                if (!checkTerminate()) {
                                                    removeInner(innerSubscriber);
                                                    i12++;
                                                    innerSubscriberArr = innerSubscriberArr2;
                                                    z13 = z10;
                                                } else {
                                                    return;
                                                }
                                            }
                                        }
                                        if (j11 != j6) {
                                            if (!z2) {
                                                innerSubscriberArr = innerSubscriberArr2;
                                                j10 = this.requested.addAndGet(-j11);
                                            } else {
                                                innerSubscriberArr = innerSubscriberArr2;
                                                j10 = Long.MAX_VALUE;
                                            }
                                            innerSubscriber.requestMore(j11);
                                        } else {
                                            innerSubscriberArr = innerSubscriberArr2;
                                        }
                                        if (j10 != j6 && u10 != null) {
                                            innerSubscriberArr2 = innerSubscriberArr;
                                            j11 = j6;
                                        }
                                    }
                                    boolean z14 = innerSubscriber.done;
                                    SimpleQueue<U> simpleQueue2 = innerSubscriber.queue;
                                    if (z14 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                        removeInner(innerSubscriber);
                                        if (!checkTerminate()) {
                                            j5 += j7;
                                            z13 = z10;
                                        } else {
                                            return;
                                        }
                                    }
                                    if (j10 == j6) {
                                        break;
                                    }
                                    i11++;
                                    if (i11 == length) {
                                        i11 = 0;
                                    }
                                    i12++;
                                    innerSubscriberArr2 = innerSubscriberArr;
                                    j11 = j6;
                                }
                                return;
                            }
                            return;
                        }
                        innerSubscriberArr = innerSubscriberArr2;
                        j6 = j11;
                        break;
                    }
                    z11 = z13;
                    this.lastIndex = i11;
                    this.lastId = innerSubscriberArr[i11].f12813id;
                } else {
                    j6 = 0;
                    z11 = false;
                }
                long j14 = j5;
                if (j14 != j6 && !this.cancelled) {
                    this.upstream.request(j14);
                }
                if (!z11 && (i4 = addAndGet(-i4)) == 0) {
                    return;
                }
            }
        }

        public SimpleQueue<U> getInnerQueue(InnerSubscriber<T, U> innerSubscriber) {
            SimpleQueue<U> simpleQueue = innerSubscriber.queue;
            if (simpleQueue == null) {
                SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.bufferSize);
                innerSubscriber.queue = spscArrayQueue;
                return spscArrayQueue;
            }
            return simpleQueue;
        }

        public SimpleQueue<U> getMainQueue() {
            SimplePlainQueue<U> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    simplePlainQueue = new SpscLinkedArrayQueue<>(this.bufferSize);
                } else {
                    simplePlainQueue = new SpscArrayQueue<>(this.maxConcurrency);
                }
                this.queue = simplePlainQueue;
            }
            return simplePlainQueue;
        }

        public void innerError(InnerSubscriber<T, U> innerSubscriber, Throwable th) {
            if (this.errs.addThrowable(th)) {
                innerSubscriber.done = true;
                if (!this.delayErrors) {
                    this.upstream.cancel();
                    for (InnerSubscriber<?, ?> innerSubscriber2 : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber2.dispose();
                    }
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            if (this.errs.addThrowable(th)) {
                this.done = true;
                if (!this.delayErrors) {
                    for (InnerSubscriber<?, ?> innerSubscriber : this.subscribers.getAndSet(CANCELLED)) {
                        innerSubscriber.dispose();
                    }
                }
                drain();
                return;
            }
            RxJavaPlugins.onError(th);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (!this.done) {
                try {
                    b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply(t5), "The mapper returned a null Publisher");
                    if (bVar instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar).call();
                            if (call != null) {
                                tryEmitScalar(call);
                                return;
                            }
                            if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                                int i4 = this.scalarEmitted + 1;
                                this.scalarEmitted = i4;
                                int i5 = this.scalarLimit;
                                if (i4 == i5) {
                                    this.scalarEmitted = 0;
                                    this.upstream.request(i5);
                                    return;
                                }
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.errs.addThrowable(th);
                            drain();
                            return;
                        }
                    }
                    long j5 = this.uniqueId;
                    this.uniqueId = 1 + j5;
                    InnerSubscriber innerSubscriber = new InnerSubscriber(this, j5);
                    if (addInner(innerSubscriber)) {
                        bVar.subscribe(innerSubscriber);
                    }
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.upstream.cancel();
                    onError(th2);
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                if (!this.cancelled) {
                    int i4 = this.maxConcurrency;
                    if (i4 == Integer.MAX_VALUE) {
                        dVar.request(Long.MAX_VALUE);
                    } else {
                        dVar.request(i4);
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void removeInner(InnerSubscriber<T, U> innerSubscriber) {
            InnerSubscriber<?, ?>[] innerSubscriberArr;
            while (true) {
                InnerSubscriber<?, ?>[] innerSubscriberArr2 = this.subscribers.get();
                int length = innerSubscriberArr2.length;
                if (length != 0) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (innerSubscriberArr2[i4] == innerSubscriber) {
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
                        innerSubscriberArr = EMPTY;
                    } else {
                        InnerSubscriber<?, ?>[] innerSubscriberArr3 = new InnerSubscriber[length - 1];
                        System.arraycopy(innerSubscriberArr2, 0, innerSubscriberArr3, 0, i4);
                        System.arraycopy(innerSubscriberArr2, i4 + 1, innerSubscriberArr3, i4, (length - i4) - 1);
                        innerSubscriberArr = innerSubscriberArr3;
                    }
                    AtomicReference<InnerSubscriber<?, ?>[]> atomicReference = this.subscribers;
                    while (!atomicReference.compareAndSet(innerSubscriberArr2, innerSubscriberArr)) {
                        if (atomicReference.get() != innerSubscriberArr2) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }

        public void tryEmit(U u4, InnerSubscriber<T, U> innerSubscriber) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j5 = this.requested.get();
                SimpleQueue<U> simpleQueue = innerSubscriber.queue;
                if (j5 != 0 && (simpleQueue == null || simpleQueue.isEmpty())) {
                    this.downstream.onNext(u4);
                    if (j5 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    innerSubscriber.requestMore(1L);
                } else {
                    if (simpleQueue == null) {
                        simpleQueue = getInnerQueue(innerSubscriber);
                    }
                    if (!simpleQueue.offer(u4)) {
                        onError(new MissingBackpressureException("Inner queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue2 = innerSubscriber.queue;
                if (simpleQueue2 == null) {
                    simpleQueue2 = new SpscArrayQueue(this.bufferSize);
                    innerSubscriber.queue = simpleQueue2;
                }
                if (!simpleQueue2.offer(u4)) {
                    onError(new MissingBackpressureException("Inner queue full?!"));
                    return;
                } else if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        public void tryEmitScalar(U u4) {
            if (get() == 0 && compareAndSet(0, 1)) {
                long j5 = this.requested.get();
                SimpleQueue<U> simpleQueue = this.queue;
                if (j5 != 0 && (simpleQueue == null || simpleQueue.isEmpty())) {
                    this.downstream.onNext(u4);
                    if (j5 != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    if (this.maxConcurrency != Integer.MAX_VALUE && !this.cancelled) {
                        int i4 = this.scalarEmitted + 1;
                        this.scalarEmitted = i4;
                        int i5 = this.scalarLimit;
                        if (i4 == i5) {
                            this.scalarEmitted = 0;
                            this.upstream.request(i5);
                        }
                    }
                } else {
                    if (simpleQueue == null) {
                        simpleQueue = getMainQueue();
                    }
                    if (!simpleQueue.offer(u4)) {
                        onError(new IllegalStateException("Scalar queue full?!"));
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!getMainQueue().offer(u4)) {
                onError(new IllegalStateException("Scalar queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    public FlowableFlatMap(Flowable<T> flowable, Function<? super T, ? extends b> function, boolean z2, int i4, int i5) {
        super(flowable);
        this.mapper = function;
        this.delayErrors = z2;
        this.maxConcurrency = i4;
        this.bufferSize = i5;
    }

    public static <T, U> FlowableSubscriber<T> subscribe(c cVar, Function<? super T, ? extends b> function, boolean z2, int i4, int i5) {
        return new MergeSubscriber(cVar, function, z2, i4, i5);
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe((FlowableSubscriber) subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
