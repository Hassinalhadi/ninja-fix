package g6;

import android.content.Context;
import e6.AbstractC1630b;
import g0.C1726f;

/* renamed from: g6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1753a {
    public static Context alpha;
    public static Boolean bravo;
    public static C1726f charlie;

    public static synchronized boolean alpha(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (AbstractC1753a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = alpha;
            if (context2 != null && (bool = bravo) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            bravo = null;
            if (AbstractC1630b.delta()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                bravo = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    bravo = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bravo = Boolean.FALSE;
                }
            }
            alpha = applicationContext;
            return bravo.booleanValue();
        }
    }
}
