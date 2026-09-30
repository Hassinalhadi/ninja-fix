package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzov extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzov> CREATOR = new Y5.b(16);
    public final String alpha;
    public final long purple;
    public final int red;

    public zzov(int i4, long j5, String str) {
        this.alpha = str;
        this.purple = j5;
        this.red = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
