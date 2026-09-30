package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public final class BlockingSubscriber<T> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
    public static final Object TERMINATED = new Object();
    private static final long serialVersionUID = -4875965440900746268L;
    final Queue<Object> queue;

    public BlockingSubscriber(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override // qg.d
    public void cancel() {
        if (SubscriptionHelper.cancel(this)) {
            this.queue.offer(TERMINATED);
        }
    }

    public boolean isCancelled() {
        if (get() == SubscriptionHelper.CANCELLED) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        this.queue.offer(NotificationLite.complete());
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        this.queue.offer(NotificationLite.error(th));
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        this.queue.offer(NotificationLite.next(t5));
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.setOnce(this, dVar)) {
            this.queue.offer(NotificationLite.subscription(this));
        }
    }

    @Override // qg.d
    public void request(long j5) {
        get().request(j5);
    }
}
