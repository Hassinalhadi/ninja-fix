package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new e(13);
    public final int alpha;
    public final String purple;
    public final CommonWalletObject red;

    public OfferWalletObject(int i4, String str, String str2, CommonWalletObject commonWalletObject) {
        this.alpha = i4;
        this.purple = str2;
        if (i4 < 3) {
            CommonWalletObject commonWalletObject2 = new CommonWalletObject();
            commonWalletObject2.alpha = str;
            this.red = commonWalletObject2;
            return;
        }
        this.red = commonWalletObject;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
