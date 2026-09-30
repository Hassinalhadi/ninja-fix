package ab;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import t6.AbstractC2992f3;

/* loaded from: classes3.dex */
public final class b implements d {
    public IBinder golf;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.golf;
    }

    public final boolean bravo(as.a aVar, Uri uri, Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.bravo);
            obtain.writeStrongInterface(aVar);
            AbstractC2992f3.delta(obtain, uri);
            AbstractC2992f3.delta(obtain, bundle);
            obtain.writeInt(-1);
            boolean z2 = false;
            this.golf.transact(4, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean charlie(as.a aVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.bravo);
            obtain.writeStrongInterface(aVar);
            boolean z2 = false;
            this.golf.transact(3, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    public final boolean delta() {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(d.bravo);
            obtain.writeLong(0L);
            boolean z2 = false;
            this.golf.transact(2, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                z2 = true;
            }
            return z2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
