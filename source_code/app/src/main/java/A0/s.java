package A0;

import B9.C0058p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import q0.AbstractC2375K;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.C2563x;
import s0.L;
import s0.al;
import s0.e0;

/* loaded from: classes3.dex */
public final class s {
    public final T.r alpha;
    public final boolean bravo;
    public final al charlie;
    public final k delta;
    public boolean echo;
    public s foxtrot;
    public final int golf;

    public s(T.r rVar, boolean z2, al alVar, k kVar) {
        this.alpha = rVar;
        this.bravo = z2;
        this.charlie = alVar;
        this.delta = kVar;
        this.golf = alVar.purple;
    }

    public static /* synthetic */ List juliet(int i4, s sVar) {
        boolean z2;
        boolean z10 = false;
        if ((i4 & 1) != 0) {
            z2 = !sVar.bravo;
        } else {
            z2 = false;
        }
        if ((i4 & 2) == 0) {
            z10 = true;
        }
        return sVar.india(z2, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final Z.c alpha(L l10) {
        AbstractC2556p abstractC2556p;
        s lima = lima();
        if (lima == null) {
            return Z.c.echo;
        }
        C0058p c0058p = lima.charlie.f13305x;
        L l11 = null;
        if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 8) != 0) {
            loop0: for (T.r rVar = (T.r) c0058p.delta; rVar != null; rVar = rVar.getChild$ui_release()) {
                if ((rVar.getKindSet$ui_release() & 8) != 0) {
                    abstractC2556p = rVar;
                    ?? r62 = 0;
                    while (abstractC2556p != 0) {
                        if (abstractC2556p instanceof e0) {
                            if (abstractC2556p.charlie()) {
                                break loop0;
                            }
                        } else if ((abstractC2556p.getKindSet$ui_release() & 8) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                            T.r rVar2 = abstractC2556p.purple;
                            int i4 = 0;
                            abstractC2556p = abstractC2556p;
                            r62 = r62;
                            while (rVar2 != null) {
                                if ((rVar2.getKindSet$ui_release() & 8) != 0) {
                                    i4++;
                                    r62 = r62;
                                    if (i4 == 1) {
                                        abstractC2556p = rVar2;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new J.e(new T.r[16]);
                                        }
                                        if (abstractC2556p != 0) {
                                            r62.bravo(abstractC2556p);
                                            abstractC2556p = 0;
                                        }
                                        r62.bravo(rVar2);
                                    }
                                }
                                rVar2 = rVar2.getChild$ui_release();
                                abstractC2556p = abstractC2556p;
                                r62 = r62;
                            }
                            if (i4 == 1) {
                            }
                        }
                        abstractC2556p = AbstractC2555o.bravo(r62);
                    }
                }
                if ((rVar.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
            }
        }
        abstractC2556p = 0;
        e0 e0Var = (e0) abstractC2556p;
        if (e0Var != null) {
            l11 = AbstractC2555o.echo(e0Var, 8);
        }
        if (l11 == null) {
            return lima.alpha(l10);
        }
        return l11.sierra(l10, true);
    }

    public final s bravo(h hVar, Function1 function1) {
        int i4;
        k kVar = new k();
        kVar.red = false;
        kVar.silver = false;
        function1.invoke(kVar);
        r rVar = new r(function1);
        int i5 = this.golf;
        if (hVar != null) {
            i4 = 1000000000;
        } else {
            i4 = 2000000000;
        }
        s sVar = new s(rVar, false, new al(i5 + i4, true), kVar);
        sVar.echo = true;
        sVar.foxtrot = this;
        return sVar;
    }

    public final void charlie(al alVar, ArrayList arrayList) {
        J.e yankee = alVar.yankee();
        Object[] objArr = yankee.alpha;
        int i4 = yankee.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            if (alVar2.cyan() && !alVar2.f13282I) {
                if (alVar2.f13305x.foxtrot(8)) {
                    arrayList.add(v.alpha(alVar2, this.bravo));
                } else {
                    charlie(alVar2, arrayList);
                }
            }
        }
    }

    public final L delta() {
        L echo;
        if (this.echo) {
            s lima = lima();
            if (lima != null) {
                return lima.delta();
            }
            return null;
        }
        e0 foxtrot = foxtrot();
        if (foxtrot != null && (echo = AbstractC2555o.echo(foxtrot, 8)) != null) {
            return echo;
        }
        return (C2563x) this.charlie.f13305x.echo;
    }

