package q;

/* loaded from: classes3.dex */
public final class a {
    public final int alpha;

    public a(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (this.alpha != ((a) obj).alpha) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha;
    }
}
