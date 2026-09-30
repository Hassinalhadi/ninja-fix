package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n, reason: collision with root package name */
    final long f12815n;

    /* loaded from: classes2.dex */
    public static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2288246011222124525L;
        final c downstream;
        long remaining;
        d upstream;

        public LimitSubscriber(c cVar, long j5) {
            this.downstream = cVar;
            this.remaining = j5;
            lazySet(j5);
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onError(th);
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            long j5 = this.remaining;
            if (j5 > 0) {
                long j6 = j5 - 1;
                this.remaining = j6;
                this.downstream.onNext(t5);
                if (j6 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                if (this.remaining == 0) {
                    dVar.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = dVar;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            long j6;
            long j7;
            if (!SubscriptionHelper.validate(j5)) {
                return;
            }
            do {
                j6 = get();
                if (j6 != 0) {
                    if (j6 <= j5) {
                        j7 = j6;
                    } else {
                        j7 = j5;
                    }
                } else {
                    return;
                }
            } while (!compareAndSet(j6, j6 - j7));
            this.upstream.request(j7);
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j5) {
        super(flowable);
        this.f12815n = j5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(cVar, this.f12815n));
    }
}
