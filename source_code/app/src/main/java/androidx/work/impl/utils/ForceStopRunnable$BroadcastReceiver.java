package androidx.work.impl.utils;

import A2.z;
import K2.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes3.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {
    public static final String alpha = z.golf("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            if (z.echo().alpha <= 2) {
                Log.v(alpha, "Rescheduling alarm that keeps track of force-stops.");
            }
            c.charlie(context);
        }
    }
}
