package androidx.camera.core;

import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0531m implements Executor {
    public static final ThreadFactoryC0530l red = new ThreadFactoryC0530l(0);
    public final Object alpha = new Object();
    public ThreadPoolExecutor purple;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public ExecutorC0531m() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), red);
        threadPoolExecutor.setRejectedExecutionHandler(new Object());
        this.purple = threadPoolExecutor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.RejectedExecutionHandler, java.lang.Object] */
    public final void alpha(av.i iVar) {
        ThreadPoolExecutor threadPoolExecutor;
        iVar.getClass();
        synchronized (this.alpha) {
            try {
                if (this.purple.isShutdown()) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), red);
                    threadPoolExecutor2.setRejectedExecutionHandler(new Object());
                    this.purple = threadPoolExecutor2;
                }
                threadPoolExecutor = this.purple;
            } catch (Throwable th) {
                throw th;
            }
        }
        int max = Math.max(1, new LinkedHashSet(iVar.foxtrot).size());
        threadPoolExecutor.setMaximumPoolSize(max);
        threadPoolExecutor.setCorePoolSize(max);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.alpha) {
            this.purple.execute(runnable);
        }
    }
}
