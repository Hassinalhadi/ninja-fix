package s6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import g0.C1726f;

/* renamed from: s6.e0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2638e0 {
    public static C1726f alpha;

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void alpha(Context context) {
        boolean z2;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (!AbstractC2647f0.alpha(context).getBoolean("proxy_notification_initialized", false)) {
            try {
                applicationContext = context.getApplicationContext();
                packageManager = applicationContext.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
                z2 = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
                if (Build.VERSION.SDK_INT < 29) {
                    new av.az(context, z2, new G6.h()).run();
                    return;
                } else {
                    V4.echo(null);
                    return;
                }
            }
            z2 = true;
            if (Build.VERSION.SDK_INT < 29) {
            }
        }
    }
}
