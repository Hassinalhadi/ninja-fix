package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableRepeat<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;

    /* loaded from: classes2.dex */
    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c downstream;
        long produced;
        long remaining;

        /* renamed from: sa, reason: collision with root package name */
        final SubscriptionArbiter f12817sa;
        final b source;

        public RepeatSubscriber(c cVar, long j5, SubscriptionArbiter subscriptionArbiter, b bVar) {
            this.downstream = cVar;
            this.f12817sa = subscriptionArbiter;
            this.source = bVar;
            this.remaining = j5;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 != 0) {
                subscribeNext();
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            this.f12817sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i4 = 1;
                while (!this.f12817sa.isCancelled()) {
                    long j5 = this.produced;
                    if (j5 != 0) {
                        this.produced = 0L;
                        this.f12817sa.produced(j5);
                    }
                    this.source.subscribe(this);
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRepeat(Flowable<T> flowable, long j5) {
        super(flowable);
        this.count = j5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        long j5 = this.count;
        long j6 = Long.MAX_VALUE;
        if (j5 != Long.MAX_VALUE) {
            j6 = j5 - 1;
        }
        new RepeatSubscriber(cVar, j6, subscriptionArbiter, this.source).subscribeNext();
    }
}
