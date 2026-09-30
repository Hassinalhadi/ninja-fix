package ap;

import E2.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ThreadFactoryC0530l;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import t6.I3;

/* loaded from: classes3.dex */
public final class c extends I3 {
    public final Object alpha = new Object();
    public final ExecutorService bravo = Executors.newFixedThreadPool(4, new ThreadFactoryC0530l(1));
    public volatile Handler charlie;

    public static Handler charlie(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return e.alpha(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
