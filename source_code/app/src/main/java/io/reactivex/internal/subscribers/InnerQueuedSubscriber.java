package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public final class InnerQueuedSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = 22876611072430776L;
    volatile boolean done;
    int fusionMode;
    final int limit;
    final InnerQueuedSubscriberSupport<T> parent;
    final int prefetch;
    long produced;
    volatile SimpleQueue<T> queue;

    public InnerQueuedSubscriber(InnerQueuedSubscriberSupport<T> innerQueuedSubscriberSupport, int i4) {
        this.parent = innerQueuedSubscriberSupport;
        this.prefetch = i4;
        this.limit = i4 - (i4 >> 2);
    }

    @Override // qg.d
    public void cancel() {
        SubscriptionHelper.cancel(this);
    }

    public boolean isDone() {
        return this.done;
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        this.parent.innerComplete(this);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        this.parent.innerError(this, th);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        if (this.fusionMode == 0) {
            this.parent.innerNext(this, t5);
        } else {
            this.parent.drain();
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            if (dVar instanceof QueueSubscription) {
                QueueSubscription queueSubscription = (QueueSubscription) dVar;
                int requestFusion = queueSubscription.requestFusion(3);
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    this.done = true;
                    this.parent.innerComplete(this);
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueSubscription;
                    QueueDrainHelper.request(dVar, this.prefetch);
                    return;
                }
            }
            this.queue = QueueDrainHelper.createQueue(this.prefetch);
            QueueDrainHelper.request(dVar, this.prefetch);
        }
    }

    public SimpleQueue<T> queue() {
        return this.queue;
    }

    @Override // qg.d
    public void request(long j5) {
        if (this.fusionMode != 1) {
            long j6 = this.produced + j5;
            if (j6 >= this.limit) {
                this.produced = 0L;
                get().request(j6);
            } else {
                this.produced = j6;
            }
        }
    }

    public void requestOne() {
        if (this.fusionMode != 1) {
            long j5 = this.produced + 1;
            if (j5 == this.limit) {
                this.produced = 0L;
                get().request(j5);
            } else {
                this.produced = j5;
            }
        }
    }

    public void setDone() {
        this.done = true;
    }
}
