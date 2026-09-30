package e6;

import android.os.StrictMode;

/* loaded from: classes2.dex */
public abstract class f {
    public static StrictMode.VmPolicy.Builder alpha(StrictMode.VmPolicy.Builder builder) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        permitUnsafeIntentLaunch = builder.permitUnsafeIntentLaunch();
        return permitUnsafeIntentLaunch;
    }
}
