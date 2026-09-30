package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new c(9);
    public final int alpha;
    public final int purple;
    public final byte[] red;

    public Tile(byte[] bArr, int i4, int i5) {
        this.alpha = i4;
        this.purple = i5;
        this.red = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.charlie(parcel, 4, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
