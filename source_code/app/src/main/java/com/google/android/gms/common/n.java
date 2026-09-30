package com.google.android.gms.common;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import m6.AbstractBinderC2100a;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public abstract class n extends AbstractBinderC2100a implements V5.s {
    public static final /* synthetic */ int india = 0;
    public final int hotel;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        boolean z2;
        if (bArr.length == 25) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.bravo(z2);
        this.hotel = Arrays.hashCode(bArr);
    }

    public static byte[] lime(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC1812b zzd;
        if (obj != null && (obj instanceof V5.s)) {
            try {
                V5.s sVar = (V5.s) obj;
                if (sVar.zzc() == this.hotel && (zzd = sVar.zzd()) != null) {
                    return Arrays.equals(magenta(), (byte[]) BinderC1814d.magenta(zzd));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.hotel;
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(this.hotel);
            return true;
        }
        InterfaceC1812b zzd = zzd();
        parcel2.writeNoException();
        AbstractC2197a.charlie(parcel2, zzd);
        return true;
    }

    public abstract byte[] magenta();

    @Override // V5.s
    public final int zzc() {
        return this.hotel;
    }

    @Override // V5.s
    public final InterfaceC1812b zzd() {
        return new BinderC1814d(magenta());
    }
}
