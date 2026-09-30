package androidx.work.impl.background.systemalarm;

import A2.z;
import B2.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String alpha = z.golf("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z.echo().alpha(alpha, "Received intent " + intent);
        try {
            w golf = w.golf(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (w.november) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = golf.juliet;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    golf.juliet = goAsync;
                    if (golf.india) {
                        goAsync.finish();
                        golf.juliet = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            z.echo().delta(alpha, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
