package Ge;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o {
    public final String alpha;

    public o(String str) {
        this.alpha = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && Intrinsics.areEqual(this.alpha, ((o) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("MemberSignature(signature="), this.alpha, ')');
    }
}
