package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new e(9);
    public LoyaltyWalletObject alpha;
    public OfferWalletObject purple;
    public GiftCardWalletObject red;
    public int silver;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 3, this.purple, i4);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
