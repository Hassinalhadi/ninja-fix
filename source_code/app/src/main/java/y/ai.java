package y;

/* loaded from: classes3.dex */
public abstract class ai {
    public static final float alpha;
    public static final float bravo;
    public static final A0.ac charlie = new A0.ac("SelectionHandleInfo");

    static {
        float f5 = 25;
        alpha = f5;
        bravo = f5;
    }

    public static final long alpha(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) - 1.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
