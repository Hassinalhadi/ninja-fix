package g3;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import s6.P4;

/* loaded from: classes3.dex */
public final class ah extends P4 {
    public final String bravo;

    public ah(String str) {
        this.bravo = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ah) && Intrinsics.areEqual(this.bravo, ((ah) obj).bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("End(reason="), this.bravo, ")");
    }
}
