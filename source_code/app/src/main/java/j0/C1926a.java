package j0;

/* renamed from: j0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1926a {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof C1926a) {
            if (this.alpha != ((C1926a) obj).alpha) {
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
            return "Touch";
        }
        if (i4 == 2) {
            return "Keyboard";
        }
        return "Error";
    }
}
