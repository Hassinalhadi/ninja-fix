package Z2;

import N2.o;
import X2.i;
import X2.m;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class d implements f {
    public final o alpha;
    public final i bravo;

    public d(o oVar, i iVar) {
        this.alpha = oVar;
        this.bravo = iVar;
    }

    @Override // Z2.f
    public final void alpha() {
        i iVar = this.bravo;
        boolean z2 = iVar instanceof m;
        o oVar = this.alpha;
        if (z2) {
            Drawable drawable = ((m) iVar).alpha;
            oVar.getClass();
        } else {
            if (iVar instanceof X2.d) {
                Drawable drawable2 = ((X2.d) iVar).alpha;
                oVar.getClass();
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
