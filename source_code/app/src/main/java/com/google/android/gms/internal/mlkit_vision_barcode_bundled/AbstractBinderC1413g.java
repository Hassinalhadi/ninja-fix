package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1413g extends Binder implements IInterface {
    public AbstractBinderC1413g(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 > 16777215) {
            if (super.onTransact(i4, parcel, parcel2, i5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return zza(i4, parcel, parcel2, i5);
    }

    public abstract boolean zza(int i4, Parcel parcel, Parcel parcel2, int i5);
}
