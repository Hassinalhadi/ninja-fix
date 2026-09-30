package D2;

import A2.z;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes3.dex */
public abstract class c extends BroadcastReceiver {
    public static final String alpha = z.golf("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        z.echo().alpha(alpha, "onReceive : " + intent);
        String str = b.white;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
