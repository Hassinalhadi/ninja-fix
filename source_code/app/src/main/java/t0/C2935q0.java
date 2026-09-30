package t0;

import java.util.List;

/* renamed from: t0.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2935q0 {
    public final A0.k alpha;
    public final bv.ab bravo;

    public C2935q0(A0.s sVar, bv.n nVar) {
        this.alpha = sVar.delta;
        this.bravo = new bv.ab(A0.s.juliet(4, sVar).size());
        List juliet = A0.s.juliet(4, sVar);
        int size = juliet.size();
        for (int i4 = 0; i4 < size; i4++) {
            A0.s sVar2 = (A0.s) juliet.get(i4);
            if (nVar.alpha(sVar2.golf)) {
                this.bravo.alpha(sVar2.golf);
            }
        }
    }
}
