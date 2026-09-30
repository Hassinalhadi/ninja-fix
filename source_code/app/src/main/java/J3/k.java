package J3;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class k {
    public final String alpha;

    public k(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.alpha.equals(((k) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("StringHeaderFactory{value='"), this.alpha, "'}");
    }
}
