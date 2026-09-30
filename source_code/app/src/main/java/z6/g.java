package z6;

import V5.x;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import q6.C2414d;
import q6.w;

/* loaded from: classes2.dex */
public final class g {
    public final q6.f alpha;

    public g(q6.f fVar) {
        x.hotel(fVar);
        this.alpha = fVar;
    }

    public final void alpha(boolean z2) {
        try {
            C2414d c2414d = (C2414d) this.alpha;
            Parcel ivory = c2414d.ivory();
            int i4 = w.alpha;
            ivory.writeInt(z2 ? 1 : 0);
            c2414d.lavender(ivory, 15);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final boolean equals(Object obj) {
        boolean z2 = false;
        if (!(obj instanceof g)) {
            return false;
        }
        try {
            q6.f fVar = this.alpha;
            q6.f fVar2 = ((g) obj).alpha;
            C2414d c2414d = (C2414d) fVar;
            Parcel ivory = c2414d.ivory();
            w.delta(ivory, fVar2);
            Parcel delta = c2414d.delta(ivory, 19);
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
            C2414d c2414d = (C2414d) this.alpha;
            Parcel delta = c2414d.delta(c2414d.ivory(), 20);
            int readInt = delta.readInt();
            delta.recycle();
            return readInt;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
