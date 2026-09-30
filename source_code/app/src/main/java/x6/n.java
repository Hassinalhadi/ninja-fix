package x6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import q6.w;

/* loaded from: classes2.dex */
public final class n {
    public final y6.c alpha;

    public n(y6.c cVar) {
        this.alpha = cVar;
    }

    public final VisibleRegion alpha() {
        try {
            y6.c cVar = this.alpha;
            Parcel delta = cVar.delta(cVar.ivory(), 3);
            VisibleRegion visibleRegion = (VisibleRegion) w.alpha(delta, VisibleRegion.CREATOR);
            delta.recycle();
            return visibleRegion;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
