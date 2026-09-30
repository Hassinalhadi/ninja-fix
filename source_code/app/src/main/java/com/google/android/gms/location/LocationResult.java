package com.google.android.gms.location;

import KingArchersMougraphAlsopromas0.AlwaysMougraohSmootihbngmode;
import KingArchersMougraphAlsopromas0.hidden.Hidden0;
import android.content.Intent;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: Dex2C */
/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = null;
    static final List zza = null;
    private final List zzb;

    static {
        AlwaysMougraohSmootihbngmode.registerNativesForClass(118, LocationResult.class);
        Hidden0.special_clinit_118_00(LocationResult.class);
    }

    public LocationResult(List list) {
        this.zzb = list;
    }

    public static native LocationResult create(List list);

    public static native LocationResult extractResult(Intent intent);

    public static native boolean hasResult(Intent intent);

    public native boolean equals(Object obj);

    public native Location getLastLocation();

    public native List getLocations();

    public native int hashCode();

    public native String toString();

    @Override // android.os.Parcelable
    public native void writeToParcel(Parcel parcel, int i4);
}
