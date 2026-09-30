package o1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC2190c implements Executor {
    public final /* synthetic */ int alpha;
    public final Handler purple;

    public ExecutorC2190c() {
        this.alpha = 1;
        this.purple = new Handler(Looper.getMainLooper());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                runnable.getClass();
                Handler handler = this.purple;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                this.purple.post(runnable);
                return;
        }
    }

    public ExecutorC2190c(Handler handler) {
        this.alpha = 0;
        this.purple = handler;
    }
}
