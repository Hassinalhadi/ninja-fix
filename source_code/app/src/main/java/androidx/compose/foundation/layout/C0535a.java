package androidx.compose.foundation.layout;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import j1.C1929c;

/* renamed from: androidx.compose.foundation.layout.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0535a implements a0 {
    public final int alpha;
    public final String bravo;
    public final androidx.compose.runtime.ax charlie = C0564b.zulu(C1929c.echo);
    public final androidx.compose.runtime.ax delta = C0564b.zulu(Boolean.TRUE);

    public C0535a(int i4, String str) {
        this.alpha = i4;
        this.bravo = str;
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

    public final C1929c echo() {
        return (C1929c) ((t0) this.charlie).getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0535a) {
                if (this.alpha == ((C0535a) obj).alpha) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void foxtrot(s1.a0 a0Var, int i4) {
        int i5 = this.alpha;
        if (i4 != 0 && (i4 & i5) == 0) {
            return;
        }
        ((t0) this.charlie).setValue(a0Var.alpha.golf(i5));
        boolean quebec = a0Var.alpha.quebec(i5);
        ((t0) this.delta).setValue(Boolean.valueOf(quebec));
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.bravo);
        sb2.append('(');
        sb2.append(echo().alpha);
        sb2.append(", ");
        sb2.append(echo().bravo);
        sb2.append(", ");
        sb2.append(echo().charlie);
        sb2.append(", ");
        return Q0.c.quebec(sb2, echo().delta, ')');
    }
}
