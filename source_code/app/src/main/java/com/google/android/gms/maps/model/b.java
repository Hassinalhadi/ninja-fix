package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.PinConfig;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int amber = AbstractC3038p.amber(parcel);
        PinConfig.Glyph glyph = null;
        int i4 = 0;
        int i5 = 0;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 2) {
                if (c3 != 3) {
                    if (c3 != 4) {
                        AbstractC3038p.zulu(parcel, readInt);
                    } else {
                        glyph = (PinConfig.Glyph) AbstractC3038p.hotel(parcel, readInt, PinConfig.Glyph.CREATOR);
                    }
                } else {
                    i5 = AbstractC3038p.uniform(parcel, readInt);
                }
            } else {
                i4 = AbstractC3038p.uniform(parcel, readInt);
            }
        }
        AbstractC3038p.november(parcel, amber);
        return new PinConfig(i4, i5, glyph);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new PinConfig[i4];
    }
}
