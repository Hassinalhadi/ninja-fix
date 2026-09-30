package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableDematerialize<T, R> extends AbstractFlowableWithUpstream<T, R> {
    final Function<? super T, ? extends Notification<R>> selector;

    /* loaded from: classes2.dex */
    public static final class DematerializeSubscriber<T, R> implements FlowableSubscriber<T>, d {
        boolean done;
        final c downstream;
        final Function<? super T, ? extends Notification<R>> selector;
        d upstream;

        public DematerializeSubscriber(c cVar, Function<? super T, ? extends Notification<R>> function) {
            this.downstream = cVar;
            this.selector = function;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.downstream.onComplete();
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.done) {
                if (t5 instanceof Notification) {
                    Notification notification = (Notification) t5;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.selector.apply(t5), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.upstream.cancel();
                    onError(notification2.getError());
                } else if (notification2.isOnComplete()) {
                    this.upstream.cancel();
                    onComplete();
                } else {
                    this.downstream.onNext(notification2.getValue());
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public FlowableDematerialize(Flowable<T> flowable, Function<? super T, ? extends Notification<R>> function) {
        super(flowable);
        this.selector = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new DematerializeSubscriber(cVar, this.selector));
    }
}
