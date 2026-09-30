package com.google.android.gms.internal.identity;

import Y5.a;
import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.location.r;
import com.google.android.gms.location.t;
import p6.aa;
import p6.o;
import p6.p;
import p6.z;
import t6.AbstractC3043q;

@Deprecated
/* loaded from: classes2.dex */
public final class zzei extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzei> CREATOR = new a(24);
    public final int alpha;
    public final zzeg purple;
    public final t red;
    public final r silver;
    public final PendingIntent teal;
    public final aa white;
    public final String yellow;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.measurement.y] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.google.android.gms.internal.measurement.y] */
    public zzei(int i4, zzeg zzegVar, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        t tVar;
        r rVar;
        this.alpha = i4;
        this.purple = zzegVar;
        aa aaVar = null;
        if (iBinder != null) {
            int i5 = p.hotel;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            if (queryLocalInterface instanceof t) {
                tVar = (t) queryLocalInterface;
            } else {
                tVar = new AbstractC1394y(iBinder, "com.google.android.gms.location.ILocationListener", 3);
            }
        } else {
            tVar = null;
        }
        this.red = tVar;
        this.teal = pendingIntent;
        if (iBinder2 != null) {
            int i10 = o.india;
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            if (queryLocalInterface2 instanceof r) {
                rVar = (r) queryLocalInterface2;
            } else {
                rVar = new AbstractC1394y(iBinder2, "com.google.android.gms.location.ILocationCallback", 3);
            }
        } else {
            rVar = null;
        }
        this.silver = rVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface3 instanceof aa) {
                aaVar = (aa) queryLocalInterface3;
            } else {
                aaVar = new z(iBinder3);
            }
        }
        this.white = aaVar;
        this.yellow = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        IBinder asBinder;
        IBinder asBinder2;
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.kilo(parcel, 2, this.purple, i4);
        IBinder iBinder = null;
        t tVar = this.red;
        if (tVar == null) {
            asBinder = null;
        } else {
            asBinder = tVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 3, asBinder);
        AbstractC3043q.kilo(parcel, 4, this.teal, i4);
        r rVar = this.silver;
        if (rVar == null) {
            asBinder2 = null;
        } else {
            asBinder2 = rVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 5, asBinder2);
        aa aaVar = this.white;
        if (aaVar != null) {
            iBinder = aaVar.asBinder();
        }
        AbstractC3043q.foxtrot(parcel, 6, iBinder);
        AbstractC3043q.lima(parcel, 8, this.yellow);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
