package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public abstract class BasicFuseableSubscriber<T, R> implements FlowableSubscriber<T>, QueueSubscription<R> {
    protected boolean done;
    protected final c downstream;
    protected QueueSubscription<T> qs;
    protected int sourceMode;
    protected d upstream;

    public BasicFuseableSubscriber(c cVar) {
        this.downstream = cVar;
    }

    public void afterDownstream() {
    }

    public boolean beforeDownstream() {
        return true;
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, qg.d
    public void cancel() {
        this.upstream.cancel();
    }

    public void clear() {
        this.qs.clear();
    }

    public final void fail(Throwable th) {
        Exceptions.throwIfFatal(th);
        this.upstream.cancel();
        onError(th);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        return this.qs.isEmpty();
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r4) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        this.downstream.onComplete();
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
        } else {
            this.done = true;
            this.downstream.onError(th);
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public final void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            if (dVar instanceof QueueSubscription) {
                this.qs = (QueueSubscription) dVar;
            }
            if (beforeDownstream()) {
                this.downstream.onSubscribe(this);
                afterDownstream();
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueSubscription, qg.d
    public void request(long j5) {
        this.upstream.request(j5);
    }

    public final int transitiveBoundaryFusion(int i4) {
        QueueSubscription<T> queueSubscription = this.qs;
        if (queueSubscription != null && (i4 & 4) == 0) {
            int requestFusion = queueSubscription.requestFusion(i4);
            if (requestFusion != 0) {
                this.sourceMode = requestFusion;
            }
            return requestFusion;
        }
        return 0;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(R r4, R r5) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
