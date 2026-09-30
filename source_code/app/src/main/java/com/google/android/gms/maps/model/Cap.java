package com.google.android.gms.maps.model;

import V5.x;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class Cap extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Cap> CREATOR = new w6.b(11);
    public final int alpha;
    public final z6.b purple;
    public final Float red;

    public Cap(int i4, z6.b bVar, Float f5) {
        boolean z2;
        if (f5 != null && f5.floatValue() > 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 == 3) {
            r0 = bVar != null && z2;
            i4 = 3;
        }
        x.alpha("Invalid Cap: type=" + i4 + " bitmapDescriptor=" + bVar + " bitmapRefWidth=" + f5, r0);
        this.alpha = i4;
        this.purple = bVar;
        this.red = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        if (this.alpha == cap.alpha && x.lima(this.purple, cap.purple) && x.lima(this.red, cap.red)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), this.purple, this.red});
    }

    public final Cap o() {
        boolean z2;
        int i4 = this.alpha;
        if (i4 != 0) {
            boolean z10 = true;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        Log.w("Cap", "Unknown Cap type: " + i4);
                        return this;
                    }
                    z6.b bVar = this.purple;
                    if (bVar != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    x.juliet("bitmapDescriptor must not be null", z2);
                    Float f5 = this.red;
                    if (f5 == null) {
                        z10 = false;
                    }
                    x.juliet("bitmapRefWidth must not be null", z10);
                    return new CustomCap(bVar, f5.floatValue());
                }
                return new Cap(2, null, null);
            }
            return new Cap(1, null, null);
        }
        return new ButtCap();
    }

    public String toString() {
        return P0.cyan(new StringBuilder("[Cap: type="), this.alpha, Constants.AES_SUFFIX);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        z6.b bVar = this.purple;
        if (bVar == null) {
            asBinder = null;
        } else {
            asBinder = bVar.alpha.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 3, asBinder);
        AbstractC3043q.echo(parcel, 4, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
