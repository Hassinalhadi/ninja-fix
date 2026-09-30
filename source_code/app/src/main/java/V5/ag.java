package V5;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import d6.C1590a;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ag {
    public static final Object golf = new Object();
    public static ag hotel;
    public static HandlerThread india;
    public final HashMap alpha = new HashMap();
    public final Context bravo;
    public volatile com.google.android.gms.internal.measurement.ai charlie;
    public final C1590a delta;
    public final long echo;
    public final long foxtrot;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.Handler, com.google.android.gms.internal.measurement.ai] */
    public ag(Context context, Looper looper) {
        af afVar = new af(this);
        this.bravo = context.getApplicationContext();
        ?? handler = new Handler(looper, afVar);
        Looper.getMainLooper();
        this.charlie = handler;
        this.delta = C1590a.bravo();
        this.echo = 5000L;
        this.foxtrot = 300000L;
    }

    public static ag alpha(Context context) {
        synchronized (golf) {
            try {
                if (hotel == null) {
                    hotel = new ag(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hotel;
    }

    public static HandlerThread bravo() {
        synchronized (golf) {
            try {
                HandlerThread handlerThread = india;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                india = handlerThread2;
                handlerThread2.start();
                return india;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ConnectionResult charlie(ad adVar, aa aaVar, String str, Executor executor) {
        synchronized (this.alpha) {
            try {
                ae aeVar = (ae) this.alpha.get(adVar);
                ConnectionResult connectionResult = null;
                if (executor == null) {
                    executor = null;
                }
                if (aeVar == null) {
                    aeVar = new ae(this, adVar);
                    aeVar.alpha.put(aaVar, aaVar);
                    connectionResult = ae.alpha(aeVar, str, executor);
                    this.alpha.put(adVar, aeVar);
                } else {
                    this.charlie.removeMessages(0, adVar);
                    if (!aeVar.alpha.containsKey(aaVar)) {
                        aeVar.alpha.put(aaVar, aaVar);
                        int i4 = aeVar.bravo;
                        if (i4 != 1) {
                            if (i4 == 2) {
                                connectionResult = ae.alpha(aeVar, str, executor);
                            }
                        } else {
                            aaVar.onServiceConnected(aeVar.foxtrot, aeVar.delta);
                        }
                    } else {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(adVar.toString()));
                    }
                }
                if (aeVar.charlie) {
                    return ConnectionResult.teal;
                }
                if (connectionResult == null) {
                    connectionResult = new ConnectionResult(-1);
                }
                return connectionResult;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void delta(String str, ServiceConnection serviceConnection, boolean z2) {
        ad adVar = new ad(str, z2);
        x.india(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.alpha) {
            try {
                ae aeVar = (ae) this.alpha.get(adVar);
                if (aeVar != null) {
                    if (aeVar.alpha.containsKey(serviceConnection)) {
                        aeVar.alpha.remove(serviceConnection);
                        if (aeVar.alpha.isEmpty()) {
                            this.charlie.sendMessageDelayed(this.charlie.obtainMessage(0, adVar), this.echo);
                        }
                    } else {
                        throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(adVar.toString()));
                    }
                } else {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(adVar.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
