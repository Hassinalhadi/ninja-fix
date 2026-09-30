package com.google.android.gms.maps.model;

import J2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new c(18);
    public final StreetViewPanoramaLink[] alpha;
    public final LatLng purple;
    public final String red;

    public StreetViewPanoramaLocation(StreetViewPanoramaLink[] streetViewPanoramaLinkArr, LatLng latLng, String str) {
        this.alpha = streetViewPanoramaLinkArr;
        this.purple = latLng;
        this.red = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (this.red.equals(streetViewPanoramaLocation.red) && this.purple.equals(streetViewPanoramaLocation.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.purple, this.red});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.red, "panoId");
        eVar.y(this.purple.toString(), "position");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.oscar(parcel, 2, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 3, this.purple, i4);
        AbstractC3043q.lima(parcel, 4, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
