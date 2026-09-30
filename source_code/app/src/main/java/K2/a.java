package K2;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class a {
    public static String alpha() {
        String processName = Application.getProcessName();
        Intrinsics.delta(processName, "getProcessName()");
        return processName;
    }
}
