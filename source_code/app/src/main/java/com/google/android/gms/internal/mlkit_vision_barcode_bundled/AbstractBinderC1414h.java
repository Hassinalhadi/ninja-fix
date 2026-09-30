package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.RemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import java.util.List;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1414h extends AbstractBinderC1413g implements InterfaceC1415i {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1413g
    public final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            return false;
                        }
                        zzbe zzbeVar = (zzbe) AbstractC1419m.alpha(parcel, zzbe.CREATOR);
                        AbstractC1419m.bravo(parcel);
                        zze(zzbeVar);
                        parcel2.writeNoException();
                    } else {
                        InterfaceC1812b lime = BinderC1814d.lime(parcel.readStrongBinder());
                        zzcc zzccVar = (zzcc) AbstractC1419m.alpha(parcel, zzcc.CREATOR);
                        zzbc zzbcVar = (zzbc) AbstractC1419m.alpha(parcel, zzbc.CREATOR);
                        AbstractC1419m.bravo(parcel);
                        List zzc = zzc(lime, zzccVar, zzbcVar);
                        parcel2.writeNoException();
                        parcel2.writeTypedList(zzc);
                    }
                } else {
                    InterfaceC1812b lime2 = BinderC1814d.lime(parcel.readStrongBinder());
                    zzcc zzccVar2 = (zzcc) AbstractC1419m.alpha(parcel, zzcc.CREATOR);
                    AbstractC1419m.bravo(parcel);
                    List zzb = zzb(lime2, zzccVar2);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(zzb);
                }
            } else {
                zzf();
                parcel2.writeNoException();
            }
        } else {
            zzd();
            parcel2.writeNoException();
        }
        return true;
    }
}
