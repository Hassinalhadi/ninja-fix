package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiPredicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableRetryBiPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final BiPredicate<? super Integer, ? super Throwable> predicate;

    /* loaded from: classes2.dex */
    public static final class RetryBiSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c downstream;
        final BiPredicate<? super Integer, ? super Throwable> predicate;
        long produced;
        int retries;

        /* renamed from: sa, reason: collision with root package name */
        final SubscriptionArbiter f12820sa;
        final b source;

        public RetryBiSubscriber(c cVar, BiPredicate<? super Integer, ? super Throwable> biPredicate, SubscriptionArbiter subscriptionArbiter, b bVar) {
            this.downstream = cVar;
            this.f12820sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = biPredicate;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            try {
                BiPredicate<? super Integer, ? super Throwable> biPredicate = this.predicate;
                int i4 = this.retries + 1;
                this.retries = i4;
                if (!biPredicate.test(Integer.valueOf(i4), th)) {
                    this.downstream.onError(th);
                } else {
                    subscribeNext();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.produced++;
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            this.f12820sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i4 = 1;
                while (!this.f12820sa.isCancelled()) {
                    long j5 = this.produced;
                    if (j5 != 0) {
                        this.produced = 0L;
                        this.f12820sa.produced(j5);
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

    public FlowableRetryBiPredicate(Flowable<T> flowable, BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        super(flowable);
        this.predicate = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RetryBiSubscriber(cVar, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
