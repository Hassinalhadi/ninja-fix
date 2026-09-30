package O0;

/* loaded from: classes3.dex */
public final class a {
    public final float alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            if (Float.compare(this.alpha, ((a) obj).alpha) != 0) {
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
        return "BaselineShift(multiplier=" + this.alpha + ')';
    }
}
