package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSkip<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n, reason: collision with root package name */
    final long f12824n;

    /* loaded from: classes2.dex */
    public static final class SkipSubscriber<T> implements FlowableSubscriber<T>, d {
        final c downstream;
        long remaining;
        d upstream;

        public SkipSubscriber(c cVar, long j5) {
            this.downstream = cVar;
            this.remaining = j5;
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
            long j5 = this.remaining;
            if (j5 != 0) {
                this.remaining = j5 - 1;
            } else {
                this.downstream.onNext(t5);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                long j5 = this.remaining;
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(j5);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public FlowableSkip(Flowable<T> flowable, long j5) {
        super(flowable);
        this.f12824n = j5;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipSubscriber(cVar, this.f12824n));
    }
}
