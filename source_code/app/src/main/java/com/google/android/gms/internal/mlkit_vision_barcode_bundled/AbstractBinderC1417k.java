package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1417k extends AbstractBinderC1413g implements InterfaceC1418l {
    public static InterfaceC1418l asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        if (queryLocalInterface instanceof InterfaceC1418l) {
            return (InterfaceC1418l) queryLocalInterface;
        }
        return new C1416j(iBinder);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractBinderC1413g
    public final boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 == 1) {
            InterfaceC1812b lime = BinderC1814d.lime(parcel.readStrongBinder());
            zzba zzbaVar = (zzba) AbstractC1419m.alpha(parcel, zzba.CREATOR);
            AbstractC1419m.bravo(parcel);
            InterfaceC1415i newBarcodeScanner = newBarcodeScanner(lime, zzbaVar);
            parcel2.writeNoException();
            if (newBarcodeScanner == null) {
                parcel2.writeStrongBinder(null);
            } else {
                parcel2.writeStrongBinder(newBarcodeScanner.asBinder());
            }
            return true;
        }
        return false;
    }
}
