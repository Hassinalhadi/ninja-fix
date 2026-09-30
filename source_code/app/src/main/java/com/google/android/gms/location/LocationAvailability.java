package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    final int zzc;
    private final int zzd;
    private final int zze;
    private final long zzf;
    private final zzal[] zzg;
    public static final LocationAvailability zza = new LocationAvailability(0, 1, 1, 0, null, true);
    public static final LocationAvailability zzb = new LocationAvailability(1000, 1, 1, 0, null, false);
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new k(2);

    public LocationAvailability(int i4, int i5, int i10, long j5, zzal[] zzalVarArr, boolean z2) {
        this.zzc = i4 < 1000 ? 0 : 1000;
        this.zzd = i5;
        this.zze = i10;
        this.zzf = j5;
        this.zzg = zzalVarArr;
    }

    public static LocationAvailability extractLocationAvailability(Intent intent) {
        if (!hasLocationAvailability(intent)) {
            return null;
        }
        try {
            return (LocationAvailability) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public static boolean hasLocationAvailability(Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY")) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.zzd == locationAvailability.zzd && this.zze == locationAvailability.zze && this.zzf == locationAvailability.zzf && this.zzc == locationAvailability.zzc && Arrays.equals(this.zzg, locationAvailability.zzg)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzc)});
    }

    public boolean isLocationAvailable() {
        return this.zzc < 1000;
    }

    public String toString() {
        boolean isLocationAvailable = isLocationAvailable();
        StringBuilder sb2 = new StringBuilder(String.valueOf(isLocationAvailable).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(isLocationAvailable);
        sb2.append(Constants.AES_SUFFIX);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.zzd;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(i5);
        int i10 = this.zze;
        AbstractC3043q.sierra(parcel, 2, 4);
        parcel.writeInt(i10);
        long j5 = this.zzf;
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(j5);
        int i11 = this.zzc;
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(i11);
        AbstractC3043q.oscar(parcel, 5, this.zzg, i4);
        boolean isLocationAvailable = isLocationAvailable();
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(isLocationAvailable ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
