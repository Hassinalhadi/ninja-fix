package na;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {
    public final List alpha;
    public final Long bravo;

    public f(List orders, Long l10) {
        Intrinsics.echo(orders, "orders");
        this.alpha = orders;
        this.bravo = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && Intrinsics.areEqual(this.bravo, fVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        Long l10 = this.bravo;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OrderUIState(orders=" + this.alpha + ", activeBreakTime=" + this.bravo + ")";
    }
}
