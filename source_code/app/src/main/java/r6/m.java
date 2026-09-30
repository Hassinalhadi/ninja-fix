package r6;

import h9.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class m implements ExecutorService, AutoCloseable {
    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j5, TimeUnit timeUnit) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.awaitTermination(j5, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z.uniform(this);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        ((com.google.mlkit.common.sdkinternal.j) this).alpha.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.submit(runnable);
    }

    public final String toString() {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j5, TimeUnit timeUnit) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j5, TimeUnit timeUnit) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return ((com.google.mlkit.common.sdkinternal.j) this).alpha.submit(callable);
    }
}
