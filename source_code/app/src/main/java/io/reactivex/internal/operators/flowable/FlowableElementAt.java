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
public final class FlowableElementAt<T> extends AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final boolean errorOnFewer;
    final long index;

    /* loaded from: classes2.dex */
    public static final class ElementAtSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = 4066607327284737757L;
        long count;
        final T defaultValue;
        boolean done;
        final boolean errorOnFewer;
        final long index;
        d upstream;

        public ElementAtSubscriber(c cVar, long j5, T t5, boolean z2) {
            super(cVar);
            this.index = j5;
            this.defaultValue = t5;
            this.errorOnFewer = z2;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (!this.done) {
                this.done = true;
                T t5 = this.defaultValue;
                if (t5 == null) {
                    if (this.errorOnFewer) {
                        this.downstream.onError(new NoSuchElementException());
                        return;
                    } else {
                        this.downstream.onComplete();
                        return;
                    }
                }
                complete(t5);
            }
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
            long j5 = this.count;
            if (j5 == this.index) {
                this.done = true;
                this.upstream.cancel();
                complete(t5);
                return;
            }
            this.count = j5 + 1;
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

    public FlowableElementAt(Flowable<T> flowable, long j5, T t5, boolean z2) {
        super(flowable);
        this.index = j5;
        this.defaultValue = t5;
        this.errorOnFewer = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ElementAtSubscriber(cVar, this.index, this.defaultValue, this.errorOnFewer));
    }
}
