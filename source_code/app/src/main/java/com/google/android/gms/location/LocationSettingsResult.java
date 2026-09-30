package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LocationSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new k(6);
    public final Status alpha;
    public final LocationSettingsStates purple;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.alpha = status;
        this.purple = locationSettingsStates;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
