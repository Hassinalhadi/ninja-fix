package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrain;
import io.reactivex.internal.util.QueueDrainHelper;
import qg.c;

/* loaded from: classes2.dex */
public abstract class QueueDrainSubscriber<T, U, V> extends QueueDrainSubscriberPad4 implements FlowableSubscriber<T>, QueueDrain<U, V> {
    protected volatile boolean cancelled;
    protected volatile boolean done;
    protected final c downstream;
    protected Throwable error;
    protected final SimplePlainQueue<U> queue;

    public QueueDrainSubscriber(c cVar, SimplePlainQueue<U> simplePlainQueue) {
        this.downstream = cVar;
        this.queue = simplePlainQueue;
    }

    public boolean accept(c cVar, U u4) {
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean cancelled() {
        return this.cancelled;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean done() {
        return this.done;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final boolean enter() {
        if (this.wip.getAndIncrement() == 0) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final Throwable error() {
        return this.error;
    }

    public final boolean fastEnter() {
        if (this.wip.get() != 0 || !this.wip.compareAndSet(0, 1)) {
            return false;
        }
        return true;
    }

    public final void fastPathEmitMax(U u4, boolean z2, Disposable disposable) {
        c cVar = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j5 = this.requested.get();
            if (j5 != 0) {
                if (accept(cVar, u4) && j5 != Long.MAX_VALUE) {
                    produced(1L);
                }
                if (leave(-1) == 0) {
                    return;
                }
            } else {
                disposable.dispose();
                cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u4);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, cVar, z2, disposable, this);
    }

    public final void fastPathOrderedEmitMax(U u4, boolean z2, Disposable disposable) {
        c cVar = this.downstream;
        SimplePlainQueue<U> simplePlainQueue = this.queue;
        if (fastEnter()) {
            long j5 = this.requested.get();
            if (j5 != 0) {
                if (simplePlainQueue.isEmpty()) {
                    if (accept(cVar, u4) && j5 != Long.MAX_VALUE) {
                        produced(1L);
                    }
                    if (leave(-1) == 0) {
                        return;
                    }
                } else {
                    simplePlainQueue.offer(u4);
                }
            } else {
                this.cancelled = true;
                disposable.dispose();
                cVar.onError(new MissingBackpressureException("Could not emit buffer due to lack of requests"));
                return;
            }
        } else {
            simplePlainQueue.offer(u4);
            if (!enter()) {
                return;
            }
        }
        QueueDrainHelper.drainMaxLoop(simplePlainQueue, cVar, z2, disposable, this);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final int leave(int i4) {
        return this.wip.addAndGet(i4);
    }

    public abstract /* synthetic */ void onComplete();

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.internal.util.QueueDrain
    public final long produced(long j5) {
        return this.requested.addAndGet(-j5);
    }

    @Override // io.reactivex.internal.util.QueueDrain
    public final long requested() {
        return this.requested.get();
    }

    public final void requested(long j5) {
        if (SubscriptionHelper.validate(j5)) {
            BackpressureHelper.add(this.requested, j5);
        }
    }
}
