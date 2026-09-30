package t6;

/* loaded from: classes2.dex */
public abstract class M2 {
    public static final long alpha(float f5, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public static final boolean bravo(Z.c cVar, float f5, float f10) {
        float f11 = cVar.alpha;
        if (f5 <= cVar.charlie && f11 <= f5 && f10 <= cVar.delta && cVar.bravo <= f10) {
            return true;
        }
        return false;
    }

    public static final long charlie(long j5) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
