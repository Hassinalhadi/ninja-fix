package O;

import Q0.c;

/* loaded from: classes3.dex */
public final class a {
    public int alpha;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.alpha == ((a) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        return c.quebec(new StringBuilder("DeltaCounter(count="), this.alpha, ')');
    }
}
