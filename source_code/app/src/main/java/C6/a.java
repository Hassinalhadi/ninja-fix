package C6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.d;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.play.core.integrity.c;
import i6.C1894c;
import java.lang.reflect.Method;
import s6.AbstractC2627c7;

/* loaded from: classes2.dex */
public abstract class a {
    public static final d alpha = d.getInstance();
    public static final Object bravo = new Object();
    public static Method charlie = null;
    public static boolean delta = false;

    public static void alpha(Context context) {
        Context context2;
        Context context3;
        alpha.verifyGooglePlayServicesIsAvailable(context, 11925000);
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (bravo) {
            Context context4 = null;
            if (!delta) {
                try {
                    context2 = C1894c.charlie(context, C1894c.echo, "com.google.android.gms.providerinstaller.dynamite").alpha;
                } catch (DynamiteModule$LoadingException e) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage())));
                    context2 = null;
                }
                if (context2 != null) {
                    bravo(context2, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z2 = delta;
            try {
                context3 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context3 = null;
            }
            if (context3 != null) {
                delta = true;
                if (!z2) {
                    try {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        ClassLoader classLoader = context3.getClassLoader();
                        c cVar = new c(5, Context.class, context);
                        Long valueOf = Long.valueOf(uptimeMillis);
                        Class cls = Long.TYPE;
                        AbstractC2627c7.charlie(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", cVar, new c(5, cls, valueOf), new c(5, cls, Long.valueOf(uptimeMillis2)));
                    } catch (Exception e4) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e4.toString()));
                    }
                }
                context4 = context3;
            }
            if (context4 != null) {
                bravo(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new GooglePlayServicesNotAvailableException(8);
            }
        }
    }

    public static void bravo(Context context, String str) {
        String th;
        try {
            if (charlie == null) {
                charlie = context.getClassLoader().loadClass(str).getMethod("insertProvider", Context.class);
            }
            charlie.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    th = e.toString();
                } else {
                    th = cause.toString();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(th)));
            }
            throw new GooglePlayServicesNotAvailableException(8);
        }
    }
}
