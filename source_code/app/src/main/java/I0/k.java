package I0;

/* loaded from: classes3.dex */
public final class k {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == -1) {
            return "Unspecified";
        }
        if (i4 == 0) {
            return "None";
        }
        if (i4 == 1) {
            return "Default";
        }
        if (i4 == 2) {
            return "Go";
        }
        if (i4 == 3) {
            return "Search";
        }
        if (i4 == 4) {
            return "Send";
        }
        if (i4 == 5) {
            return "Previous";
        }
        if (i4 == 6) {
            return "Next";
        }
        if (i4 == 7) {
            return "Done";
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
