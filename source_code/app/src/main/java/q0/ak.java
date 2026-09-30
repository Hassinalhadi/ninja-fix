package q0;

import B9.C0058p;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.i0;
import s0.j0;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ak implements InterfaceC2377M {
    public final bv.ab alpha;
    public final /* synthetic */ al bravo;
    public final /* synthetic */ Object charlie;

    public ak(al alVar, Object obj) {
        this.bravo = alVar;
        this.charlie = obj;
        int[] iArr = bv.p.alpha;
        this.alpha = new bv.ab();
    }

    @Override // q0.InterfaceC2377M
    public final int alpha() {
        s0.al alVar = (s0.al) this.bravo.f13152c.golf(this.charlie);
        if (alVar != null) {
            return ((J.e) ((J.b) alVar.oscar()).purple).red;
        }
        return 0;
    }

    @Override // q0.InterfaceC2377M
    public final long bravo(int i4) {
        s0.al alVar = (s0.al) this.bravo.f13152c.golf(this.charlie);
        if (alVar != null && alVar.cyan()) {
            int i5 = ((J.e) ((J.b) alVar.oscar()).purple).red;
            if (i4 < 0 || i4 >= i5) {
                AbstractC2264a.delta("Index (" + i4 + ") is out of bound of [0, " + i5 + ')');
            }
            if (this.alpha.bravo(i4)) {
                return (((s0.al) ((J.b) alVar.oscar()).get(i4)).f13306y.papa.alpha << 32) | (((s0.al) ((J.b) alVar.oscar()).get(i4)).f13306y.papa.purple & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [Y1.ae] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // q0.InterfaceC2377M
    public final void charlie(Y1.ae aeVar) {
        C0058p c0058p;
        T.r rVar;
        i0 i0Var;
        s0.al alVar = (s0.al) this.bravo.f13152c.golf(this.charlie);
        if (alVar != null && (c0058p = alVar.f13305x) != null && (rVar = (T.r) c0058p.delta) != null) {
            if (!rVar.getNode().isAttached()) {
                AbstractC2264a.bravo("visitSubtreeIf called on an unattached node");
            }
            J.e eVar = new J.e(new T.r[16]);
            T.r child$ui_release = rVar.getNode().getChild$ui_release();
            if (child$ui_release == null) {
                AbstractC2555o.alpha(eVar, rVar.getNode());
            } else {
                eVar.bravo(child$ui_release);
            }
            while (true) {
                int i4 = eVar.red;
                if (i4 != 0) {
                    T.r rVar2 = (T.r) eVar.mike(i4 - 1);
                    if ((rVar2.getAggregateChildKindSet$ui_release() & 262144) != 0) {
                        for (T.r rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                            if ((rVar3.getKindSet$ui_release() & 262144) != 0) {
                                AbstractC2556p abstractC2556p = rVar3;
                                ?? r72 = 0;
                                while (abstractC2556p != 0) {
                                    if (abstractC2556p instanceof j0) {
                                        j0 j0Var = (j0) abstractC2556p;
                                        if (Intrinsics.areEqual("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", j0Var.golf())) {
                                            aeVar.invoke(j0Var);
                                            i0Var = i0.purple;
                                        } else {
                                            i0Var = i0.alpha;
                                        }
                                        if (i0Var != i0.red) {
                                            if (i0Var == i0.purple) {
                                                break;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if ((abstractC2556p.getKindSet$ui_release() & 262144) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                        T.r rVar4 = abstractC2556p.purple;
                                        int i5 = 0;
                                        abstractC2556p = abstractC2556p;
                                        r72 = r72;
                                        while (rVar4 != null) {
                                            if ((rVar4.getKindSet$ui_release() & 262144) != 0) {
                                                i5++;
                                                r72 = r72;
                                                if (i5 == 1) {
                                                    abstractC2556p = rVar4;
                                                } else {
                                                    if (r72 == 0) {
                                                        r72 = new J.e(new T.r[16]);
                                                    }
                                                    if (abstractC2556p != 0) {
                                                        r72.bravo(abstractC2556p);
                                                        abstractC2556p = 0;
                                                    }
                                                    r72.bravo(rVar4);
                                                }
                                            }
                                            rVar4 = rVar4.getChild$ui_release();
                                            abstractC2556p = abstractC2556p;
                                            r72 = r72;
                                        }
                                        if (i5 == 1) {
                                        }
                                    }
                                    abstractC2556p = AbstractC2555o.bravo(r72);
                                }
                            }
                        }
                    }
                    AbstractC2555o.alpha(eVar, rVar2);
                } else {
                    return;
                }
            }
        }
    }

    @Override // q0.InterfaceC2377M
    public final void delta(int i4, long j5) {
        al alVar = this.bravo;
        s0.al alVar2 = (s0.al) alVar.f13152c.golf(this.charlie);
        if (alVar2 != null && alVar2.cyan()) {
            int i5 = ((J.e) ((J.b) alVar2.oscar()).purple).red;
            if (i4 < 0 || i4 >= i5) {
                AbstractC2264a.delta("Index (" + i4 + ") is out of bound of [0, " + i5 + ')');
            }
            if (alVar2.emerald()) {
                AbstractC2264a.alpha("Pre-measure called on node that is not placed");
            }
            s0.al alVar3 = alVar.alpha;
            alVar3.f13290i = true;
            ((C2946x) s0.ao.alpha(alVar2)).sierra((s0.al) ((J.b) alVar2.oscar()).get(i4), j5);
            alVar3.f13290i = false;
            this.alpha.alpha(i4);
        }
    }

    @Override // q0.InterfaceC2377M
    public final void dispose() {
        al alVar = this.bravo;
        alVar.echo();
        s0.al alVar2 = (s0.al) alVar.f13152c.kilo(this.charlie);
        if (alVar2 != null) {
            if (alVar.f13156h <= 0) {
                AbstractC2264a.bravo("No pre-composed items to dispose");
            }
            s0.al alVar3 = alVar.alpha;
            int kilo = ((J.e) ((J.b) alVar3.papa()).purple).kilo(alVar2);
            if (kilo < ((J.e) ((J.b) alVar3.papa()).purple).red - alVar.f13156h) {
                AbstractC2264a.bravo("Item is not in pre-composed item range");
            }
            alVar.f13155g++;
            alVar.f13156h--;
            ae aeVar = (ae) alVar.white.golf(alVar2);
            if (aeVar != null) {
                al.charlie(aeVar);
            }
            int i4 = (((J.e) ((J.b) alVar3.papa()).purple).red - alVar.f13156h) - alVar.f13155g;
            alVar3.f13290i = true;
            alVar3.gray(kilo, i4, 1);
            alVar3.f13290i = false;
            alVar.delta(i4);
        }
    }
}
