package as;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes3.dex */
public final class a extends Binder implements ab.a {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        String str = ab.a.alpha;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        switch (i4) {
            case 2:
                parcel.readInt();
                return true;
            case 3:
                parcel.readString();
                return true;
            case 4:
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.readString();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 7:
                parcel.readString();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                parcel.readInt();
                parcel.readInt();
                return true;
            case 9:
                return true;
            case 10:
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                return true;
            case 11:
                return true;
            case 12:
                return true;
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }
}
