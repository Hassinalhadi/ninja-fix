package z6;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import q6.aa;
import q6.ac;
import q6.w;

/* loaded from: classes2.dex */
public final class c {
    public final ac alpha;

    public c(ac acVar) {
        x.hotel(acVar);
        this.alpha = acVar;
    }

    public final void alpha(boolean z2) {
        try {
            aa aaVar = (aa) this.alpha;
            Parcel ivory = aaVar.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            aaVar.lavender(ivory, 15);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        if (!(obj instanceof c)) {
            return false;
        }
        try {
            ac acVar = this.alpha;
            ac acVar2 = ((c) obj).alpha;
            aa aaVar = (aa) acVar;
            Parcel ivory = aaVar.ivory();
            w.delta(ivory, acVar2);
            Parcel delta = aaVar.delta(ivory, 17);
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
            aa aaVar = (aa) this.alpha;
            Parcel delta = aaVar.delta(aaVar.ivory(), 18);
            int readInt = delta.readInt();
            delta.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
