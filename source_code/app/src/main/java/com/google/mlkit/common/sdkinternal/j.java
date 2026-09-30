package com.google.mlkit.common.sdkinternal;

import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j extends r6.m {
    public static final ThreadLocal purple = new ThreadLocal();
    public final ThreadPoolExecutor alpha;

    public j() {
        final ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.google.mlkit.common.sdkinternal.r
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return defaultThreadFactory.newThread(new q(runnable, 1));
            }
        });
        this.alpha = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) purple.get();
        if (deque != null && deque.size() <= 1) {
            deque.add(runnable);
            if (deque.size() > 1) {
                return;
            }
            do {
                runnable.run();
                deque.removeFirst();
                runnable = (Runnable) deque.peekFirst();
            } while (runnable != null);
            return;
        }
        this.alpha.execute(new q(runnable, 0));
    }
}
