package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import av.q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new w6.b(8);
    public static final StreetViewSource purple = new StreetViewSource(0);
    public final int alpha;

    public StreetViewSource(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.alpha == ((StreetViewSource) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha)});
    }

    public final String toString() {
        String str;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1) {
                str = q.delta(i4, "UNKNOWN(", ")");
            } else {
                str = "OUTDOOR";
            }
        } else {
            str = "DEFAULT";
        }
        return "StreetViewSource:".concat(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
