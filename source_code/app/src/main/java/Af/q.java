package Af;

import s6.J6;
import vf.AbstractC3197a;
import vf.AbstractC3216u;

/* loaded from: classes2.dex */
public class q extends AbstractC3197a implements Pd.d {
    public final Nd.c silver;

    public q(Nd.c cVar, Nd.h hVar) {
        super(hVar, true, true);
        this.silver = cVar;
    }

    public void c() {
    }

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        Nd.c cVar = this.silver;
        if (cVar instanceof Pd.d) {
            return (Pd.d) cVar;
        }
        return null;
    }

    @Override // vf.P
    public final boolean lime() {
        return true;
    }

    @Override // vf.P
    public void romeo(Object obj) {
        f.golf(J6.delta(this.silver), AbstractC3216u.alpha(obj));
    }

    @Override // vf.P
    public void sierra(Object obj) {
        this.silver.resumeWith(AbstractC3216u.alpha(obj));
    }
}
