package com.google.android.gms.location;

import V5.x;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.WorkSource;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.identity.ClientIdentity;
import java.util.Arrays;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new k(4);

    @Deprecated
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 102;

    @Deprecated
    public static final int PRIORITY_HIGH_ACCURACY = 100;

    @Deprecated
    public static final int PRIORITY_LOW_POWER = 104;

    @Deprecated
    public static final int PRIORITY_NO_POWER = 105;
    private int zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private int zzf;
    private float zzg;
    private boolean zzh;
    private long zzi;
    private final int zzj;
    private final int zzk;
    private final boolean zzl;
    private final WorkSource zzm;
    private final ClientIdentity zzn;

    public LocationRequest(int i4, long j5, long j6, long j7, long j10, long j11, int i5, float f5, boolean z2, long j12, int i10, int i11, boolean z10, WorkSource workSource, ClientIdentity clientIdentity) {
        this.zza = i4;
        if (i4 == 105) {
            this.zzb = Long.MAX_VALUE;
        } else {
            this.zzb = j5;
        }
        this.zzc = j6;
        this.zzd = j7;
        this.zze = j10 == Long.MAX_VALUE ? j11 : Math.min(Math.max(1L, j10 - SystemClock.elapsedRealtime()), j11);
        this.zzf = i5;
        this.zzg = f5;
        this.zzh = z2;
        this.zzi = j12 != -1 ? j12 : j5;
        this.zzj = i10;
        this.zzk = i11;
        this.zzl = z10;
        this.zzm = workSource;
        this.zzn = clientIdentity;
    }

    @Deprecated
    public static LocationRequest create() {
        return new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, LottieConstants.IterateForever, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }

    private static String zze(long j5) {
        String sb2;
        if (j5 == Long.MAX_VALUE) {
            return "∞";
        }
        StringBuilder sb3 = p6.r.bravo;
        synchronized (sb3) {
            sb3.setLength(0);
            p6.r.alpha(j5, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.zza == locationRequest.zza && ((isPassive() || this.zzb == locationRequest.zzb) && this.zzc == locationRequest.zzc && isBatched() == locationRequest.isBatched() && ((!isBatched() || this.zzd == locationRequest.zzd) && this.zze == locationRequest.zze && this.zzf == locationRequest.zzf && this.zzg == locationRequest.zzg && this.zzh == locationRequest.zzh && this.zzj == locationRequest.zzj && this.zzk == locationRequest.zzk && this.zzl == locationRequest.zzl && this.zzm.equals(locationRequest.zzm) && x.lima(this.zzn, locationRequest.zzn)))) {
                return true;
            }
        }
        return false;
    }

    public long getDurationMillis() {
        return this.zze;
    }

    @Deprecated
    public long getExpirationTime() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.zze;
        long j6 = elapsedRealtime + j5;
        if (((elapsedRealtime ^ j6) & (j5 ^ j6)) < 0) {
            return Long.MAX_VALUE;
        }
        return j6;
    }

    @Deprecated
    public long getFastestInterval() {
        return getMinUpdateIntervalMillis();
    }

    public int getGranularity() {
        return this.zzj;
    }

    @Deprecated
    public long getInterval() {
        return getIntervalMillis();
    }

    public long getIntervalMillis() {
        return this.zzb;
    }

    public long getMaxUpdateAgeMillis() {
        return this.zzi;
    }

    public long getMaxUpdateDelayMillis() {
        return this.zzd;
    }

    public int getMaxUpdates() {
        return this.zzf;
    }

    @Deprecated
    public long getMaxWaitTime() {
        return Math.max(this.zzd, this.zzb);
    }

    public float getMinUpdateDistanceMeters() {
        return this.zzg;
    }

    public long getMinUpdateIntervalMillis() {
        return this.zzc;
    }

    @Deprecated
    public int getNumUpdates() {
        return getMaxUpdates();
    }

    public int getPriority() {
        return this.zza;
    }

    @Deprecated
    public float getSmallestDisplacement() {
        return getMinUpdateDistanceMeters();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Long.valueOf(this.zzb), Long.valueOf(this.zzc), this.zzm});
    }

    public boolean isBatched() {
        long j5 = this.zzd;
        return j5 > 0 && (j5 >> 1) >= this.zzb;
    }

    @Deprecated
    public boolean isFastestIntervalExplicitlySet() {
        return true;
    }

    public boolean isPassive() {
        return this.zza == 105;
    }

    public boolean isWaitForAccurateLocation() {
        return this.zzh;
    }

    @Deprecated
    public LocationRequest setExpirationDuration(long j5) {
        boolean z2;
        if (j5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("durationMillis must be greater than 0", z2);
        this.zze = j5;
        return this;
    }

    @Deprecated
    public LocationRequest setExpirationTime(long j5) {
        this.zze = Math.max(1L, j5 - SystemClock.elapsedRealtime());
        return this;
    }

    @Deprecated
    public LocationRequest setFastestInterval(long j5) {
        boolean z2 = true;
        Object[] objArr = {Long.valueOf(j5)};
        if (j5 < 0) {
            z2 = false;
        }
        x.charlie(z2, "illegal fastest interval: %d", objArr);
        this.zzc = j5;
        return this;
    }

    @Deprecated
    public LocationRequest setInterval(long j5) {
        boolean z2;
        if (j5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.alpha("intervalMillis must be greater than or equal to 0", z2);
        long j6 = this.zzc;
        long j7 = this.zzb;
        if (j6 == j7 / 6) {
            this.zzc = j5 / 6;
        }
        if (this.zzi == j7) {
            this.zzi = j5;
        }
        this.zzb = j5;
        return this;
    }

    @Deprecated
    public LocationRequest setMaxWaitTime(long j5) {
        boolean z2 = true;
        Object[] objArr = {Long.valueOf(j5)};
        if (j5 < 0) {
            z2 = false;
        }
        x.charlie(z2, "illegal max wait time: %d", objArr);
        this.zzd = j5;
        return this;
    }

    @Deprecated
    public LocationRequest setNumUpdates(int i4) {
        if (i4 > 0) {
            this.zzf = i4;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 20);
        sb2.append("invalid numUpdates: ");
        sb2.append(i4);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public LocationRequest setPriority(int i4) {
        n.alpha(i4);
        this.zza = i4;
        return this;
    }

    @Deprecated
    public LocationRequest setSmallestDisplacement(float f5) {
        if (f5 >= 0.0f) {
            this.zzg = f5;
            return this;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(f5).length() + 22);
        sb2.append("invalid displacement: ");
        sb2.append(f5);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Deprecated
    public LocationRequest setWaitForAccurateLocation(boolean z2) {
        this.zzh = z2;
        return this;
    }

    public String toString() {
        String str;
        StringBuilder tango = Q0.c.tango("Request[");
        if (isPassive()) {
            tango.append(n.bravo(this.zza));
            if (this.zzd > 0) {
                tango.append("/");
                p6.r.alpha(this.zzd, tango);
            }
        } else {
            tango.append("@");
            if (isBatched()) {
                p6.r.alpha(this.zzb, tango);
                tango.append("/");
                p6.r.alpha(this.zzd, tango);
            } else {
                p6.r.alpha(this.zzb, tango);
            }
            tango.append(" ");
            tango.append(n.bravo(this.zza));
        }
        if (isPassive() || this.zzc != this.zzb) {
            tango.append(", minUpdateInterval=");
            tango.append(zze(this.zzc));
        }
        if (this.zzg > 0.0d) {
            tango.append(", minUpdateDistance=");
            tango.append(this.zzg);
        }
        if (!isPassive() ? this.zzi != this.zzb : this.zzi != Long.MAX_VALUE) {
            tango.append(", maxUpdateAge=");
            tango.append(zze(this.zzi));
        }
        if (this.zze != Long.MAX_VALUE) {
            tango.append(", duration=");
            p6.r.alpha(this.zze, tango);
        }
        if (this.zzf != Integer.MAX_VALUE) {
            tango.append(", maxUpdates=");
            tango.append(this.zzf);
        }
        if (this.zzk != 0) {
            tango.append(", ");
            int i4 = this.zzk;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 == 2) {
                        str = "THROTTLE_NEVER";
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    str = "THROTTLE_ALWAYS";
                }
            } else {
                str = "THROTTLE_BACKGROUND";
            }
            tango.append(str);
        }
        if (this.zzj != 0) {
            tango.append(", ");
            tango.append(n.charlie(this.zzj));
        }
        if (this.zzh) {
            tango.append(", waitForAccurateLocation");
        }
        if (this.zzl) {
            tango.append(", bypass");
        }
        if (!e6.e.charlie(this.zzm)) {
            tango.append(", ");
            tango.append(this.zzm);
        }
        if (this.zzn != null) {
            tango.append(", impersonation=");
            tango.append(this.zzn);
        }
        tango.append(']');
        return tango.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        int priority = getPriority();
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(priority);
        long intervalMillis = getIntervalMillis();
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(intervalMillis);
        long minUpdateIntervalMillis = getMinUpdateIntervalMillis();
        AbstractC3043q.sierra(parcel, 3, 8);
        parcel.writeLong(minUpdateIntervalMillis);
        int maxUpdates = getMaxUpdates();
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(maxUpdates);
        float minUpdateDistanceMeters = getMinUpdateDistanceMeters();
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeFloat(minUpdateDistanceMeters);
        long maxUpdateDelayMillis = getMaxUpdateDelayMillis();
        AbstractC3043q.sierra(parcel, 8, 8);
        parcel.writeLong(maxUpdateDelayMillis);
        boolean isWaitForAccurateLocation = isWaitForAccurateLocation();
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(isWaitForAccurateLocation ? 1 : 0);
        long durationMillis = getDurationMillis();
        AbstractC3043q.sierra(parcel, 10, 8);
        parcel.writeLong(durationMillis);
        long maxUpdateAgeMillis = getMaxUpdateAgeMillis();
        AbstractC3043q.sierra(parcel, 11, 8);
        parcel.writeLong(maxUpdateAgeMillis);
        int granularity = getGranularity();
        AbstractC3043q.sierra(parcel, 12, 4);
        parcel.writeInt(granularity);
        int i5 = this.zzk;
        AbstractC3043q.sierra(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = this.zzl;
        AbstractC3043q.sierra(parcel, 15, 4);
        parcel.writeInt(z2 ? 1 : 0);
        AbstractC3043q.kilo(parcel, 16, this.zzm, i4);
        AbstractC3043q.kilo(parcel, 17, this.zzn, i4);
        AbstractC3043q.romeo(parcel, quebec);
    }

    public final int zza() {
        return this.zzk;
    }

    public final boolean zzb() {
        return this.zzl;
    }

    public final WorkSource zzc() {
        return this.zzm;
    }

    public final ClientIdentity zzd() {
        return this.zzn;
    }

    @Deprecated
    public LocationRequest() {
        this(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, LottieConstants.IterateForever, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
    }
}
