package V5;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaj;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ae implements ServiceConnection {
    public final HashMap alpha = new HashMap();
    public int bravo = 2;
    public boolean charlie;
    public IBinder delta;
    public final ad echo;
    public ComponentName foxtrot;
    public final /* synthetic */ ag golf;

    public ae(ag agVar, ad adVar) {
        this.golf = agVar;
        this.echo = adVar;
    }

    public static ConnectionResult alpha(ae aeVar, String str, Executor executor) {
        try {
            Intent alpha = aeVar.echo.alpha(aeVar.golf.bravo);
            aeVar.bravo = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(e6.f.alpha(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                ag agVar = aeVar.golf;
                boolean delta = agVar.delta.delta(agVar.bravo, str, alpha, aeVar, 4225, executor);
                aeVar.charlie = delta;
                if (delta) {
                    aeVar.golf.charlie.sendMessageDelayed(aeVar.golf.charlie.obtainMessage(1, aeVar.echo), aeVar.golf.foxtrot);
                    ConnectionResult connectionResult = ConnectionResult.teal;
                    StrictMode.setVmPolicy(vmPolicy);
                    return connectionResult;
                }
                aeVar.bravo = 2;
                try {
                    ag agVar2 = aeVar.golf;
                    agVar2.delta.charlie(agVar2.bravo, aeVar);
                } catch (IllegalArgumentException unused) {
                }
                ConnectionResult connectionResult2 = new ConnectionResult(16);
                StrictMode.setVmPolicy(vmPolicy);
                return connectionResult2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (zzaj e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.golf.alpha) {
            try {
                this.golf.charlie.removeMessages(1, this.echo);
                this.delta = iBinder;
                this.foxtrot = componentName;
                Iterator it = this.alpha.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.bravo = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.golf.alpha) {
            try {
                this.golf.charlie.removeMessages(1, this.echo);
                this.delta = null;
                this.foxtrot = componentName;
                Iterator it = this.alpha.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.bravo = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
