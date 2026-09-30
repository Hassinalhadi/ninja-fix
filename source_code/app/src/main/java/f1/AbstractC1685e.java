package f1;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: f1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1685e {
    public static final Class alpha;
    public static final Field bravo;
    public static final Field charlie;
    public static final Method delta;
    public static final Method echo;
    public static final Method foxtrot;
    public static final Handler golf;

    /* JADX WARN: Can't wrap try/catch for region: R(19:1|(2:2|3)|4|(2:5|6)|7|(2:8|9)|10|(12:33|34|13|(6:29|30|16|(3:24|25|26)|20|21)|15|16|(1:18)|24|25|26|20|21)|12|13|(0)|15|16|(0)|24|25|26|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Class<?> cls;
        Field field;
        Field field2;
        Method declaredMethod;
        Class cls2;
        Method declaredMethod2;
        Class cls3;
        int i4;
        Class<?> cls4 = Boolean.TYPE;
        golf = new Handler(Looper.getMainLooper());
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        alpha = cls;
        try {
            field = Activity.class.getDeclaredField("mMainThread");
            field.setAccessible(true);
        } catch (Throwable unused2) {
            field = null;
        }
        bravo = field;
        try {
            field2 = Activity.class.getDeclaredField("mToken");
            field2.setAccessible(true);
        } catch (Throwable unused3) {
            field2 = null;
        }
        charlie = field2;
        Class cls5 = alpha;
        if (cls5 != null) {
            try {
                declaredMethod = cls5.getDeclaredMethod("performStopActivity", IBinder.class, cls4, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
            delta = declaredMethod;
            cls2 = alpha;
            if (cls2 != null) {
                try {
                    declaredMethod2 = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls4);
                    declaredMethod2.setAccessible(true);
                } catch (Throwable unused5) {
                }
                echo = declaredMethod2;
                cls3 = alpha;
                i4 = Build.VERSION.SDK_INT;
                if ((i4 != 26 || i4 == 27) && cls3 != null) {
                    Method declaredMethod3 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
                    declaredMethod3.setAccessible(true);
                    method = declaredMethod3;
                }
                foxtrot = method;
            }
            declaredMethod2 = null;
            echo = declaredMethod2;
            cls3 = alpha;
            i4 = Build.VERSION.SDK_INT;
            if (i4 != 26) {
            }
            Method declaredMethod32 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
            declaredMethod32.setAccessible(true);
            method = declaredMethod32;
            foxtrot = method;
        }
        declaredMethod = null;
        delta = declaredMethod;
        cls2 = alpha;
        if (cls2 != null) {
        }
        declaredMethod2 = null;
        echo = declaredMethod2;
        cls3 = alpha;
        i4 = Build.VERSION.SDK_INT;
        if (i4 != 26) {
        }
        Method declaredMethod322 = cls3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls4, Configuration.class, Configuration.class, cls4, cls4);
        declaredMethod322.setAccessible(true);
        method = declaredMethod322;
        foxtrot = method;
    }
}
