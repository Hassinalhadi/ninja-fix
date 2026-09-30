package bc;

import android.os.Handler;
import android.os.Looper;
import s6.U6;

/* loaded from: classes3.dex */
public abstract class e {
    public static volatile Handler alpha;

    public static Handler alpha() {
        if (alpha != null) {
            return alpha;
        }
        synchronized (e.class) {
            try {
                if (alpha == null) {
                    alpha = U6.alpha(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return alpha;
    }

    public static int bravo(int i4) {
        int[] iArr = {1, 2, 3};
        for (int i5 = 0; i5 < 3; i5++) {
            int i10 = iArr[i5];
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == i4) {
                    return i10;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
