package x;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3270a {
    public static final long alpha = alpha(Float.NaN, Float.NaN);
    public static final /* synthetic */ int bravo = 0;

    public static long alpha(float f5, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static String bravo(long j5) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j5 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j5 & 4294967295L)) + ')';
    }
}
