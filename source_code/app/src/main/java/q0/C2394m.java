package q0;

/* renamed from: q0.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2394m implements InterfaceC2392k {
    @Override // q0.InterfaceC2392k
    public final long alpha(long j5, long j6) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (4294967295L & Float.floatToRawIntBits(1.0f));
        int i4 = AbstractC2372H.alpha;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2394m) {
                ((C2394m) obj).getClass();
                if (Float.compare(1.0f, 1.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
