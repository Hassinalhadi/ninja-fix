package com.google.android.gms.maps.model;

import J2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new c(10);
    public final LatLng alpha;
    public final LatLng purple;
    public final LatLng red;
    public final LatLng silver;
    public final LatLngBounds teal;

    public VisibleRegion(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4, LatLngBounds latLngBounds) {
        this.alpha = latLng;
        this.purple = latLng2;
        this.red = latLng3;
        this.silver = latLng4;
        this.teal = latLngBounds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.alpha.equals(visibleRegion.alpha) && this.purple.equals(visibleRegion.purple) && this.red.equals(visibleRegion.red) && this.silver.equals(visibleRegion.silver) && this.teal.equals(visibleRegion.teal)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.purple, this.red, this.silver, this.teal});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.alpha, "nearLeft");
        eVar.y(this.purple, "nearRight");
        eVar.y(this.red, "farLeft");
        eVar.y(this.silver, "farRight");
        eVar.y(this.teal, "latLngBounds");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 3, this.purple, i4);
        AbstractC3043q.kilo(parcel, 4, this.red, i4);
        AbstractC3043q.kilo(parcel, 5, this.silver, i4);
        AbstractC3043q.kilo(parcel, 6, this.teal, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
