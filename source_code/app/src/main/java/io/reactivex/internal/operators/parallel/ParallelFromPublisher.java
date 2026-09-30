package io.reactivex.internal.operators.parallel;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongArray;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelFromPublisher<T> extends ParallelFlowable<T> {
    final int parallelism;
    final int prefetch;
    final b source;

    /* loaded from: classes2.dex */
    public static final class ParallelDispatcher<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -4470634016609963609L;
        volatile boolean cancelled;
        volatile boolean done;
        final long[] emissions;
        Throwable error;
        int index;
        final int limit;
        final int prefetch;
        int produced;
        SimpleQueue<T> queue;
        final AtomicLongArray requests;
        int sourceMode;
        final AtomicInteger subscriberCount = new AtomicInteger();
        final c[] subscribers;
        d upstream;

        /* loaded from: classes2.dex */
        public final class RailSubscription implements d {

            /* renamed from: j, reason: collision with root package name */
            final int f12848j;

            /* renamed from: m, reason: collision with root package name */
            final int f12849m;

            public RailSubscription(int i4, int i5) {
                this.f12848j = i4;
                this.f12849m = i5;
            }

            @Override // qg.d
            public void cancel() {
                if (ParallelDispatcher.this.requests.compareAndSet(this.f12848j + this.f12849m, 0L, 1L)) {
                    ParallelDispatcher parallelDispatcher = ParallelDispatcher.this;
                    int i4 = this.f12849m;
                    parallelDispatcher.cancel(i4 + i4);
                }
            }

            @Override // qg.d
            public void request(long j5) {
                long j6;
                if (SubscriptionHelper.validate(j5)) {
                    AtomicLongArray atomicLongArray = ParallelDispatcher.this.requests;
                    do {
                        j6 = atomicLongArray.get(this.f12848j);
                        if (j6 != Long.MAX_VALUE) {
                        } else {
                            return;
                        }
                    } while (!atomicLongArray.compareAndSet(this.f12848j, j6, BackpressureHelper.addCap(j6, j5)));
                    if (ParallelDispatcher.this.subscriberCount.get() == this.f12849m) {
                        ParallelDispatcher.this.drain();
                    }
                }
            }
        }

        public ParallelDispatcher(c[] cVarArr, int i4) {
            this.subscribers = cVarArr;
            this.prefetch = i4;
            this.limit = i4 - (i4 >> 2);
            int length = cVarArr.length;
            int i5 = length + length;
            AtomicLongArray atomicLongArray = new AtomicLongArray(i5 + 1);
            this.requests = atomicLongArray;
            atomicLongArray.lazySet(i5, length);
            this.emissions = new long[length];
        }

        public void cancel(int i4) {
            if (this.requests.decrementAndGet(i4) == 0) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.sourceMode == 1) {
                drainSync();
            } else {
                drainAsync();
            }
        }

        public void drainAsync() {
            Throwable th;
            SimpleQueue<T> simpleQueue = this.queue;
            c[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i4 = this.index;
            int i5 = this.produced;
            int i10 = 1;
            while (true) {
                int i11 = 0;
                int i12 = 0;
                while (!this.cancelled) {
                    boolean z2 = this.done;
                    if (z2 && (th = this.error) != null) {
                        simpleQueue.clear();
                        int length2 = cVarArr.length;
                        while (i11 < length2) {
                            cVarArr[i11].onError(th);
                            i11++;
                        }
                        return;
                    }
                    boolean isEmpty = simpleQueue.isEmpty();
                    if (z2 && isEmpty) {
                        int length3 = cVarArr.length;
                        while (i11 < length3) {
                            cVarArr[i11].onComplete();
                            i11++;
                        }
                        return;
                    }
                    if (!isEmpty) {
                        long j5 = atomicLongArray.get(i4);
                        long j6 = jArr[i4];
                        if (j5 != j6 && atomicLongArray.get(length + i4) == 0) {
                            try {
                                T poll = simpleQueue.poll();
                                if (poll != null) {
                                    cVarArr[i4].onNext(poll);
                                    jArr[i4] = j6 + 1;
                                    i5++;
                                    if (i5 == this.limit) {
                                        this.upstream.request(i5);
                                        i5 = 0;
                                    }
                                    i12 = 0;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                this.upstream.cancel();
                                int length4 = cVarArr.length;
                                while (i11 < length4) {
                                    cVarArr[i11].onError(th2);
                                    i11++;
                                }
                                return;
                            }
                        } else {
                            i12++;
                        }
                        i4++;
                        if (i4 == length) {
                            i4 = 0;
                        }
                        if (i12 == length) {
                        }
                    }
                    int i13 = get();
                    if (i13 == i10) {
                        this.index = i4;
                        this.produced = i5;
                        i10 = addAndGet(-i10);
                        if (i10 == 0) {
                            return;
                        }
                    } else {
                        i10 = i13;
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        public void drainSync() {
            SimpleQueue<T> simpleQueue = this.queue;
            c[] cVarArr = this.subscribers;
            AtomicLongArray atomicLongArray = this.requests;
            long[] jArr = this.emissions;
            int length = jArr.length;
            int i4 = this.index;
            int i5 = 1;
            while (true) {
                int i10 = 0;
                int i11 = 0;
                while (!this.cancelled) {
                    if (simpleQueue.isEmpty()) {
                        int length2 = cVarArr.length;
                        while (i10 < length2) {
                            cVarArr[i10].onComplete();
                            i10++;
                        }
                        return;
                    }
                    long j5 = atomicLongArray.get(i4);
                    long j6 = jArr[i4];
                    if (j5 != j6 && atomicLongArray.get(length + i4) == 0) {
                        try {
                            T poll = simpleQueue.poll();
                            if (poll == null) {
                                int length3 = cVarArr.length;
                                while (i10 < length3) {
                                    cVarArr[i10].onComplete();
                                    i10++;
                                }
                                return;
                            }
                            cVarArr[i4].onNext(poll);
                            jArr[i4] = j6 + 1;
                            i11 = 0;
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            this.upstream.cancel();
                            int length4 = cVarArr.length;
                            while (i10 < length4) {
                                cVarArr[i10].onError(th);
                                i10++;
                            }
                            return;
                        }
                    } else {
                        i11++;
                    }
                    i4++;
                    if (i4 == length) {
                        i4 = 0;
                    }
                    if (i11 == length) {
                        int i12 = get();
                        if (i12 == i5) {
                            this.index = i4;
                            i5 = addAndGet(-i5);
                            if (i5 == 0) {
                                return;
                            }
                        } else {
                            i5 = i12;
                        }
                    }
                }
                simpleQueue.clear();
                return;
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.sourceMode == 0 && !this.queue.offer(t5)) {
                this.upstream.cancel();
                onError(new MissingBackpressureException("Queue is full?"));
            } else {
                drain();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        setupSubscribers();
                        drain();
                        return;
                    }
                    if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        setupSubscribers();
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                setupSubscribers();
                dVar.request(this.prefetch);
            }
        }

        public void setupSubscribers() {
            c[] cVarArr = this.subscribers;
            int length = cVarArr.length;
            int i4 = 0;
            while (i4 < length && !this.cancelled) {
                int i5 = i4 + 1;
                this.subscriberCount.lazySet(i5);
                cVarArr[i4].onSubscribe(new RailSubscription(i4, length));
                i4 = i5;
            }
        }
    }

    public ParallelFromPublisher(b bVar, int i4, int i5) {
        this.source = bVar;
        this.parallelism = i4;
        this.prefetch = i5;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.parallelism;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (!validate(cVarArr)) {
            return;
        }
        this.source.subscribe(new ParallelDispatcher(cVarArr, this.prefetch));
    }
}
