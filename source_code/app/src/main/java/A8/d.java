package A8;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.TimeUnit;
import s8.C2837a;
import s8.s;
import s8.t;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class d {
    public static final long india;
    public B8.h bravo;
    public final B8.h echo;
    public final B8.h foxtrot;
    public final long golf;
    public final long hotel;
    public long charlie = 500;
    public double delta = 500;
    public Timer alpha = new Timer();

    static {
        C3146a.delta();
        india = TimeUnit.SECONDS.toMicros(1L);
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, s8.t] */
    public d(B8.h hVar, g8.d dVar, C2837a c2837a, String str) {
        long november;
        long mike;
        long november2;
        t tVar;
        this.bravo = hVar;
        if (str == "Trace") {
            november = c2837a.november();
        } else {
            november = c2837a.november();
        }
        long j5 = november;
        if (str == "Trace") {
            synchronized (t.class) {
                try {
                    if (t.alpha == null) {
                        t.alpha = new Object();
                    }
                    tVar = t.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = c2837a.alpha;
            tVar.getClass();
            B8.e eVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (eVar.bravo() && C2837a.quebec(((Long) eVar.alpha()).longValue())) {
                c2837a.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                mike = ((Long) eVar.alpha()).longValue();
            } else {
                B8.e charlie = c2837a.charlie(tVar);
                if (charlie.bravo() && C2837a.quebec(((Long) charlie.alpha()).longValue())) {
                    mike = ((Long) charlie.alpha()).longValue();
                } else {
                    mike = 300;
                }
            }
        } else {
            mike = c2837a.mike();
        }
        long j6 = mike;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.echo = new B8.h(j6, j5, timeUnit);
        this.golf = j6;
        if (str == "Trace") {
            november2 = c2837a.november();
        } else {
            november2 = c2837a.november();
        }
        long j7 = november2;
        long charlie2 = charlie(c2837a, str);
        this.foxtrot = new B8.h(charlie2, j7, timeUnit);
        this.hotel = charlie2;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, s8.s] */
    public static long charlie(C2837a c2837a, String str) {
        s sVar;
        if (str == "Trace") {
            c2837a.getClass();
            synchronized (s.class) {
                try {
                    if (s.alpha == null) {
                        s.alpha = new Object();
                    }
                    sVar = s.alpha;
                } catch (Throwable th) {
                    throw th;
                }
            }
            RemoteConfigManager remoteConfigManager = c2837a.alpha;
            sVar.getClass();
            B8.e eVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_bg");
            if (eVar.bravo() && C2837a.quebec(((Long) eVar.alpha()).longValue())) {
                c2837a.charlie.delta(((Long) eVar.alpha()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                return ((Long) eVar.alpha()).longValue();
            }
            B8.e charlie = c2837a.charlie(sVar);
            if (charlie.bravo() && C2837a.quebec(((Long) charlie.alpha()).longValue())) {
                return ((Long) charlie.alpha()).longValue();
            }
            return 30L;
        }
        return c2837a.lima();
    }

    public final synchronized void alpha(boolean z2) {
        B8.h hVar;
        long j5;
        try {
            if (z2) {
                hVar = this.echo;
            } else {
                hVar = this.foxtrot;
            }
            this.bravo = hVar;
            if (z2) {
                j5 = this.golf;
            } else {
                j5 = this.hotel;
            }
            this.charlie = j5;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:10:0x005a, B:12:0x0065, B:13:0x0076, B:15:0x007e, B:22:0x0039, B:23:0x0042, B:24:0x0046, B:25:0x0050), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {all -> 0x0074, blocks: (B:3:0x0001, B:9:0x0031, B:10:0x005a, B:12:0x0065, B:13:0x0076, B:15:0x007e, B:22:0x0039, B:23:0x0042, B:24:0x0046, B:25:0x0050), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean bravo() {
        double d4;
        long nanos;
        double d9;
        double d10;
        double d11;
        try {
            Timer timer = new Timer();
            Timer timer2 = this.alpha;
            timer2.getClass();
            double d12 = timer.purple - timer2.purple;
            B8.h hVar = this.bravo;
            hVar.getClass();
            int i4 = B8.g.alpha[((TimeUnit) hVar.charlie).ordinal()];
            long j5 = hVar.bravo;
            long j6 = hVar.alpha;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        d9 = j6 / r5.toSeconds(j5);
                        d10 = (d12 * d9) / india;
                        if (d10 > 0.0d) {
                            this.delta = Math.min(this.delta + d10, this.charlie);
                            this.alpha = timer;
                        }
                        d11 = this.delta;
                        if (d11 < 1.0d) {
                            this.delta = d11 - 1.0d;
                            return true;
                        }
                        return false;
                    }
                    d4 = j6 / j5;
                    nanos = TimeUnit.SECONDS.toMillis(1L);
                } else {
                    d4 = j6 / j5;
                    nanos = TimeUnit.SECONDS.toMicros(1L);
                }
            } else {
                d4 = j6 / j5;
                nanos = TimeUnit.SECONDS.toNanos(1L);
            }
            d9 = d4 * nanos;
            d10 = (d12 * d9) / india;
            if (d10 > 0.0d) {
            }
            d11 = this.delta;
            if (d11 < 1.0d) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
