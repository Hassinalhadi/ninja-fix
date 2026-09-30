package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTake<T> extends AbstractFlowableWithUpstream<T, T> {
    final long limit;

    /* loaded from: classes2.dex */
    public static final class TakeSubscriber<T> extends AtomicBoolean implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5636543848937116287L;
        boolean done;
        final c downstream;
        final long limit;
        long remaining;
        d upstream;

        public TakeSubscriber(c cVar, long j5) {
            this.downstream = cVar;
            this.limit = j5;
            this.remaining = j5;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (!this.done) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(th);
                return;
            }
            RxJavaPlugins.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            boolean z2;
            if (!this.done) {
                long j5 = this.remaining;
                long j6 = j5 - 1;
                this.remaining = j6;
                if (j5 > 0) {
                    if (j6 == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.downstream.onNext(t5);
                    if (z2) {
                        this.upstream.cancel();
                        onComplete();
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                if (this.limit == 0) {
                    dVar.cancel();
                    this.done = true;
                    EmptySubscription.complete(this.downstream);
                    return;
                }
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (!SubscriptionHelper.validate(j5)) {
                return;
            }
            if (!get() && compareAndSet(false, true) && j5 >= this.limit) {
                this.upstream.request(Long.MAX_VALUE);
            } else {
                this.upstream.request(j5);
            }
        }
    }

    public FlowableTake(Flowable<T> flowable, long j5) {
        super(flowable);
        this.limit = j5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeSubscriber(cVar, this.limit));
    }
}
