package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;
import qg.d;

/* loaded from: classes2.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<d> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i4) {
        super(i4);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        d andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i4 = 0; i4 < length; i4++) {
                d dVar = get(i4);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (dVar != subscriptionHelper && (andSet = getAndSet(i4, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (get(0) != SubscriptionHelper.CANCELLED) {
            return false;
        }
        return true;
    }

    public d replaceResource(int i4, d dVar) {
        d dVar2;
        do {
            dVar2 = get(i4);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                    return null;
                }
                return null;
            }
        } while (!compareAndSet(i4, dVar2, dVar));
        return dVar2;
    }

    public boolean setResource(int i4, d dVar) {
        d dVar2;
        do {
            dVar2 = get(i4);
            if (dVar2 == SubscriptionHelper.CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                    return false;
                }
                return false;
            }
        } while (!compareAndSet(i4, dVar2, dVar));
        if (dVar2 != null) {
            dVar2.cancel();
            return true;
        }
        return true;
    }
}
