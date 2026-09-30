package O7;

import android.os.Looper;
import androidx.camera.core.ThreadFactoryC0530l;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class aa {
    public static final ExecutorService alpha;

    static {
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0530l(new AtomicLong(1L)), new ThreadPoolExecutor.DiscardPolicy()));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Runtime.getRuntime().addShutdownHook(new Thread(new v(unconfigurableExecutorService), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        alpha = unconfigurableExecutorService;
    }

    public static void alpha(G6.q qVar) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        qVar.mike(alpha, new z(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (qVar.juliet()) {
            qVar.hotel();
        } else {
            if (!qVar.delta) {
                if (qVar.india()) {
                    throw new IllegalStateException(qVar.golf());
                }
                throw new TimeoutException();
            }
            throw new CancellationException("Task is already canceled");
        }
    }
}
