package R3;

import Gc.v;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class r implements o {
    public static final Executor yellow = AsyncTask.SERIAL_EXECUTOR;
    public final Context alpha;
    public final n purple;
    public final com.google.android.gms.common.f red;
    public volatile boolean silver;
    public volatile boolean teal;
    public final v white = new v(2, this);

    public r(Context context, com.google.android.gms.common.f fVar, n nVar) {
        this.alpha = context.getApplicationContext();
        this.red = fVar;
        this.purple = nVar;
    }

    public final boolean alpha() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.red.get()).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                return false;
            }
            return true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
                return true;
            }
            return true;
        }
    }

    @Override // R3.o
    public final boolean register() {
        yellow.execute(new q(this, 0));
        return true;
    }

    @Override // R3.o
    public final void unregister() {
        yellow.execute(new q(this, 1));
    }
}
