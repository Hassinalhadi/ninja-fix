package O0;

/* loaded from: classes3.dex */
public final class h {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            if (this.alpha != ((h) obj).alpha) {
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
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i4 == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i4 == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        if (i4 == 0) {
            return "LineHeightStyle.Trim.None";
        }
        return "Invalid";
    }
}
