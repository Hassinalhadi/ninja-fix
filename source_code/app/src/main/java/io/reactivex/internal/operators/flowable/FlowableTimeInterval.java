package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, d {
        final c downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
        d upstream;

        public TimeIntervalSubscriber(c cVar, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = cVar;
            this.scheduler = scheduler;
            this.unit = timeUnit;
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
            long now = this.scheduler.now(this.unit);
            long j5 = this.lastTime;
            this.lastTime = now;
            this.downstream.onNext(new Timed(t5, now - j5, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            this.upstream.request(j5);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(cVar, this.unit, this.scheduler));
    }
}
