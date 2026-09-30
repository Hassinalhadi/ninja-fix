package s6;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.s6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2769s6 {
    public static final void alpha(View animateAlpha, Float f5, Float f10, long j5) {
        float f11;
        Intrinsics.foxtrot(animateAlpha, "$this$animateAlpha");
        if (f5 != null) {
            f11 = f5.floatValue();
        } else {
            f11 = 0.0f;
        }
        animateAlpha.setAlpha(f11);
        animateAlpha.clearAnimation();
        animateAlpha.animate().alpha(f10.floatValue()).setDuration(j5).start();
    }

    public static int bravo(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int charlie(int i4, int... iArr) {
        for (int i5 : iArr) {
            i4 = Math.max(i4, i5);
        }
        return i4;
    }
}
