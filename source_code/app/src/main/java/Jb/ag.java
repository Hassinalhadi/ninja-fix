package Jb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ag extends ai {
    public final String alpha;

    public ag(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ag) && Intrinsics.areEqual(this.alpha, ((ag) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("Header(label="), this.alpha, ")");
    }
}
