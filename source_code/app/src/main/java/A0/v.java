package A0;

import B9.C0058p;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import q0.AbstractC2375K;
import s0.AbstractC2555o;
import s0.AbstractC2556p;
import s0.C2563x;
import s0.InterfaceC2554n;
import s0.L;
import s0.al;
import s0.e0;
import s6.AbstractC2618b7;

/* loaded from: classes3.dex */
public abstract class v {
    public static final Z.c alpha = new Z.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final s alpha(al alVar, boolean z2) {
        C0058p c0058p = alVar.f13305x;
        InterfaceC2554n interfaceC2554n = null;
        if ((((T.r) c0058p.delta).getAggregateChildKindSet$ui_release() & 8) != 0) {
            T.r rVar = (T.r) c0058p.delta;
            loop0: while (true) {
                if (rVar == null) {
                    break;
                }
                if ((rVar.getKindSet$ui_release() & 8) != 0) {
                    T.r rVar2 = rVar;
                    J.e eVar = null;
                    while (rVar2 != null) {
                        if (rVar2 instanceof e0) {
                            interfaceC2554n = rVar2;
                            break loop0;
                        }
                        if ((rVar2.getKindSet$ui_release() & 8) != 0 && (rVar2 instanceof AbstractC2556p)) {
                            int i4 = 0;
                            for (T.r rVar3 = ((AbstractC2556p) rVar2).purple; rVar3 != null; rVar3 = rVar3.getChild$ui_release()) {
                                if ((rVar3.getKindSet$ui_release() & 8) != 0) {
                                    i4++;
                                    if (i4 == 1) {
                                        rVar2 = rVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new J.e(new T.r[16]);
                                        }
                                        if (rVar2 != null) {
                                            eVar.bravo(rVar2);
                                            rVar2 = null;
                                        }
                                        eVar.bravo(rVar3);
                                    }
                                }
                            }
                            if (i4 == 1) {
                            }
                        }
                        rVar2 = AbstractC2555o.bravo(eVar);
                    }
                }
                if ((rVar.getAggregateChildKindSet$ui_release() & 8) == 0) {
                    break;
                }
                rVar = rVar.getChild$ui_release();
            }
        }
        Intrinsics.checkNotNull(interfaceC2554n);
        T.r node = ((T.r) ((e0) interfaceC2554n)).getNode();
        k xray = alVar.xray();
        if (xray == null) {
            xray = new k();
        }
        return new s(node, z2, alVar, xray);
    }

    public static final bv.aa bravo(u uVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            s alpha2 = uVar.alpha();
            al alVar = alpha2.charlie;
            if (alVar.emerald() && alVar.cyan()) {
                bv.aa aaVar = new bv.aa(48);
                D8.c cVar = new D8.c(1);
                Q0.l bravo = AbstractC2618b7.bravo(alpha2.golf());
                ((Region) cVar.purple).set(bravo.alpha, bravo.bravo, bravo.charlie, bravo.delta);
                charlie(cVar, alpha2, aaVar, alpha2, new D8.c(1));
                return aaVar;
            }
            bv.aa aaVar2 = bv.o.alpha;
            Intrinsics.charlie(aaVar2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return aaVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void charlie(D8.c cVar, s sVar, bv.aa aaVar, s sVar2, D8.c cVar2) {
        boolean z2;
        Z.c U4;
        Z.c cVar3;
        al alVar;
        boolean emerald = sVar2.charlie.emerald();
        boolean z10 = false;
        al alVar2 = sVar2.charlie;
        if (emerald && alVar2.cyan()) {
            z2 = false;
        } else {
            z2 = true;
        }
        Region region = (Region) cVar.purple;
        boolean isEmpty = region.isEmpty();
        int i4 = sVar.golf;
        int i5 = sVar2.golf;
        if (!isEmpty || i5 == i4) {
            if (!z2 || sVar2.echo) {
                InterfaceC2554n foxtrot = sVar2.foxtrot();
                if (foxtrot == null) {
                    U4 = ((C2563x) alVar2.f13305x.echo).U();
                } else {
                    T.r node = ((T.r) foxtrot).getNode();
                    if (delta(sVar2.delta, j.bravo) != null) {
                        z10 = true;
                    }
                    if (!node.getNode().isAttached()) {
                        U4 = Z.c.echo;
                    } else if (!z10) {
                        L echo = AbstractC2555o.echo(node, 8);
                        U4 = AbstractC2375K.hotel(echo).sierra(echo, true);
                    } else {
                        U4 = AbstractC2555o.echo(node, 8).U();
                    }
                }
                Q0.l bravo = AbstractC2618b7.bravo(U4);
                Region region2 = (Region) cVar2.purple;
                region2.set(bravo.alpha, bravo.bravo, bravo.charlie, bravo.delta);
                if (i5 == i4) {
                    i5 = -1;
                }
                if (region2.op(region, Region.Op.INTERSECT)) {
                    Rect bounds = region2.getBounds();
                    aaVar.hotel(i5, new t(sVar2, new Q0.l(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List juliet = s.juliet(4, sVar2);
                    for (int size = juliet.size() - 1; -1 < size; size--) {
                        if (!((s) juliet.get(size)).kilo().alpha.charlie(x.zulu)) {
                            charlie(cVar, sVar, aaVar, (s) juliet.get(size), cVar2);
                        }
                    }
                    if (foxtrot(sVar2)) {
                        region.op(bravo.alpha, bravo.bravo, bravo.charlie, bravo.delta, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (sVar2.echo) {
                    s lima = sVar2.lima();
                    if (lima != null && (alVar = lima.charlie) != null && alVar.emerald()) {
                        cVar3 = lima.golf();
                    } else {
                        cVar3 = alpha;
                    }
                    aaVar.hotel(i5, new t(sVar2, AbstractC2618b7.bravo(cVar3)));
                    return;
                }
                if (i5 == -1) {
                    Rect bounds2 = region2.getBounds();
                    aaVar.hotel(i5, new t(sVar2, new Q0.l(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    public static final Object delta(k kVar, ac acVar) {
        Object golf = kVar.alpha.golf(acVar);
        if (golf == null) {
            return l.purple.invoke();
        }
        return golf;
    }

    public static final boolean echo(s sVar) {
        boolean z2;
        L delta = sVar.delta();
        if (delta != null) {
            z2 = delta.I();
        } else {
            z2 = false;
        }
        if (!z2) {
            ac acVar = x.alpha;
            ac acVar2 = x.papa;
            k kVar = sVar.delta;
            if (!kVar.alpha.charlie(acVar2)) {
                if (!kVar.alpha.charlie(x.oscar)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public static final boolean foxtrot(s sVar) {
        if (!echo(sVar)) {
            k kVar = sVar.delta;
            if (!kVar.red) {
                bv.al alVar = kVar.alpha;
                Object[] objArr = alVar.bravo;
                Object[] objArr2 = alVar.charlie;
                long[] jArr = alVar.alpha;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j5 = jArr[i4];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i10 = 0; i10 < i5; i10++) {
                                if ((255 & j5) < 128) {
                                    int i11 = (i4 << 3) + i10;
                                    Object obj = objArr[i11];
                                    Object obj2 = objArr2[i11];
                                    if (((ac) obj).charlie) {
                                        return true;
                                    }
                                }
                                j5 >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
