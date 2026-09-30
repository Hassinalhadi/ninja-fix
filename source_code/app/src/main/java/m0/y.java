package m0;

/* loaded from: classes3.dex */
public final class y {
    public final int alpha;

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            if (this.alpha != ((y) obj).alpha) {
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
        return "PointerKeyboardModifiers(packedValue=" + this.alpha + ')';
    }
}
