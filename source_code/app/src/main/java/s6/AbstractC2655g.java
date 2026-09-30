package s6;

import android.os.SystemClock;

/* renamed from: s6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2655g {
    public static final C2646f alpha;

    static {
        C2646f c2646f;
        try {
            SystemClock.elapsedRealtimeNanos();
            c2646f = new C2646f(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            c2646f = new C2646f(1);
        }
        alpha = c2646f;
    }
}
