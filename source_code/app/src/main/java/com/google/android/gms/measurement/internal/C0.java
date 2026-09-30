package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractBinderC1398z;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class C0 extends AbstractBinderC1398z implements ai {
    public final /* synthetic */ AtomicReference golf;
    public final /* synthetic */ H0 hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(H0 h02, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.golf = atomicReference;
        this.hotel = h02;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            zzpe zzpeVar = (zzpe) com.google.android.gms.internal.measurement.aa.alpha(parcel, zzpe.CREATOR);
            com.google.android.gms.internal.measurement.aa.bravo(parcel);
            sierra(zzpeVar);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.ai
    public final void sierra(zzpe zzpeVar) {
        AtomicReference atomicReference = this.golf;
        synchronized (atomicReference) {
            ar arVar = ((G) this.hotel.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.bravo(Integer.valueOf(zzpeVar.alpha.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzpeVar);
            atomicReference.notifyAll();
        }
    }
}
