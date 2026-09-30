package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class J extends m0 {
    public final String alpha;

    public J(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m0) {
            return this.alpha.equals(((J) ((m0) obj)).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return P0.gold(new StringBuilder("User{identifier="), this.alpha, "}");
    }
}
