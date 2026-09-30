package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class aj extends AbstractBinderC1398z implements ao {
    public final AtomicReference golf;
    public boolean hotel;

    public aj() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.golf = new AtomicReference();
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r3 = r3.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(Bundle bundle, Class cls) {
        Object obj;
        if (bundle != null && obj != null) {
            try {
                return cls.cast(obj);
            } catch (ClassCastException e) {
                Log.w("AM", av.q.foxtrot("Unexpected object type. Expected, Received: ", cls.getCanonicalName(), ", ", obj.getClass().getCanonicalName()), e);
                throw e;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            Bundle bundle = (Bundle) aa.alpha(parcel, Bundle.CREATOR);
            aa.bravo(parcel);
            november(bundle);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }

    public final Bundle charlie(long j5) {
        Bundle bundle;
        AtomicReference atomicReference = this.golf;
        synchronized (atomicReference) {
            if (!this.hotel) {
                try {
                    atomicReference.wait(j5);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.golf.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.ao
    public final void november(Bundle bundle) {
        AtomicReference atomicReference = this.golf;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.hotel = true;
                } finally {
                    this.golf.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
