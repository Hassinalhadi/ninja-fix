package x6;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import g.C1718a;
import h6.AbstractC1811a;
import h6.BinderC1814d;
import java.util.ArrayList;
import java.util.Iterator;
import t6.D3;

/* loaded from: classes2.dex */
public final class s extends AbstractC1811a {
    public final MapView echo;
    public final Context foxtrot;
    public C1718a golf;
    public final GoogleMapOptions hotel;
    public final ArrayList india = new ArrayList();

    public s(MapView mapView, Context context, GoogleMapOptions googleMapOptions) {
        this.echo = mapView;
        this.foxtrot = context;
        this.hotel = googleMapOptions;
    }

    @Override // h6.AbstractC1811a
    public final void alpha(C1718a c1718a) {
        this.golf = c1718a;
        if (this.alpha == null) {
            try {
                Context context = this.foxtrot;
                synchronized (l.class) {
                    l.charlie(context);
                }
                y6.i navy = D3.bravo(context).navy(new BinderC1814d(context), this.hotel);
                if (navy != null) {
                    this.golf.azure(new r(this.echo, navy));
                    ArrayList arrayList = this.india;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((r) this.alpha).juliet((m) it.next());
                    }
                    arrayList.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
