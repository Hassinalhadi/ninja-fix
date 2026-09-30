package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Z implements a0 {
    public final String alpha;
    public final androidx.compose.runtime.ax bravo;

    public Z(az azVar, String str) {
        this.alpha = str;
        this.bravo = C0564b.zulu(azVar);
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int alpha(Q0.d dVar) {
        return echo().bravo;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int bravo(Q0.d dVar, Q0.n nVar) {
        return echo().alpha;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int charlie(Q0.d dVar) {
        return echo().delta;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int delta(Q0.d dVar, Q0.n nVar) {
        return echo().charlie;
    }

    public final az echo() {
        return (az) ((t0) this.bravo).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        return Intrinsics.areEqual(echo(), ((Z) obj).echo());
    }

    public final void foxtrot(az azVar) {
        ((t0) this.bravo).setValue(azVar);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.alpha);
        sb2.append("(left=");
        sb2.append(echo().alpha);
        sb2.append(", top=");
        sb2.append(echo().bravo);
        sb2.append(", right=");
        sb2.append(echo().charlie);
        sb2.append(", bottom=");
        return Q0.c.quebec(sb2, echo().delta, ')');
    }
}
