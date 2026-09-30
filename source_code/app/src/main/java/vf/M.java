package vf;

/* loaded from: classes2.dex */
public final class M extends K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13992a;
    public final P teal;
    public final N white;
    public final C3211o yellow;

    public M(P p4, N n5, C3211o c3211o, Object obj) {
        this.teal = p4;
        this.white = n5;
        this.yellow = c3211o;
        this.f13992a = obj;
    }

    @Override // vf.K
    public final boolean juliet() {
        return false;
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        C3211o c3211o = this.yellow;
        P p4 = this.teal;
        p4.getClass();
        C3211o ochre = P.ochre(c3211o);
        N n5 = this.white;
        Object obj = this.f13992a;
        if (ochre == null || !p4.white(n5, ochre, obj)) {
            n5.alpha.bravo(new Af.h(2), 2);
            C3211o ochre2 = P.ochre(c3211o);
            if (ochre2 != null && p4.white(n5, ochre2, obj)) {
                return;
            }
            p4.romeo(p4.coral(n5, obj));
        }
    }
}
