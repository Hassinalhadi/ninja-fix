package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class m implements Parcelable.Creator {
    public static final m bravo = new m(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ m(int i4) {
        this.alpha = i4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                int dataPosition = parcel.dataPosition();
                if (parcel.readInt() == -204102970) {
                    int amber = AbstractC3038p.amber(parcel);
                    ComplianceOptions complianceOptions = null;
                    while (parcel.dataPosition() < amber) {
                        int readInt = parcel.readInt();
                        if (((char) readInt) != 1) {
                            AbstractC3038p.zulu(parcel, readInt);
                        } else {
                            complianceOptions = (ComplianceOptions) AbstractC3038p.hotel(parcel, readInt, ComplianceOptions.CREATOR);
                        }
                    }
                    AbstractC3038p.november(parcel, amber);
                    return new ApiMetadata(complianceOptions);
                }
                parcel.setDataPosition(dataPosition - 4);
                return ApiMetadata.purple;
            case 1:
                int amber2 = AbstractC3038p.amber(parcel);
                int i4 = 0;
                boolean z2 = true;
                int i5 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < amber2) {
                    int readInt2 = parcel.readInt();
                    char c3 = (char) readInt2;
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt2);
                                } else {
                                    z2 = AbstractC3038p.oscar(parcel, readInt2);
                                }
                            } else {
                                i10 = AbstractC3038p.uniform(parcel, readInt2);
                            }
                        } else {
                            i5 = AbstractC3038p.uniform(parcel, readInt2);
                        }
                    } else {
                        i4 = AbstractC3038p.uniform(parcel, readInt2);
                    }
                }
                AbstractC3038p.november(parcel, amber2);
                return new ComplianceOptions(i4, i5, i10, z2);
            case 2:
                int amber3 = AbstractC3038p.amber(parcel);
                String str = null;
                int i11 = 0;
                while (parcel.dataPosition() < amber3) {
                    int readInt3 = parcel.readInt();
                    char c4 = (char) readInt3;
                    if (c4 != 1) {
                        if (c4 != 2) {
                            AbstractC3038p.zulu(parcel, readInt3);
                        } else {
                            str = AbstractC3038p.india(parcel, readInt3);
                        }
                    } else {
                        i11 = AbstractC3038p.uniform(parcel, readInt3);
                    }
                }
                AbstractC3038p.november(parcel, amber3);
                return new Scope(i11, str);
            default:
                int amber4 = AbstractC3038p.amber(parcel);
                String str2 = null;
                ConnectionResult connectionResult = null;
                int i12 = 0;
                PendingIntent pendingIntent = null;
                while (parcel.dataPosition() < amber4) {
                    int readInt4 = parcel.readInt();
                    char c10 = (char) readInt4;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    AbstractC3038p.zulu(parcel, readInt4);
                                } else {
                                    connectionResult = (ConnectionResult) AbstractC3038p.hotel(parcel, readInt4, ConnectionResult.CREATOR);
                                }
                            } else {
                                pendingIntent = (PendingIntent) AbstractC3038p.hotel(parcel, readInt4, PendingIntent.CREATOR);
                            }
                        } else {
                            str2 = AbstractC3038p.india(parcel, readInt4);
                        }
                    } else {
                        i12 = AbstractC3038p.uniform(parcel, readInt4);
                    }
                }
                AbstractC3038p.november(parcel, amber4);
                return new Status(i12, str2, pendingIntent, connectionResult);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new ApiMetadata[i4];
            case 1:
                return new ComplianceOptions[i4];
            case 2:
                return new Scope[i4];
            default:
                return new Status[i4];
        }
    }
}
