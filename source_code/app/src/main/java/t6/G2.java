package t6;

/* loaded from: classes2.dex */
public abstract class G2 {
    public static J2.n alpha;

    public static final String alpha(float f5) {
        if (Float.isNaN(f5)) {
            return "NaN";
        }
        if (Float.isInfinite(f5)) {
            if (f5 < 0.0f) {
                return "-Infinity";
            }
            return "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f10 = f5 * pow;
        int i4 = (int) f10;
        if (f10 - i4 >= 0.5f) {
            i4++;
        }
        float f11 = i4 / pow;
        if (max > 0) {
            return String.valueOf(f11);
        }
        return String.valueOf((int) f11);
    }
}
