package b;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract class L {
    public static final A0.ac alpha = new A0.ac("MagnifierPositionInRoot");

    public static boolean alpha() {
        if (Build.VERSION.SDK_INT >= 28) {
            return true;
        }
        return false;
    }
}
