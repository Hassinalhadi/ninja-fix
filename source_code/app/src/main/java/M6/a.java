package M6;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes2.dex */
public abstract class a {
    public static final LinearInterpolator alpha = new LinearInterpolator();
    public static final P1.a bravo = new P1.a(1);
    public static final P1.a charlie = new P1.a(0);
    public static final P1.a delta = new P1.a(2);
    public static final DecelerateInterpolator echo = new DecelerateInterpolator();

    public static float alpha(float f5, float f10, float f11) {
        return Q0.c.lima(f10, f5, f11, f5);
    }

    public static float bravo(float f5, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f5;
        }
        if (f13 >= f12) {
            return f10;
        }
        return alpha(f5, f10, (f13 - f11) / (f12 - f11));
    }

    public static int charlie(int i4, int i5, float f5) {
        return Math.round(f5 * (i5 - i4)) + i4;
    }
}
