package com.google.android.gms.maps.model;

import J2.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new w6.b(18);
    public final String alpha;
    public final float purple;

    public StreetViewPanoramaLink(String str, float f5) {
        this.alpha = str;
        this.purple = (((double) f5) <= 0.0d ? (f5 % 360.0f) + 360.0f : f5) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.alpha.equals(streetViewPanoramaLink.alpha) && Float.floatToIntBits(this.purple) == Float.floatToIntBits(streetViewPanoramaLink.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, Float.valueOf(this.purple)});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.alpha, "panoId");
        eVar.y(Float.valueOf(this.purple), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 2, this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeFloat(this.purple);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
