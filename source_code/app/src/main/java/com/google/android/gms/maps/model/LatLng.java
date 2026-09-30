package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new w6.b(14);
    public final double alpha;
    public final double purple;

    public LatLng(double d4, double d9) {
        if (d9 >= -180.0d && d9 < 180.0d) {
            this.purple = d9;
        } else {
            this.purple = ((((d9 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.alpha = Math.max(-90.0d, Math.min(90.0d, d4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.alpha) == Double.doubleToLongBits(latLng.alpha) && Double.doubleToLongBits(this.purple) == Double.doubleToLongBits(latLng.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.alpha);
        long j5 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.purple);
        return ((((int) j5) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "lat/lng: (" + this.alpha + Constants.SEPARATOR_COMMA + this.purple + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeDouble(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeDouble(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
