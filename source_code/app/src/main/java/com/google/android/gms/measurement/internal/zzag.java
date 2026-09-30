package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzag> CREATOR = new Y5.a(14);
    public final long alpha;
    public final int purple;
    public final long red;

    public zzag(int i4, long j5, long j6) {
        this.alpha = j5;
        this.purple = i4;
        this.red = j6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 8);
        parcel.writeLong(this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
