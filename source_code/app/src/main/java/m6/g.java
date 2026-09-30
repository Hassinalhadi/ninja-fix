package m6;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class g {
    public static final int alpha;

    static {
        int i4;
        if (Build.VERSION.SDK_INT >= 31) {
            i4 = 33554432;
        } else {
            i4 = 0;
        }
        alpha = i4;
    }
}
