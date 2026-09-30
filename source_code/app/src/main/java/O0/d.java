package O0;

/* loaded from: classes3.dex */
public final class d {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == 1) {
            return "Hyphens.None";
        }
        if (i4 == 2) {
            return "Hyphens.Auto";
        }
        if (i4 == Integer.MIN_VALUE) {
            return "Hyphens.Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            if (this.alpha != ((d) obj).alpha) {
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
