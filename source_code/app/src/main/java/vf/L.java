package vf;

/* loaded from: classes2.dex */
public final class L extends C3207k {

    /* renamed from: b, reason: collision with root package name */
    public final P f13991b;

    public L(Nd.c cVar, P p4) {
        super(1, cVar);
        this.f13991b = p4;
    }

    @Override // vf.C3207k
    public final Throwable romeo(P p4) {
        Throwable bravo;
        P p5 = this.f13991b;
        p5.getClass();
        Object obj = P.alpha.get(p5);
        if ((obj instanceof N) && (bravo = ((N) obj).bravo()) != null) {
            return bravo;
        }
        if (obj instanceof C3215t) {
            return ((C3215t) obj).alpha;
        }
        return p4.quebec();
    }

    @Override // vf.C3207k
    public final String zulu() {
        return "AwaitContinuation";
    }
}
