package io.reactivex.internal.util;

import A0.z;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class BackpressureHelper {
    private BackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static long add(AtomicLong atomicLong, long j5) {
        long j6;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, addCap(j6, j5)));
        return j6;
    }

    public static long addCancel(AtomicLong atomicLong, long j5) {
        long j6;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j6, addCap(j6, j5)));
        return j6;
    }

    public static long addCap(long j5, long j6) {
        long j7 = j5 + j6;
        if (j7 < 0) {
            return Long.MAX_VALUE;
        }
        return j7;
    }

    public static long multiplyCap(long j5, long j6) {
        long j7 = j5 * j6;
        if (((j5 | j6) >>> 31) != 0 && j7 / j5 != j6) {
            return Long.MAX_VALUE;
        }
        return j7;
    }

    public static long produced(AtomicLong atomicLong, long j5) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j7 = j6 - j5;
            if (j7 < 0) {
                RxJavaPlugins.onError(new IllegalStateException(z.india(j7, "More produced than requested: ")));
                j7 = 0;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        return j7;
    }

    public static long producedCancel(AtomicLong atomicLong, long j5) {
        long j6;
        long j7;
        do {
            j6 = atomicLong.get();
            if (j6 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j6 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j7 = j6 - j5;
            if (j7 < 0) {
                RxJavaPlugins.onError(new IllegalStateException(z.india(j7, "More produced than requested: ")));
                j7 = 0;
            }
        } while (!atomicLong.compareAndSet(j6, j7));
        return j7;
    }
}
