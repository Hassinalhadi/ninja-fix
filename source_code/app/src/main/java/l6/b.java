package l6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class b implements d, IInterface {
    public final IBinder golf;

    public b(IBinder iBinder) {
        this.golf = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.golf;
    }

    public final Parcel bravo(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.golf.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e) {
                obtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}
