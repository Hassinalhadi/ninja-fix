package n6;

import android.os.Build;

/* renamed from: n6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2161a {
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
