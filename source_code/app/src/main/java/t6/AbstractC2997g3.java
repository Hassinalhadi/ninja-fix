package t6;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.Window;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.BinderC1814d;
import h6.InterfaceC1812b;

/* renamed from: t6.g3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2997g3 {
    public static y6.b alpha;

    public static tg.b bravo(LatLng latLng, float f5) {
        try {
            y6.b bVar = alpha;
            V5.x.india(bVar, "CameraUpdateFactory is not initialized");
            Parcel ivory = bVar.ivory();
            q6.w.charlie(ivory, latLng);
            ivory.writeFloat(f5);
            Parcel delta = bVar.delta(ivory, 9);
            InterfaceC1812b lime = BinderC1814d.lime(delta.readStrongBinder());
            delta.recycle();
            return new tg.b(lime);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public void alpha(Window window) {
    }

    public abstract void charlie(ae.al alVar, ae.al alVar2, Window window, View view, boolean z2, boolean z10);
}
