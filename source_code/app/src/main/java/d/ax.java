package d;

/* loaded from: classes3.dex */
public abstract class ax {
    public static final float alpha = 6;
    public static final float bravo = 1;

    public static final boolean alpha(float f5) {
        if (!Float.isNaN(f5) && Math.abs(f5) >= 0.5f) {
            return false;
        }
        return true;
    }
}
