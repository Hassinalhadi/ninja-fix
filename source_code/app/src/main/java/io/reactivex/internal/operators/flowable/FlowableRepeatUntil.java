package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableRepeatUntil<T> extends AbstractFlowableWithUpstream<T, T> {
    final BooleanSupplier until;

    /* loaded from: classes2.dex */
    public static final class RepeatSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c downstream;
        long produced;

        /* renamed from: sa, reason: collision with root package name */
        final SubscriptionArbiter f12818sa;
        final b source;
        final BooleanSupplier stop;

        public RepeatSubscriber(c cVar, BooleanSupplier booleanSupplier, SubscriptionArbiter subscriptionArbiter, b bVar) {
            this.downstream = cVar;
            this.f12818sa = subscriptionArbiter;
            this.source = bVar;
            this.stop = booleanSupplier;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            try {
                if (this.stop.getAsBoolean()) {
                    this.downstream.onComplete();
                } else {
                    subscribeNext();
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.downstream.onError(th);
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
            this.f12818sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i4 = 1;
                while (!this.f12818sa.isCancelled()) {
                    long j5 = this.produced;
                    if (j5 != 0) {
                        this.produced = 0L;
                        this.f12818sa.produced(j5);
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

    public FlowableRepeatUntil(Flowable<T> flowable, BooleanSupplier booleanSupplier) {
        super(flowable);
        this.until = booleanSupplier;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RepeatSubscriber(cVar, this.until, subscriptionArbiter, this.source).subscribeNext();
    }
}
