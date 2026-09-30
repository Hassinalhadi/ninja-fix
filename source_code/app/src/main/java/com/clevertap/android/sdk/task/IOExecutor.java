package com.clevertap.android.sdk.task;

import h9.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class IOExecutor implements ExecutorService, AutoCloseable {
    ExecutorService executorService;
    private final int numCores;

    public IOExecutor() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.numCores = availableProcessors;
        this.executorService = new ThreadPoolExecutor(availableProcessors * 2, availableProcessors * 2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.executorService.awaitTermination(j5, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z.tango(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.executorService.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.executorService.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.executorService.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.executorService.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.executorService.isTerminated();
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.executorService.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.executorService.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.executorService.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.executorService.invokeAll(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.executorService.invokeAny(collection, j5, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t5) {
        return this.executorService.submit(runnable, t5);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.executorService.submit(runnable);
    }

    public IOExecutor(int i4) {
        this.numCores = Runtime.getRuntime().availableProcessors();
        this.executorService = new ThreadPoolExecutor(4, i4, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }
}
