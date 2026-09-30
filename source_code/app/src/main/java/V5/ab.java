package V5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes2.dex */
public final class ab extends r {
    public final IBinder golf;
    public final /* synthetic */ e hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab(e eVar, int i4, IBinder iBinder, Bundle bundle) {
        super(eVar, i4, bundle);
        this.hotel = eVar;
        this.golf = iBinder;
    }

    @Override // V5.r
    public final void alpha(ConnectionResult connectionResult) {
        c cVar = this.hotel.papa;
        if (cVar != null) {
            cVar.delta(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // V5.r
    public final boolean bravo() {
        IBinder iBinder = this.golf;
        try {
            x.hotel(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            e eVar = this.hotel;
            if (!eVar.uniform().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + eVar.uniform() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface oscar = eVar.oscar(iBinder);
            if (oscar == null || (!e.amber(eVar, 2, 4, oscar) && !e.amber(eVar, 3, 4, oscar))) {
                return false;
            }
            eVar.tango = null;
            b bVar = eVar.oscar;
            if (bVar != null) {
                bVar.charlie();
                return true;
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
