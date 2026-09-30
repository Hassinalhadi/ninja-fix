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
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    /* loaded from: classes2.dex */
    public static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
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

        public SkipLastTimedSubscriber(c cVar, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
            this.downstream = cVar;
            this.time = j5;
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

        public boolean checkTerminated(boolean z2, boolean z10, c cVar, boolean z11) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (z2) {
                if (z11) {
                    if (z10) {
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
                if (z10) {
                    cVar.onComplete();
                    return true;
                }
                return false;
            }
            return false;
        }

        public void drain() {
            long j5;
            boolean z2;
            boolean z10;
            if (getAndIncrement() == 0) {
                c cVar = this.downstream;
                SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
                boolean z11 = this.delayError;
                TimeUnit timeUnit = this.unit;
                Scheduler scheduler = this.scheduler;
                long j6 = this.time;
                int i4 = 1;
                do {
                    long j7 = this.requested.get();
                    long j10 = 0;
                    while (true) {
                        if (j10 != j7) {
                            boolean z12 = this.done;
                            Long l10 = (Long) spscLinkedArrayQueue.peek();
                            if (l10 == null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            long now = scheduler.now(timeUnit);
                            if (!z2 && l10.longValue() > now - j6) {
                                z10 = true;
                            } else {
                                z10 = z2;
                            }
                            j5 = 0;
                            if (!checkTerminated(z12, z10, cVar, z11)) {
                                if (z10) {
                                    break;
                                }
                                spscLinkedArrayQueue.poll();
                                cVar.onNext(spscLinkedArrayQueue.poll());
                                j10++;
                            } else {
                                return;
                            }
                        } else {
                            j5 = 0;
                            break;
                        }
                    }
                    if (j10 != j5) {
                        BackpressureHelper.produced(this.requested, j10);
                    }
                    i4 = addAndGet(-i4);
                } while (i4 != 0);
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
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t5);
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
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j5, TimeUnit timeUnit, Scheduler scheduler, int i4, boolean z2) {
        super(flowable);
        this.time = j5;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i4;
        this.delayError = z2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(cVar, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
