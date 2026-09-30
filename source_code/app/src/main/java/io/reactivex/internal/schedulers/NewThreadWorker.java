package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class NewThreadWorker extends Scheduler.Worker implements Disposable {
    volatile boolean disposed;
    private final ScheduledExecutorService executor;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.executor = SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (!this.disposed) {
            this.disposed = true;
            this.executor.shutdownNow();
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @NonNull
    public ScheduledRunnable scheduleActual(Runnable runnable, long j5, @NonNull TimeUnit timeUnit, @Nullable DisposableContainer disposableContainer) {
        Future<?> schedule;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), disposableContainer);
        if (disposableContainer == null || disposableContainer.add(scheduledRunnable)) {
            try {
                if (j5 <= 0) {
                    schedule = this.executor.submit((Callable) scheduledRunnable);
                } else {
                    schedule = this.executor.schedule((Callable) scheduledRunnable, j5, timeUnit);
                }
                scheduledRunnable.setFuture(schedule);
                return scheduledRunnable;
            } catch (RejectedExecutionException e) {
                if (disposableContainer != null) {
                    disposableContainer.remove(scheduledRunnable);
                }
                RxJavaPlugins.onError(e);
            }
        }
        return scheduledRunnable;
    }

    public Disposable scheduleDirect(Runnable runnable, long j5, TimeUnit timeUnit) {
        Future<?> schedule;
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        try {
            if (j5 <= 0) {
                schedule = this.executor.submit(scheduledDirectTask);
            } else {
                schedule = this.executor.schedule(scheduledDirectTask, j5, timeUnit);
            }
            scheduledDirectTask.setFuture(schedule);
            return scheduledDirectTask;
        } catch (RejectedExecutionException e) {
            RxJavaPlugins.onError(e);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable onSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j6 <= 0) {
            InstantPeriodicTask instantPeriodicTask = new InstantPeriodicTask(onSchedule, this.executor);
            try {
                if (j5 <= 0) {
                    schedule = this.executor.submit(instantPeriodicTask);
                } else {
                    schedule = this.executor.schedule(instantPeriodicTask, j5, timeUnit);
                }
                instantPeriodicTask.setFirst(schedule);
                return instantPeriodicTask;
            } catch (RejectedExecutionException e) {
                RxJavaPlugins.onError(e);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(onSchedule);
        try {
            scheduledDirectPeriodicTask.setFuture(this.executor.scheduleAtFixedRate(scheduledDirectPeriodicTask, j5, j6, timeUnit));
            return scheduledDirectPeriodicTask;
        } catch (RejectedExecutionException e4) {
            RxJavaPlugins.onError(e4);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void shutdown() {
        if (!this.disposed) {
            this.disposed = true;
            this.executor.shutdown();
        }
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable, long j5, @NonNull TimeUnit timeUnit) {
        if (this.disposed) {
            return EmptyDisposable.INSTANCE;
        }
        return scheduleActual(runnable, j5, timeUnit, null);
    }
}
