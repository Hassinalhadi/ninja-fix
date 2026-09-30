package p6;

import android.os.RemoteException;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import s6.AbstractC2824y7;

/* loaded from: classes2.dex */
public final class k extends LocationCallback {
    public final /* synthetic */ G6.h alpha;
    public final /* synthetic */ q bravo;

    public k(q qVar, G6.h hVar) {
        this.alpha = hVar;
        this.bravo = qVar;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        this.alpha.delta(locationResult.getLastLocation());
        try {
            this.bravo.coral(AbstractC2824y7.delta(this, "GetCurrentLocation"), false, new G6.h());
        } catch (RemoteException unused) {
        }
    }
}
