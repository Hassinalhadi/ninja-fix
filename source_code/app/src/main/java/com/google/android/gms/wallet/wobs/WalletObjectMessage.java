package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new e(20);
    public String alpha;
    public String purple;
    public TimeInterval red;
    public UriData silver;
    public UriData teal;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.kilo(parcel, 5, this.silver, i4);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
