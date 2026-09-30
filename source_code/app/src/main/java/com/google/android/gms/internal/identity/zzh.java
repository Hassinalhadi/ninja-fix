package com.google.android.gms.internal.identity;

import Q0.c;
import V5.x;
import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.Collections;
import java.util.List;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR;
    public static final List silver = Collections.EMPTY_LIST;
    public static final DeviceOrientationRequest teal;
    public final DeviceOrientationRequest alpha;
    public final List purple;
    public final String red;

    static {
        new StringBuilder(String.valueOf(20000L).length() + 102).append("Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        teal = new DeviceOrientationRequest(20000L, false);
        CREATOR = new a(26);
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.alpha = deviceOrientationRequest;
        this.purple = list;
        this.red = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        if (!x.lima(this.alpha, zzhVar.alpha) || !x.lima(this.purple, zzhVar.purple) || !x.lima(this.red, zzhVar.red)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.alpha);
        String valueOf2 = String.valueOf(this.purple);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.red;
        StringBuilder sb2 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        c.azure(sb2, "DeviceOrientationRequestInternal[deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        sb2.append(", tag='");
        sb2.append(str);
        sb2.append("']");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.papa(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
