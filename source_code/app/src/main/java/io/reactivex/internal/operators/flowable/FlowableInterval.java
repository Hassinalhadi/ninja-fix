package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.schedulers.TrampolineScheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableInterval extends Flowable<Long> {
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class IntervalSubscriber extends AtomicLong implements d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final c downstream;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalSubscriber(c cVar) {
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            DisposableHelper.dispose(this.resource);
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.resource.get() != DisposableHelper.DISPOSED) {
                if (get() != 0) {
                    c cVar = this.downstream;
                    long j5 = this.count;
                    this.count = j5 + 1;
                    cVar.onNext(Long.valueOf(j5));
                    BackpressureHelper.produced(this, 1L);
                    return;
                }
                this.downstream.onError(new MissingBackpressureException(Q0.c.mike(this.count, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableInterval(long j5, long j6, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j5;
        this.period = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        IntervalSubscriber intervalSubscriber = new IntervalSubscriber(cVar);
        cVar.onSubscribe(intervalSubscriber);
        Scheduler scheduler = this.scheduler;
        if (scheduler instanceof TrampolineScheduler) {
            Scheduler.Worker createWorker = scheduler.createWorker();
            intervalSubscriber.setResource(createWorker);
            createWorker.schedulePeriodically(intervalSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalSubscriber, this.initialDelay, this.period, this.unit));
    }
}
