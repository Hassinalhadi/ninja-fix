package H0;

/* loaded from: classes3.dex */
public final class s {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (this.alpha != ((s) obj).alpha) {
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
        if (i4 == 0) {
            return "None";
        }
        if (i4 == 1) {
            return "Weight";
        }
        if (i4 == 2) {
            return "Style";
        }
        if (i4 == 65535) {
            return "All";
        }
        return "Invalid";
    }
}
