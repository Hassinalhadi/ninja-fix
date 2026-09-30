package com.clevertap.android.sdk.task;

import h9.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class PostAsyncSafelyExecutor implements ExecutorService, AutoCloseable {
    private long EXECUTOR_THREAD_ID = 0;
    ExecutorService executor = Executors.newSingleThreadExecutor();

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j5, TimeUnit timeUnit) throws InterruptedException {
        return this.executor.awaitTermination(j5, timeUnit);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        z.tango(this);
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (runnable != null) {
            if (Thread.currentThread().getId() == this.EXECUTOR_THREAD_ID) {
                runnable.run();
                return;
            } else {
                this.executor.execute(new Runnable() { // from class: com.clevertap.android.sdk.task.PostAsyncSafelyExecutor.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PostAsyncSafelyExecutor.this.EXECUTOR_THREAD_ID = Thread.currentThread().getId();
                        runnable.run();
                    }
                });
                return;
            }
        }
        throw new NullPointerException("PostAsyncSafelyExecutor#execute: task can't ne null");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.executor.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.executor.isTerminated();
    }

    public void setExecutor(ExecutorService executorService) {
        this.executor = executorService;
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.executor.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.executor.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Callable<T> callable) {
        if (callable == null) {
            throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
        }
        if (Thread.currentThread().getId() == this.EXECUTOR_THREAD_ID) {
            try {
                callable.call();
                return null;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        return this.executor.submit(new Callable<T>() { // from class: com.clevertap.android.sdk.task.PostAsyncSafelyExecutor.2
            @Override // java.util.concurrent.Callable
            public T call() throws Exception {
                PostAsyncSafelyExecutor.this.EXECUTOR_THREAD_ID = Thread.currentThread().getId();
                return (T) callable.call();
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAll: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j5, TimeUnit timeUnit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("PostAsyncSafelyExecutor#invokeAny: This method is not supported");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t5) {
        if (runnable != null) {
            FutureTask futureTask = new FutureTask(runnable, t5);
            execute(futureTask);
            return futureTask;
        }
        throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        if (runnable != null) {
            FutureTask futureTask = new FutureTask(runnable, null);
            execute(futureTask);
            return futureTask;
        }
        throw new NullPointerException("PostAsyncSafelyExecutor#submit: task can't ne null");
    }
}
