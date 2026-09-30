package com.google.android.gms.maps.model;

import J2.e;
import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new c(7);
    public final float alpha;
    public final float purple;

    public StreetViewPanoramaOrientation(float f5, float f10) {
        boolean z2 = false;
        if (f5 >= -90.0f && f5 <= 90.0f) {
            z2 = true;
        }
        x.alpha("Tilt needs to be between -90 and 90 inclusive: " + f5, z2);
        this.alpha = f5 + 0.0f;
        this.purple = (((double) f10) <= 0.0d ? (f10 % 360.0f) + 360.0f : f10) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.alpha) == Float.floatToIntBits(streetViewPanoramaOrientation.alpha) && Float.floatToIntBits(this.purple) == Float.floatToIntBits(streetViewPanoramaOrientation.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.alpha), Float.valueOf(this.purple)});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(Float.valueOf(this.alpha), "tilt");
        eVar.y(Float.valueOf(this.purple), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeFloat(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeFloat(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
