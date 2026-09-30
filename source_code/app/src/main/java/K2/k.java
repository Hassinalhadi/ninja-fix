package K2;

import A2.z;
import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k {
    public static final String alpha;

    static {
        String golf = z.golf("WakeLocks");
        Intrinsics.delta(golf, "tagWithPrefix(\"WakeLocks\")");
        alpha = golf;
    }

    public static final PowerManager.WakeLock alpha(Context context, String tag) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String concat = "WorkManager: ".concat(tag);
        PowerManager.WakeLock wakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (l.alpha) {
        }
        Intrinsics.delta(wakeLock, "wakeLock");
        return wakeLock;
    }
}
