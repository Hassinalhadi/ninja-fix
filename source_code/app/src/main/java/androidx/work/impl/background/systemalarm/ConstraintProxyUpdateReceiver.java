package androidx.work.impl.background.systemalarm;

import A2.z;
import B2.w;
import D2.d;
import L2.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import av.q;

/* loaded from: classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String alpha = z.golf("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            z.echo().alpha(alpha, q.echo("Ignoring unknown action ", str));
        } else {
            BroadcastReceiver.PendingResult goAsync = goAsync();
            w golf = w.golf(context);
            ((c) golf.echo).alpha(new d(intent, context, goAsync, 0));
        }
    }
}
