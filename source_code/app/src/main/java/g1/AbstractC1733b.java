package g1;

import Gc.v;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1733b {
    public static Intent alpha(Context context, v vVar, IntentFilter intentFilter) {
        return context.registerReceiver(vVar, intentFilter, null, null, 0);
    }

    public static Intent bravo(Context context, v vVar, IntentFilter intentFilter) {
        return context.registerReceiver(vVar, intentFilter, null, null, 2);
    }

    public static void charlie(Context context, Intent intent) {
        context.startForegroundService(intent);
    }
}
