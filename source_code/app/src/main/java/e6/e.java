package e6;

import V5.x;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import g1.AbstractC1735d;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class e {
    public static final Method alpha;
    public static final Method bravo;
    public static final Method charlie;
    public static final Method delta;
    public static Boolean echo;

    static {
        Method method;
        Method method2;
        Method method3;
        boolean z2;
        Method method4;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        alpha = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        bravo = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        charlie = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e4) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e4);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
            delta = method4;
            echo = null;
        }
        method4 = null;
        delta = method4;
        echo = null;
    }

    public static void alpha(WorkSource workSource, int i4, String str) {
        Method method = bravo;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i4), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = alpha;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i4));
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            }
        }
    }

    public static synchronized boolean bravo(Context context) {
        synchronized (e.class) {
            Boolean bool = echo;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z2 = false;
            if (context == null) {
                return false;
            }
            if (AbstractC1735d.alpha(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z2 = true;
            }
            echo = Boolean.valueOf(z2);
            return z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0037 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean charlie(WorkSource workSource) {
        int intValue;
        Method method = delta;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                x.hotel(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        Method method2 = charlie;
        if (method2 != null) {
            try {
                Object invoke2 = method2.invoke(workSource, null);
                x.hotel(invoke2);
                intValue = ((Integer) invoke2).intValue();
            } catch (Exception e4) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e4);
            }
            if (intValue == 0) {
                return false;
            }
            return true;
        }
        intValue = 0;
        if (intValue == 0) {
        }
    }
}
