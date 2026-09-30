package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final boolean failOnEmpty;

    /* loaded from: classes2.dex */
    public static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        d upstream;

        public SingleElementSubscriber(c cVar, T t5, boolean z2) {
            super(cVar);
            this.defaultValue = t5;
            this.failOnEmpty = z2;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t5 = this.value;
            this.value = null;
            if (t5 == null) {
                t5 = this.defaultValue;
            }
            if (t5 == null) {
                if (this.failOnEmpty) {
                    this.downstream.onError(new NoSuchElementException());
                    return;
                } else {
                    this.downstream.onComplete();
                    return;
                }
            }
            complete(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                return;
            }
            if (this.value != null) {
                this.done = true;
                this.upstream.cancel();
                this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                return;
            }
            this.value = t5;
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(Flowable<T> flowable, T t5, boolean z2) {
        super(flowable);
        this.defaultValue = t5;
        this.failOnEmpty = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SingleElementSubscriber(cVar, this.defaultValue, this.failOnEmpty));
    }
}
