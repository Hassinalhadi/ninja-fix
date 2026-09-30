package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSwitchIfEmpty<T> extends AbstractFlowableWithUpstream<T, T> {
    final b other;

    /* loaded from: classes2.dex */
    public static final class SwitchIfEmptySubscriber<T> implements FlowableSubscriber<T> {
        final c downstream;
        final b other;
        boolean empty = true;
        final SubscriptionArbiter arbiter = new SubscriptionArbiter(false);

        public SwitchIfEmptySubscriber(c cVar, b bVar) {
            this.downstream = cVar;
            this.other = bVar;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.empty) {
                this.empty = false;
                this.other.subscribe(this);
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
            if (this.empty) {
                this.empty = false;
            }
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            this.arbiter.setSubscription(dVar);
        }
    }

    public FlowableSwitchIfEmpty(Flowable<T> flowable, b bVar) {
        super(flowable);
        this.other = bVar;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SwitchIfEmptySubscriber switchIfEmptySubscriber = new SwitchIfEmptySubscriber(cVar, this.other);
        cVar.onSubscribe(switchIfEmptySubscriber.arbiter);
        this.source.subscribe((FlowableSubscriber) switchIfEmptySubscriber);
    }
}
