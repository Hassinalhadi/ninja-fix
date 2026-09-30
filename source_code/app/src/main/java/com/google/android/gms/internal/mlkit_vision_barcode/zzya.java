package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzya extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzya> CREATOR = new C2601a(27);
    public final String alpha;
    public final String purple;
    public final int red;

    public zzya(String str, String str2, int i4) {
        this.alpha = str;
        this.purple = str2;
        this.red = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
