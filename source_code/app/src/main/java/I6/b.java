package I6;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.wallet.button.ButtonOptions;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import w6.AbstractC3237a;

/* loaded from: classes2.dex */
public final class b extends AbstractC1394y {
    public final InterfaceC1812b magenta(BinderC1814d binderC1814d, ButtonOptions buttonOptions) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.india);
        int i4 = AbstractC3237a.alpha;
        obtain.writeStrongBinder(binderC1814d);
        AbstractC3237a.charlie(obtain, buttonOptions);
        obtain = Parcel.obtain();
        try {
            this.hotel.transact(1, obtain, obtain, 0);
            obtain.readException();
            obtain.recycle();
            return BinderC1814d.lime(obtain.readStrongBinder());
        } catch (RuntimeException e) {
            throw e;
        } finally {
            obtain.recycle();
        }
    }
}
