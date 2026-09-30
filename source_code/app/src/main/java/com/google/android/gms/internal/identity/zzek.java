package com.google.android.gms.internal.identity;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.Geofence;
import java.util.Locale;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzek extends AbstractSafeParcelable implements Geofence {
    public static final Parcelable.Creator<zzek> CREATOR = new b(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f6670a;
    public final String alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f6671b;
    public final long purple;
    public final short red;
    public final double silver;
    public final double teal;
    public final float white;
    public final int yellow;

    public zzek(String str, int i4, short s3, double d4, double d9, float f5, long j5, int i5, int i10) {
        if (str != null && str.length() <= 100) {
            if (f5 > 0.0f) {
                if (d4 <= 90.0d && d4 >= -90.0d) {
                    if (d9 <= 180.0d && d9 >= -180.0d) {
                        int i11 = i4 & 7;
                        if (i11 != 0) {
                            this.red = s3;
                            this.alpha = str;
                            this.silver = d4;
                            this.teal = d9;
                            this.white = f5;
                            this.purple = j5;
                            this.yellow = i11;
                            this.f6670a = i5;
                            this.f6671b = i10;
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 35);
                        sb2.append("No supported transition specified: ");
                        sb2.append(i4);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder(String.valueOf(d9).length() + 19);
                    sb3.append("invalid longitude: ");
                    sb3.append(d9);
                    throw new IllegalArgumentException(sb3.toString());
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(d4).length() + 18);
                sb4.append("invalid latitude: ");
                sb4.append(d4);
                throw new IllegalArgumentException(sb4.toString());
            }
            StringBuilder sb5 = new StringBuilder(String.valueOf(f5).length() + 16);
            sb5.append("invalid radius: ");
            sb5.append(f5);
            throw new IllegalArgumentException(sb5.toString());
        }
        throw new IllegalArgumentException("requestId is null or too long: ".concat(String.valueOf(str)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzek) {
            zzek zzekVar = (zzek) obj;
            if (this.white == zzekVar.white && this.silver == zzekVar.silver && this.teal == zzekVar.teal && this.red == zzekVar.red && this.yellow == zzekVar.yellow) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.location.Geofence
    public final long getExpirationTime() {
        return this.purple;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLatitude() {
        return this.silver;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getLoiteringDelay() {
        return this.f6671b;
    }

    @Override // com.google.android.gms.location.Geofence
    public final double getLongitude() {
        return this.teal;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getNotificationResponsiveness() {
        return this.f6670a;
    }

    @Override // com.google.android.gms.location.Geofence
    public final float getRadius() {
        return this.white;
    }

    @Override // com.google.android.gms.location.Geofence
    public final String getRequestId() {
        return this.alpha;
    }

    @Override // com.google.android.gms.location.Geofence
    public final int getTransitionTypes() {
        return this.yellow;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.silver);
        long doubleToLongBits2 = Double.doubleToLongBits(this.teal);
        return ((ad.sierra(this.white, (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31, 31) + this.red) * 31) + this.yellow;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        short s3 = this.red;
        if (s3 != -1) {
            if (s3 != 1) {
                str = "UNKNOWN";
            } else {
                str = "CIRCLE";
            }
        } else {
            str = "INVALID";
        }
        return String.format(locale, "Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, resp=%ds, dwell=%dms, @%d]", str, this.alpha.replaceAll("\\p{C}", "?"), Integer.valueOf(this.yellow), Double.valueOf(this.silver), Double.valueOf(this.teal), Float.valueOf(this.white), Integer.valueOf(this.f6670a / 1000), Integer.valueOf(this.f6671b), Long.valueOf(this.purple));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        AbstractC3043q.sierra(parcel, 2, 8);
        parcel.writeLong(this.purple);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red);
        AbstractC3043q.sierra(parcel, 4, 8);
        parcel.writeDouble(this.silver);
        AbstractC3043q.sierra(parcel, 5, 8);
        parcel.writeDouble(this.teal);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeFloat(this.white);
        AbstractC3043q.sierra(parcel, 7, 4);
        parcel.writeInt(this.yellow);
        AbstractC3043q.sierra(parcel, 8, 4);
        parcel.writeInt(this.f6670a);
        AbstractC3043q.sierra(parcel, 9, 4);
        parcel.writeInt(this.f6671b);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
