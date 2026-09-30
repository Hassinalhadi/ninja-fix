package M6;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public abstract class b implements TypeEvaluator {
    public static Integer alpha(Integer num, Integer num2, float f5) {
        int intValue = num.intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = num2.intValue();
        float f11 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float lima = Q0.c.lima(f11, f10, f5, f10);
        float lima2 = Q0.c.lima(pow4, pow, f5, pow);
        float lima3 = Q0.c.lima(pow5, pow2, f5, pow2);
        float lima4 = Q0.c.lima(pow6, pow3, f5, pow3);
        float pow7 = ((float) Math.pow(lima2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(lima3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(lima4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(lima * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
