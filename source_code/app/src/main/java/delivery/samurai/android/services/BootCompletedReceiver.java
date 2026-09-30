package delivery.samurai.android.services;

import Y9.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3026m2;
import t6.AbstractC3031n2;
import t6.AbstractC3036o2;
import z3.C3462a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldelivery/samurai/android/services/BootCompletedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_ProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BootCompletedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        Intrinsics.echo(context, "context");
        if (intent != null && (action = intent.getAction()) != null) {
            if (Intrinsics.areEqual(action, "android.intent.action.BOOT_COMPLETED") || Intrinsics.areEqual(action, "android.intent.action.QUICKBOOT_POWERON") || Intrinsics.areEqual(action, "com.htc.intent.action.QUICKBOOT_POWERON")) {
                boolean charlie = l.charlie(context, "boot", false);
                if (charlie) {
                    AbstractC3026m2.bravo(context, "boot");
                }
                C3462a.alpha("LocationFlow", 12, "🔁 [BOOT] startedService=" + charlie, null);
                if (l.bravo(context)) {
                    AbstractC3036o2.delta(context);
                    AbstractC3031n2.bravo(context);
                }
            }
        }
    }
}
