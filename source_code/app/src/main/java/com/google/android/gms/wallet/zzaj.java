package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

@Deprecated
/* loaded from: classes2.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new k(5);
    public final String alpha;
    public final String purple;
    public final int red;
    public final int silver;

    public zzaj(String str, String str2, int i4, int i5) {
        this.alpha = str;
        this.purple = str2;
        this.red = i4;
        this.silver = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
