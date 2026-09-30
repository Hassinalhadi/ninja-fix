package io.reactivex.internal.subscriptions;

import java.util.concurrent.atomic.AtomicBoolean;
import qg.d;

/* loaded from: classes2.dex */
public final class BooleanSubscription extends AtomicBoolean implements d {
    private static final long serialVersionUID = -8127758972444290902L;

    @Override // qg.d
    public void cancel() {
        lazySet(true);
    }

    public boolean isCancelled() {
        return get();
    }

    @Override // qg.d
    public void request(long j5) {
        SubscriptionHelper.validate(j5);
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "BooleanSubscription(cancelled=" + get() + ")";
    }
}
