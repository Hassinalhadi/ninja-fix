package x2;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ab extends aa {
    public final /* synthetic */ bv.e alpha;
    public final /* synthetic */ ac bravo;

    public ab(ac acVar, bv.e eVar) {
        this.bravo = acVar;
        this.alpha = eVar;
    }

    @Override // x2.aa, x2.x
    public final void onTransitionEnd(z zVar) {
        ((ArrayList) this.alpha.get(this.bravo.purple)).remove(zVar);
        zVar.azure(this);
    }
}
