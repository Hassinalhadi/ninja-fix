package q6;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import m6.AbstractBinderC2100a;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2412b extends AbstractBinderC2100a implements InterfaceC2413c {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.measurement.y, q6.c] */
    public static InterfaceC2413c lime(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof InterfaceC2413c) {
            return (InterfaceC2413c) queryLocalInterface;
        }
        return new AbstractC1394y(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
    }
}
