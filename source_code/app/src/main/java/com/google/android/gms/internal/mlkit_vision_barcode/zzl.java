package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C2601a(14);
    public zzp alpha;
    public String purple;
    public String red;
    public zzq[] silver;
    public zzn[] teal;
    public String[] white;
    public zzi[] yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.oscar(parcel, 5, this.silver, i4);
        AbstractC3043q.oscar(parcel, 6, this.teal, i4);
        AbstractC3043q.mike(parcel, 7, this.white);
        AbstractC3043q.oscar(parcel, 8, this.yellow, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
