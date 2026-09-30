package Z2;

import N2.o;
import X2.i;
import X2.m;
import Y2.g;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes3.dex */
public final class b implements f {
    public final o alpha;
    public final i bravo;
    public final int charlie;

    public b(o oVar, i iVar, int i4) {
        this.alpha = oVar;
        this.bravo = iVar;
        this.charlie = i4;
        if (i4 > 0) {
        } else {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // Z2.f
    public final void alpha() {
        boolean z2;
        this.alpha.getClass();
        i iVar = this.bravo;
        Drawable alpha = iVar.alpha();
        g gVar = iVar.bravo().whiskey;
        boolean z10 = iVar instanceof m;
        if (z10 && ((m) iVar).golf) {
            z2 = false;
        } else {
            z2 = true;
        }
        new Q2.a(alpha, gVar, this.charlie, z2);
        if (z10 || (iVar instanceof X2.d)) {
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
