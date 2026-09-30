package io.reactivex.internal.operators.parallel;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class ParallelJoin<T> extends Flowable<T> {
    final boolean delayErrors;
    final int prefetch;
    final ParallelFlowable<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class JoinInnerSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 8410034718427740355L;
        final int limit;
        final JoinSubscriptionBase<T> parent;
        final int prefetch;
        long produced;
        volatile SimplePlainQueue<T> queue;

        public JoinInnerSubscriber(JoinSubscriptionBase<T> joinSubscriptionBase, int i4) {
            this.parent = joinSubscriptionBase;
            this.prefetch = i4;
            this.limit = i4 - (i4 >> 2);
        }

        public boolean cancel() {
            return SubscriptionHelper.cancel(this);
        }

        public SimplePlainQueue<T> getQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
                this.queue = spscArrayQueue;
                return spscArrayQueue;
            }
            return simplePlainQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.parent.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.parent.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.parent.onNext(this, t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, this.prefetch);
        }

        public void request(long j5) {
            long j6 = this.produced + j5;
            if (j6 >= this.limit) {
                this.produced = 0L;
                get().request(j6);
            } else {
                this.produced = j6;
            }
        }

        public void requestOne() {
            long j5 = this.produced + 1;
            if (j5 == this.limit) {
                this.produced = 0L;
                get().request(j5);
            } else {
                this.produced = j5;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class JoinSubscription<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public JoinSubscription(c cVar, int i4, int i5) {
            super(cVar, i4, i5);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:76:0x005e, code lost:
        
            r16 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0060, code lost:
        
            if (r12 == false) goto L88;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0062, code lost:
        
            if (r15 == false) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0064, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0067, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0068, code lost:
        
            if (r15 == false) goto L90;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            boolean z2;
            long j5;
            boolean z10;
            boolean z11;
            T poll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            c cVar = this.downstream;
            int i4 = 1;
            while (true) {
                long j6 = this.requested.get();
                long j7 = 0;
                while (true) {
                    z2 = false;
                    if (j7 != j6) {
                        if (this.cancelled) {
                            cleanup();
                            return;
                        }
                        Throwable th = this.errors.get();
                        if (th != null) {
                            cleanup();
                            cVar.onError(th);
                            return;
                        }
                        if (this.done.get() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i5 = 0;
                        boolean z12 = true;
                        while (true) {
                            if (i5 >= joinInnerSubscriberArr.length) {
                                break;
                            }
                            JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i5];
                            j5 = 0;
                            SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                            if (simplePlainQueue != null && (poll = simplePlainQueue.poll()) != null) {
                                cVar.onNext(poll);
                                joinInnerSubscriber.requestOne();
                                j7++;
                                if (j7 == j6) {
                                    break;
                                } else {
                                    z12 = false;
                                }
                            }
                            i5++;
                        }
                    } else {
                        j5 = 0;
                        break;
                    }
                }
                if (j7 == j6) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    Throwable th2 = this.errors.get();
                    if (th2 != null) {
                        cleanup();
                        cVar.onError(th2);
                        return;
                    }
                    if (this.done.get() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i10].queue;
                            if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z10 && z2) {
                        cVar.onComplete();
                        return;
                    }
                }
                if (j7 != j5 && j6 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j7);
                }
                int i11 = get();
                if (i11 == i4 && (i11 = addAndGet(-i4)) == 0) {
                    return;
                } else {
                    i4 = i11;
                }
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th) {
            if (this.errors.compareAndSet(null, th)) {
                cancelAll();
                drain();
            } else if (th != this.errors.get()) {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t5) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t5);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t5)) {
                    cancelAll();
                    MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Queue full?!");
                    if (this.errors.compareAndSet(null, missingBackpressureException)) {
                        this.downstream.onError(missingBackpressureException);
                        return;
                    } else {
                        RxJavaPlugins.onError(missingBackpressureException);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!joinInnerSubscriber.getQueue().offer(t5)) {
                cancelAll();
                onError(new MissingBackpressureException("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class JoinSubscriptionBase<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 3100232009247827843L;
        volatile boolean cancelled;
        final c downstream;
        final JoinInnerSubscriber<T>[] subscribers;
        final AtomicThrowable errors = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger done = new AtomicInteger();

        public JoinSubscriptionBase(c cVar, int i4, int i5) {
            this.downstream = cVar;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = new JoinInnerSubscriber[i4];
            for (int i10 = 0; i10 < i4; i10++) {
                joinInnerSubscriberArr[i10] = new JoinInnerSubscriber<>(this, i5);
            }
            this.subscribers = joinInnerSubscriberArr;
            this.done.lazySet(i4);
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                cancelAll();
                if (getAndIncrement() == 0) {
                    cleanup();
                }
            }
        }

        public void cancelAll() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.cancel();
            }
        }

        public void cleanup() {
            for (JoinInnerSubscriber<T> joinInnerSubscriber : this.subscribers) {
                joinInnerSubscriber.queue = null;
            }
        }

        public abstract void drain();

        public abstract void onComplete();

        public abstract void onError(Throwable th);

        public abstract void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t5);

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class JoinSubscriptionDelayError<T> extends JoinSubscriptionBase<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public JoinSubscriptionDelayError(c cVar, int i4, int i5) {
            super(cVar, i4, i5);
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            drainLoop();
        }

        /* JADX WARN: Code restructure failed: missing block: B:72:0x004c, code lost:
        
            r16 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x004e, code lost:
        
            if (r12 == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0050, code lost:
        
            if (r15 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x005a, code lost:
        
            if (r18.errors.get() == null) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x005c, code lost:
        
            r3.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0065, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0066, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0069, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x006a, code lost:
        
            if (r15 == false) goto L87;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void drainLoop() {
            boolean z2;
            long j5;
            boolean z10;
            boolean z11;
            T poll;
            JoinInnerSubscriber<T>[] joinInnerSubscriberArr = this.subscribers;
            int length = joinInnerSubscriberArr.length;
            c cVar = this.downstream;
            int i4 = 1;
            while (true) {
                long j6 = this.requested.get();
                long j7 = 0;
                while (true) {
                    z2 = false;
                    if (j7 != j6) {
                        if (this.cancelled) {
                            cleanup();
                            return;
                        }
                        if (this.done.get() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int i5 = 0;
                        boolean z12 = true;
                        while (true) {
                            if (i5 >= length) {
                                break;
                            }
                            JoinInnerSubscriber<T> joinInnerSubscriber = joinInnerSubscriberArr[i5];
                            j5 = 0;
                            SimplePlainQueue<T> simplePlainQueue = joinInnerSubscriber.queue;
                            if (simplePlainQueue != null && (poll = simplePlainQueue.poll()) != null) {
                                cVar.onNext(poll);
                                joinInnerSubscriber.requestOne();
                                j7++;
                                if (j7 == j6) {
                                    break;
                                } else {
                                    z12 = false;
                                }
                            }
                            i5++;
                        }
                    } else {
                        j5 = 0;
                        break;
                    }
                }
                if (j7 == j6) {
                    if (this.cancelled) {
                        cleanup();
                        return;
                    }
                    if (this.done.get() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            SimplePlainQueue<T> simplePlainQueue2 = joinInnerSubscriberArr[i10].queue;
                            if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                                break;
                            } else {
                                i10++;
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                    }
                    if (z10 && z2) {
                        if (this.errors.get() != null) {
                            cVar.onError(this.errors.terminate());
                            return;
                        } else {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                if (j7 != j5 && j6 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j7);
                }
                int i11 = get();
                if (i11 == i4 && (i11 = addAndGet(-i4)) == 0) {
                    return;
                } else {
                    i4 = i11;
                }
            }
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onComplete() {
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onError(Throwable th) {
            this.errors.addThrowable(th);
            this.done.decrementAndGet();
            drain();
        }

        @Override // io.reactivex.internal.operators.parallel.ParallelJoin.JoinSubscriptionBase
        public void onNext(JoinInnerSubscriber<T> joinInnerSubscriber, T t5) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.requested.get() != 0) {
                    this.downstream.onNext(t5);
                    if (this.requested.get() != Long.MAX_VALUE) {
                        this.requested.decrementAndGet();
                    }
                    joinInnerSubscriber.request(1L);
                } else if (!joinInnerSubscriber.getQueue().offer(t5)) {
                    joinInnerSubscriber.cancel();
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                    drainLoop();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!joinInnerSubscriber.getQueue().offer(t5) && joinInnerSubscriber.cancel()) {
                    this.errors.addThrowable(new MissingBackpressureException("Queue full?!"));
                    this.done.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }
    }

    public ParallelJoin(ParallelFlowable<? extends T> parallelFlowable, int i4, boolean z2) {
        this.source = parallelFlowable;
        this.prefetch = i4;
        this.delayErrors = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        JoinSubscriptionBase joinSubscription;
        if (this.delayErrors) {
            joinSubscription = new JoinSubscriptionDelayError(cVar, this.source.parallelism(), this.prefetch);
        } else {
            joinSubscription = new JoinSubscription(cVar, this.source.parallelism(), this.prefetch);
        }
        cVar.onSubscribe(joinSubscription);
        this.source.subscribe(joinSubscription.subscribers);
    }
}
