package io.reactivex.internal.subscriptions;

import A0.z;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import qg.d;

/* loaded from: classes2.dex */
public enum SubscriptionHelper implements d {
    CANCELLED;

    public static void deferredRequest(AtomicReference<d> atomicReference, AtomicLong atomicLong, long j5) {
        d dVar = atomicReference.get();
        if (dVar != null) {
            dVar.request(j5);
            return;
        }
        if (validate(j5)) {
            BackpressureHelper.add(atomicLong, j5);
            d dVar2 = atomicReference.get();
            if (dVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    dVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<d> atomicReference, AtomicLong atomicLong, d dVar) {
        if (setOnce(atomicReference, dVar)) {
            long andSet = atomicLong.getAndSet(0L);
            if (andSet != 0) {
                dVar.request(andSet);
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean replace(AtomicReference<d> atomicReference, d dVar) {
        while (true) {
            d dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                    return false;
                }
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            return true;
        }
    }

    public static void reportMoreProduced(long j5) {
        RxJavaPlugins.onError(new ProtocolViolationException(z.india(j5, "More produced than requested: ")));
    }

    public static void reportSubscriptionSet() {
        RxJavaPlugins.onError(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<d> atomicReference, d dVar) {
        while (true) {
            d dVar2 = atomicReference.get();
            if (dVar2 == CANCELLED) {
                if (dVar != null) {
                    dVar.cancel();
                    return false;
                }
                return false;
            }
            while (!atomicReference.compareAndSet(dVar2, dVar)) {
                if (atomicReference.get() != dVar2) {
                    break;
                }
            }
            if (dVar2 != null) {
                dVar2.cancel();
                return true;
            }
            return true;
        }
    }

    public static boolean setOnce(AtomicReference<d> atomicReference, d dVar) {
        ObjectHelper.requireNonNull(dVar, "s is null");
        while (!atomicReference.compareAndSet(null, dVar)) {
            if (atomicReference.get() != null) {
                dVar.cancel();
                if (atomicReference.get() == CANCELLED) {
                    return false;
                }
                reportSubscriptionSet();
                return false;
            }
        }
        return true;
    }

    public static boolean validate(d dVar, d dVar2) {
        if (dVar2 == null) {
            RxJavaPlugins.onError(new NullPointerException("next is null"));
            return false;
        }
        if (dVar == null) {
            return true;
        }
        dVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // qg.d
    public void cancel() {
    }

    @Override // qg.d
    public void request(long j5) {
    }

    public static boolean cancel(AtomicReference<d> atomicReference) {
        d andSet;
        d dVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (dVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static boolean validate(long j5) {
        if (j5 > 0) {
            return true;
        }
        RxJavaPlugins.onError(new IllegalArgumentException(z.india(j5, "n > 0 required but it was ")));
        return false;
    }

    public static boolean setOnce(AtomicReference<d> atomicReference, d dVar, long j5) {
        if (!setOnce(atomicReference, dVar)) {
            return false;
        }
        dVar.request(j5);
        return true;
    }
}
