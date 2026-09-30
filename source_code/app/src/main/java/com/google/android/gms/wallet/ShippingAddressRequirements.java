package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class ShippingAddressRequirements extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ShippingAddressRequirements> CREATOR = new e(6);
    public ArrayList alpha;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.november(parcel, 1, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
