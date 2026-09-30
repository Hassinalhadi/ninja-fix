package z6;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import q6.w;

/* loaded from: classes2.dex */
public final class h {
    public final q6.i alpha;

    public h(q6.i iVar) {
        x.hotel(iVar);
        this.alpha = iVar;
    }

    public final void alpha(boolean z2) {
        try {
            q6.g gVar = (q6.g) this.alpha;
            Parcel ivory = gVar.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            gVar.lavender(ivory, 11);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        if (!(obj instanceof h)) {
            return false;
        }
        try {
            q6.i iVar = this.alpha;
            q6.i iVar2 = ((h) obj).alpha;
            q6.g gVar = (q6.g) iVar;
            Parcel ivory = gVar.ivory();
            w.delta(ivory, iVar2);
            Parcel delta = gVar.delta(ivory, 15);
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
            q6.g gVar = (q6.g) this.alpha;
            Parcel delta = gVar.delta(gVar.ivory(), 16);
            int readInt = delta.readInt();
            delta.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
