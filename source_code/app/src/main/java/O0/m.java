package O0;

/* loaded from: classes3.dex */
public final class m {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == 1) {
            return "Ltr";
        }
        if (i4 == 2) {
            return "Rtl";
        }
        if (i4 == 3) {
            return "Content";
        }
        if (i4 == 4) {
            return "ContentOrLtr";
        }
        if (i4 == 5) {
            return "ContentOrRtl";
        }
        if (i4 == Integer.MIN_VALUE) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            if (this.alpha != ((m) obj).alpha) {
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
