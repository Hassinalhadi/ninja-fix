package io.reactivex.internal.schedulers;

import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SchedulerPoolFactory {
    public static final boolean PURGE_ENABLED;
    static final String PURGE_ENABLED_KEY = "rx2.purge-enabled";
    public static final int PURGE_PERIOD_SECONDS;
    static final String PURGE_PERIOD_SECONDS_KEY = "rx2.purge-period-seconds";
    static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();
    static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();

    /* loaded from: classes2.dex */
    public static final class ScheduledTask implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(SchedulerPoolFactory.POOLS.keySet()).iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SystemPropertyAccessor implements Function<String, String> {
        @Override // io.reactivex.functions.Function
        public String apply(String str) throws Exception {
            return System.getProperty(str);
        }
    }

    static {
        SystemPropertyAccessor systemPropertyAccessor = new SystemPropertyAccessor();
        boolean booleanProperty = getBooleanProperty(true, PURGE_ENABLED_KEY, true, true, systemPropertyAccessor);
        PURGE_ENABLED = booleanProperty;
        PURGE_PERIOD_SECONDS = getIntProperty(booleanProperty, PURGE_PERIOD_SECONDS_KEY, 1, 1, systemPropertyAccessor);
        start();
    }

    private SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, newScheduledThreadPool);
        return newScheduledThreadPool;
    }

    public static boolean getBooleanProperty(boolean z2, String str, boolean z10, boolean z11, Function<String, String> function) {
        String apply;
        if (z2) {
            try {
                apply = function.apply(str);
            } catch (Throwable unused) {
            }
            if (apply != null) {
                return "true".equals(apply);
            }
            return z10;
        }
        return z11;
    }

    public static int getIntProperty(boolean z2, String str, int i4, int i5, Function<String, String> function) {
        String apply;
        if (z2) {
            try {
                apply = function.apply(str);
            } catch (Throwable unused) {
            }
            if (apply != null) {
                return Integer.parseInt(apply);
            }
            return i4;
        }
        return i5;
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    public static void tryPutIntoPool(boolean z2, ScheduledExecutorService scheduledExecutorService) {
        if (z2 && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }

    public static void tryStart(boolean z2) {
        ScheduledExecutorService newScheduledThreadPool;
        if (!z2) {
            return;
        }
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = PURGE_THREAD;
            ScheduledExecutorService scheduledExecutorService = atomicReference.get();
            if (scheduledExecutorService == null) {
                newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                while (!atomicReference.compareAndSet(scheduledExecutorService, newScheduledThreadPool)) {
                    if (atomicReference.get() != scheduledExecutorService) {
                        break;
                    }
                }
                ScheduledTask scheduledTask = new ScheduledTask();
                int i4 = PURGE_PERIOD_SECONDS;
                newScheduledThreadPool.scheduleAtFixedRate(scheduledTask, i4, i4, TimeUnit.SECONDS);
                return;
            }
            return;
            newScheduledThreadPool.shutdownNow();
        }
    }
}
