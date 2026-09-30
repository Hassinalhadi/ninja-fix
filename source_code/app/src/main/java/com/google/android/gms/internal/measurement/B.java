package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: classes2.dex */
public final class B extends AbstractBinderC1398z implements aq {
    public final /* synthetic */ com.google.common.util.concurrent.d golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.google.common.util.concurrent.d dVar) {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
        this.golf = dVar;
    }

    @Override // com.google.android.gms.internal.measurement.aq
    public final void alpha() {
        this.golf.run();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1398z
    public final boolean bravo(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            alpha();
            return true;
        }
        return false;
    }
}
