package V5;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
public final class af implements Handler.Callback {
    public final /* synthetic */ ag alpha;

    public /* synthetic */ af(ag agVar) {
        this.alpha = agVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i4 = message.what;
        if (i4 != 0) {
            if (i4 != 1) {
                return false;
            }
            synchronized (this.alpha.alpha) {
                try {
                    ad adVar = (ad) message.obj;
                    ae aeVar = (ae) this.alpha.alpha.get(adVar);
                    if (aeVar != null && aeVar.bravo == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(adVar)), new Exception());
                        ComponentName componentName = aeVar.foxtrot;
                        if (componentName == null) {
                            adVar.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = adVar.bravo;
                            x.hotel(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        aeVar.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.alpha.alpha) {
            try {
                ad adVar2 = (ad) message.obj;
                ae aeVar2 = (ae) this.alpha.alpha.get(adVar2);
                if (aeVar2 != null && aeVar2.alpha.isEmpty()) {
                    if (aeVar2.charlie) {
                        aeVar2.golf.charlie.removeMessages(1, aeVar2.echo);
                        ag agVar = aeVar2.golf;
                        agVar.delta.charlie(agVar.bravo, aeVar2);
                        aeVar2.charlie = false;
                        aeVar2.bravo = 2;
                    }
                    this.alpha.alpha.remove(adVar2);
                }
            } finally {
            }
        }
        return true;
    }
}
