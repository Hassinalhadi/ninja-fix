package v;

import android.os.Build;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3164c {
    public static final boolean alpha;

    static {
        boolean z2;
        if (Build.VERSION.SDK_INT >= 34) {
            z2 = true;
        } else {
            z2 = false;
        }
        alpha = z2;
    }
}
