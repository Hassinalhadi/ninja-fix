package Dc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class d extends e {
    public final List alpha;
    public final List bravo;

    public d(List shifts, List leaveReasons) {
        Intrinsics.echo(shifts, "shifts");
        Intrinsics.echo(leaveReasons, "leaveReasons");
        this.alpha = shifts;
        this.bravo = leaveReasons;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Intrinsics.areEqual(this.alpha, dVar.alpha) && Intrinsics.areEqual(this.bravo, dVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "Success(shifts=" + this.alpha + ", leaveReasons=" + this.bravo + ")";
    }
}
