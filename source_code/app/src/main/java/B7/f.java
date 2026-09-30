package B7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f extends BroadcastReceiver {
    public static final AtomicReference bravo = new AtomicReference();
    public final Context alpha;

    public f(Context context) {
        this.alpha = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.kilo) {
            try {
                Iterator it = ((bv.d) g.lima.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).echo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.alpha.unregisterReceiver(this);
    }
}
