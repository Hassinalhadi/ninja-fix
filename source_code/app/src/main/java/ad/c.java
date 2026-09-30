package ad;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;

/* loaded from: classes3.dex */
public final class c extends Binder implements b {
    public static final /* synthetic */ int hotel = 0;
    public final /* synthetic */ ResultReceiver golf;

    public c(ResultReceiver resultReceiver) {
        this.golf = resultReceiver;
        attachInterface(this, b.delta);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        Object obj;
        String str = b.delta;
        if (i4 >= 1 && i4 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i4 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i4 != 1) {
            return super.onTransact(i4, parcel, parcel2, i5);
        }
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            obj = creator.createFromParcel(parcel);
        } else {
            obj = null;
        }
        this.golf.charlie(readInt, (Bundle) obj);
        return true;
    }
}
