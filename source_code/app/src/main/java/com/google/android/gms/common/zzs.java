package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import t6.AbstractC3043q;

/* loaded from: classes2.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new k(4);
    public final String alpha;
    public final o purple;
    public final boolean red;
    public final boolean silver;

    public zzs(String str, o oVar, boolean z2, boolean z10) {
        this.alpha = str;
        this.purple = oVar;
        this.red = z2;
        this.silver = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.lima(parcel, 1, this.alpha);
        o oVar = this.purple;
        if (oVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            oVar = null;
        }
        AbstractC3043q.foxtrot(parcel, 2, oVar);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.red ? 1 : 0);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.romeo(parcel, quebec);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [V5.s] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public zzs(String str, IBinder iBinder, boolean z2, boolean z10) {
        ?? r32;
        this.alpha = str;
        o oVar = null;
        if (iBinder != null) {
            try {
                int i4 = n.india;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                if (queryLocalInterface instanceof V5.s) {
                    r32 = (V5.s) queryLocalInterface;
                } else {
                    r32 = new AbstractC1394y(iBinder, "com.google.android.gms.common.internal.ICertData", 2);
                }
                InterfaceC1812b zzd = r32.zzd();
                byte[] bArr = zzd == null ? null : (byte[]) BinderC1814d.magenta(zzd);
                if (bArr != null) {
                    oVar = new o(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
            }
        }
        this.purple = oVar;
        this.red = z2;
        this.silver = z10;
    }
}
