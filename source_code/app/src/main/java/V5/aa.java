package V5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class aa implements ServiceConnection {
    public final int alpha;
    public final /* synthetic */ e bravo;

    public aa(e eVar, int i4) {
        this.bravo = eVar;
        this.alpha = i4;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        t tVar;
        e eVar = this.bravo;
        if (iBinder == null) {
            e.zulu(eVar);
            return;
        }
        synchronized (eVar.hotel) {
            try {
                e eVar2 = this.bravo;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof t)) {
                    tVar = (t) queryLocalInterface;
                } else {
                    tVar = new t(iBinder);
                }
                eVar2.india = tVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar3 = this.bravo;
        int i4 = this.alpha;
        eVar3.getClass();
        ac acVar = new ac(eVar3, 0, null);
        y yVar = eVar3.foxtrot;
        yVar.sendMessage(yVar.obtainMessage(7, i4, -1, acVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar;
        synchronized (this.bravo.hotel) {
            eVar = this.bravo;
            eVar.india = null;
        }
        int i4 = this.alpha;
        y yVar = eVar.foxtrot;
        yVar.sendMessage(yVar.obtainMessage(6, i4, 1));
    }
}
