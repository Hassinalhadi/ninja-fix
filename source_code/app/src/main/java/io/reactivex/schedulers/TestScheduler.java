package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class TestScheduler extends Scheduler {
    long counter;
    final Queue<TimedRunnable> queue = new PriorityBlockingQueue(11);
    volatile long time;

    /* loaded from: classes2.dex */
    public static final class TimedRunnable implements Comparable<TimedRunnable> {
        final long count;
        final Runnable run;
        final TestWorker scheduler;
        final long time;

        public TimedRunnable(TestWorker testWorker, long j5, Runnable runnable, long j6) {
            this.time = j5;
            this.run = runnable;
            this.scheduler = testWorker;
            this.count = j6;
        }

        public String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.time), this.run.toString());
        }

        @Override // java.lang.Comparable
        public int compareTo(TimedRunnable timedRunnable) {
            long j5 = this.time;
            long j6 = timedRunnable.time;
            if (j5 == j6) {
                return ObjectHelper.compare(this.count, timedRunnable.count);
            }
            return ObjectHelper.compare(j5, j6);
        }
    }

    public TestScheduler() {
    }

    public void advanceTimeBy(long j5, TimeUnit timeUnit) {
        advanceTimeTo(timeUnit.toNanos(j5) + this.time, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j5, TimeUnit timeUnit) {
        triggerActions(timeUnit.toNanos(j5));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new TestWorker();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.time, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        triggerActions(this.time);
    }

    private void triggerActions(long j5) {
        while (true) {
            TimedRunnable peek = this.queue.peek();
            if (peek == null) {
                break;
            }
            long j6 = peek.time;
            if (j6 > j5) {
                break;
            }
            if (j6 == 0) {
                j6 = this.time;
            }
            this.time = j6;
            this.queue.remove(peek);
            if (!peek.scheduler.disposed) {
                peek.run.run();
            }
        }
        this.time = j5;
    }

    public TestScheduler(long j5, TimeUnit timeUnit) {
        this.time = timeUnit.toNanos(j5);
    }

    /* loaded from: classes2.dex */
    public final class TestWorker extends Scheduler.Worker {
        volatile boolean disposed;

        /* loaded from: classes2.dex */
        public final class QueueRemove implements Runnable {
            final TimedRunnable timedAction;

            public QueueRemove(TimedRunnable timedRunnable) {
                this.timedAction = timedRunnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                TestScheduler.this.queue.remove(this.timedAction);
            }
        }

        public TestWorker() {
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        public long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j5, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = timeUnit.toNanos(j5) + TestScheduler.this.time;
            TestScheduler testScheduler = TestScheduler.this;
            long j6 = testScheduler.counter;
            testScheduler.counter = 1 + j6;
            TimedRunnable timedRunnable = new TimedRunnable(this, nanos, runnable, j6);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j5 = testScheduler.counter;
            testScheduler.counter = 1 + j5;
            TimedRunnable timedRunnable = new TimedRunnable(this, 0L, runnable, j5);
            TestScheduler.this.queue.add(timedRunnable);
            return Disposables.fromRunnable(new QueueRemove(timedRunnable));
        }
    }
}
