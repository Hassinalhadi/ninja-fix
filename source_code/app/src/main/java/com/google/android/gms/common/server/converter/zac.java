package com.google.android.gms.common.server.converter;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new b(10);
    public final int alpha;
    public final String purple;
    public final int red;

    public zac(int i4, String str, int i5) {
        this.alpha = i4;
        this.purple = str;
        this.red = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zac(String str, int i4) {
        this.alpha = 1;
        this.purple = str;
        this.red = i4;
    }
}
