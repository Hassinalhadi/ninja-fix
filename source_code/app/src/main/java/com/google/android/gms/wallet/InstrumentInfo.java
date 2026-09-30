package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new e(11);
    public String alpha;
    public String purple;
    public int red;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        int i5 = this.red;
        if (i5 != 1 && i5 != 2 && i5 != 3) {
            i5 = 0;
        }
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(i5);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
