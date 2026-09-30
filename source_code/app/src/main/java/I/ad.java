package I;

import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.j0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ad extends aj {
    public static final ad delta = new aj(0, 1, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        P.g gVar;
        Q q4 = (Q) alVar.echo(0);
        bv.al alVar2 = (bv.al) rVar.india;
        if (alVar2 != null) {
            gVar = (P.g) alVar2.golf(q4);
        } else {
            gVar = null;
        }
        if (gVar != null) {
            ArrayList arrayList = (ArrayList) rVar.juliet;
            if (arrayList == null) {
                arrayList = new ArrayList();
                rVar.juliet = arrayList;
            }
            arrayList.add((J.e) rVar.echo);
            rVar.echo = gVar.purple;
        }
    }
}
