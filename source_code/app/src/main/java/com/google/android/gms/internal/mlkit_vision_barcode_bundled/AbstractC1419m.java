package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1419m {
    static {
        AbstractC1419m.class.getClassLoader();
    }

    public static Parcelable alpha(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void bravo(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(ao.ad.zulu(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
