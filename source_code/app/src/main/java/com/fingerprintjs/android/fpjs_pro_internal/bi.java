package com.fingerprintjs.android.fpjs_pro_internal;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2707l6;
import s6.AbstractC2716m6;

/* loaded from: classes3.dex */
public final class bi {
    public static int alpha;
    public static int bravo;

    public static int alpha() {
        int i4 = alpha;
        int i5 = i4 % 7703054;
        alpha = i4 + 1;
        if (i5 != 0) {
            return bravo;
        }
        int tango = ao.ad.tango(1500619143);
        bravo = tango;
        return tango;
    }

    @NotNull
    public static final N14263A23323<String, Throwable> component5(@NotNull List<String> list) {
        try {
            Runtime runtime = Runtime.getRuntime();
            Intrinsics.checkNotNull(runtime);
            boolean z2 = false;
            Process exec = runtime.exec((String[]) list.toArray(new String[0]));
            Intrinsics.checkNotNull(exec);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long nanoTime = System.nanoTime();
            long nanos = timeUnit.toNanos(1000L);
            while (true) {
                try {
                    exec.exitValue();
                    z2 = true;
                    break;
                } catch (IllegalThreadStateException unused) {
                    if (nanos > 0) {
                        Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                    }
                    nanos = timeUnit.toNanos(1000L) - (System.nanoTime() - nanoTime);
                    if (nanos <= 0) {
                        break;
                    }
                }
            }
            if (z2) {
                if (exec.exitValue() == 0) {
                    InputStream inputStream = exec.getInputStream();
                    Intrinsics.checkNotNull(inputStream);
                    try {
                        String str = new String(AbstractC2707l6.foxtrot(inputStream), kotlin.text.a.alpha);
                        AbstractC2716m6.alpha(inputStream, null);
                        return new component8(str);
                    } finally {
                    }
                } else {
                    throw new Exception();
                }
            } else {
                exec.destroy();
                throw new TimeoutException();
            }
        } catch (Throwable th) {
            return new setTopP6481(th);
        }
    }
}
