package i6;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import h6.BinderC1814d;
import h6.InterfaceC1812b;
import o6.AbstractC2197a;

/* loaded from: classes2.dex */
public final class h extends AbstractC1394y {
    public final InterfaceC1812b magenta(BinderC1814d binderC1814d, String str, int i4) {
        Parcel ivory = ivory();
        AbstractC2197a.charlie(ivory, binderC1814d);
        ivory.writeString(str);
        ivory.writeInt(i4);
        Parcel charlie = charlie(ivory, 2);
        InterfaceC1812b lime = BinderC1814d.lime(charlie.readStrongBinder());
        charlie.recycle();
        return lime;
    }

    public final InterfaceC1812b maroon(BinderC1814d binderC1814d, String str, int i4, BinderC1814d binderC1814d2) {
        Parcel ivory = ivory();
        AbstractC2197a.charlie(ivory, binderC1814d);
        ivory.writeString(str);
        ivory.writeInt(i4);
        AbstractC2197a.charlie(ivory, binderC1814d2);
        Parcel charlie = charlie(ivory, 8);
        InterfaceC1812b lime = BinderC1814d.lime(charlie.readStrongBinder());
        charlie.recycle();
        return lime;
    }

    public final InterfaceC1812b navy(BinderC1814d binderC1814d, String str, int i4) {
        Parcel ivory = ivory();
        AbstractC2197a.charlie(ivory, binderC1814d);
        ivory.writeString(str);
        ivory.writeInt(i4);
        Parcel charlie = charlie(ivory, 4);
        InterfaceC1812b lime = BinderC1814d.lime(charlie.readStrongBinder());
        charlie.recycle();
        return lime;
    }

    public final InterfaceC1812b ochre(BinderC1814d binderC1814d, String str, boolean z2, long j5) {
        Parcel ivory = ivory();
        AbstractC2197a.charlie(ivory, binderC1814d);
        ivory.writeString(str);
        ivory.writeInt(z2 ? 1 : 0);
        ivory.writeLong(j5);
        Parcel charlie = charlie(ivory, 7);
        InterfaceC1812b lime = BinderC1814d.lime(charlie.readStrongBinder());
        charlie.recycle();
        return lime;
    }
}
