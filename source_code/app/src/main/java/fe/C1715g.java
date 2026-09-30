package fe;

/* renamed from: fe.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1715g extends C1713e {
    public static final C1715g silver = new C1713e(1, 0, 1);

    public final boolean alpha(int i4) {
        if (this.alpha <= i4 && i4 <= this.purple) {
            return true;
        }
        return false;
    }

    @Override // fe.C1713e
    public final boolean equals(Object obj) {
        if (obj instanceof C1715g) {
            if (!isEmpty() || !((C1715g) obj).isEmpty()) {
                C1715g c1715g = (C1715g) obj;
                if (this.alpha == c1715g.alpha) {
                    if (this.purple == c1715g.purple) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // fe.C1713e
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.alpha * 31) + this.purple;
    }

    @Override // fe.C1713e
    public final boolean isEmpty() {
        if (this.alpha > this.purple) {
            return true;
        }
        return false;
    }

    @Override // fe.C1713e
    public final String toString() {
        return this.alpha + ".." + this.purple;
    }
}
