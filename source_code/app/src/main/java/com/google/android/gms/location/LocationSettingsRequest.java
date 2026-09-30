package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new k(5);
    public final ArrayList alpha;
    public final boolean purple;
    public final boolean red;

    public LocationSettingsRequest(ArrayList arrayList, boolean z2, boolean z10) {
        this.alpha = arrayList;
        this.purple = z2;
        this.red = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.papa(parcel, 1, Collections.unmodifiableList(this.alpha));
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple ? 1 : 0);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
