package Cf;

import Af.u;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class k {
    public static final String alpha;
    public static final long bravo;
    public static final int charlie;
    public static final int delta;
    public static final long echo;
    public static final g foxtrot;

    static {
        String str;
        int i4 = u.alpha;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        alpha = str;
        bravo = Af.f.juliet("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i5 = u.alpha;
        if (i5 < 2) {
            i5 = 2;
        }
        charlie = Af.f.kilo(i5, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        delta = Af.f.kilo(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        echo = TimeUnit.SECONDS.toNanos(Af.f.juliet("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        foxtrot = g.alpha;
    }
}
