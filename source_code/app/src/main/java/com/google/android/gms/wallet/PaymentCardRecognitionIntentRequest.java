package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public class PaymentCardRecognitionIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new e(14);
    public int alpha;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
