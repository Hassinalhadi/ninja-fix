package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.b;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    /* loaded from: classes2.dex */
    public static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final c downstream;
        final boolean nonScheduledRequests;
        b source;
        final Scheduler.Worker worker;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        /* loaded from: classes2.dex */
        public static final class Request implements Runnable {

            /* renamed from: n, reason: collision with root package name */
            final long f12825n;
            final d upstream;

            public Request(d dVar, long j5) {
                this.upstream = dVar;
                this.f12825n = j5;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f12825n);
            }
        }

        public SubscribeOnSubscriber(c cVar, Scheduler.Worker worker, b bVar, boolean z2) {
            this.downstream = cVar;
            this.worker = worker;
            this.source = bVar;
            this.nonScheduledRequests = !z2;
        }

        @Override // qg.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            this.downstream.onNext(t5);
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, dVar);
                }
            }
        }

        @Override // qg.d
        public void request(long j5) {
            if (SubscriptionHelper.validate(j5)) {
                d dVar = this.upstream.get();
                if (dVar != null) {
                    requestUpstream(j5, dVar);
                    return;
                }
                BackpressureHelper.add(this.requested, j5);
                d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, dVar2);
                    }
                }
            }
        }

        public void requestUpstream(long j5, d dVar) {
            if (!this.nonScheduledRequests && Thread.currentThread() != get()) {
                this.worker.schedule(new Request(dVar, j5));
            } else {
                dVar.request(j5);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            b bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z2) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, createWorker, this.source, this.nonScheduledRequests);
        cVar.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
