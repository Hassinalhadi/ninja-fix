package vf;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: vf.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3194A extends az implements ai {
    public final Executor purple;

    public C3194A(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        Method method;
        this.purple = executor;
        Method method2 = Af.a.alpha;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null && (method = Af.a.alpha) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        try {
            this.purple.execute(runnable);
        } catch (RejectedExecutionException e) {
            ad.juliet(hVar, ad.alpha("The task was rejected", e));
            Cf.e eVar = ao.alpha;
            Cf.d.purple.beige(hVar, runnable);
        }
    }

    @Override // vf.ai
    public final aq charlie(long j5, d0 d0Var, Nd.h hVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.purple;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(d0Var, j5, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                ad.juliet(hVar, ad.alpha("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            return new ap(scheduledFuture);
        }
        return ae.f13993b.charlie(j5, d0Var, hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ExecutorService executorService;
        Executor executor = this.purple;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C3194A) && ((C3194A) obj).purple == this.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return System.identityHashCode(this.purple);
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        return this.purple.toString();
    }

    @Override // vf.ai
    public final void uniform(long j5, C3207k c3207k) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.purple;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new com.google.common.util.concurrent.d(16, this, c3207k), j5, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                ad.juliet(c3207k.teal, ad.alpha("The task was rejected", e));
            }
        }
        if (scheduledFuture != null) {
            c3207k.whiskey(new C3204h(0, scheduledFuture));
        } else {
            ae.f13993b.uniform(j5, c3207k);
        }
    }
}
