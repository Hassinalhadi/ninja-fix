package fe;

/* renamed from: fe.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1712d {
    public final float alpha;

    public C1712d(float f5) {
        this.alpha = f5;
    }

    public static boolean alpha(Float f5, Float f10) {
        if (f5.floatValue() <= f10.floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1712d) {
            float f5 = this.alpha;
            if (0.0f <= f5 || 0.0f <= ((C1712d) obj).alpha) {
                C1712d c1712d = (C1712d) obj;
                c1712d.getClass();
                if (f5 == c1712d.alpha) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float f5 = this.alpha;
        if (0.0f > f5) {
            return -1;
        }
        return Float.floatToIntBits(f5) + (Float.floatToIntBits(0.0f) * 31);
    }

    public final String toString() {
        return "0.0.." + this.alpha;
    }
}
