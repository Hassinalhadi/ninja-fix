package okhttp3.internal.concurrent;

import ao.ad;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 -2\u00020\u0001:\u0003+,-B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0000¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J \u0010\"\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0010H\u0002J\b\u0010%\u001a\u0004\u0018\u00010!J\b\u0010&\u001a\u00020\u001cH\u0002J\u0006\u0010'\u001a\u00020\u0017J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170)J\u0006\u0010*\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\b\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/Lockable;", "backend", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "logger", "Ljava/util/logging/Logger;", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;Ljava/util/logging/Logger;)V", "getBackend", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "getLogger$okhttp", "()Ljava/util/logging/Logger;", "logger$1", "nextQueueName", "", "coordinatorWaiting", "", "coordinatorWakeUpAt", "", "executeCallCount", "runCallCount", "busyQueues", "", "Lokhttp3/internal/concurrent/TaskQueue;", "readyQueues", "runnable", "Ljava/lang/Runnable;", "kickCoordinator", "", "taskQueue", "kickCoordinator$okhttp", "beforeRun", "task", "Lokhttp3/internal/concurrent/Task;", "afterRun", "delayNanos", "completedNormally", "awaitTaskToRun", "startAnotherThread", "newQueue", "activeQueues", "", "cancelAll", "Backend", "RealBackend", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TaskRunner implements Lockable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final TaskRunner INSTANCE;

    @NotNull
    private static final Logger logger;

    @NotNull
    private final Backend backend;

    @NotNull
    private final List<TaskQueue> busyQueues;
    private boolean coordinatorWaiting;
    private long coordinatorWakeUpAt;
    private int executeCallCount;

    /* renamed from: logger$1, reason: from kotlin metadata */
    @NotNull
    private final Logger logger;
    private int nextQueueName;

    @NotNull
    private final List<TaskQueue> readyQueues;
    private int runCallCount;

    @NotNull
    private final Runnable runnable;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H&J\"\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000bH&J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "nanoTime", "", "coordinatorNotify", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorWait", "nanos", "decorate", "Ljava/util/concurrent/BlockingQueue;", "T", "queue", "execute", "runnable", "Ljava/lang/Runnable;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface Backend {
        void coordinatorNotify(@NotNull TaskRunner taskRunner);

        void coordinatorWait(@NotNull TaskRunner taskRunner, long nanos);

        @NotNull
        <T> BlockingQueue<T> decorate(@NotNull BlockingQueue<T> queue);

        void execute(@NotNull TaskRunner taskRunner, @NotNull Runnable runnable);

        long nanoTime();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "logger", "Ljava/util/logging/Logger;", "getLogger", "()Ljava/util/logging/Logger;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger getLogger() {
            return TaskRunner.logger;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0013H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0006\u0010\u0019\u001a\u00020\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "threadFactory", "Ljava/util/concurrent/ThreadFactory;", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "executor", "Ljava/util/concurrent/ThreadPoolExecutor;", "getExecutor", "()Ljava/util/concurrent/ThreadPoolExecutor;", "nanoTime", "", "coordinatorNotify", "", "taskRunner", "Lokhttp3/internal/concurrent/TaskRunner;", "coordinatorWait", "nanos", "decorate", "Ljava/util/concurrent/BlockingQueue;", "T", "queue", "execute", "runnable", "Ljava/lang/Runnable;", "shutdown", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class RealBackend implements Backend {

        @NotNull
        private final ThreadPoolExecutor executor;

        public RealBackend(@NotNull ThreadFactory threadFactory) {
            Intrinsics.echo(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, LottieConstants.IterateForever, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorNotify(@NotNull TaskRunner taskRunner) {
            Intrinsics.echo(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void coordinatorWait(@NotNull TaskRunner taskRunner, long nanos) throws InterruptedException {
            Intrinsics.echo(taskRunner, "taskRunner");
            if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(taskRunner)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + taskRunner);
            }
            if (nanos > 0) {
                long j5 = nanos / 1000000;
                long j6 = nanos - (1000000 * j5);
                if (j5 > 0 || nanos > 0) {
                    taskRunner.wait(j5, (int) j6);
                }
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        @NotNull
        public <T> BlockingQueue<T> decorate(@NotNull BlockingQueue<T> queue) {
            Intrinsics.echo(queue, "queue");
            return queue;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(@NotNull TaskRunner taskRunner, @NotNull Runnable runnable) {
            Intrinsics.echo(taskRunner, "taskRunner");
            Intrinsics.echo(runnable, "runnable");
            this.executor.execute(runnable);
        }

        @NotNull
        public final ThreadPoolExecutor getExecutor() {
            return this.executor;
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long nanoTime() {
            return System.nanoTime();
        }

        public final void shutdown() {
            this.executor.shutdown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Logger logger2 = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.delta(logger2, "getLogger(...)");
        logger = logger2;
        INSTANCE = new TaskRunner(new RealBackend(_UtilJvmKt.threadFactory(_UtilJvmKt.okHttpName + " TaskRunner", true)), 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);
    }

    public TaskRunner(@NotNull Backend backend, @NotNull Logger logger2) {
        Intrinsics.echo(backend, "backend");
        Intrinsics.echo(logger2, "logger");
        this.backend = backend;
        this.logger = logger2;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                int i4;
                Task awaitTaskToRun;
                long j5;
                Task awaitTaskToRun2;
                TaskRunner taskRunner = TaskRunner.this;
                synchronized (taskRunner) {
                    i4 = taskRunner.runCallCount;
                    taskRunner.runCallCount = i4 + 1;
                    awaitTaskToRun = taskRunner.awaitTaskToRun();
                }
                if (awaitTaskToRun == null) {
                    return;
                }
                Thread currentThread = Thread.currentThread();
                String name = currentThread.getName();
                while (true) {
                    try {
                        currentThread.setName(awaitTaskToRun.getName());
                        Logger logger3 = TaskRunner.this.getLogger();
                        TaskQueue queue = awaitTaskToRun.getQueue();
                        Intrinsics.checkNotNull(queue);
                        boolean isLoggable = logger3.isLoggable(Level.FINE);
                        if (isLoggable) {
                            j5 = queue.getTaskRunner().getBackend().nanoTime();
                            TaskLoggerKt.log(logger3, awaitTaskToRun, queue, "starting");
                        } else {
                            j5 = -1;
                        }
                        try {
                            long runOnce = awaitTaskToRun.runOnce();
                            if (isLoggable) {
                                TaskLoggerKt.log(logger3, awaitTaskToRun, queue, "finished run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - j5));
                            }
                            TaskRunner taskRunner2 = TaskRunner.this;
                            synchronized (taskRunner2) {
                                taskRunner2.afterRun(awaitTaskToRun, runOnce, true);
                                awaitTaskToRun2 = taskRunner2.awaitTaskToRun();
                            }
                            if (awaitTaskToRun2 == null) {
                                currentThread.setName(name);
                                return;
                            }
                            awaitTaskToRun = awaitTaskToRun2;
                        } catch (Throwable th) {
                            if (isLoggable) {
                                TaskLoggerKt.log(logger3, awaitTaskToRun, queue, "failed a run in " + TaskLoggerKt.formatDuration(queue.getTaskRunner().getBackend().nanoTime() - j5));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = TaskRunner.this;
                            synchronized (taskRunner3) {
                                taskRunner3.afterRun(awaitTaskToRun, -1L, false);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            currentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void afterRun(Task task, long delayNanos, boolean completedNormally) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        if (queue.getActiveTask() == task) {
            boolean cancelActiveTask = queue.getCancelActiveTask();
            queue.setCancelActiveTask$okhttp(false);
            queue.setActiveTask$okhttp(null);
            this.busyQueues.remove(queue);
            if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
                queue.scheduleAndDecide$okhttp(task, delayNanos, true);
            }
            if (!queue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.add(queue);
                if (!completedNormally) {
                    startAnotherThread();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    private final void beforeRun(Task task) {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.setNextExecuteNanoTime$okhttp(-1L);
        TaskQueue queue = task.getQueue();
        Intrinsics.checkNotNull(queue);
        queue.getFutureTasks$okhttp().remove(task);
        this.readyQueues.remove(queue);
        queue.setActiveTask$okhttp(task);
        this.busyQueues.add(queue);
    }

    private final void startAnotherThread() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int i4 = this.executeCallCount;
        if (i4 > this.runCallCount) {
            return;
        }
        this.executeCallCount = i4 + 1;
        this.backend.execute(this, this.runnable);
    }

    @NotNull
    public final List<TaskQueue> activeQueues() {
        ArrayList a6;
        synchronized (this) {
            a6 = CollectionsKt.a(this.busyQueues, this.readyQueues);
        }
        return a6;
    }

    @Nullable
    public final Task awaitTaskToRun() {
        boolean z2;
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long nanoTime = this.backend.nanoTime();
            Iterator<TaskQueue> it = this.readyQueues.iterator();
            long j5 = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (it.hasNext()) {
                    Task task2 = it.next().getFutureTasks$okhttp().get(0);
                    long max = Math.max(0L, task2.getNextExecuteNanoTime() - nanoTime);
                    if (max > 0) {
                        j5 = Math.min(max, j5);
                    } else {
                        if (task != null) {
                            z2 = true;
                            break;
                        }
                        task = task2;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
            if (task != null) {
                beforeRun(task);
                if (z2 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    startAnotherThread();
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (j5 < this.coordinatorWakeUpAt - nanoTime) {
                    this.backend.coordinatorNotify(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = nanoTime + j5;
            try {
                try {
                    this.backend.coordinatorWait(this, j5);
                } catch (InterruptedException unused) {
                    cancelAll();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void cancelAll() {
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.busyQueues.get(size).cancelAllAndDecide$okhttp();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = this.readyQueues.get(size2);
            taskQueue.cancelAllAndDecide$okhttp();
            if (taskQueue.getFutureTasks$okhttp().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    @NotNull
    public final Backend getBackend() {
        return this.backend;
    }

    @NotNull
    /* renamed from: getLogger$okhttp, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    public final void kickCoordinator$okhttp(@NotNull TaskQueue taskQueue) {
        Intrinsics.echo(taskQueue, "taskQueue");
        if (_UtilJvmKt.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (!taskQueue.getFutureTasks$okhttp().isEmpty()) {
                _UtilCommonKt.addIfAbsent(this.readyQueues, taskQueue);
            } else {
                this.readyQueues.remove(taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.coordinatorNotify(this);
        } else {
            startAnotherThread();
        }
    }

    @NotNull
    public final TaskQueue newQueue() {
        int i4;
        synchronized (this) {
            i4 = this.nextQueueName;
            this.nextQueueName = i4 + 1;
        }
        return new TaskQueue(this, ad.zulu(i4, "Q"));
    }

    public /* synthetic */ TaskRunner(Backend backend, Logger logger2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(backend, (i4 & 2) != 0 ? logger : logger2);
    }
}
