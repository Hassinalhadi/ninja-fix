package io.reactivex.internal.subscribers;

import A0.z;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final c downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<d> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(c cVar) {
        this.downstream = cVar;
    }

    @Override // qg.d
    public void cancel() {
        if (!this.done) {
            SubscriptionHelper.cancel(this.upstream);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        HalfSerializer.onNext(this.downstream, t5, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        } else {
            dVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // qg.d
    public void request(long j5) {
        if (j5 <= 0) {
            cancel();
            onError(new IllegalArgumentException(z.india(j5, "§3.9 violated: positive request amount required but it was ")));
        } else {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j5);
        }
    }
}
