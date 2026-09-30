package bd;

import android.os.Handler;
import android.os.SystemClock;
import be.j;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: bd.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ScheduledExecutorServiceC0750c extends AbstractExecutorService implements ScheduledExecutorService, AutoCloseable {
    public final Handler alpha;

    static {
        new A7.a(5);
    }

    public ScheduledExecutorServiceC0750c(Handler handler) {
        this.alpha = handler;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j5, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0750c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        Rf.a.victor(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Handler handler = this.alpha;
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(handler + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j5, TimeUnit timeUnit) {
        return schedule(new C3.b(1, runnable), j5, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0750c.class.getSimpleName().concat(" does not yet support fixed-rate scheduling."));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0750c.class.getSimpleName().concat(" does not yet support fixed-delay scheduling."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0750c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException(ScheduledExecutorServiceC0750c.class.getSimpleName().concat(" cannot be shut down. Use Looper.quitSafely()."));
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [be.j, java.util.concurrent.ScheduledFuture] */
    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Callable callable, long j5, TimeUnit timeUnit) {
        long convert = TimeUnit.MILLISECONDS.convert(j5, timeUnit) + SystemClock.uptimeMillis();
        Handler handler = this.alpha;
        RunnableScheduledFutureC0749b runnableScheduledFutureC0749b = new RunnableScheduledFutureC0749b(handler, convert, callable);
        if (handler.postAtTime(runnableScheduledFutureC0749b, convert)) {
            return runnableScheduledFutureC0749b;
        }
        return new j(1, new RejectedExecutionException(handler + " is shutting down"));
    }
}
