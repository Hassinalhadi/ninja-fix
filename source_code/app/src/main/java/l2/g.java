package l2;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class g implements h {
    public IBinder golf;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.golf;
    }

    @Override // l2.h
    public final void india(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(h.echo);
            obtain.writeStringArray(strArr);
            this.golf.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
