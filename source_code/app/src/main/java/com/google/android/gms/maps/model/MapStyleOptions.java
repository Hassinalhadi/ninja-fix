package com.google.android.gms.maps.model;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new c(14);
    public final String alpha;

    public MapStyleOptions(String str) {
        x.india(str, "json must not be null");
        this.alpha = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
