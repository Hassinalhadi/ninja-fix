package x6;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import g.C1718a;
import h6.AbstractC1811a;
import h6.BinderC1814d;
import java.util.ArrayList;
import java.util.Iterator;
import t6.D3;

/* loaded from: classes2.dex */
public final class u extends AbstractC1811a {
    public final SupportMapFragment echo;
    public C1718a foxtrot;
    public Activity golf;
    public final ArrayList hotel = new ArrayList();

    public u(SupportMapFragment supportMapFragment) {
        this.echo = supportMapFragment;
    }

    @Override // h6.AbstractC1811a
    public final void alpha(C1718a c1718a) {
        this.foxtrot = c1718a;
        echo();
    }

    public final void echo() {
        Activity activity = this.golf;
        if (activity != null && this.foxtrot != null && this.alpha == null) {
            try {
                synchronized (l.class) {
                    l.charlie(activity);
                }
                y6.h maroon = D3.bravo(this.golf).maroon(new BinderC1814d(this.golf));
                if (maroon != null) {
                    this.foxtrot.azure(new t(this.echo, maroon));
                    ArrayList arrayList = this.hotel;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((t) this.alpha).juliet((m) it.next());
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
