package m0;

import s0.AbstractC2557q;
import t0.AbstractC2901T;
import t0.C2942u;

/* loaded from: classes3.dex */
public final class z extends f {
    @Override // m0.f
    public final void c(o oVar) {
        p pVar = (p) AbstractC2557q.echo(this, AbstractC2901T.uniform);
        if (pVar != null) {
            ((C2942u) pVar).alpha = oVar;
        }
    }

    @Override // m0.f
    public final boolean e(int i4) {
        if (i4 == 3 || i4 == 4) {
            return true;
        }
        return false;
    }

    @Override // s0.j0
    public final /* bridge */ /* synthetic */ Object golf() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
