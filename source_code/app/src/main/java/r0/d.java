package r0;

import T.r;
import bv.ah;
import java.util.HashSet;
import p0.AbstractC2264a;
import qe.C2474j;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.C2544d;
import s0.al;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class d {
    public final C2946x alpha;
    public final J.e bravo = new J.e(new C2544d[16]);
    public final J.e charlie = new J.e(new g[16]);
    public final J.e delta = new J.e(new al[16]);
    public final J.e echo = new J.e(new g[16]);
    public boolean foxtrot;

    public d(C2946x c2946x) {
        this.alpha = c2946x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void bravo(r rVar, g gVar, HashSet hashSet) {
        if (!rVar.getNode().isAttached()) {
            AbstractC2264a.bravo("visitSubtreeIf called on an unattached node");
        }
        J.e eVar = new J.e(new r[16]);
        r child$ui_release = rVar.getNode().getChild$ui_release();
        if (child$ui_release == null) {
            AbstractC2555o.alpha(eVar, rVar.getNode());
        } else {
            eVar.bravo(child$ui_release);
        }
        while (true) {
            int i4 = eVar.red;
            if (i4 != 0) {
                r rVar2 = (r) eVar.mike(i4 - 1);
                if ((rVar2.getAggregateChildKindSet$ui_release() & 32) != 0) {
                    for (r rVar3 = rVar2; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                        if ((rVar3.getKindSet$ui_release() & 32) != 0) {
                            AbstractC2556p abstractC2556p = rVar3;
                            ?? r5 = 0;
                            while (abstractC2556p != 0) {
                                if (abstractC2556p instanceof e) {
                                    e eVar2 = (e) abstractC2556p;
                                    if (eVar2 instanceof C2544d) {
                                        C2544d c2544d = (C2544d) eVar2;
                                        if ((c2544d.alpha instanceof InterfaceC2481c) && c2544d.red.contains(gVar)) {
                                            hashSet.add(eVar2);
                                        }
                                    }
                                    if (eVar2.green().bravo(gVar)) {
                                        break;
                                    }
                                } else if ((abstractC2556p.getKindSet$ui_release() & 32) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                    r rVar4 = abstractC2556p.purple;
                                    int i5 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r5 = r5;
                                    while (rVar4 != null) {
                                        if ((rVar4.getKindSet$ui_release() & 32) != 0) {
                                            i5++;
                                            r5 = r5;
                                            if (i5 == 1) {
                                                abstractC2556p = rVar4;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new J.e(new r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r5.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r5.bravo(rVar4);
                                            }
                                        }
                                        rVar4 = rVar4.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r5 = r5;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2556p = AbstractC2555o.bravo(r5);
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

    public final void alpha() {
        if (!this.foxtrot) {
            this.foxtrot = true;
            C2474j c2474j = new C2474j(1, this);
            ah ahVar = this.alpha.f13903o0;
            if (ahVar.charlie(c2474j) < 0) {
                ahVar.golf(c2474j);
            }
        }
    }
}
