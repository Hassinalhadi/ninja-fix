package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableMergeWithSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final SingleSource<? extends T> other;

    /* loaded from: classes2.dex */
    public static final class MergeWithObserver<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        static final int OTHER_STATE_CONSUMED_OR_EMPTY = 2;
        static final int OTHER_STATE_HAS_VALUE = 1;
        private static final long serialVersionUID = -4592979584110982903L;
        volatile boolean cancelled;
        int consumed;
        final c downstream;
        long emitted;
        final int limit;
        volatile boolean mainDone;
        volatile int otherState;
        final int prefetch;
        volatile SimplePlainQueue<T> queue;
        T singleItem;
        final AtomicReference<d> mainSubscription = new AtomicReference<>();
        final OtherObserver<T> otherObserver = new OtherObserver<>(this);
        final AtomicThrowable error = new AtomicThrowable();
        final AtomicLong requested = new AtomicLong();

        /* loaded from: classes2.dex */
        public static final class OtherObserver<T> extends AtomicReference<Disposable> implements SingleObserver<T> {
            private static final long serialVersionUID = -2935427570954647017L;
            final MergeWithObserver<T> parent;

            public OtherObserver(MergeWithObserver<T> mergeWithObserver) {
                this.parent = mergeWithObserver;
            }

            @Override // io.reactivex.SingleObserver
            public void onError(Throwable th) {
                this.parent.otherError(th);
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(T t5) {
                this.parent.otherSuccess(t5);
            }
        }

        public MergeWithObserver(c cVar) {
            this.downstream = cVar;
            int bufferSize = Flowable.bufferSize();
            this.prefetch = bufferSize;
            this.limit = bufferSize - (bufferSize >> 2);
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            SubscriptionHelper.cancel(this.mainSubscription);
            DisposableHelper.dispose(this.otherObserver);
            if (getAndIncrement() == 0) {
                this.queue = null;
                this.singleItem = null;
            }
        }

        public void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public void drainLoop() {
            boolean z2;
            T t5;
            boolean z10;
            c cVar = this.downstream;
            long j5 = this.emitted;
            int i4 = this.consumed;
            int i5 = this.limit;
            int i10 = 1;
            int i11 = 1;
            while (true) {
                long j6 = this.requested.get();
                while (j5 != j6) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    }
                    int i12 = this.otherState;
                    if (i12 == i10) {
                        T t10 = this.singleItem;
                        this.singleItem = null;
                        this.otherState = 2;
                        cVar.onNext(t10);
                        j5++;
                    } else {
                        boolean z11 = this.mainDone;
                        SimplePlainQueue<T> simplePlainQueue = this.queue;
                        if (simplePlainQueue != null) {
                            t5 = simplePlainQueue.poll();
                        } else {
                            t5 = null;
                        }
                        if (t5 == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z11 && z10 && i12 == 2) {
                            this.queue = null;
                            cVar.onComplete();
                            return;
                        } else {
                            if (z10) {
                                break;
                            }
                            cVar.onNext(t5);
                            j5++;
                            i4++;
                            if (i4 == i5) {
                                this.mainSubscription.get().request(i5);
                                i4 = 0;
                            }
                            i10 = 1;
                        }
                    }
                }
                if (j5 == j6) {
                    if (this.cancelled) {
                        this.singleItem = null;
                        this.queue = null;
                        return;
                    }
                    if (this.error.get() != null) {
                        this.singleItem = null;
                        this.queue = null;
                        cVar.onError(this.error.terminate());
                        return;
                    }
                    boolean z12 = this.mainDone;
                    SimplePlainQueue<T> simplePlainQueue2 = this.queue;
                    if (simplePlainQueue2 != null && !simplePlainQueue2.isEmpty()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z12 && z2 && this.otherState == 2) {
                        this.queue = null;
                        cVar.onComplete();
                        return;
                    }
                }
                this.emitted = j5;
                this.consumed = i4;
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                } else {
                    i10 = 1;
                }
            }
        }

        public SimplePlainQueue<T> getOrCreateQueue() {
            SimplePlainQueue<T> simplePlainQueue = this.queue;
            if (simplePlainQueue == null) {
                SpscArrayQueue spscArrayQueue = new SpscArrayQueue(Flowable.bufferSize());
                this.queue = spscArrayQueue;
                return spscArrayQueue;
            }
            return simplePlainQueue;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.mainDone = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.error.addThrowable(th)) {
                DisposableHelper.dispose(this.otherObserver);
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (compareAndSet(0, 1)) {
                long j5 = this.emitted;
                if (this.requested.get() != j5) {
                    SimplePlainQueue<T> simplePlainQueue = this.queue;
                    if (simplePlainQueue != null && !simplePlainQueue.isEmpty()) {
                        simplePlainQueue.offer(t5);
                    } else {
                        this.emitted = j5 + 1;
                        this.downstream.onNext(t5);
                        int i4 = this.consumed + 1;
                        if (i4 == this.limit) {
                            this.consumed = 0;
                            this.mainSubscription.get().request(i4);
                        } else {
                            this.consumed = i4;
                        }
                    }
                } else {
                    getOrCreateQueue().offer(t5);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                getOrCreateQueue().offer(t5);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this.mainSubscription, dVar, this.prefetch);
        }

        public void otherError(Throwable th) {
            if (this.error.addThrowable(th)) {
                SubscriptionHelper.cancel(this.mainSubscription);
                drain();
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        public void otherSuccess(T t5) {
            if (compareAndSet(0, 1)) {
                long j5 = this.emitted;
                if (this.requested.get() != j5) {
                    this.emitted = j5 + 1;
                    this.downstream.onNext(t5);
                    this.otherState = 2;
                } else {
                    this.singleItem = t5;
                    this.otherState = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.singleItem = t5;
                this.otherState = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            drainLoop();
        }

        @Override // qg.d
        public void request(long j5) {
            BackpressureHelper.add(this.requested, j5);
            drain();
        }
    }

    public FlowableMergeWithSingle(Flowable<T> flowable, SingleSource<? extends T> singleSource) {
        super(flowable);
        this.other = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        MergeWithObserver mergeWithObserver = new MergeWithObserver(cVar);
        cVar.onSubscribe(mergeWithObserver);
        this.source.subscribe((FlowableSubscriber) mergeWithObserver);
        this.other.subscribe(mergeWithObserver.otherObserver);
    }
}
