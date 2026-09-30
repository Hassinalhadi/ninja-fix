package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new e(3);
    public final int alpha;
    public final ConnectionResult purple;
    public final zav red;

    public zak(int i4, ConnectionResult connectionResult, zav zavVar) {
        this.alpha = i4;
        this.purple = connectionResult;
        this.red = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