    public final void echo(ArrayList arrayList, ArrayList arrayList2) {
        quebec(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            s sVar = (s) arrayList.get(size2);
            if (sVar.november()) {
                arrayList2.add(sVar);
            } else if (!sVar.delta.silver) {
                sVar.echo(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v14, types: [s0.e0] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [J.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [J.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final e0 foxtrot() {
        T.r rVar;
        boolean z2 = this.delta.red;
        al alVar = this.charlie;
        Object obj = null;
        if (z2) {
            C0058p c0058p = alVar.f13305x;
            if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 8) != 0) {
                rVar = null;
                for (T.r rVar2 = (T.r) c0058p.delta; rVar2 != null; rVar2 = rVar2.getChild$ui_release()) {
                    if ((rVar2.getKindSet$ui_release() & 8) != 0) {
                        AbstractC2556p abstractC2556p = rVar2;
                        ?? r72 = 0;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof e0) {
                                ?? r62 = (e0) abstractC2556p;
                                if (r62.charlie()) {
                                    if (r62.yellow()) {
                                        return r62;
                                    }
                                    if (rVar == null) {
                                        rVar = r62;
                                    }
                                }
                            } else if ((abstractC2556p.getKindSet$ui_release() & 8) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar3 = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r72 = r72;
                                while (rVar3 != null) {
                                    if ((rVar3.getKindSet$ui_release() & 8) != 0) {
                                        i4++;
                                        r72 = r72;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar3;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r72.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r72.bravo(rVar3);
                                        }
                                    }
                                    rVar3 = rVar3.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r72 = r72;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r72);
                        }
                    }
                    if ((rVar2.getAggregateChildKindSet$ui_release() & 8) == 0) {
                        break;
                    }
                }
                obj = rVar;
            }
            return (e0) obj;
        }
        C0058p c0058p2 = alVar.f13305x;
        if ((((T.r) c0058p2.delta).getAggregateChildKindSet$ui_release() & 8) != 0) {
            loop3: for (T.r rVar4 = (T.r) c0058p2.delta; rVar4 != null; rVar4 = rVar4.getChild$ui_release()) {
                if ((rVar4.getKindSet$ui_release() & 8) != 0) {
                    rVar = rVar4;
                    J.e eVar = null;
                    while (rVar != null) {
                        if (rVar instanceof e0) {
                            if (((e0) rVar).charlie()) {
                                obj = rVar;
                            }
                        } else if ((rVar.getKindSet$ui_release() & 8) != 0 && (rVar instanceof AbstractC2556p)) {
                            int i5 = 0;
                            for (T.r rVar5 = ((AbstractC2556p) rVar).purple; rVar5 != null; rVar5 = rVar5.getChild$ui_release()) {
                                if ((rVar5.getKindSet$ui_release() & 8) != 0) {
                                    i5++;
                                    if (i5 == 1) {
                                        rVar = rVar5;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new J.e(new T.r[16]);
                                        }
                                        if (rVar != null) {
                                            eVar.bravo(rVar);
                                            rVar = null;
                                        }
                                        eVar.bravo(rVar5);
                                    }
                                }
                            }
                            if (i5 == 1) {
                            }
                        }
                        rVar = AbstractC2555o.bravo(eVar);
                    }
                }
                if ((rVar4.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
            }
        }
        return (e0) obj;
    }

    public final Z.c golf() {
        L delta = delta();
        if (delta != null) {
            if (!delta.india()) {
                delta = null;
            }
            if (delta != null) {
                return AbstractC2375K.hotel(delta).sierra(delta, true);
            }
        }
        return Z.c.echo;
    }

    public final Z.c hotel() {
        L delta = delta();
        if (delta != null) {
            if (!delta.india()) {
                delta = null;
            }
            if (delta != null) {
                return AbstractC2375K.foxtrot(delta);
            }
        }
        return Z.c.echo;
    }

    public final List india(boolean z2, boolean z10) {
        if (!z2 && this.delta.silver) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        if (november()) {
            ArrayList arrayList2 = new ArrayList();
            echo(arrayList, arrayList2);
            return arrayList2;
        }
        return quebec(arrayList, z10);
    }

    public final k kilo() {
        boolean november = november();
        k kVar = this.delta;
        if (november) {
            k alpha = kVar.alpha();
            papa(new ArrayList(), alpha);
            return alpha;
        }
        return kVar;
    }

    public final s lima() {
        al alVar;
        s sVar = this.foxtrot;
        if (sVar != null) {
            return sVar;
        }
        al alVar2 = this.charlie;
        boolean z2 = this.bravo;
        if (z2) {
            alVar = alVar2.victor();
            while (alVar != null) {
                k xray = alVar.xray();
                if (xray != null && xray.red) {
                    break;
                }
                alVar = alVar.victor();
            }
        }
        alVar = null;
        if (alVar == null) {
            al victor = alVar2.victor();
            while (true) {
                if (victor != null) {
                    if (victor.f13305x.foxtrot(8)) {
                        alVar = victor;
                        break;
                    }
                    victor = victor.victor();
                } else {
                    alVar = null;
                    break;
                }
            }
        }
        if (alVar == null) {
            return null;
        }
        return v.alpha(alVar, z2);
    }

    public final k mike() {
        return this.delta;
    }

    public final boolean november() {
        if (this.bravo && this.delta.red) {
            return true;
        }
        return false;
    }

    public final boolean oscar() {
        if (!this.echo && juliet(4, this).isEmpty()) {
            al victor = this.charlie.victor();
            while (true) {
                if (victor != null) {
                    k xray = victor.xray();
                    if (xray != null && xray.red) {
                        break;
                    }
                    victor = victor.victor();
                } else {
                    victor = null;
                    break;
                }
            }
            if (victor == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void papa(ArrayList arrayList, k kVar) {
        if (!this.delta.silver) {
            quebec(arrayList, false);
            int size = arrayList.size();
            for (int size2 = arrayList.size(); size2 < size; size2++) {
                s sVar = (s) arrayList.get(size2);
                if (!sVar.november()) {
                    kVar.delta(sVar.delta);
                    sVar.papa(arrayList, kVar);
                }
            }
        }
    }

    public final List quebec(ArrayList arrayList, boolean z2) {
        String str;
        if (this.echo) {
            return CollectionsKt.emptyList();
        }
        charlie(this.charlie, arrayList);
        if (z2) {
            ac acVar = x.xray;
            k kVar = this.delta;
            h hVar = (h) v.delta(kVar, acVar);
            if (hVar != null && kVar.red && !arrayList.isEmpty()) {
                arrayList.add(bravo(hVar, new p(0, hVar)));
            }
            ac acVar2 = x.alpha;
            if (kVar.alpha.charlie(acVar2) && !arrayList.isEmpty() && kVar.red) {
                List list = (List) v.delta(kVar, acVar2);
                if (list != null) {
                    str = (String) CollectionsKt.green(list);
                } else {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(0, bravo(null, new q(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
