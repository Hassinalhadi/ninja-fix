package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.PinConfig;
import h6.BinderC1814d;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r10v1, types: [com.google.android.gms.maps.model.PinConfig$Glyph, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int amber = AbstractC3038p.amber(parcel);
        int i4 = 0;
        z6.b bVar = null;
        int i5 = 0;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < amber) {
            int readInt = parcel.readInt();
            char c3 = (char) readInt;
            if (c3 != 2) {
                if (c3 != 3) {
                    if (c3 != 4) {
                        if (c3 != 5) {
                            AbstractC3038p.zulu(parcel, readInt);
                        } else {
                            i5 = AbstractC3038p.uniform(parcel, readInt);
                        }
                    } else {
                        i4 = AbstractC3038p.uniform(parcel, readInt);
                    }
                } else {
                    iBinder = AbstractC3038p.tango(parcel, readInt);
                }
            } else {
                str = AbstractC3038p.india(parcel, readInt);
            }
        }
        AbstractC3038p.november(parcel, amber);
        ?? obj = new Object();
        obj.red = -5041134;
        obj.silver = ShapeBuilder.DEFAULT_SHAPE_COLOR;
        obj.alpha = str;
        if (iBinder != null) {
            bVar = new z6.b(BinderC1814d.lime(iBinder));
        }
        obj.purple = bVar;
        obj.red = i4;
        obj.silver = i5;
        return obj;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new PinConfig.Glyph[i4];
    }
}
