package vf;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class ae extends ax implements Runnable {

    @Nullable
    private static volatile Thread _thread;

    /* renamed from: b, reason: collision with root package name */
    public static final ae f13993b;

    /* renamed from: c, reason: collision with root package name */
    public static final long f13994c;
    private static volatile int debugStatus;

    /* JADX WARN: Type inference failed for: r0v0, types: [vf.ay, vf.y, vf.ae] */
    static {
        Long l10;
        ?? abstractC3220y = new AbstractC3220y();
        f13993b = abstractC3220y;
        abstractC3220y.peach(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f13994c = timeUnit.toNanos(l10.longValue());
    }

    @Override // vf.ax, vf.ai
    public final aq charlie(long j5, d0 d0Var, Nd.h hVar) {
        long j6 = 0;
        if (j5 > 0) {
            if (j5 >= 9223372036854L) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = 1000000 * j5;
            }
        }
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            au auVar = new au(j6 + nanoTime, d0Var);
            l(nanoTime, auVar);
            return auVar;
        }
        return V.alpha;
    }

    public final synchronized void n() {
        boolean z2;
        int i4 = debugStatus;
        if (i4 != 2 && i4 != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        debugStatus = 3;
        ax.white.set(this, null);
        ax.yellow.set(this, null);
        notifyAll();
    }

    @Override // vf.ay
    public final Thread olive() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f13993b.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
            return thread;
        }
        return thread2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        boolean z10;
        boolean j5;
        b0.alpha.set(this);
        try {
            synchronized (this) {
                int i4 = debugStatus;
                if (i4 != 2 && i4 != 3) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    if (!j5) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j6 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long pink = pink();
                    if (pink == Long.MAX_VALUE) {
                        long nanoTime = System.nanoTime();
                        if (j6 == Long.MAX_VALUE) {
                            j6 = f13994c + nanoTime;
                        }
                        long j7 = j6 - nanoTime;
                        if (j7 <= 0) {
                            _thread = null;
                            n();
                            if (!j()) {
                                olive();
                                return;
                            }
                            return;
                        }
                        if (pink > j7) {
                            pink = j7;
                        }
                    } else {
                        j6 = Long.MAX_VALUE;
                    }
                    if (pink > 0) {
                        int i5 = debugStatus;
                        if (i5 != 2 && i5 != 3) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            _thread = null;
                            n();
                            if (!j()) {
                                olive();
                                return;
                            }
                            return;
                        }
                        LockSupport.parkNanos(this, pink);
                    }
                }
            }
        } finally {
            _thread = null;
            n();
            if (!j()) {
                olive();
            }
        }
    }

    @Override // vf.ax, vf.ay
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // vf.ay
    public final void silver(long j5, av avVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // vf.ax
    public final void white(Runnable runnable) {
        if (debugStatus != 4) {
            super.white(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
