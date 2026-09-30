package t6;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Map;
import s6.T7;

/* loaded from: classes2.dex */
public abstract class j4 {
    public static r6.r alpha;

    public static void alpha() {
        T7.golf("Not in application's main thread", charlie());
    }

    public static void bravo(zd.p pVar, Xd.l lVar) {
        for (Map.Entry entry : pVar.foxtrot()) {
            lVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static boolean charlie() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void delta(Runnable runnable) {
        if (charlie()) {
            runnable.run();
        } else {
            T7.golf("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static synchronized h4 echo(e4 e4Var) {
        h4 h4Var;
        synchronized (j4.class) {
            try {
                if (alpha == null) {
                    alpha = new r6.r(2);
                }
                h4Var = (h4) alpha.get(e4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return h4Var;
    }
}
