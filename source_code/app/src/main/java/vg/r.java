package vg;

import okhttp3.Call;
import s6.J6;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class r extends s {
    public final f delta;

    public r(ap apVar, Call.Factory factory, m mVar, f fVar) {
        super(apVar, factory, mVar);
        this.delta = fVar;
    }

    @Override // vg.s
    public final Object bravo(y yVar, Object[] objArr) {
        d dVar = (d) this.delta.adapt(yVar);
        Nd.c cVar = (Nd.c) objArr[objArr.length - 1];
        try {
            C3207k c3207k = new C3207k(1, J6.delta(cVar));
            c3207k.tango();
            c3207k.victor(new u(dVar, 2));
            dVar.o(new Ff.b(c3207k, 3));
            Object sierra = c3207k.sierra();
            Od.a aVar = Od.a.alpha;
            return sierra;
        } catch (Exception e) {
            A.romeo(cVar, e);
            return Od.a.alpha;
        }
    }
}
