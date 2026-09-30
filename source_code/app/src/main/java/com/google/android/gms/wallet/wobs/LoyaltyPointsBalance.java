package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new k(17);
    public int alpha;
    public String purple;
    public double red;
    public String silver;
    public long teal;
    public int white;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.sierra(parcel, 4, 8);
        parcel.writeDouble(this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.sierra(parcel, 6, 8);
        parcel.writeLong(this.teal);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.white);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
