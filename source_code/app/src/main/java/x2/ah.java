package x2;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class ah {
    public static final boolean alpha;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 28) {
            z2 = true;
        } else {
            z2 = false;
        }
        alpha = z2;
    }
}
