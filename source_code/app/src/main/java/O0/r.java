package O0;

/* loaded from: classes3.dex */
public final class r {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            if (this.alpha != ((r) obj).alpha) {
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
        int i4 = this.alpha;
        if (i4 == 1) {
            return "Linearity.Linear";
        }
        if (i4 == 2) {
            return "Linearity.FontHinting";
        }
        if (i4 == 3) {
            return "Linearity.None";
        }
        return "Invalid";
    }
}
