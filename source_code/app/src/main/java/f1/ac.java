package f1;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class ac {
    public static String delta;
    public static ab golf;
    public final Context alpha;
    public final NotificationManager bravo;
    public static final Object charlie = new Object();
    public static HashSet echo = new HashSet();
    public static final Object foxtrot = new Object();

    public ac(Context context) {
        this.alpha = context;
        this.bravo = (NotificationManager) context.getSystemService("notification");
    }

    public final boolean alpha() {
        Method method;
        Integer num;
        if (Build.VERSION.SDK_INT >= 24) {
            return u.alpha(this.bravo);
        }
        Context context = this.alpha;
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i4 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.getClass();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
        }
        if (((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i4), packageName)).intValue() == 0) {
            return true;
        }
        return false;
    }

    public final void bravo(int i4, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel")) {
            y yVar = new y(this.alpha.getPackageName(), i4, notification);
            synchronized (foxtrot) {
                try {
                    if (golf == null) {
                        golf = new ab(this.alpha.getApplicationContext());
                    }
                    golf.bravo.obtainMessage(0, yVar).sendToTarget();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.bravo.cancel(null, i4);
            return;
        }
        this.bravo.notify(null, i4, notification);
    }
}
