package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final c downstream;
    protected long produced;
    protected d upstream;
    protected R value;

    public SinglePostCompleteSubscriber(c cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    public final void complete(R r4) {
        long j5 = this.produced;
        if (j5 != 0) {
            BackpressureHelper.produced(this, j5);
        }
        while (true) {
            long j6 = get();
            if ((j6 & COMPLETE_MASK) != 0) {
                onDrop(r4);
                return;
            }
            if ((j6 & REQUEST_MASK) != 0) {
                lazySet(-9223372036854775807L);
                this.downstream.onNext(r4);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r4;
                if (compareAndSet(0L, COMPLETE_MASK)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    public void onDrop(R r4) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // qg.d
    public final void request(long j5) {
        long j6;
        if (!SubscriptionHelper.validate(j5)) {
            return;
        }
        do {
            j6 = get();
            if ((j6 & COMPLETE_MASK) != 0) {
                if (compareAndSet(COMPLETE_MASK, -9223372036854775807L)) {
                    this.downstream.onNext(this.value);
                    this.downstream.onComplete();
                    return;
                }
                return;
            }
        } while (!compareAndSet(j6, BackpressureHelper.addCap(j6, j5)));
        this.upstream.request(j5);
    }
}
