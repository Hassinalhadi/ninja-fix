package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzxv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxv> CREATOR = new C2601a(22);
    public final double alpha;
    public final double purple;

    public zzxv(double d4, double d9) {
        this.alpha = d4;
        this.purple = d9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeDouble(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeDouble(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
