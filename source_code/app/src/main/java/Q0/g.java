package Q0;

/* loaded from: classes3.dex */
public final class g implements Comparable {
    public final float alpha;

    public static final boolean alpha(float f5, float f10) {
        if (Float.compare(f5, f10) == 0) {
            return true;
        }
        return false;
    }

    public static String bravo(float f5) {
        if (Float.isNaN(f5)) {
            return "Dp.Unspecified";
        }
        return f5 + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.alpha, ((g) obj).alpha);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            if (Float.compare(this.alpha, ((g) obj).alpha) != 0) {
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
