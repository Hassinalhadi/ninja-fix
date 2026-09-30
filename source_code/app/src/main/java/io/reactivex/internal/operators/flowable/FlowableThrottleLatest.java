package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableThrottleLatest<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean emitLast;
    final Scheduler scheduler;
    final long timeout;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class ThrottleLatestSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        final boolean emitLast;
        long emitted;
        Throwable error;
        final AtomicReference<T> latest = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();
        final long timeout;
        volatile boolean timerFired;
        boolean timerRunning;
        final TimeUnit unit;
        d upstream;
        final Scheduler.Worker worker;

        public ThrottleLatestSubscriber(c cVar, long j5, TimeUnit timeUnit, Scheduler.Worker worker, boolean z2) {
            this.downstream = cVar;
            this.timeout = j5;
            this.unit = timeUnit;
            this.worker = worker;
            this.emitLast = z2;
        }

        @Override // qg.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.latest.lazySet(null);
            }
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                AtomicReference<T> atomicReference = this.latest;
                AtomicLong atomicLong = this.requested;
                c cVar = this.downstream;
                int i4 = 1;
                while (!this.cancelled) {
                    boolean z10 = this.done;
                    if (z10 && this.error != null) {
                        atomicReference.lazySet(null);
                        cVar.onError(this.error);
                        this.worker.dispose();
                        return;
                    }
                    if (atomicReference.get() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z10) {
                        if (!z2 && this.emitLast) {
                            T andSet = atomicReference.getAndSet(null);
                            long j5 = this.emitted;
                            if (j5 != atomicLong.get()) {
                                this.emitted = j5 + 1;
                                cVar.onNext(andSet);
                                cVar.onComplete();
                            } else {
                                cVar.onError(new MissingBackpressureException("Could not emit final value due to lack of requests"));
                            }
                        } else {
                            atomicReference.lazySet(null);
                            cVar.onComplete();
                        }
                        this.worker.dispose();
                        return;
                    }
                    if (z2) {
                        if (this.timerFired) {
                            this.timerRunning = false;
                            this.timerFired = false;
                        }
                    } else if (!this.timerRunning || this.timerFired) {
                        T andSet2 = atomicReference.getAndSet(null);
                        long j6 = this.emitted;
                        if (j6 != atomicLong.get()) {
                            cVar.onNext(andSet2);
                            this.emitted = j6 + 1;
                            this.timerFired = false;
                            this.timerRunning = true;
                            this.worker.schedule(this, this.timeout, this.unit);
                        } else {
                            this.upstream.cancel();
                            cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
                            this.worker.dispose();
                            return;
                        }
                    }
                    i4 = addAndGet(-i4);
                    if (i4 == 0) {
                        return;
                    }
                }
                atomicReference.lazySet(null);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.latest.set(t5);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                BackpressureHelper.add(this.requested, j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.timerFired = true;
            drain();
        }
    }

    public FlowableThrottleLatest(Flowable<T> flowable, long j5, TimeUnit timeUnit, Scheduler scheduler, boolean z2) {
        super(flowable);
        this.timeout = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.emitLast = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new ThrottleLatestSubscriber(cVar, this.timeout, this.unit, this.scheduler.createWorker(), this.emitLast));
    }
}
