package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z6.k;

/* loaded from: classes2.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new k(13);
    public String alpha;
    public CreditCardExpirationDate purple;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
