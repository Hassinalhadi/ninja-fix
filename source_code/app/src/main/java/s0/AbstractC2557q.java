package s0;

import B9.C0058p;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.C2396o;
import q0.InterfaceC2402u;
import t0.C2946x;

/* renamed from: s0.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2557q {
    public static final S alpha = new S(1);

    public static final long alpha(float f5, boolean z2, boolean z10) {
        long j5;
        long floatToRawIntBits = Float.floatToRawIntBits(f5);
        long j6 = 0;
        if (z2) {
            j5 = 1;
        } else {
            j5 = 0;
        }
        if (z10) {
            j6 = 2;
        }
        return ((j5 | j6) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static final int bravo(at atVar, C2396o c2396o) {
        at f5 = atVar.f();
        if (f5 == null) {
            AbstractC2264a.bravo("Child of " + atVar + " cannot be null when calculating alignment line");
        }
        if (atVar.i().charlie().containsKey(c2396o)) {
            Integer num = (Integer) atVar.i().charlie().get(c2396o);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int magenta = f5.magenta(c2396o);
            if (magenta != Integer.MIN_VALUE) {
                f5.f13311c = true;
                atVar.f13312d = true;
                atVar.o();
                f5.f13311c = false;
                atVar.f13312d = false;
                if (c2396o instanceof C2396o) {
                    return magenta + ((int) (f5.k() & 4294967295L));
                }
                return magenta + ((int) (f5.k() >> 32));
            }
        }
        return RecyclerView.UNDEFINED_DURATION;
    }

    public static final T.r charlie(InterfaceC2554n interfaceC2554n, int i4) {
        T.r child$ui_release = interfaceC2554n.getNode().getChild$ui_release();
        if (child$ui_release != null && (child$ui_release.getAggregateChildKindSet$ui_release() & i4) != 0) {
            while (child$ui_release != null) {
                int kindSet$ui_release = child$ui_release.getKindSet$ui_release();
                if ((kindSet$ui_release & 2) == 0) {
                    if ((kindSet$ui_release & i4) != 0) {
                        return child$ui_release;
                    }
                    child$ui_release = child$ui_release.getChild$ui_release();
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    public static final int delta(long j5, long j6) {
        boolean kilo = kilo(j5);
        if (kilo != kilo(j6)) {
            if (!kilo) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(hotel(j5) - hotel(j6));
        if (Math.min(hotel(j5), hotel(j6)) >= 0.0f && juliet(j5) != juliet(j6)) {
            if (!juliet(j5)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object echo(InterfaceC2553m interfaceC2553m, androidx.compose.runtime.N n5) {
        if (!((T.r) interfaceC2553m).getNode().isAttached()) {
            AbstractC2264a.bravo("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        P.i iVar = (P.i) AbstractC2555o.golf(interfaceC2553m).f13301t;
        iVar.getClass();
        return C0564b.azure(iVar, n5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [T.r] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [T.r] */
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
    public static final j0 foxtrot(j0 j0Var) {
        C0058p c0058p;
        if (!j0Var.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = j0Var.getNode().getParent$ui_release();
        al golf = AbstractC2555o.golf(j0Var);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2556p abstractC2556p = parent$ui_release;
                        ?? r5 = 0;
                        while (abstractC2556p != 0) {
                            if (abstractC2556p instanceof j0) {
                                j0 j0Var2 = (j0) abstractC2556p;
                                if (Intrinsics.areEqual(j0Var.golf(), j0Var2.golf()) && j0Var.getClass() == j0Var2.getClass()) {
                                    return j0Var2;
                                }
                            } else if ((abstractC2556p.getKindSet$ui_release() & 262144) != 0 && (abstractC2556p instanceof AbstractC2556p)) {
                                T.r rVar = abstractC2556p.purple;
                                int i4 = 0;
                                abstractC2556p = abstractC2556p;
                                r5 = r5;
                                while (rVar != null) {
                                    if ((rVar.getKindSet$ui_release() & 262144) != 0) {
                                        i4++;
                                        r5 = r5;
                                        if (i4 == 1) {
                                            abstractC2556p = rVar;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new J.e(new T.r[16]);
                                            }
                                            if (abstractC2556p != 0) {
                                                r5.bravo(abstractC2556p);
                                                abstractC2556p = 0;
                                            }
                                            r5.bravo(rVar);
                                        }
                                    }
                                    rVar = rVar.getChild$ui_release();
                                    abstractC2556p = abstractC2556p;
                                    r5 = r5;
                                }
                                if (i4 == 1) {
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r5);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                parent$ui_release = (g0) c0058p.golf;
            } else {
                parent$ui_release = null;
            }
        }
        return null;
    }

    public static final ArrayList golf(InterfaceC2402u interfaceC2402u) {
        List mike;
        Intrinsics.charlie(interfaceC2402u, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        al plum = ((D) interfaceC2402u).plum();
        boolean lima = lima(plum);
        J.b bVar = (J.b) plum.papa();
        J.e eVar = (J.e) bVar.purple;
        ArrayList arrayList = new ArrayList(eVar.red);
        int i4 = eVar.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar = (al) bVar.get(i5);
            if (lima) {
                mike = alVar.lima();
            } else {
                mike = alVar.mike();
            }
            arrayList.add(mike);
        }
        return arrayList;
    }

    public static final float hotel(long j5) {
        return Float.intBitsToFloat((int) (j5 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void india(InterfaceC2558s interfaceC2558s) {
        if (((T.r) interfaceC2558s).getNode().isAttached()) {
            AbstractC2555o.echo(interfaceC2558s, 1).H();
        }
    }

    public static final boolean juliet(long j5) {
        if ((j5 & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean kilo(long j5) {
        if ((j5 & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean lima(al alVar) {
        int i4 = E.$EnumSwitchMapping$0[alVar.f13306y.delta.ordinal()];
        if (i4 == 1 || i4 == 2) {
            return true;
        }
        if (i4 != 3 && i4 != 4) {
            if (i4 == 5) {
                al victor = alVar.victor();
                if (victor != null) {
                    return lima(victor);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    public static final boolean mike(al alVar) {
        al alVar2;
        if (alVar.yellow != null) {
            al victor = alVar.victor();
            if (victor != null) {
                alVar2 = victor.yellow;
            } else {
                alVar2 = null;
            }
            if (alVar2 == null || alVar.f13306y.bravo) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void november(T.r rVar, Function0 function0) {
        Q ownerScope$ui_release = rVar.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new Q((P) rVar);
            rVar.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        ((C2946x) AbstractC2555o.hotel(rVar)).getSnapshotObserver().alpha(ownerScope$ui_release, Q.purple, function0);
    }

    public static final View oscar(InterfaceC2554n interfaceC2554n) {
        if (!interfaceC2554n.getNode().isAttached()) {
            AbstractC2264a.bravo("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) ao.alpha(AbstractC2555o.golf(interfaceC2554n));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [T.r] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [J.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [J.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final void papa(InterfaceC2554n interfaceC2554n, Object obj, Function1 function1) {
        C0058p c0058p;
        boolean z2;
        boolean z10;
        if (!interfaceC2554n.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = interfaceC2554n.getNode().getParent$ui_release();
        al golf = AbstractC2555o.golf(interfaceC2554n);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2556p abstractC2556p = parent$ui_release;
                        ?? r4 = 0;
                        while (abstractC2556p != 0) {
                            boolean z11 = true;
                            if (abstractC2556p instanceof j0) {
                                j0 j0Var = (j0) abstractC2556p;
                                if (Intrinsics.areEqual(obj, j0Var.golf())) {
                                    z11 = ((Boolean) function1.invoke(j0Var)).booleanValue();
                                }
                                if (!z11) {
                                    return;
                                }
                            } else {
                                if ((abstractC2556p.getKindSet$ui_release() & 262144) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar = abstractC2556p.purple;
                                    int i4 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r4 = r4;
                                    while (rVar != null) {
                                        if ((rVar.getKindSet$ui_release() & 262144) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i4++;
                                            r4 = r4;
                                            if (i4 == 1) {
                                                abstractC2556p = rVar;
                                            } else {
                                                if (r4 == 0) {
                                                    r4 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r4.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r4.bravo(rVar);
                                            }
                                        }
                                        rVar = rVar.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r4 = r4;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r4);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                parent$ui_release = (g0) c0058p.golf;
            } else {
                parent$ui_release = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [T.r] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [T.r] */
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
    public static final void quebec(j0 j0Var, Function1 function1) {
        C0058p c0058p;
        boolean z2;
        boolean z10;
        if (!j0Var.getNode().isAttached()) {
            AbstractC2264a.bravo("visitAncestors called on an unattached node");
        }
        T.r parent$ui_release = j0Var.getNode().getParent$ui_release();
        al golf = AbstractC2555o.golf(j0Var);
        while (golf != null) {
            if ((((T.r) golf.f13305x.delta).getAggregateChildKindSet$ui_release() & 262144) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & 262144) != 0) {
                        AbstractC2556p abstractC2556p = parent$ui_release;
                        ?? r5 = 0;
                        while (abstractC2556p != 0) {
                            boolean z11 = true;
                            if (abstractC2556p instanceof j0) {
                                j0 j0Var2 = (j0) abstractC2556p;
                                if (Intrinsics.areEqual(j0Var.golf(), j0Var2.golf()) && j0Var.getClass() == j0Var2.getClass()) {
                                    z11 = ((Boolean) function1.invoke(j0Var2)).booleanValue();
                                }
                                if (!z11) {
                                    return;
                                }
                            } else {
                                if ((abstractC2556p.getKindSet$ui_release() & 262144) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2 && (abstractC2556p instanceof AbstractC2556p)) {
                                    T.r rVar = abstractC2556p.purple;
                                    int i4 = 0;
                                    abstractC2556p = abstractC2556p;
                                    r5 = r5;
                                    while (rVar != null) {
                                        if ((rVar.getKindSet$ui_release() & 262144) != 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        if (z10) {
                                            i4++;
                                            r5 = r5;
                                            if (i4 == 1) {
                                                abstractC2556p = rVar;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new J.e(new T.r[16]);
                                                }
                                                if (abstractC2556p != 0) {
                                                    r5.bravo(abstractC2556p);
                                                    abstractC2556p = 0;
                                                }
                                                r5.bravo(rVar);
                                            }
                                        }
                                        rVar = rVar.getChild$ui_release();
                                        abstractC2556p = abstractC2556p;
                                        r5 = r5;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                            }
                            abstractC2556p = AbstractC2555o.bravo(r5);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            golf = golf.victor();
            if (golf != null && (c0058p = golf.f13305x) != null) {
                parent$ui_release = (g0) c0058p.golf;
            } else {
                parent$ui_release = null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, s0.j0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [T.r] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
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
    public static final void romeo(j0 j0Var, Function1 function1) {
        i0 i0Var;
        T.r rVar = (T.r) j0Var;
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
                                    j0 j0Var2 = (j0) abstractC2556p;
                                    if (Intrinsics.areEqual(j0Var.golf(), j0Var2.golf()) && j0Var.getClass() == j0Var2.getClass()) {
                                        i0Var = (i0) function1.invoke(j0Var2);
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
