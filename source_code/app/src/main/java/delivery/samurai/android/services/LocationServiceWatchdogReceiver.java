package delivery.samurai.android.services;

import Y9.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3016k2;
import t6.AbstractC3026m2;
import t6.AbstractC3036o2;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/services/LocationServiceWatchdogReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocationServiceWatchdogReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.echo(context, "context");
        boolean z2 = CaptainLocationMonitoringService.f12066D;
        if (!AbstractC3016k2.bravo(context)) {
            AbstractC3036o2.charlie(context);
            return;
        }
        boolean charlie = l.charlie(context, "watchdog_alarm", true);
        if (charlie) {
            AbstractC3026m2.bravo(context, "watchdog_alarm");
        }
        C3462a.alpha("LocationFlow", 12, "🐶 [WATCHDOG] fired — restartedService=" + charlie, null);
        AbstractC3036o2.delta(context);
    }
}
