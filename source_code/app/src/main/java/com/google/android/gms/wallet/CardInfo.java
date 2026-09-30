package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new e(8);
    public String alpha;
    public String purple;
    public String red;
    public int silver;
    public UserAddress teal;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver);
        AbstractC3043q.kilo(parcel, 5, this.teal, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
