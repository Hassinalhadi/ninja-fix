package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class av implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ av(int i4) {
        this.alpha = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                int amber = AbstractC3038p.amber(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                Bundle bundle = null;
                String str4 = null;
                boolean z2 = false;
                long j5 = 0;
                long j6 = 0;
                while (parcel.dataPosition() < amber) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            j5 = AbstractC3038p.whiskey(parcel, readInt);
                            break;
                        case 2:
                            j6 = AbstractC3038p.whiskey(parcel, readInt);
                            break;
                        case 3:
                            z2 = AbstractC3038p.oscar(parcel, readInt);
                            break;
                        case 4:
                            str = AbstractC3038p.india(parcel, readInt);
                            break;
                        case 5:
                            str2 = AbstractC3038p.india(parcel, readInt);
                            break;
                        case 6:
                            str3 = AbstractC3038p.india(parcel, readInt);
                            break;
                        case 7:
                            bundle = AbstractC3038p.charlie(parcel, readInt);
                            break;
                        case '\b':
                            str4 = AbstractC3038p.india(parcel, readInt);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber);
                return new zzdh(j5, j6, z2, str, str2, str3, bundle, str4);
            default:
                int amber2 = AbstractC3038p.amber(parcel);
                String str5 = null;
                int i4 = 0;
                Intent intent = null;
                while (parcel.dataPosition() < amber2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                AbstractC3038p.zulu(parcel, readInt2);
                            } else {
                                intent = (Intent) AbstractC3038p.hotel(parcel, readInt2, Intent.CREATOR);
                            }
                        } else {
                            str5 = AbstractC3038p.india(parcel, readInt2);
                        }
                    } else {
                        i4 = AbstractC3038p.uniform(parcel, readInt2);
                    }
                }
                AbstractC3038p.november(parcel, amber2);
                return new zzdj(i4, str5, intent);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new zzdh[i4];
            default:
                return new zzdj[i4];
        }
    }
}
