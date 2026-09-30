package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class InstantPeriodicTask implements Callable<Void>, Disposable {
    static final FutureTask<Void> CANCELLED = new FutureTask<>(Functions.EMPTY_RUNNABLE, null);
    final ExecutorService executor;
    final AtomicReference<Future<?>> first = new AtomicReference<>();
    final AtomicReference<Future<?>> rest = new AtomicReference<>();
    Thread runner;
    final Runnable task;

    public InstantPeriodicTask(Runnable runnable, ExecutorService executorService) {
        this.task = runnable;
        this.executor = executorService;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        boolean z2;
        AtomicReference<Future<?>> atomicReference = this.first;
        FutureTask<Void> futureTask = CANCELLED;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z10 = false;
        if (andSet != null && andSet != futureTask) {
            if (this.runner != Thread.currentThread()) {
                z2 = true;
            } else {
                z2 = false;
            }
            andSet.cancel(z2);
        }
        Future<?> andSet2 = this.rest.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.runner != Thread.currentThread()) {
                z10 = true;
            }
            andSet2.cancel(z10);
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        if (this.first.get() == CANCELLED) {
            return true;
        }
        return false;
    }

    public void setFirst(Future<?> future) {
        boolean z2;
        while (true) {
            Future<?> future2 = this.first.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                future.cancel(z2);
                return;
            }
            AtomicReference<Future<?>> atomicReference = this.first;
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    public void setRest(Future<?> future) {
        boolean z2;
        while (true) {
            Future<?> future2 = this.rest.get();
            if (future2 == CANCELLED) {
                if (this.runner != Thread.currentThread()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                future.cancel(z2);
                return;
            }
            AtomicReference<Future<?>> atomicReference = this.rest;
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.task.run();
            setRest(this.executor.submit(this));
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            RxJavaPlugins.onError(th);
        }
        return null;
    }
}
