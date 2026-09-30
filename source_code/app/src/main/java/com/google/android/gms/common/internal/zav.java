package com.google.android.gms.common.internal;

import V5.a;
import V5.h;
import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import t6.AbstractC3043q;
import z1.e;

/* loaded from: classes2.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new e(26);
    public final int alpha;
    public final IBinder purple;
    public final ConnectionResult red;
    public final boolean silver;
    public final boolean teal;

    public zav(int i4, IBinder iBinder, ConnectionResult connectionResult, boolean z2, boolean z10) {
        this.alpha = i4;
        this.purple = iBinder;
        this.red = connectionResult;
        this.silver = z2;
        this.teal = z10;
    }

    public final boolean equals(Object obj) {
        Object abstractC1394y;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof zav) {
                    zav zavVar = (zav) obj;
                    if (this.red.equals(zavVar.red)) {
                        Object obj2 = null;
                        IBinder iBinder = this.purple;
                        if (iBinder == null) {
                            abstractC1394y = null;
                        } else {
                            int i4 = a.hotel;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof h) {
                                abstractC1394y = (h) queryLocalInterface;
                            } else {
                                abstractC1394y = new AbstractC1394y(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        IBinder iBinder2 = zavVar.purple;
                        if (iBinder2 != null) {
                            int i5 = a.hotel;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof h) {
                                obj2 = (h) queryLocalInterface2;
                            } else {
                                obj2 = new AbstractC1394y(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        if (x.lima(abstractC1394y, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.foxtrot(parcel, 2, this.purple);
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
