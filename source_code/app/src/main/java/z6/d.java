package z6;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import q6.ad;
import q6.af;
import q6.w;

/* loaded from: classes2.dex */
public final class d {
    public final af alpha;

    public d(af afVar) {
        x.hotel(afVar);
        this.alpha = afVar;
    }

    public final void alpha(boolean z2) {
        try {
            ad adVar = (ad) this.alpha;
            Parcel ivory = adVar.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            adVar.lavender(ivory, 15);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        if (!(obj instanceof d)) {
            return false;
        }
        try {
            af afVar = this.alpha;
            af afVar2 = ((d) obj).alpha;
            ad adVar = (ad) afVar;
            Parcel ivory = adVar.ivory();
            w.delta(ivory, afVar2);
            Parcel delta = adVar.delta(ivory, 19);
            if (delta.readInt() != 0) {
                z2 = true;
            }
            delta.recycle();
            return z2;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final int hashCode() {
        try {
            ad adVar = (ad) this.alpha;
            Parcel delta = adVar.delta(adVar.ivory(), 20);
            int readInt = delta.readInt();
            delta.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
