package a0;

/* renamed from: a0.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0371y {
    public final int alpha;

    public static String alpha(int i4) {
        return "CompositingStrategy(value=" + i4 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0371y) {
            if (this.alpha != ((C0371y) obj).alpha) {
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
