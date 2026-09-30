package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    final int count;

    /* loaded from: classes2.dex */
    public static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final c downstream;
        d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        public TakeLastSubscriber(c cVar, int i4) {
            this.downstream = cVar;
            this.count = i4;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        public void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c cVar = this.downstream;
                long j5 = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j6 = 0;
                        while (j6 != j5) {
                            if (!this.cancelled) {
                                T poll = poll();
                                if (poll == null) {
                                    cVar.onComplete();
                                    return;
                                } else {
                                    cVar.onNext(poll);
                                    j6++;
                                }
                            } else {
                                return;
                            }
                        }
                        if (j6 != 0 && j5 != Long.MAX_VALUE) {
                            j5 = this.requested.addAndGet(-j6);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.count == size()) {
                poll();
            }
            offer(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
                drain();
            }
        }
    }

    public FlowableTakeLast(Flowable<T> flowable, int i4) {
        super(flowable);
        this.count = i4;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeLastSubscriber(cVar, this.count));
    }
}
