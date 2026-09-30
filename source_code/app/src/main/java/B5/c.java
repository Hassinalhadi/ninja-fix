package B5;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class c {
    public final String alpha;

    public c(String str) {
        if (str != null) {
            this.alpha = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.alpha.equals(((c) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Encoding{name=\""), this.alpha, "\"}");
    }
}
