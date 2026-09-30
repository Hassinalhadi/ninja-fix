package zendesk.commonui;

import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;
import s1.af;

/* loaded from: classes.dex */
public final class MainThreadExecutorService extends AbstractExecutorService implements AutoCloseable {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());
    private static final MainThreadExecutorService INSTANCE = new MainThreadExecutorService();

    private MainThreadExecutorService() {
    }

    public static MainThreadExecutorService get() {
        return INSTANCE;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j5, TimeUnit timeUnit) throws InterruptedException {
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        af.amber(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        HANDLER.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return Collections.EMPTY_LIST;
    }
}
