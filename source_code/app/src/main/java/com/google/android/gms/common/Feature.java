package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new k(1);
    public final String alpha;
    public final int purple;
    public final long red;

    public Feature(int i4, long j5, String str) {
        this.alpha = str;
        this.purple = i4;
        this.red = j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.alpha;
            if (((str != null && str.equals(feature.alpha)) || (str == null && feature.alpha == null)) && o() == feature.o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, Long.valueOf(o())});
    }

    public final long o() {
        long j5 = this.red;
        return j5 == -1 ? this.purple : j5;
    }

    public final String toString() {
        J2.e eVar = new J2.e(this);
        eVar.y(this.alpha, "name");
        eVar.y(Long.valueOf(o()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(this.purple);
        long o5 = o();
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(o5);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public Feature(String str, long j5) {
        this.alpha = str;
        this.red = j5;
        this.purple = -1;
    }
}
