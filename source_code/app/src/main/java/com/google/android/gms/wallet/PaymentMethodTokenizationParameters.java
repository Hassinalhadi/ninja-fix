package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new e(5);
    public final int alpha;
    public final Bundle purple;

    public PaymentMethodTokenizationParameters(int i4, Bundle bundle) {
        new Bundle();
        this.alpha = i4;
        this.purple = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.bravo(parcel, 3, this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
