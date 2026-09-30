package I;

import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;

/* loaded from: classes3.dex */
public final class f extends aj {
    public static final f delta = new aj(0, 2, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        int i4;
        J2.e eVar;
        P.f fVar = (P.f) alVar.echo(1);
        if (fVar != null) {
            i4 = fVar.alpha;
        } else {
            i4 = 0;
        }
        a aVar = (a) alVar.echo(0);
        if (i4 > 0) {
            interfaceC0566c = new S5.l(interfaceC0566c, i4);
        }
        if (akVar != null) {
            eVar = new J2.e(9, akVar, j0Var);
        } else {
            eVar = null;
        }
        aVar.bravo(interfaceC0566c, j0Var, rVar, eVar);
    }
}
