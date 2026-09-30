package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LocationSettingsStates extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new k(7);
    public final boolean alpha;
    public final boolean purple;
    public final boolean red;
    public final boolean silver;
    public final boolean teal;
    public final boolean white;

    public LocationSettingsStates(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.alpha = z2;
        this.purple = z10;
        this.red = z11;
        this.silver = z12;
        this.teal = z13;
        this.white = z14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha ? 1 : 0);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
