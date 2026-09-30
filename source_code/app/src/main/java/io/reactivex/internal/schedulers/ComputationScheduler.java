package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.ListCompositeDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ComputationScheduler extends Scheduler implements SchedulerMultiWorkerSupport {
    private static final String KEY_COMPUTATION_PRIORITY = "rx2.computation-priority";
    static final String KEY_MAX_THREADS = "rx2.computation-threads";
    static final int MAX_THREADS = cap(Runtime.getRuntime().availableProcessors(), Integer.getInteger(KEY_MAX_THREADS, 0).intValue());
    static final FixedSchedulerPool NONE;
    static final PoolWorker SHUTDOWN_WORKER;
    static final RxThreadFactory THREAD_FACTORY;
    private static final String THREAD_NAME_PREFIX = "RxComputationThreadPool";
    final AtomicReference<FixedSchedulerPool> pool;
    final ThreadFactory threadFactory;

    /* loaded from: classes2.dex */
    public static final class FixedSchedulerPool implements SchedulerMultiWorkerSupport {
        final int cores;
        final PoolWorker[] eventLoops;

        /* renamed from: n, reason: collision with root package name */
        long f12852n;

        public FixedSchedulerPool(int i4, ThreadFactory threadFactory) {
            this.cores = i4;
            this.eventLoops = new PoolWorker[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                this.eventLoops[i5] = new PoolWorker(threadFactory);
            }
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
        public void createWorkers(int i4, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
            int i5 = this.cores;
            if (i5 == 0) {
                for (int i10 = 0; i10 < i4; i10++) {
                    workerCallback.onWorker(i10, ComputationScheduler.SHUTDOWN_WORKER);
                }
                return;
            }
            int i11 = ((int) this.f12852n) % i5;
            for (int i12 = 0; i12 < i4; i12++) {
                workerCallback.onWorker(i12, new EventLoopWorker(this.eventLoops[i11]));
                i11++;
                if (i11 == i5) {
                    i11 = 0;
                }
            }
            this.f12852n = i11;
        }

        public PoolWorker getEventLoop() {
            int i4 = this.cores;
            if (i4 == 0) {
                return ComputationScheduler.SHUTDOWN_WORKER;
            }
            PoolWorker[] poolWorkerArr = this.eventLoops;
            long j5 = this.f12852n;
            this.f12852n = 1 + j5;
            return poolWorkerArr[(int) (j5 % i4)];
        }

        public void shutdown() {
            for (PoolWorker poolWorker : this.eventLoops) {
                poolWorker.dispose();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PoolWorker extends NewThreadWorker {
        public PoolWorker(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        PoolWorker poolWorker = new PoolWorker(new RxThreadFactory("RxComputationShutdown"));
        SHUTDOWN_WORKER = poolWorker;
        poolWorker.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory(THREAD_NAME_PREFIX, Math.max(1, Math.min(10, Integer.getInteger(KEY_COMPUTATION_PRIORITY, 5).intValue())), true);
        THREAD_FACTORY = rxThreadFactory;
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(0, rxThreadFactory);
        NONE = fixedSchedulerPool;
        fixedSchedulerPool.shutdown();
    }

    public ComputationScheduler() {
        this(THREAD_FACTORY);
    }

    public static int cap(int i4, int i5) {
        return (i5 <= 0 || i5 > i4) ? i4 : i5;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new EventLoopWorker(this.pool.get().getEventLoop());
    }

    @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport
    public void createWorkers(int i4, SchedulerMultiWorkerSupport.WorkerCallback workerCallback) {
        ObjectHelper.verifyPositive(i4, "number > 0 required");
        this.pool.get().createWorkers(i4, workerCallback);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j5, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().scheduleDirect(runnable, j5, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j5, long j6, TimeUnit timeUnit) {
        return this.pool.get().getEventLoop().schedulePeriodicallyDirect(runnable, j5, j6, timeUnit);
    }

    @Override // io.reactivex.Scheduler
    public void shutdown() {
        while (true) {
            FixedSchedulerPool fixedSchedulerPool = this.pool.get();
            FixedSchedulerPool fixedSchedulerPool2 = NONE;
            if (fixedSchedulerPool == fixedSchedulerPool2) {
                return;
            }
            AtomicReference<FixedSchedulerPool> atomicReference = this.pool;
            while (!atomicReference.compareAndSet(fixedSchedulerPool, fixedSchedulerPool2)) {
                if (atomicReference.get() != fixedSchedulerPool) {
                    break;
                }
            }
            fixedSchedulerPool.shutdown();
            return;
        }
    }

    @Override // io.reactivex.Scheduler
    public void start() {
        FixedSchedulerPool fixedSchedulerPool = new FixedSchedulerPool(MAX_THREADS, this.threadFactory);
        AtomicReference<FixedSchedulerPool> atomicReference = this.pool;
        FixedSchedulerPool fixedSchedulerPool2 = NONE;
        while (!atomicReference.compareAndSet(fixedSchedulerPool2, fixedSchedulerPool)) {
            if (atomicReference.get() != fixedSchedulerPool2) {
                fixedSchedulerPool.shutdown();
                return;
            }
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.threadFactory = threadFactory;
        this.pool = new AtomicReference<>(NONE);
        start();
    }

    /* loaded from: classes2.dex */
    public static final class EventLoopWorker extends Scheduler.Worker {
        private final ListCompositeDisposable both;
        volatile boolean disposed;
        private final PoolWorker poolWorker;
        private final ListCompositeDisposable serial;
        private final CompositeDisposable timed;

        public EventLoopWorker(PoolWorker poolWorker) {
            this.poolWorker = poolWorker;
            ListCompositeDisposable listCompositeDisposable = new ListCompositeDisposable();
            this.serial = listCompositeDisposable;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.timed = compositeDisposable;
            ListCompositeDisposable listCompositeDisposable2 = new ListCompositeDisposable();
            this.both = listCompositeDisposable2;
            listCompositeDisposable2.add(listCompositeDisposable);
            listCompositeDisposable2.add(compositeDisposable);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            if (!this.disposed) {
                this.disposed = true;
                this.both.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, 0L, TimeUnit.MILLISECONDS, this.serial);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public Disposable schedule(@NonNull Runnable runnable, long j5, @NonNull TimeUnit timeUnit) {
            if (this.disposed) {
                return EmptyDisposable.INSTANCE;
            }
            return this.poolWorker.scheduleActual(runnable, j5, timeUnit, this.timed);
        }
    }
}
