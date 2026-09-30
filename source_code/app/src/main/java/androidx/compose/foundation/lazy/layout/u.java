package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class u {
    public final R.c alpha;
    public final Cb.u bravo;
    public final bv.al charlie;

    public u(R.c cVar, Cb.u uVar) {
        this.alpha = cVar;
        this.bravo = uVar;
        long[] jArr = bv.au.alpha;
        this.charlie = new bv.al();
    }

    public final Xd.l alpha(int i4, Object obj, Object obj2) {
        bv.al alVar = this.charlie;
        t tVar = (t) alVar.golf(obj);
        if (tVar != null && tVar.charlie == i4 && Intrinsics.areEqual(tVar.bravo, obj2)) {
            P.d dVar = tVar.delta;
            if (dVar == null) {
                P.d dVar2 = new P.d(new P0.b(5, tVar.echo, tVar), 818252804, true);
                tVar.delta = dVar2;
                return dVar2;
            }
            return dVar;
        }
        t tVar2 = new t(this, i4, obj, obj2);
        alVar.mike(obj, tVar2);
        P.d dVar3 = tVar2.delta;
        if (dVar3 == null) {
            P.d dVar4 = new P.d(new P0.b(5, this, tVar2), 818252804, true);
            tVar2.delta = dVar4;
            return dVar4;
        }
        return dVar3;
    }

    public final Object bravo(Object obj) {
        if (obj != null) {
            t tVar = (t) this.charlie.golf(obj);
            if (tVar != null) {
                return tVar.bravo;
            }
            w wVar = (w) this.bravo.invoke();
            int charlie = wVar.charlie(obj);
            if (charlie != -1) {
                return wVar.bravo(charlie);
            }
            return null;
        }
        return null;
    }
}
