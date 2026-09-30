package I0;

/* loaded from: classes3.dex */
public final class m {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == -1) {
            return "Unspecified";
        }
        if (i4 == 0) {
            return "None";
        }
        if (i4 == 1) {
            return "Characters";
        }
        if (i4 == 2) {
            return "Words";
        }
        if (i4 == 3) {
            return "Sentences";
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
