package I;

import androidx.compose.runtime.InterfaceC0566c;
import androidx.compose.runtime.j0;
import java.util.List;

/* loaded from: classes3.dex */
public final class g extends aj {
    public static final g delta = new aj(0, 2, 1);

    @Override // I.aj
    public final void charlie(al alVar, InterfaceC0566c interfaceC0566c, j0 j0Var, B9.r rVar, ak akVar) {
        int i4 = ((P.f) alVar.echo(0)).alpha;
        List list = (List) alVar.echo(1);
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            int i10 = i4 + i5;
            interfaceC0566c.bravo(i10, obj);
            interfaceC0566c.lima(i10, obj);
        }
    }
}
