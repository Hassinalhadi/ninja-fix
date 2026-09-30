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
public final class FlowableIntervalRange extends Flowable<Long> {
    final long end;
    final long initialDelay;
    final long period;
    final Scheduler scheduler;
    final long start;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class IntervalRangeSubscriber extends AtomicLong implements d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        long count;
        final c downstream;
        final long end;
        final AtomicReference<Disposable> resource = new AtomicReference<>();

        public IntervalRangeSubscriber(c cVar, long j5, long j6) {
            this.downstream = cVar;
            this.count = j5;
            this.end = j6;
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
            Disposable disposable = this.resource.get();
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (disposable != disposableHelper) {
                long j5 = get();
                if (j5 != 0) {
                    long j6 = this.count;
                    this.downstream.onNext(Long.valueOf(j6));
                    if (j6 == this.end) {
                        if (this.resource.get() != disposableHelper) {
                            this.downstream.onComplete();
                        }
                        DisposableHelper.dispose(this.resource);
                        return;
                    } else {
                        this.count = j6 + 1;
                        if (j5 != Long.MAX_VALUE) {
                            decrementAndGet();
                            return;
                        }
                        return;
                    }
                }
                this.downstream.onError(new MissingBackpressureException(Q0.c.mike(this.count, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                DisposableHelper.dispose(this.resource);
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.setOnce(this.resource, disposable);
        }
    }

    public FlowableIntervalRange(long j5, long j6, long j7, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.initialDelay = j7;
        this.period = j10;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.start = j5;
        this.end = j6;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        IntervalRangeSubscriber intervalRangeSubscriber = new IntervalRangeSubscriber(cVar, this.start, this.end);
        cVar.onSubscribe(intervalRangeSubscriber);
        Scheduler scheduler = this.scheduler;
        if (scheduler instanceof TrampolineScheduler) {
            Scheduler.Worker createWorker = scheduler.createWorker();
            intervalRangeSubscriber.setResource(createWorker);
            createWorker.schedulePeriodically(intervalRangeSubscriber, this.initialDelay, this.period, this.unit);
            return;
        }
        intervalRangeSubscriber.setResource(scheduler.schedulePeriodicallyDirect(intervalRangeSubscriber, this.initialDelay, this.period, this.unit));
    }
}
