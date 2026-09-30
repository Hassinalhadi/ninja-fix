package Y2;

import t6.AbstractC3001h2;

/* loaded from: classes3.dex */
public final class a extends AbstractC3001h2 {
    public final int alpha;

    public a(int i4) {
        this.alpha = i4;
        if (i4 > 0) {
        } else {
            throw new IllegalArgumentException("px must be > 0.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.alpha == ((a) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return String.valueOf(this.alpha);
    }
}
