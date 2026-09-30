package Y;

/* loaded from: classes3.dex */
public final class d {
    public final int alpha;

    public static String alpha(int i4) {
        if (i4 == 1) {
            return "Next";
        }
        if (i4 == 2) {
            return "Previous";
        }
        if (i4 == 3) {
            return "Left";
        }
        if (i4 == 4) {
            return "Right";
        }
        if (i4 == 5) {
            return "Up";
        }
        if (i4 == 6) {
            return "Down";
        }
        if (i4 == 7) {
            return "Enter";
        }
        if (i4 == 8) {
            return "Exit";
        }
        return "Invalid FocusDirection";
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
