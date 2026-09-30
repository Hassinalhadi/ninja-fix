package P;

import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class k {
    public static final long alpha;

    static {
        long j5;
        try {
            j5 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j5 = -1;
        }
        alpha = j5;
    }
}
