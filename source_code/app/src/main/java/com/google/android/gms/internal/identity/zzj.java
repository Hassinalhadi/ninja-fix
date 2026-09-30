package com.google.android.gms.internal.identity;

import Y5.b;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.location.p;
import p6.aa;
import p6.m;
import p6.z;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new b(26);
    public final int alpha;
    public final zzh purple;
    public final p red;
    public final aa silver;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.location.p] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public zzj(int i4, zzh zzhVar, IBinder iBinder, IBinder iBinder2) {
        ?? r02;
        this.alpha = i4;
        this.purple = zzhVar;
        aa aaVar = null;
        if (iBinder == null) {
            r02 = 0;
        } else {
            int i5 = m.hotel;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            if (queryLocalInterface instanceof p) {
                r02 = (p) queryLocalInterface;
            } else {
                r02 = new AbstractC1394y(iBinder, "com.google.android.gms.location.IDeviceOrientationListener", 3);
            }
        }
        this.red = r02;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof aa) {
                aaVar = (aa) queryLocalInterface2;
            } else {
                aaVar = new z(iBinder2);
            }
        }
        this.silver = aaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        IBinder iBinder = null;
        p pVar = this.red;
        if (pVar == null) {
            asBinder = null;
        } else {
            asBinder = pVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 3, asBinder);
        aa aaVar = this.silver;
        if (aaVar != null) {
            iBinder = aaVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 4, iBinder);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
