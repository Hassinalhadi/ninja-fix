package com.google.android.gms.internal.identity;

import V5.x;
import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.g;
import e6.e;
import java.util.ArrayList;
import java.util.Iterator;
import t6.AbstractC3043q;

@Deprecated
/* loaded from: classes2.dex */
public final class zzeg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeg> CREATOR = new b(23);
    public final LocationRequest alpha;

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzeg(LocationRequest locationRequest, ArrayList arrayList, boolean z2, boolean z10, boolean z11, boolean z12, long j5) {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i4;
        WorkSource workSource;
        g gVar = new g(locationRequest.getPriority(), locationRequest.getIntervalMillis());
        gVar.delta(locationRequest.getMinUpdateIntervalMillis());
        long maxUpdateDelayMillis = locationRequest.getMaxUpdateDelayMillis();
        if (maxUpdateDelayMillis >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        x.alpha("maxUpdateDelayMillis must be greater than or equal to 0", z13);
        gVar.delta = maxUpdateDelayMillis;
        long durationMillis = locationRequest.getDurationMillis();
        if (durationMillis > 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        x.alpha("durationMillis must be greater than 0", z14);
        gVar.echo = durationMillis;
        int maxUpdates = locationRequest.getMaxUpdates();
        if (maxUpdates > 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        x.alpha("maxUpdates must be greater than 0", z15);
        gVar.foxtrot = maxUpdates;
        float minUpdateDistanceMeters = locationRequest.getMinUpdateDistanceMeters();
        if (minUpdateDistanceMeters >= 0.0f) {
            z16 = true;
        } else {
            z16 = false;
        }
        x.alpha("minUpdateDistanceMeters must be greater than or equal to 0", z16);
        gVar.golf = minUpdateDistanceMeters;
        gVar.hotel = locationRequest.isWaitForAccurateLocation();
        gVar.charlie(locationRequest.getMaxUpdateAgeMillis());
        gVar.bravo(locationRequest.getGranularity());
        int zza = locationRequest.zza();
        if (zza != 0 && zza != 1) {
            if (zza == 2) {
                z17 = true;
                i4 = 2;
                x.charlie(z17, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i4));
                gVar.kilo = zza;
                gVar.lima = locationRequest.zzb();
                gVar.mike = locationRequest.zzc();
                ClientIdentity zzd = locationRequest.zzd();
                x.bravo(zzd != null || zzd.white == null);
                if (arrayList != null) {
                    if (arrayList.isEmpty()) {
                        workSource = null;
                    } else {
                        workSource = new WorkSource();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ClientIdentity clientIdentity = (ClientIdentity) it.next();
                            e.alpha(workSource, clientIdentity.alpha, clientIdentity.purple);
                        }
                    }
                    gVar.mike = workSource;
                }
                if (z2) {
                    gVar.bravo(1);
                }
                if (z10) {
                    gVar.kilo = 2;
                }
                if (z11) {
                    gVar.lima = true;
                }
                if (z12) {
                    gVar.hotel = true;
                }
                if (j5 != Long.MAX_VALUE) {
                    gVar.charlie(j5);
                }
                this.alpha = gVar.alpha();
            }
            z17 = false;
        } else {
            z17 = true;
        }
        i4 = zza;
        x.charlie(z17, "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant", Integer.valueOf(i4));
        gVar.kilo = zza;
        gVar.lima = locationRequest.zzb();
        gVar.mike = locationRequest.zzc();
        ClientIdentity zzd2 = locationRequest.zzd();
        x.bravo(zzd2 != null || zzd2.white == null);
        if (arrayList != null) {
        }
        if (z2) {
        }
        if (z10) {
        }
        if (z11) {
        }
        if (z12) {
        }
        if (j5 != Long.MAX_VALUE) {
        }
        this.alpha = gVar.alpha();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzeg) {
            return x.lima(this.alpha, ((zzeg) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.kilo(parcel, 1, this.alpha, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
