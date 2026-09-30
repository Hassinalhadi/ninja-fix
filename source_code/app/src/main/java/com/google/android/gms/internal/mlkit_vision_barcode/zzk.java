package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C2601a(12);
    public String alpha;
    public String purple;
    public String red;
    public String silver;
    public String teal;
    public zzj white;
    public zzj yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.lima(parcel, 6, this.teal);
        AbstractC3043q.kilo(parcel, 7, this.white, i4);
        AbstractC3043q.kilo(parcel, 8, this.yellow, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
