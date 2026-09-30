package Y3;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public abstract class h {
    public static final double alpha = 1.0d / Math.pow(10.0d, 6.0d);
    public static final /* synthetic */ int bravo = 0;

    public static double alpha(long j5) {
        return (SystemClock.elapsedRealtimeNanos() - j5) * alpha;
    }
}
