package I;

import androidx.compose.runtime.C0565b0;
import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.j0;
import bv.au;
import java.util.Set;

/* loaded from: classes3.dex */
public final class x extends aj {
    public static final x delta = new aj(0, 1, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        Q q4 = (Q) alVar.echo(0);
        Set set = (Set) rVar.alpha;
        if (set == null) {
            return;
        }
        P.g gVar = new P.g(set);
        bv.al alVar2 = (bv.al) rVar.india;
        if (alVar2 == null) {
            long[] jArr = au.alpha;
            alVar2 = new bv.al();
            rVar.india = alVar2;
        }
        alVar2.mike(q4, gVar);
        ((J.e) rVar.echo).bravo(new C0565b0(gVar, null));
    }
}
