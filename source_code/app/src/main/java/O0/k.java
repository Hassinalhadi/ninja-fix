package O0;

/* loaded from: classes3.dex */
public final class k {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == 1) {
            return "Left";
        }
        if (i4 == 2) {
            return "Right";
        }
        if (i4 == 3) {
            return "Center";
        }
        if (i4 == 4) {
            return "Justify";
        }
        if (i4 == 5) {
            return "Start";
        }
        if (i4 == 6) {
            return "End";
        }
        if (i4 == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            if (this.alpha != ((k) obj).alpha) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return alpha(this.alpha);
    }
}
