package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzbc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbc> CREATOR = new C1412f(3);
    public final zzbt alpha;
    public final zzbv purple;
    public final boolean red;

    public zzbc(zzbt zzbtVar, zzbv zzbvVar, boolean z2) {
        this.alpha = zzbtVar;
        this.purple = zzbvVar;
        this.red = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(1);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
