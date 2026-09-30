package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import qg.c;

/* loaded from: classes2.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final c downstream;
    protected T value;

    public DeferredScalarSubscription(c cVar) {
        this.downstream = cVar;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t5) {
        int i4 = get();
        while (i4 != 8) {
            if ((i4 & (-3)) == 0) {
                if (i4 == 2) {
                    lazySet(3);
                    c cVar = this.downstream;
                    cVar.onNext(t5);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
                this.value = t5;
                if (compareAndSet(0, 1)) {
                    return;
                }
                i4 = get();
                if (i4 == 4) {
                    this.value = null;
                    return;
                }
            } else {
                return;
            }
        }
        this.value = t5;
        lazySet(16);
        c cVar2 = this.downstream;
        cVar2.onNext(t5);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        if (get() == 4) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        if (get() != 16) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t5 = this.value;
        this.value = null;
        return t5;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, qg.d
    public final void request(long j5) {
        T t5;
        if (!SubscriptionHelper.validate(j5)) {
            return;
        }
        do {
            int i4 = get();
            if ((i4 & (-2)) == 0) {
                if (i4 == 1) {
                    if (compareAndSet(1, 3) && (t5 = this.value) != null) {
                        this.value = null;
                        c cVar = this.downstream;
                        cVar.onNext(t5);
                        if (get() != 4) {
                            cVar.onComplete();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(0, 2));
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i4) {
        if ((i4 & 2) != 0) {
            lazySet(8);
            return 2;
        }
        return 0;
    }

    public final boolean tryCancel() {
        if (getAndSet(4) != 4) {
            return true;
        }
        return false;
    }
}
