package m0;

import android.os.Build;
import s0.AbstractC2557q;
import t0.AbstractC2901T;
import t0.C2942u;
import t0.al;

/* loaded from: classes3.dex */
public final class m extends f {
    @Override // m0.f
    public final void c(o oVar) {
        p pVar = (p) AbstractC2557q.echo(this, AbstractC2901T.uniform);
        if (pVar != null) {
            C2942u c2942u = (C2942u) pVar;
            if (oVar == null) {
                o.alpha.getClass();
                oVar = q.alpha;
            }
            if (Build.VERSION.SDK_INT >= 24) {
                al.alpha.alpha(c2942u.bravo, oVar);
            }
        }
    }

    @Override // m0.f
    public final boolean e(int i4) {
        if (i4 == 3 || i4 == 4) {
            return false;
        }
        return true;
    }

    @Override // s0.j0
    public final /* bridge */ /* synthetic */ Object golf() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }
}
