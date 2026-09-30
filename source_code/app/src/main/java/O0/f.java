package O0;

/* loaded from: classes3.dex */
public final class f {
    public static final float bravo;
    public static final float charlie;
    public static final float delta;
    public final float alpha;

    static {
        alpha(0.0f);
        alpha(0.5f);
        bravo = 0.5f;
        alpha(-1.0f);
        charlie = -1.0f;
        alpha(1.0f);
        delta = 1.0f;
    }

    public static void alpha(float f5) {
        if ((0.0f <= f5 && f5 <= 1.0f) || f5 == -1.0f) {
            return;
        }
        J0.a.bravo("topRatio should be in [0..1] range or -1");
    }

    public static String bravo(float f5) {
        if (f5 == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f5 == bravo) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f5 == charlie) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f5 == delta) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f5 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (Float.compare(this.alpha, ((f) obj).alpha) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha);
    }

    public final String toString() {
        return bravo(this.alpha);
    }
}
