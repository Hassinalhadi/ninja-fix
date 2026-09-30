package k;

import Ac.l;
import T.r;
import d.C1535i;
import kotlin.Unit;
import q0.z;
import qa.j;
import s0.AbstractC2555o;
import s0.L;
import s0.aa;
import vf.ad;
import x0.InterfaceC3278a;

/* loaded from: classes3.dex */
public final class h extends r implements InterfaceC3278a, aa {
    public C1535i alpha;
    public boolean purple;

    public static final Z.c b(h hVar, L l10, j jVar) {
        Z.c cVar;
        if (hVar.isAttached() && hVar.purple) {
            L foxtrot = AbstractC2555o.foxtrot(hVar);
            if (!l10.india()) {
                l10 = null;
            }
            if (l10 != null && (cVar = (Z.c) jVar.invoke()) != null) {
                return cVar.hotel(foxtrot.sierra(l10, false).charlie());
            }
        }
        return null;
    }

    @Override // s0.aa
    public final void foxtrot(z zVar) {
        this.purple = true;
    }

    @Override // T.r
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // s0.aa
    public final /* synthetic */ void kilo(long j5) {
    }

    @Override // x0.InterfaceC3278a
    public final Object sierra(L l10, j jVar, Pd.c cVar) {
        Object mike = ad.mike(new g(this, l10, jVar, new l(this, l10, jVar, 13), null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }
}
