package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC1398z extends Binder implements IInterface {
    public AbstractBinderC1398z(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public abstract boolean bravo(int i4, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) throws RemoteException {
        if (i4 > 16777215) {
            if (super.onTransact(i4, parcel, parcel2, i5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        return bravo(i4, parcel, parcel2);
    }
}
