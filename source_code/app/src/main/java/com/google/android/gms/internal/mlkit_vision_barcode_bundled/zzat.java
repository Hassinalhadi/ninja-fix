package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new C1412f(14);
    public final String alpha;
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final String white;
    public final String yellow;

    public zzat(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.alpha = str;
        this.purple = str2;
        this.red = str3;
        this.silver = str4;
        this.teal = str5;
        this.white = str6;
        this.yellow = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.lima(parcel, 6, this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
