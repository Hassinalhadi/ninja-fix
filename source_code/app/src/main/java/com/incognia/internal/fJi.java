package com.incognia.internal;

import android.location.Location;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class fJi {
    public static Integer b(Location location) {
        Parcel parcel;
        Parcel parcel2 = null;
        if (CnH.b(CnH.f8484b, 31, 0, 2) && location != null) {
            try {
                Location location2 = new Location(location);
                location2.setProvider(null);
                parcel = Parcel.obtain();
                try {
                    location2.writeToParcel(parcel, 0);
                    parcel.setDataPosition(0);
                    parcel.readString();
                    Integer valueOf = Integer.valueOf(parcel.readInt());
                    parcel.recycle();
                    return valueOf;
                } catch (Exception unused) {
                    if (parcel != null) {
                        parcel.recycle();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    parcel2 = parcel;
                    if (parcel2 != null) {
                        parcel2.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                parcel = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }
}
