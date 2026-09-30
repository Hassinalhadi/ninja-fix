package P5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a implements c, IInterface {
    public final IBinder golf;

    public a(IBinder iBinder) {
        this.golf = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.golf;
    }

    public final Bundle bravo(Bundle bundle) {
        Parcelable parcelable;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        int i4 = A5.a.alpha;
        obtain.writeInt(1);
        bundle.writeToParcel(obtain, 0);
        obtain = Parcel.obtain();
        try {
            this.golf.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            Parcelable.Creator creator = Bundle.CREATOR;
            if (obtain.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            }
            return (Bundle) parcelable;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
