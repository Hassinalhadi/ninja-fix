package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzpa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpa> CREATOR = new Y5.a(17);
    public final long alpha;
    public byte[] purple;
    public final String red;
    public final Bundle silver;
    public final int teal;
    public final long white;
    public String yellow;

    public zzpa(long j5, byte[] bArr, String str, Bundle bundle, int i4, long j6, String str2) {
        this.alpha = j5;
        this.purple = bArr;
        this.red = str;
        this.silver = bundle;
        this.teal = i4;
        this.white = j6;
        this.yellow = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.charlie(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.bravo(parcel, 4, this.silver);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.sierra(parcel, 6, 8);
        parcel.writeLong(this.white);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
