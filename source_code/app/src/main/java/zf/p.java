package zf;

import java.util.Iterator;
import kotlin.Unit;
import t6.AbstractC3017k3;
import vf.AbstractC3218w;
import xf.EnumC3340a;
import yf.InterfaceC3439i;

/* loaded from: classes2.dex */
public final class p extends f {
    public final Iterable silver;

    public p(Iterable iterable, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        super(hVar, i4, enumC3340a);
        this.silver = iterable;
    }

    @Override // zf.f
    public final Object delta(xf.r rVar, Nd.c cVar) {
        ab abVar = new ab(rVar);
        Iterator it = this.silver.iterator();
        while (it.hasNext()) {
            vf.ad.zulu(rVar, null, null, new o((InterfaceC3439i) it.next(), abVar, null), 3);
        }
        return Unit.INSTANCE;
    }

    @Override // zf.f
    public final f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return new p(this.silver, hVar, i4, enumC3340a);
    }

    @Override // zf.f
    public final xf.t golf(vf.ab abVar) {
        Xd.l eVar = new e(this, null);
        EnumC3340a enumC3340a = EnumC3340a.alpha;
        vf.ac acVar = vf.ac.alpha;
        xf.q qVar = new xf.q(AbstractC3218w.bravo(abVar, this.alpha), AbstractC3017k3.bravo(this.purple, 4, enumC3340a), true, true);
        qVar.b(acVar, qVar, eVar);
        return qVar;
    }
}
