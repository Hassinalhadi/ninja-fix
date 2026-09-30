package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1398z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class B0 extends AbstractBinderC1398z implements ag {
    public final /* synthetic */ AtomicReference golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.golf = atomicReference;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzov.CREATOR);
            com.google.android.gms.internal.measurement.aa.bravo(parcel);
            cyan(createTypedArrayList);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.ag
    public final void cyan(List list) {
        AtomicReference atomicReference = this.golf;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
