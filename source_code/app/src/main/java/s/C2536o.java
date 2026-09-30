package s;

import U0.ac;

/* renamed from: s.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2536o implements ac {
    public final androidx.core.widget.f alpha;
    public Q0.m purple;
    public Q0.n red;
    public Q0.m silver;
    public Q0.k teal;

    public C2536o(androidx.core.widget.f fVar) {
        this.alpha = fVar;
    }

    @Override // U0.ac
    public final long oscar(Q0.l lVar, long j5, Q0.n nVar, long j6) {
        boolean alpha;
        Q0.k kVar = this.teal;
        if (kVar != null) {
            Q0.m mVar = this.purple;
            boolean z2 = false;
            if (mVar == null) {
                alpha = false;
            } else {
                alpha = Q0.m.alpha(mVar.alpha, j5);
            }
            if (alpha && this.red == nVar) {
                Q0.m mVar2 = this.silver;
                if (mVar2 != null) {
                    z2 = Q0.m.alpha(mVar2.alpha, j6);
                }
                if (z2) {
                    return kVar.alpha;
                }
            }
        }
        long oscar = this.alpha.oscar(lVar, j5, nVar, j6);
        this.purple = new Q0.m(j5);
        this.red = nVar;
        this.silver = new Q0.m(j6);
        this.teal = new Q0.k(oscar);
        return oscar;
    }
}
