package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import s6.C2601a;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzxp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxp> CREATOR = new C2601a(13);
    public final int alpha;
    public final String[] purple;

    public zzxp(int i4, String[] strArr) {
        this.alpha = i4;
        this.purple = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.mike(parcel, 2, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
