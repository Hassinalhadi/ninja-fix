package s6;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import k5.C2015h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qb.EnumC2443j;

/* loaded from: classes2.dex */
public abstract class D7 {
    public static final U.e alpha(String str) {
        return new U.e(kotlin.collections.ab.oscar(str));
    }

    public static final void bravo(EnumC2443j enumC2443j, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        long j5;
        T.p pVar = T.p.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(767613902);
        if ((i4 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i4 & 1, z2)) {
            int ordinal = enumC2443j.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        j5 = Db.c.mike;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    j5 = Db.c.lima;
                }
            } else {
                j5 = Db.c.kilo;
            }
            F.K1.charlie(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), Db.a.bravo, F.K1.lima(j5, c0585q, 0), F.K1.mike(0, 62), null, P.e.echo(901046940, new Lb.V(dVar, 1), c0585q), c0585q, 196656, 16);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2015h(i4, 2, enumC2443j, dVar);
        }
    }

    public static final String[] charlie(U.n nVar) {
        Intrinsics.charlie(nVar, "null cannot be cast to non-null type androidx.compose.ui.autofill.AndroidContentType");
        return (String[]) ((U.e) nVar).bravo.toArray(new String[0]);
    }
}
