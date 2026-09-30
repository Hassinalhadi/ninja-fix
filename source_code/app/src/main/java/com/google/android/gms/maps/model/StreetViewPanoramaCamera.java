package com.google.android.gms.maps.model;

import J2.e;
import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;
import w6.c;

/* loaded from: classes2.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new c(17);
    public final float alpha;
    public final float purple;
    public final float red;

    public StreetViewPanoramaCamera(float f5, float f10, float f11) {
        float f12;
        boolean z2 = false;
        if (f10 >= -90.0f && f10 <= 90.0f) {
            z2 = true;
        }
        x.alpha("Tilt needs to be between -90 and 90 inclusive: " + f10, z2);
        this.alpha = ((double) f5) <= 0.0d ? 0.0f : f5;
        this.purple = 0.0f + f10;
        if (f11 <= 0.0d) {
            f12 = (f11 % 360.0f) + 360.0f;
        } else {
            f12 = f11;
        }
        this.red = f12 % 360.0f;
        new StreetViewPanoramaOrientation(f10, f11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.alpha) == Float.floatToIntBits(streetViewPanoramaCamera.alpha) && Float.floatToIntBits(this.purple) == Float.floatToIntBits(streetViewPanoramaCamera.purple) && Float.floatToIntBits(this.red) == Float.floatToIntBits(streetViewPanoramaCamera.red)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.alpha), Float.valueOf(this.purple), Float.valueOf(this.red)});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(Float.valueOf(this.alpha), "zoom");
        eVar.y(Float.valueOf(this.purple), "tilt");
        eVar.y(Float.valueOf(this.red), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeFloat(this.alpha);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeFloat(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
