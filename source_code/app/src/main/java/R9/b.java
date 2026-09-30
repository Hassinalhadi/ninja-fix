package R9;

/* loaded from: classes2.dex */
public final class b implements e {
    public final boolean alpha;

    public b(boolean z2) {
        this.alpha = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.alpha == ((b) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.alpha) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "AllowCompletion(sent=" + this.alpha + ")";
    }
}
