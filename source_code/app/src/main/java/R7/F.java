package R7;

import androidx.appcompat.widget.P0;

/* loaded from: classes2.dex */
public final class F extends h0 {
    public final String alpha;
    public final String bravo;

    public F(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            if (this.alpha.equals(((F) h0Var).alpha) && this.bravo.equals(((F) h0Var).bravo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutVariant{rolloutId=");
        sb2.append(this.alpha);
        sb2.append(", variantId=");
        return P0.gold(sb2, this.bravo, "}");
    }
}
