package H0;

import s6.J4;

/* loaded from: classes3.dex */
public final class l implements j {
    public final a alpha;
    public final b bravo;
    public final J2.l charlie;
    public final q delta;
    public final Aa.m echo;
    public final Aa.l foxtrot;

    public l(a aVar, b bVar) {
        J2.l lVar = m.alpha;
        q qVar = new q(m.bravo);
        Aa.m mVar = new Aa.m(14);
        this.alpha = aVar;
        this.bravo = bVar;
        this.charlie = lVar;
        this.delta = qVar;
        this.echo = mVar;
        this.foxtrot = new Aa.l(11, this);
    }

    public final af alpha(ac acVar) {
        J2.l lVar = this.charlie;
        Cb.ad adVar = new Cb.ad(8, this, acVar);
        synchronized (((r6.u) lVar.alpha)) {
            af afVar = (af) ((bv.w) lVar.purple).charlie(acVar);
            if (afVar != null) {
                if (afVar.echo()) {
                    return afVar;
                }
            }
            try {
                af afVar2 = (af) adVar.invoke(new Cb.ad(9, lVar, acVar));
                synchronized (((r6.u) lVar.alpha)) {
                    if (((bv.w) lVar.purple).charlie(acVar) == null && afVar2.echo()) {
                        ((bv.w) lVar.purple).delta(acVar, afVar2);
                    }
                }
                return afVar2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final af bravo(k kVar, v vVar, int i4, int i5) {
        v vVar2;
        b bVar = this.bravo;
        bVar.getClass();
        int i10 = bVar.alpha;
        if (i10 != 0 && i10 != Integer.MAX_VALUE) {
            vVar2 = new v(J4.delta(vVar.alpha + i10, 1, 1000));
        } else {
            vVar2 = vVar;
        }
        this.alpha.getClass();
        return alpha(new ac(kVar, vVar2, i4, i5, null));
    }
}
