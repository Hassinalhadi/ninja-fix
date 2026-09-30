package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTimer extends Flowable<Long> {
    final long delay;
    final Scheduler scheduler;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TimerSubscriber extends AtomicReference<Disposable> implements d, Runnable {
        private static final long serialVersionUID = -2809475196591179431L;
        final c downstream;
        volatile boolean requested;

        public TimerSubscriber(c cVar) {
            this.downstream = cVar;
        }

        @Override // qg.d
        public void cancel() {
            DisposableHelper.dispose(this);
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                this.requested = true;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (get() != DisposableHelper.DISPOSED) {
                if (this.requested) {
                    this.downstream.onNext(0L);
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onComplete();
                } else {
                    lazySet(EmptyDisposable.INSTANCE);
                    this.downstream.onError(new MissingBackpressureException("Can't deliver value due to lack of requests"));
                }
            }
        }

        public void setResource(Disposable disposable) {
            DisposableHelper.trySet(this, disposable);
        }
    }

    public FlowableTimer(long j5, TimeUnit timeUnit, Scheduler scheduler) {
        this.delay = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        TimerSubscriber timerSubscriber = new TimerSubscriber(cVar);
        cVar.onSubscribe(timerSubscriber);
        timerSubscriber.setResource(this.scheduler.scheduleDirect(timerSubscriber, this.delay, this.unit));
    }
}
