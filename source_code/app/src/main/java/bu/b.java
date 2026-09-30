package bu;

import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public abstract class b extends Drawable {
    public static final double alpha = Math.cos(Math.toRadians(45.0d));

    public static float alpha(float f5, float f10, boolean z2) {
        if (z2) {
            return (float) (((1.0d - alpha) * f10) + f5);
        }
        return f5;
    }

    public static float bravo(float f5, float f10, boolean z2) {
        if (z2) {
            return (float) (((1.0d - alpha) * f10) + (f5 * 1.5f));
        }
        return f5 * 1.5f;
    }
}
