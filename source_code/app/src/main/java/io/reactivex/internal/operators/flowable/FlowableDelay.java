package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class DelaySubscriber<T> implements FlowableSubscriber<T>, d {
        final long delay;
        final boolean delayError;
        final c downstream;
        final TimeUnit unit;
        d upstream;

        /* renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f12810w;

        /* loaded from: classes2.dex */
        public final class OnComplete implements Runnable {
            public OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f12810w.dispose();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnError implements Runnable {

            /* renamed from: t, reason: collision with root package name */
            private final Throwable f12811t;

            public OnError(Throwable th) {
                this.f12811t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f12811t);
                } finally {
                    DelaySubscriber.this.f12810w.dispose();
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class OnNext implements Runnable {

            /* renamed from: t, reason: collision with root package name */
            private final T f12812t;

            public OnNext(T t5) {
                this.f12812t = t5;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f12812t);
            }
        }

        public DelaySubscriber(c cVar, long j5, TimeUnit timeUnit, Scheduler.Worker worker, boolean z2) {
            this.downstream = cVar;
            this.delay = j5;
            this.unit = timeUnit;
            this.f12810w = worker;
            this.delayError = z2;
        }

        @Override // qg.d
        public void cancel() {
            this.upstream.cancel();
            this.f12810w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.f12810w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            long j5;
            Scheduler.Worker worker = this.f12810w;
            OnError onError = new OnError(th);
            if (this.delayError) {
                j5 = this.delay;
            } else {
                j5 = 0;
            }
            worker.schedule(onError, j5, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.f12810w.schedule(new OnNext(t5), this.delay, this.unit);
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

    public FlowableDelay(Flowable<T> flowable, long j5, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        super(flowable);
        this.delay = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        c serializedSubscriber;
        if (this.delayError) {
            serializedSubscriber = cVar;
        } else {
            serializedSubscriber = new SerializedSubscriber(cVar);
        }
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(serializedSubscriber, this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
