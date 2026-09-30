package x6;

import V5.x;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import h6.InterfaceC1812b;
import java.util.HashMap;
import q6.AbstractBinderC2412b;
import q6.AbstractBinderC2415e;
import q6.InterfaceC2413c;
import q6.w;
import s1.C2576i;

/* loaded from: classes2.dex */
public final class k {
    public final y6.g alpha;
    public C2576i bravo;

    public k(y6.g gVar) {
        new HashMap();
        new HashMap();
        x.hotel(gVar);
        this.alpha = gVar;
    }

    public final z6.f alpha(MarkerOptions markerOptions) {
        if (markerOptions instanceof AdvancedMarkerOptions) {
            markerOptions.f7485j = 1;
        }
        try {
            x.india(markerOptions, "MarkerOptions must not be null.");
            y6.g gVar = this.alpha;
            Parcel ivory = gVar.ivory();
            w.charlie(ivory, markerOptions);
            Parcel delta = gVar.delta(ivory, 11);
            InterfaceC2413c lime = AbstractBinderC2412b.lime(delta.readStrongBinder());
            delta.recycle();
            if (lime != null) {
                if (markerOptions.f7485j == 1) {
                    return new z6.f(lime);
                }
                return new z6.f(lime);
            }
            return null;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [q6.f] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final z6.g bravo(PolygonOptions polygonOptions) {
        ?? abstractC1394y;
        try {
            x.india(polygonOptions, "PolygonOptions must not be null");
            y6.g gVar = this.alpha;
            Parcel ivory = gVar.ivory();
            w.charlie(ivory, polygonOptions);
            Parcel delta = gVar.delta(ivory, 10);
            IBinder readStrongBinder = delta.readStrongBinder();
            int i4 = AbstractBinderC2415e.hotel;
            if (readStrongBinder == null) {
                abstractC1394y = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
                if (queryLocalInterface instanceof q6.f) {
                    abstractC1394y = (q6.f) queryLocalInterface;
                } else {
                    abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate", 4);
                }
            }
            delta.recycle();
            return new z6.g(abstractC1394y);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final CameraPosition charlie() {
        try {
            y6.g gVar = this.alpha;
            Parcel delta = gVar.delta(gVar.ivory(), 1);
            CameraPosition cameraPosition = (CameraPosition) w.alpha(delta, CameraPosition.CREATOR);
            delta.recycle();
            return cameraPosition;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n delta() {
        y6.c abstractC1394y;
        try {
            y6.g gVar = this.alpha;
            Parcel delta = gVar.delta(gVar.ivory(), 26);
            IBinder readStrongBinder = delta.readStrongBinder();
            if (readStrongBinder == null) {
                abstractC1394y = 0;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
                if (queryLocalInterface instanceof y6.c) {
                    abstractC1394y = (y6.c) queryLocalInterface;
                } else {
                    abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.IProjectionDelegate", 4);
                }
            }
            delta.recycle();
            return new n(abstractC1394y);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final C2576i echo() {
        AbstractC1394y abstractC1394y;
        try {
            if (this.bravo == null) {
                y6.g gVar = this.alpha;
                Parcel delta = gVar.delta(gVar.ivory(), 25);
                IBinder readStrongBinder = delta.readStrongBinder();
                if (readStrongBinder == null) {
                    abstractC1394y = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
                    if (queryLocalInterface instanceof y6.d) {
                        abstractC1394y = (y6.d) queryLocalInterface;
                    } else {
                        abstractC1394y = new AbstractC1394y(readStrongBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate", 4);
                    }
                }
                delta.recycle();
                this.bravo = new C2576i(abstractC1394y);
            }
            return this.bravo;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final void foxtrot(tg.b bVar) {
        try {
            y6.g gVar = this.alpha;
            InterfaceC1812b interfaceC1812b = (InterfaceC1812b) bVar.purple;
            Parcel ivory = gVar.ivory();
            w.delta(ivory, interfaceC1812b);
            gVar.lavender(ivory, 4);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
