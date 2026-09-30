package bd;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.ThreadFactoryC0530l;
import com.google.android.gms.internal.measurement.ai;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: bd.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0753f implements Executor {
    public static volatile ExecutorC0753f red;
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ ExecutorC0753f(Handler handler, int i4) {
        this.alpha = i4;
        this.purple = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                ((ExecutorService) this.purple).execute(runnable);
                return;
            case 1:
                ((ai) this.purple).post(runnable);
                return;
            case 2:
                ((ai) this.purple).post(runnable);
                return;
            case 3:
                ((ai) this.purple).post(runnable);
                return;
            default:
                runnable.getClass();
                Handler handler = (Handler) this.purple;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public ExecutorC0753f(Looper looper) {
        this.alpha = 3;
        this.purple = new ai(looper, 3);
    }

    public ExecutorC0753f(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                Handler handler = new Handler(Looper.getMainLooper());
                Looper.getMainLooper();
                this.purple = handler;
                return;
            default:
                this.purple = Executors.newFixedThreadPool(2, new ThreadFactoryC0530l(2));
                return;
        }
    }
}
