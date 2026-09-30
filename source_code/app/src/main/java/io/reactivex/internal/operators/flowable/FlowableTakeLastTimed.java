package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class FlowableTakeLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class TakeLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final long count;
        final boolean delayError;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        d upstream;

        public TakeLastTimedSubscriber(c cVar, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
            this.downstream = cVar;
            this.count = j5;
            this.time = j6;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i4);
            this.delayError = z2;
        }

        @Override // qg.d
        public void cancel() {
            if (!this.cancelled) {
                this.cancelled = true;
                this.upstream.cancel();
                if (getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z2, c cVar, boolean z10) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z10) {
                if (z2) {
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                cVar.onError(th2);
                return true;
            }
            if (z2) {
                cVar.onComplete();
                return true;
            }
            return false;
        }

        public void drain() {
            boolean z2;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                boolean z10 = this.delayError;
                int i4 = 1;
                do {
                    if (this.done) {
                        if (!checkTerminated(spscLinkedArrayQueue.isEmpty(), cVar, z10)) {
                            long j5 = this.requested.get();
                            long j6 = 0;
                            while (true) {
                                if (spscLinkedArrayQueue.peek() == null) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!checkTerminated(z2, cVar, z10)) {
                                    if (j5 == j6) {
                                        if (j6 != 0) {
                                            BackpressureHelper.produced(this.requested, j6);
                                        }
                                    } else {
                                        spscLinkedArrayQueue.poll();
                                        cVar.onNext(spscLinkedArrayQueue.poll());
                                        j6++;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    i4 = addAndGet(-i4);
                } while (i4 != 0);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onComplete() {
            trim(this.scheduler.now(this.unit), this.queue);
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onError(Throwable th) {
            if (this.delayError) {
                trim(this.scheduler.now(this.unit), this.queue);
            }
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, qg.c
        public void onNext(T t5) {
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            long now = this.scheduler.now(this.unit);
            spscLinkedArrayQueue.offer(Long.valueOf(now), t5);
            trim(now, spscLinkedArrayQueue);
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
                drain();
            }
        }

        public void trim(long j5, SpscLinkedArrayQueue<Object> spscLinkedArrayQueue) {
            boolean z2;
            long j6 = this.time;
            long j7 = this.count;
            if (j7 == Long.MAX_VALUE) {
                z2 = true;
            } else {
                z2 = false;
            }
            while (!spscLinkedArrayQueue.isEmpty()) {
                if (((Long) spscLinkedArrayQueue.peek()).longValue() < j5 - j6 || (!z2 && (spscLinkedArrayQueue.size() >> 1) > j7)) {
                    spscLinkedArrayQueue.poll();
                    spscLinkedArrayQueue.poll();
                } else {
                    return;
                }
            }
        }
    }

    public FlowableTakeLastTimed(Flowable<T> flowable, long j5, long j6, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
        super(flowable);
        this.count = j5;
        this.time = j6;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeLastTimedSubscriber(cVar, this.count, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
