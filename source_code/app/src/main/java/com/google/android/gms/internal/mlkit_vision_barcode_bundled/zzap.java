package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzap> CREATOR = new C1412f(7);
    public final zzat alpha;
    public final String purple;
    public final String red;
    public final zzau[] silver;
    public final zzar[] teal;
    public final String[] white;
    public final zzam[] yellow;

    public zzap(zzat zzatVar, String str, String str2, zzau[] zzauVarArr, zzar[] zzarVarArr, String[] strArr, zzam[] zzamVarArr) {
        this.alpha = zzatVar;
        this.purple = str;
        this.red = str2;
        this.silver = zzauVarArr;
        this.teal = zzarVarArr;
        this.white = strArr;
        this.yellow = zzamVarArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.oscar(parcel, 4, this.silver, i4);
        AbstractC3043q.oscar(parcel, 5, this.teal, i4);
        AbstractC3043q.mike(parcel, 6, this.white);
        AbstractC3043q.oscar(parcel, 7, this.yellow, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
