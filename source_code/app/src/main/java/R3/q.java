package R3;

import android.content.IntentFilter;
import android.util.Log;

/* loaded from: classes3.dex */
public final class q implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    public /* synthetic */ q(r rVar, int i4) {
        this.alpha = i4;
        this.purple = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                r rVar = this.purple;
                rVar.silver = rVar.alpha();
                try {
                    r rVar2 = this.purple;
                    rVar2.alpha.registerReceiver(rVar2.white, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.purple.teal = true;
                    return;
                } catch (SecurityException e) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e);
                    }
                    this.purple.teal = false;
                    return;
                }
            case 1:
                if (this.purple.teal) {
                    this.purple.teal = false;
                    r rVar3 = this.purple;
                    rVar3.alpha.unregisterReceiver(rVar3.white);
                    return;
                }
                return;
            default:
                boolean z2 = this.purple.silver;
                r rVar4 = this.purple;
                rVar4.silver = rVar4.alpha();
                if (z2 != this.purple.silver) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.purple.silver);
                    }
                    r rVar5 = this.purple;
                    Y3.l.foxtrot().post(new p(rVar5, rVar5.silver, 1));
                    return;
                }
                return;
        }
    }
}
