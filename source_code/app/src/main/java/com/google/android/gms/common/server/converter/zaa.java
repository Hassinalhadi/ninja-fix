package com.google.android.gms.common.server.converter;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new b(9);
    public final int alpha;
    public final StringToIntConverter purple;

    public zaa(int i4, StringToIntConverter stringToIntConverter) {
        this.alpha = i4;
        this.purple = stringToIntConverter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.alpha = 1;
        this.purple = stringToIntConverter;
    }
}
