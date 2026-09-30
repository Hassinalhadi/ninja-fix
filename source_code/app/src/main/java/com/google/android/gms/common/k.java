package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                int amber = AbstractC3038p.amber(parcel);
                PendingIntent pendingIntent = null;
                int i4 = 0;
                int i5 = 0;
                String str = null;
                while (parcel.dataPosition() < amber) {
                    int readInt = parcel.readInt();
                    char c3 = (char) readInt;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt);
                                } else {
                                    str = AbstractC3038p.india(parcel, readInt);
                                }
                            } else {
                                pendingIntent = (PendingIntent) AbstractC3038p.hotel(parcel, readInt, PendingIntent.CREATOR);
                            }
                        } else {
                            i5 = AbstractC3038p.uniform(parcel, readInt);
                        }
                    } else {
                        i4 = AbstractC3038p.uniform(parcel, readInt);
                    }
                }
                AbstractC3038p.november(parcel, amber);
                return new ConnectionResult(i4, i5, pendingIntent, str);
            case 1:
                int amber2 = AbstractC3038p.amber(parcel);
                long j5 = -1;
                int i10 = 0;
                String str2 = null;
                while (parcel.dataPosition() < amber2) {
                    int readInt2 = parcel.readInt();
                    char c4 = (char) readInt2;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            if (c4 != 3) {
                                AbstractC3038p.zulu(parcel, readInt2);
                            } else {
                                j5 = AbstractC3038p.whiskey(parcel, readInt2);
                            }
                        } else {
                            i10 = AbstractC3038p.uniform(parcel, readInt2);
                        }
                    } else {
                        str2 = AbstractC3038p.india(parcel, readInt2);
                    }
                }
                AbstractC3038p.november(parcel, amber2);
                return new Feature(i10, j5, str2);
            case 2:
                int amber3 = AbstractC3038p.amber(parcel);
                boolean z2 = false;
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                String str3 = null;
                IBinder iBinder = null;
                while (parcel.dataPosition() < amber3) {
                    int readInt3 = parcel.readInt();
                    switch ((char) readInt3) {
                        case 1:
                            str3 = AbstractC3038p.india(parcel, readInt3);
                            break;
                        case 2:
                            z2 = AbstractC3038p.oscar(parcel, readInt3);
                            break;
                        case 3:
                            z10 = AbstractC3038p.oscar(parcel, readInt3);
                            break;
                        case 4:
                            iBinder = AbstractC3038p.tango(parcel, readInt3);
                            break;
                        case 5:
                            z11 = AbstractC3038p.oscar(parcel, readInt3);
                            break;
                        case 6:
                            z12 = AbstractC3038p.oscar(parcel, readInt3);
                            break;
                        default:
                            AbstractC3038p.zulu(parcel, readInt3);
                            break;
                    }
                }
                AbstractC3038p.november(parcel, amber3);
                return new zzo(str3, z2, z10, iBinder, z11, z12);
            case 3:
                int amber4 = AbstractC3038p.amber(parcel);
                boolean z13 = false;
                int i11 = 0;
                String str4 = null;
                int i12 = 0;
                while (parcel.dataPosition() < amber4) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt4);
                                } else {
                                    i11 = AbstractC3038p.uniform(parcel, readInt4);
                                }
                            } else {
                                i12 = AbstractC3038p.uniform(parcel, readInt4);
                            }
                        } else {
                            str4 = AbstractC3038p.india(parcel, readInt4);
                        }
                    } else {
                        z13 = AbstractC3038p.oscar(parcel, readInt4);
                    }
                }
                AbstractC3038p.november(parcel, amber4);
                return new zzq(str4, i12, i11, z13);
            default:
                int amber5 = AbstractC3038p.amber(parcel);
                boolean z14 = false;
                String str5 = null;
                IBinder iBinder2 = null;
                boolean z15 = false;
                while (parcel.dataPosition() < amber5) {
                    int readInt5 = parcel.readInt();
                    char c11 = (char) readInt5;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt5);
                                } else {
                                    z15 = AbstractC3038p.oscar(parcel, readInt5);
                                }
                            } else {
                                z14 = AbstractC3038p.oscar(parcel, readInt5);
                            }
                        } else {
                            iBinder2 = AbstractC3038p.tango(parcel, readInt5);
                        }
                    } else {
                        str5 = AbstractC3038p.india(parcel, readInt5);
                    }
                }
                AbstractC3038p.november(parcel, amber5);
                return new zzs(str5, iBinder2, z14, z15);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ConnectionResult[i4];
            case 1:
                return new Feature[i4];
            case 2:
                return new zzo[i4];
            case 3:
                return new zzq[i4];
            default:
                return new zzs[i4];
        }
    }
}
