package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class C extends g0 {
    public final String alpha;

    public C(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            return this.alpha.equals(((C) ((g0) obj)).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode() ^ 1000003;
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Log{content="), this.alpha, "}");
    }
}
