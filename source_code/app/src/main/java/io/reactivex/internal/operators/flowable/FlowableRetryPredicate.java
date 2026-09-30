package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;
    final Predicate<? super Throwable> predicate;

    /* loaded from: classes2.dex */
    public static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c downstream;
        final Predicate<? super Throwable> predicate;
        long produced;
        long remaining;

        /* renamed from: sa, reason: collision with root package name */
        final SubscriptionArbiter f12821sa;
        final b source;

        public RetrySubscriber(c cVar, long j5, Predicate<? super Throwable> predicate, SubscriptionArbiter subscriptionArbiter, b bVar) {
            this.downstream = cVar;
            this.f12821sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = predicate;
            this.remaining = j5;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            long j5 = this.remaining;
            if (j5 != Long.MAX_VALUE) {
                this.remaining = j5 - 1;
            }
            if (j5 == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (!this.predicate.test(th)) {
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
            this.f12821sa.setSubscription(dVar);
        }

        public void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i4 = 1;
                while (!this.f12821sa.isCancelled()) {
                    long j5 = this.produced;
                    if (j5 != 0) {
                        this.produced = 0L;
                        this.f12821sa.produced(j5);
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

    public FlowableRetryPredicate(Flowable<T> flowable, long j5, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.predicate = predicate;
        this.count = j5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(cVar, this.count, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
