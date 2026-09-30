package K2;

import A2.ai;
import A2.z;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class h {
    public static final String alpha;

    static {
        String golf = z.golf("ProcessUtils");
        Intrinsics.delta(golf, "tagWithPrefix(\"ProcessUtils\")");
        alpha = golf;
    }

    public static final boolean alpha(Context context, A2.a configuration) {
        String str;
        Object obj;
        Intrinsics.echo(context, "context");
        Intrinsics.echo(configuration, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            str = a.alpha();
        } else {
            str = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, ai.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, null);
                Intrinsics.checkNotNull(invoke);
                if (invoke instanceof String) {
                    str = (String) invoke;
                }
            } catch (Throwable th) {
                z.echo().bravo(alpha, "Unable to check ActivityThread for processName", th);
            }
            int myPid = Process.myPid();
            Object systemService = context.getSystemService("activity");
            Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<T> it = runningAppProcesses.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
                if (runningAppProcessInfo != null) {
                    str = runningAppProcessInfo.processName;
                }
            }
        }
        return Intrinsics.areEqual(str, context.getApplicationInfo().processName);
    }
}
