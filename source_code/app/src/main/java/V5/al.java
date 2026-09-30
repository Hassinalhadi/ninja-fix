package V5;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import h6.BinderC1814d;
import h6.InterfaceC1812b;

/* loaded from: classes2.dex */
public final class al extends AbstractC1394y implements s {
    @Override // V5.s
    public final int zzc() {
        Parcel charlie = charlie(ivory(), 2);
        int readInt = charlie.readInt();
        charlie.recycle();
        return readInt;
    }

    @Override // V5.s
    public final InterfaceC1812b zzd() {
        Parcel charlie = charlie(ivory(), 1);
        InterfaceC1812b lime = BinderC1814d.lime(charlie.readStrongBinder());
        charlie.recycle();
        return lime;
    }
}
