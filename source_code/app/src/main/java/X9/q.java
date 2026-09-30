package X9;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class q {
    public static final AtomicLong alpha = new AtomicLong(0);

    public static void alpha(String str) {
        if (str != null) {
            boolean z2 = false;
            if (StringsKt.beige(str, "INTEGRITY_TIMESTAMP_FUTURE", false) || StringsKt.beige(str, "INTEGRITY_TIMESTAMP_EXPIRED", false)) {
                z2 = true;
            }
            K7.b.alpha().bravo("security: integrity_timestamp_stomp | clockSkew=" + z2 + " | msg=" + StringsKt.yellow(120, str));
            if (z2) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                AtomicLong atomicLong = alpha;
                long j5 = atomicLong.get();
                if ((j5 != 0 && elapsedRealtime - j5 < 300000) || !atomicLong.compareAndSet(j5, elapsedRealtime)) {
                    return;
                }
                new Handler(Looper.getMainLooper()).post(new K5.a(2));
            }
        }
    }
}
