package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class PaymentData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentData> CREATOR = new k(3);

    /* renamed from: a, reason: collision with root package name */
    public Bundle f7745a;
    public String alpha;
    public CardInfo purple;
    public UserAddress red;
    public PaymentMethodToken silver;
    public String teal;
    public Bundle white;
    public String yellow;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.kilo(parcel, 4, this.silver, i4);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.bravo(parcel, 6, this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.bravo(parcel, 8, this.f7745a);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
