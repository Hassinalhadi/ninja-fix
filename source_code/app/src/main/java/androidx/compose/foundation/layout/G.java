package androidx.compose.foundation.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class G implements a0 {
    public final a0 alpha;
    public final int bravo;

    public G(a0 a0Var, int i4) {
        this.alpha = a0Var;
        this.bravo = i4;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int alpha(Q0.d dVar) {
        if ((this.bravo & 16) != 0) {
            return this.alpha.alpha(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int bravo(Q0.d dVar, Q0.n nVar) {
        int i4;
        if (nVar == Q0.n.alpha) {
            i4 = 8;
        } else {
            i4 = 2;
        }
        if ((i4 & this.bravo) != 0) {
            return this.alpha.bravo(dVar, nVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int charlie(Q0.d dVar) {
        if ((this.bravo & 32) != 0) {
            return this.alpha.charlie(dVar);
        }
        return 0;
    }

    @Override // androidx.compose.foundation.layout.a0
    public final int delta(Q0.d dVar, Q0.n nVar) {
        int i4;
        if (nVar == Q0.n.alpha) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        if ((i4 & this.bravo) != 0) {
            return this.alpha.delta(dVar, nVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g2 = (G) obj;
        if (Intrinsics.areEqual(this.alpha, g2.alpha)) {
            if (this.bravo == g2.bravo) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.alpha);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i4 = this.bravo;
        int i5 = AbstractC0538d.delta;
        if ((i4 & i5) == i5) {
            AbstractC0538d.zulu(sb4, "Start");
        }
        int i10 = AbstractC0538d.foxtrot;
        if ((i4 & i10) == i10) {
            AbstractC0538d.zulu(sb4, "Left");
        }
        if ((i4 & 16) == 16) {
            AbstractC0538d.zulu(sb4, "Top");
        }
        int i11 = AbstractC0538d.echo;
        if ((i4 & i11) == i11) {
            AbstractC0538d.zulu(sb4, "End");
        }
        int i12 = AbstractC0538d.golf;
        if ((i4 & i12) == i12) {
            AbstractC0538d.zulu(sb4, "Right");
        }
        if ((i4 & 32) == 32) {
            AbstractC0538d.zulu(sb4, "Bottom");
        }
        String sb5 = sb4.toString();
        Intrinsics.delta(sb5, "toString(...)");
        sb3.append(sb5);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
