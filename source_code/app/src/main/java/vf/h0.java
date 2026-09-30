package vf;

import kotlin.Pair;

/* loaded from: classes2.dex */
public final class h0 extends Af.q {
    public final ThreadLocal teal;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0(Nd.c cVar, Nd.h hVar) {
        super(cVar, r0);
        Nd.h hVar2;
        i0 i0Var = i0.alpha;
        if (hVar.get(i0Var) == null) {
            hVar2 = hVar.plus(i0Var);
        } else {
            hVar2 = hVar;
        }
        this.teal = new ThreadLocal();
        if (!(cVar.getContext().get(Nd.d.alpha) instanceof AbstractC3220y)) {
            Object mike = Af.f.mike(hVar, null);
            Af.f.foxtrot(hVar, mike);
            f(hVar, mike);
        }
    }

    @Override // Af.q
    public final void c() {
        e();
    }

    public final boolean d() {
        boolean z2;
        if (this.threadLocalIsSet && this.teal.get() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.teal.remove();
        return !z2;
    }

    public final void e() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.teal.get();
            if (pair != null) {
                Af.f.foxtrot((Nd.h) pair.first, pair.second);
            }
            this.teal.remove();
        }
    }

    public final void f(Nd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.teal.set(new Pair(hVar, obj));
    }

    @Override // Af.q, vf.P
    public final void sierra(Object obj) {
        e();
        Object alpha = AbstractC3216u.alpha(obj);
        Nd.c cVar = this.silver;
        Nd.h context = cVar.getContext();
        h0 h0Var = null;
        Object mike = Af.f.mike(context, null);
        if (mike != Af.f.charlie) {
            h0Var = AbstractC3218w.charlie(cVar, context, mike);
        }
        try {
            cVar.resumeWith(alpha);
            if (h0Var != null && !h0Var.d()) {
                return;
            }
            Af.f.foxtrot(context, mike);
        } catch (Throwable th) {
            if (h0Var == null || h0Var.d()) {
                Af.f.foxtrot(context, mike);
            }
            throw th;
        }
    }
}
