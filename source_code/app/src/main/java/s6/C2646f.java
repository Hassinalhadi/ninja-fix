package s6;

import android.os.SystemClock;

/* renamed from: s6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2646f {
    public static final /* synthetic */ int bravo = 0;
    public final /* synthetic */ int alpha;

    public final long alpha() {
        switch (this.alpha) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
