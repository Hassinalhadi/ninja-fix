package T5;

import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class w {
    public final int alpha;

    public w(int i4) {
        this.alpha = i4;
    }

    public static Status golf(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean alpha(r rVar);

    public abstract Feature[] bravo(r rVar);

    public abstract void charlie(Status status);

    public abstract void delta(RuntimeException runtimeException);

    public abstract void echo(r rVar);

    public abstract void foxtrot(J2.l lVar, boolean z2);
}
