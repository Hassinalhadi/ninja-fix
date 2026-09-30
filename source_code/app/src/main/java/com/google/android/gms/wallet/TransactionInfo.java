package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new k(6);
    public int alpha;
    public String purple;
    public String red;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
