package q0;

/* loaded from: classes3.dex */
public final class av implements InterfaceC2381Q, InterfaceC2392k {
    public static final av purple = new av(0);
    public final /* synthetic */ int alpha;

    public /* synthetic */ av(int i4) {
        this.alpha = i4;
    }

    @Override // q0.InterfaceC2392k
    public long alpha(long j5, long j6) {
        switch (this.alpha) {
            case 1:
                float max = Math.max(Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L)));
                long floatToRawIntBits = (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L);
                int i4 = AbstractC2372H.alpha;
                return floatToRawIntBits;
            case 2:
                float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) / Float.intBitsToFloat((int) (j5 & 4294967295L));
                long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
                int i5 = AbstractC2372H.alpha;
                return floatToRawIntBits2;
            case 3:
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32)) / Float.intBitsToFloat((int) (j5 >> 32));
                long floatToRawIntBits3 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
                int i10 = AbstractC2372H.alpha;
                return floatToRawIntBits3;
            case 4:
                float charlie = AbstractC2375K.charlie(j5, j6);
                long floatToRawIntBits4 = (Float.floatToRawIntBits(charlie) << 32) | (Float.floatToRawIntBits(charlie) & 4294967295L);
                int i11 = AbstractC2372H.alpha;
                return floatToRawIntBits4;
            default:
                if (Float.intBitsToFloat((int) (j5 >> 32)) <= Float.intBitsToFloat((int) (j6 >> 32)) && Float.intBitsToFloat((int) (j5 & 4294967295L)) <= Float.intBitsToFloat((int) (j6 & 4294967295L))) {
                    long floatToRawIntBits5 = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
                    int i12 = AbstractC2372H.alpha;
                    return floatToRawIntBits5;
                }
                float charlie2 = AbstractC2375K.charlie(j5, j6);
                long floatToRawIntBits6 = (Float.floatToRawIntBits(charlie2) << 32) | (Float.floatToRawIntBits(charlie2) & 4294967295L);
                int i13 = AbstractC2372H.alpha;
                return floatToRawIntBits6;
        }
    }

    @Override // q0.InterfaceC2381Q
    public boolean green(Object obj, Object obj2) {
        return false;
    }

    @Override // q0.InterfaceC2381Q
    public void lima(bv.A a6) {
        a6.clear();
    }

    public String toString() {
        switch (this.alpha) {
            case 6:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }
}
