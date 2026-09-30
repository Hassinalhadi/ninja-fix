package t0;

import android.view.ViewGroup;
import kotlin.Unit;
import x0.InterfaceC3278a;

/* renamed from: t0.K, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2893K extends T.r implements InterfaceC3278a {
    public ViewGroup alpha;

    @Override // x0.InterfaceC3278a
    public final Object sierra(s0.L l10, qa.j jVar, Pd.c cVar) {
        Z.c cVar2;
        long gray = l10.gray(0L);
        Z.c cVar3 = (Z.c) jVar.invoke();
        if (cVar3 != null) {
            cVar2 = cVar3.hotel(gray);
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            this.alpha.requestRectangleOnScreen(a0.ao.zulu(cVar2), false);
        }
        return Unit.INSTANCE;
    }
}
