package com.google.android.gms.maps.model;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;
import z6.e;

/* loaded from: classes2.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new c(13);
    public final LatLng alpha;
    public final LatLng purple;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        x.india(latLng, "southwest must not be null.");
        x.india(latLng2, "northeast must not be null.");
        double d4 = latLng.alpha;
        Double valueOf = Double.valueOf(d4);
        double d9 = latLng2.alpha;
        x.charlie(d9 >= d4, "southern latitude exceeds northern latitude (%s > %s)", valueOf, Double.valueOf(d9));
        this.alpha = latLng;
        this.purple = latLng2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z6.e] */
    public static e o() {
        ?? obj = new Object();
        obj.alpha = Double.POSITIVE_INFINITY;
        obj.bravo = Double.NEGATIVE_INFINITY;
        obj.charlie = Double.NaN;
        obj.delta = Double.NaN;
        return obj;
    }

    public final boolean E(LatLng latLng) {
        x.india(latLng, "point must not be null.");
        LatLng latLng2 = this.alpha;
        double d4 = latLng2.alpha;
        double d9 = latLng.alpha;
        if (d4 <= d9) {
            LatLng latLng3 = this.purple;
            if (d9 <= latLng3.alpha) {
                double d10 = latLng2.purple;
                double d11 = latLng3.purple;
                double d12 = latLng.purple;
                if (d10 <= d11) {
                    if (d10 <= d12 && d12 <= d11) {
                        return true;
                    }
                    return false;
                }
                if (d10 <= d12 || d12 <= d11) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.alpha.equals(latLngBounds.alpha) && this.purple.equals(latLngBounds.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.purple});
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(this.alpha, "southwest");
        eVar.y(this.purple, "northeast");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.kilo(parcel, 3, this.purple, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
