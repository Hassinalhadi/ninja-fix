package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSkipWhile<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    /* loaded from: classes2.dex */
    public static final class SkipWhileSubscriber<T> implements FlowableSubscriber<T>, d {
        final c downstream;
        boolean notSkipping;
        final Predicate<? super T> predicate;
        d upstream;

        public SkipWhileSubscriber(c cVar, Predicate<? super T> predicate) {
            this.downstream = cVar;
            this.predicate = predicate;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            if (this.notSkipping) {
                this.downstream.onNext(t5);
                return;
            }
            try {
                if (this.predicate.test(t5)) {
                    this.upstream.request(1L);
                } else {
                    this.notSkipping = true;
                    this.downstream.onNext(t5);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.downstream.onError(th);
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

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipWhileSubscriber(cVar, this.predicate));
    }
}
