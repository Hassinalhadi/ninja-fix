package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new k(10);

    /* renamed from: a, reason: collision with root package name */
    public String f7726a;
    public CommonWalletObject alpha;
    public String purple;
    public String red;
    public String silver;
    public long teal;
    public String white;
    public long yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.lima(parcel, 3, this.purple);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.lima(parcel, 5, this.silver);
        AbstractC3043q.sierra(parcel, 6, 8);
        parcel.writeLong(this.teal);
        AbstractC3043q.lima(parcel, 7, this.white);
        AbstractC3043q.sierra(parcel, 8, 8);
        parcel.writeLong(this.yellow);
        AbstractC3043q.lima(parcel, 9, this.f7726a);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
