package com.google.android.gms.maps.model;

import J2.e;
import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new w6.b(7);
    public final LatLng alpha;
    public final float purple;
    public final float red;
    public final float silver;

    public CameraPosition(LatLng latLng, float f5, float f10, float f11) {
        boolean z2;
        x.india(latLng, "camera target must not be null.");
        if (f10 >= 0.0f && f10 <= 90.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.charlie(z2, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f10));
        this.alpha = latLng;
        this.purple = f5;
        this.red = f10 + 0.0f;
        this.silver = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.alpha.equals(cameraPosition.alpha) && Float.floatToIntBits(this.purple) == Float.floatToIntBits(cameraPosition.purple) && Float.floatToIntBits(this.red) == Float.floatToIntBits(cameraPosition.red) && Float.floatToIntBits(this.silver) == Float.floatToIntBits(cameraPosition.silver)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, Float.valueOf(this.purple), Float.valueOf(this.red), Float.valueOf(this.silver)});
    }

    public final String toString() {
        e eVar = new e(this);
        eVar.y(this.alpha, "target");
        eVar.y(Float.valueOf(this.purple), "zoom");
        eVar.y(Float.valueOf(this.red), "tilt");
        eVar.y(Float.valueOf(this.silver), "bearing");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 2, this.alpha, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeFloat(this.purple);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeFloat(this.red);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeFloat(this.silver);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
