package androidx.compose.runtime;

import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2777t5;

/* renamed from: androidx.compose.runtime.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0564b {
    public static final Object alpha = new Object();
    public static final ag bravo = new Object();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(O o5, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        G0 g02;
        boolean z2;
        al alVar;
        Q uniform;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-149765515);
        I mike = c0585q.mike();
        c0585q.peach(201, r.bravo);
        Object jade = c0585q.jade();
        if (Intrinsics.areEqual(jade, C0580l.alpha)) {
            g02 = null;
        } else {
            Intrinsics.charlie(jade, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            g02 = (G0) jade;
        }
        N n5 = o5.alpha;
        G0 charlie = n5.charlie(o5, g02);
        boolean areEqual = Intrinsics.areEqual(charlie, g02);
        if (!areEqual) {
            c0585q.f(charlie);
        }
        boolean z10 = false;
        if (c0585q.lime) {
            if (o5.foxtrot || !((P.i) mike).containsKey(n5)) {
                mike = ((P.i) mike).charlie(n5, charlie);
            }
            c0585q.emerald = true;
        } else {
            C0573f0 c0573f0 = c0585q.coral;
            Object bravo2 = c0573f0.bravo(c0573f0.golf, c0573f0.bravo);
            Intrinsics.charlie(bravo2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            I i5 = (I) bravo2;
            if ((c0585q.bronze() && areEqual) || (!o5.foxtrot && ((P.i) mike).containsKey(n5))) {
                if ((areEqual && !c0585q.whiskey) || !c0585q.whiskey) {
                    mike = i5;
                }
            } else {
                mike = ((P.i) mike).charlie(n5, charlie);
            }
            if (c0585q.yankee || i5 != mike) {
                z2 = true;
                if (z2 && !c0585q.lime) {
                    c0585q.indigo(mike);
                }
                boolean z11 = c0585q.whiskey;
                alVar = c0585q.xray;
                alVar.charlie(z11 ? 1 : 0);
                c0585q.whiskey = z2;
                c0585q.fuchsia = mike;
                c0585q.olive(202, 0, r.charlie, mike);
                lVar.invoke(c0585q, Integer.valueOf((i4 >> 3) & 14));
                c0585q.quebec(false);
                c0585q.quebec(false);
                if (alVar.bravo() != 0) {
                    z10 = true;
                }
                c0585q.whiskey = z10;
                c0585q.fuchsia = null;
                uniform = c0585q.uniform();
                if (uniform == null) {
                    uniform.delta = new Ec.aa(i4, 9, o5, lVar);
                    return;
                }
                return;
            }
        }
        z2 = false;
        if (z2) {
            c0585q.indigo(mike);
        }
        boolean z112 = c0585q.whiskey;
        alVar = c0585q.xray;
        alVar.charlie(z112 ? 1 : 0);
        c0585q.whiskey = z2;
        c0585q.fuchsia = mike;
        c0585q.olive(202, 0, r.charlie, mike);
        lVar.invoke(c0585q, Integer.valueOf((i4 >> 3) & 14));
        c0585q.quebec(false);
        c0585q.quebec(false);
        if (alVar.bravo() != 0) {
        }
        c0585q.whiskey = z10;
        c0585q.fuchsia = null;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final ax amber(Xd.l lVar, InterfaceC0581m interfaceC0581m, Object obj) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = zulu(obj);
            c0585q.f(jade);
        }
        ax axVar = (ax) jade;
        Unit unit = Unit.INSTANCE;
        boolean india = c0585q.india(lVar);
        Object jade2 = c0585q.jade();
        if (india || jade2 == asVar) {
            jade2 = new w0(lVar, axVar, null);
            c0585q.f(jade2);
        }
        foxtrot((Xd.l) jade2, c0585q, unit);
        return axVar;
    }

    public static final Object azure(I i4, N n5) {
        Intrinsics.charlie(n5, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        P.i iVar = (P.i) i4;
        Object obj = iVar.get(n5);
        if (obj == null) {
            obj = n5.bravo();
        }
        return ((G0) obj).alpha(iVar);
    }

    public static final C0584p beige(InterfaceC0581m interfaceC0581m) {
        C0583o c0583o;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.peach(206, r.echo);
        if (c0585q.lime) {
            j0.yankee(c0585q.cyan);
        }
        Object cyan = c0585q.cyan();
        if (cyan instanceof C0583o) {
            c0583o = (C0583o) cyan;
        } else {
            c0583o = null;
        }
        if (c0583o == null) {
            long j5 = c0585q.magenta;
            boolean z2 = c0585q.quebec;
            O7.j jVar = null;
            boolean z10 = c0585q.beige;
            C0590w c0590w = c0585q.hotel;
            if (c0590w == null) {
                c0590w = null;
            }
            if (c0590w != null) {
                jVar = c0590w.f3018m;
            }
            c0583o = new C0583o(new C0584p(c0585q, j5, z2, z10, jVar));
            c0585q.g(c0583o);
        }
        I mike = c0585q.mike();
        C0584p c0584p = c0583o.alpha;
        ((t0) c0584p.foxtrot).setValue(mike);
        c0585q.quebec(false);
        return c0584p;
    }

    public static final ax black(Object obj, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (jade == C0580l.alpha) {
            jade = zulu(obj);
            c0585q.f(jade);
        }
        ax axVar = (ax) jade;
        axVar.setValue(obj);
        return axVar;
    }

    public static final void blue(Xd.l lVar, InterfaceC0581m interfaceC0581m, Object obj) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (!c0585q.lime && Intrinsics.areEqual(c0585q.jade(), obj)) {
            return;
        }
        c0585q.f(obj);
        c0585q.bravo(obj, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, androidx.compose.runtime.I] */
    /* JADX WARN: Type inference failed for: r8v0, types: [Xd.l, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(O[] oArr, Xd.l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        P.i e;
        boolean z2;
        al alVar;
        Q uniform;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(415205898);
        I mike = c0585q.mike();
        c0585q.peach(201, r.bravo);
        boolean z10 = false;
        if (c0585q.lime) {
            e = c0585q.e(mike, emerald(oArr, mike, P.i.silver));
            c0585q.emerald = true;
        } else {
            C0573f0 c0573f0 = c0585q.coral;
            Object hotel = c0573f0.hotel(c0573f0.golf, 0);
            Intrinsics.charlie(hotel, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r12 = (I) hotel;
            C0573f0 c0573f02 = c0585q.coral;
            Object hotel2 = c0573f02.hotel(c0573f02.golf, 1);
            Intrinsics.charlie(hotel2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            I i5 = (I) hotel2;
            P.i emerald = emerald(oArr, mike, i5);
            if (c0585q.bronze() && !c0585q.yankee && Intrinsics.areEqual(i5, emerald)) {
                c0585q.lima = c0585q.coral.sierra() + c0585q.lima;
                e = r12;
            } else {
                e = c0585q.e(mike, emerald);
                if (c0585q.yankee || !Intrinsics.areEqual(e, r12)) {
                    z2 = true;
                    if (z2 && !c0585q.lime) {
                        c0585q.indigo(e);
                    }
                    boolean z11 = c0585q.whiskey;
                    alVar = c0585q.xray;
                    alVar.charlie(z11 ? 1 : 0);
                    c0585q.whiskey = z2;
                    c0585q.fuchsia = e;
                    c0585q.olive(202, 0, r.charlie, e);
                    lVar.invoke(c0585q, Integer.valueOf((i4 >> 3) & 14));
                    c0585q.quebec(false);
                    c0585q.quebec(false);
                    if (alVar.bravo() != 0) {
                        z10 = true;
                    }
                    c0585q.whiskey = z10;
                    c0585q.fuchsia = null;
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new Ec.aa(i4, 10, oArr, (Object) lVar);
                        return;
                    }
                    return;
                }
            }
        }
        z2 = false;
        if (z2) {
            c0585q.indigo(e);
        }
        boolean z112 = c0585q.whiskey;
        alVar = c0585q.xray;
        alVar.charlie(z112 ? 1 : 0);
        c0585q.whiskey = z2;
        c0585q.fuchsia = e;
        c0585q.olive(202, 0, r.charlie, e);
        lVar.invoke(c0585q, Integer.valueOf((i4 >> 3) & 14));
        c0585q.quebec(false);
        c0585q.quebec(false);
        if (alVar.bravo() != 0) {
        }
        c0585q.whiskey = z10;
        c0585q.fuchsia = null;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final C1.t bronze(Function0 function0) {
        return new C1.t(new B0(function0, null));
    }

    public static final void charlie(Object obj, Object obj2, Function1 function1, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean golf = c0585q.golf(obj) | c0585q.golf(obj2);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new ae(function1);
            c0585q.f(jade);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.E0, androidx.compose.runtime.N] */
    public static final E0 coral(Function0 function0) {
        return new N(function0);
    }

    public static final int crimson(bv.z zVar) {
        int alpha2;
        int i4 = zVar.bravo;
        int alpha3 = zVar.alpha(0);
        while (zVar.bravo != 0 && zVar.alpha(0) == alpha3) {
            zVar.foxtrot(0, zVar.bravo());
            zVar.echo(zVar.bravo - 1);
            int i5 = zVar.bravo;
            int i10 = i5 >>> 1;
            int i11 = 0;
            while (i11 < i10) {
                int alpha4 = zVar.alpha(i11);
                int i12 = (i11 + 1) * 2;
                int i13 = i12 - 1;
                int alpha5 = zVar.alpha(i13);
                if (i12 < i5 && (alpha2 = zVar.alpha(i12)) > alpha5) {
                    if (alpha2 > alpha4) {
                        zVar.foxtrot(i11, alpha2);
                        zVar.foxtrot(i12, alpha4);
                        i11 = i12;
                    }
                } else if (alpha5 > alpha4) {
                    zVar.foxtrot(i11, alpha5);
                    zVar.foxtrot(i13, alpha4);
                    i11 = i13;
                }
            }
        }
        return alpha3;
    }

    public static final int cyan(int i4) {
        int i5 = 306783378 & i4;
        int i10 = 613566756 & i4;
        return (i4 & (-920350135)) | (i10 >> 1) | i5 | ((i5 << 1) & i10);
    }

    public static final void delta(Object obj, Function1 function1, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean golf = c0585q.golf(obj);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new ae(function1);
            c0585q.f(jade);
        }
    }

    public static final void echo(Object[] objArr, Function1 function1, InterfaceC0581m interfaceC0581m) {
        boolean z2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= ((C0585q) interfaceC0581m).golf(obj);
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        Object jade = c0585q.jade();
        if (!z2 && jade != C0580l.alpha) {
            return;
        }
        c0585q.f(new ae(function1));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [M.e, P.h] */
    public static final P.i emerald(O[] oArr, I i4, I i5) {
        P.i iVar = P.i.silver;
        ?? eVar = new M.e(iVar);
        eVar.yellow = iVar;
        for (O o5 : oArr) {
            N n5 = o5.alpha;
            if (o5.foxtrot || !((P.i) i4).containsKey(n5)) {
                eVar.put(n5, n5.charlie(o5, (G0) ((P.i) i5).get(n5)));
            }
        }
        return eVar.build();
    }

    public static final void foxtrot(Xd.l lVar, InterfaceC0581m interfaceC0581m, Object obj) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Nd.h hVar = c0585q.lavender;
        boolean golf = c0585q.golf(obj);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new aq(hVar, lVar);
            c0585q.f(jade);
        }
    }

    public static final void golf(Object obj, Object obj2, Xd.l lVar, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Nd.h hVar = c0585q.lavender;
        boolean golf = c0585q.golf(obj) | c0585q.golf(obj2);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new aq(hVar, lVar);
            c0585q.f(jade);
        }
    }

    public static final void hotel(Object obj, Object obj2, Object obj3, Xd.l lVar, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Nd.h hVar = c0585q.lavender;
        boolean golf = c0585q.golf(obj) | c0585q.golf(obj2) | c0585q.golf(obj3);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new aq(hVar, lVar);
            c0585q.f(jade);
        }
    }

    public static final void india(Object[] objArr, Xd.l lVar, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Nd.h hVar = c0585q.lavender;
        boolean z2 = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z2 |= c0585q.golf(obj);
        }
        Object jade = c0585q.jade();
        if (!z2 && jade != C0580l.alpha) {
            return;
        }
        c0585q.f(new aq(hVar, lVar));
    }

    public static final void juliet(Function0 function0, InterfaceC0581m interfaceC0581m) {
        I.a aVar = ((C0585q) interfaceC0581m).gray.bravo;
        aVar.getClass();
        I.ab abVar = I.ab.delta;
        I.am amVar = aVar.alpha;
        amVar.foxtrot(abVar);
        AbstractC2777t5.bravo(amVar, 0, function0);
    }

    public static final void kilo(bv.z zVar, int i4) {
        if (zVar.bravo != 0 && (zVar.alpha(0) == i4 || zVar.alpha(zVar.bravo - 1) == i4)) {
            return;
        }
        int i5 = zVar.bravo;
        zVar.charlie(i4);
        while (i5 > 0) {
            int i10 = ((i5 + 1) >>> 1) - 1;
            int alpha2 = zVar.alpha(i10);
            if (i4 <= alpha2) {
                break;
            }
            zVar.foxtrot(i5, alpha2);
            i5 = i10;
        }
        zVar.foxtrot(i5, i4);
    }

    public static void lima(j0 j0Var, List list, C0590w c0590w) {
        Object obj;
        Q q4;
        if (!list.isEmpty()) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                int charlie = j0Var.charlie((C0562a) list.get(i4));
                int gray = j0Var.gray(j0Var.romeo(charlie), j0Var.bravo);
                if (gray < j0Var.golf(j0Var.romeo(charlie + 1), j0Var.bravo)) {
                    obj = j0Var.charlie[j0Var.hotel(gray)];
                } else {
                    obj = C0580l.alpha;
                }
                if (obj instanceof Q) {
                    q4 = (Q) obj;
                } else {
                    q4 = null;
                }
                if (q4 != null) {
                    q4.alpha = c0590w;
                }
            }
        }
    }

    public static final ax mike(yf.L l10, InterfaceC0581m interfaceC0581m, int i4) {
        Nd.i iVar = Nd.i.alpha;
        Object value = l10.getValue();
        C0585q c0585q = (C0585q) interfaceC0581m;
        boolean india = c0585q.india(iVar) | c0585q.india(l10);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (india || jade == asVar) {
            jade = new A0(iVar, l10, null);
            c0585q.f(jade);
        }
        Xd.l lVar = (Xd.l) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = zulu(value);
            c0585q.f(jade2);
        }
        ax axVar = (ax) jade2;
        boolean india2 = c0585q.india(lVar);
        Object jade3 = c0585q.jade();
        if (india2 || jade3 == asVar) {
            jade3 = new x0(lVar, axVar, null);
            c0585q.f(jade3);
        }
        golf(l10, iVar, (Xd.l) jade3, c0585q);
        return axVar;
    }

    public static final vf.ab november(InterfaceC0581m interfaceC0581m) {
        return new C0569d0(((C0585q) interfaceC0581m).lavender);
    }

    public static final J.e oscar() {
        C1915c c1915c = v0.bravo;
        J.e eVar = (J.e) c1915c.mike();
        if (eVar == null) {
            J.e eVar2 = new J.e(new S.v[0]);
            c1915c.yankee(eVar2);
            return eVar2;
        }
        return eVar;
    }

    public static final ad papa(u0 u0Var, Function0 function0) {
        C1915c c1915c = v0.alpha;
        return new ad(u0Var, function0);
    }

    public static final ad quebec(Function0 function0) {
        C1915c c1915c = v0.alpha;
        return new ad(null, function0);
    }

    public static final int romeo(InterfaceC0581m interfaceC0581m) {
        long j5 = ((C0585q) interfaceC0581m).magenta;
        return (int) (j5 ^ (j5 >>> 32));
    }

    public static final at sierra(Nd.h hVar) {
        at atVar = (at) hVar.get(as.purple);
        if (atVar != null) {
            return atVar;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void tango() {
        throw new IllegalStateException("Invalid applier");
    }

    public static List uniform(j0 j0Var, int i4, j0 j0Var2, boolean z2, boolean z10, boolean z11) {
        boolean z12;
        List list;
        boolean crimson;
        boolean z13;
        int i5;
        int i10;
        int tango = j0Var.tango(i4);
        int i11 = i4 + tango;
        int foxtrot = j0Var.foxtrot(i4);
        int foxtrot2 = j0Var.foxtrot(i11);
        int i12 = foxtrot2 - foxtrot;
        if (i4 >= 0 && (j0Var.bravo[(j0Var.romeo(i4) * 5) + 1] & 201326592) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        j0Var2.victor(tango);
        j0Var2.whiskey(i12, j0Var2.tango);
        if (j0Var.golf < i11) {
            j0Var.amber(i11);
        }
        if (j0Var.kilo < foxtrot2) {
            j0Var.azure(foxtrot2, i11);
        }
        int[] iArr = j0Var2.bravo;
        int i13 = j0Var2.tango;
        int i14 = i13 * 5;
        ArraysKt.zulu(i14, i4 * 5, j0Var.bravo, iArr, i11 * 5);
        Object[] objArr = j0Var2.charlie;
        int i15 = j0Var2.india;
        System.arraycopy(j0Var.charlie, foxtrot, objArr, i15, i12);
        int i16 = j0Var2.victor;
        iArr[i14 + 2] = i16;
        int i17 = i13 - i4;
        int i18 = 1;
        int i19 = i13 + tango;
        int golf = i15 - j0Var2.golf(i13, iArr);
        int i20 = j0Var2.mike;
        int i21 = j0Var2.lima;
        int length = objArr.length;
        boolean z14 = z12;
        int i22 = i20;
        int i23 = i13;
        while (i23 < i19) {
            if (i23 != i13) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i17;
            }
            int[] iArr2 = iArr;
            int golf2 = j0Var2.golf(i23, iArr) + golf;
            if (i22 < i23) {
                i5 = i13;
                i10 = 0;
            } else {
                i5 = i13;
                i10 = j0Var2.kilo;
            }
            iArr2[(i23 * 5) + 4] = j0.india(golf2, i10, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i13 = i5;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        j0Var2.mike = i22;
        int bravo2 = i0.bravo(j0Var.delta, i4, j0Var.papa());
        int bravo3 = i0.bravo(j0Var.delta, i11, j0Var.papa());
        if (bravo2 < bravo3) {
            ArrayList arrayList = j0Var.delta;
            ArrayList arrayList2 = new ArrayList(bravo3 - bravo2);
            for (int i25 = bravo2; i25 < bravo3; i25++) {
                C0562a c0562a = (C0562a) arrayList.get(i25);
                c0562a.alpha += i17;
                arrayList2.add(c0562a);
            }
            j0Var2.delta.addAll(i0.bravo(j0Var2.delta, j0Var2.tango, j0Var2.papa()), arrayList2);
            arrayList.subList(bravo2, bravo3).clear();
            list = arrayList2;
        } else {
            list = CollectionsKt.emptyList();
        }
        if (!list.isEmpty()) {
            HashMap hashMap = j0Var.echo;
            HashMap hashMap2 = j0Var2.echo;
            if (hashMap != null && hashMap2 != null) {
                int size = list.size();
                for (int i26 = 0; i26 < size; i26++) {
                }
            }
        }
        int i27 = j0Var2.victor;
        j0Var2.green(i16);
        int black = j0Var.black(i4, j0Var.bravo);
        if (!z11) {
            crimson = false;
        } else if (z2) {
            if (black >= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                j0Var.indigo();
                j0Var.alpha(black - j0Var.tango);
                j0Var.indigo();
            }
            j0Var.alpha(i4 - j0Var.tango);
            boolean coral = j0Var.coral();
            if (z13) {
                j0Var.gold();
                j0Var.juliet();
                j0Var.gold();
                j0Var.juliet();
            }
            crimson = coral;
        } else {
            crimson = j0Var.crimson(i4, tango);
            j0Var.cyan(foxtrot, i12, i4 - 1);
        }
        if (crimson) {
            r.charlie("Unexpectedly removed anchors");
        }
        int i28 = j0Var2.oscar;
        int i29 = iArr3[i14 + 1];
        if ((1073741824 & i29) == 0) {
            i18 = i29 & 67108863;
        }
        j0Var2.oscar = i28 + i18;
        if (z10) {
            j0Var2.tango = i19;
            j0Var2.india = i15 + i12;
        }
        if (z14) {
            j0Var2.lime(i16);
        }
        return list;
    }

    public static final aw victor(float f5) {
        return new ParcelableSnapshotMutableFloatState(f5);
    }

    public static final p0 whiskey(int i4) {
        return new ParcelableSnapshotMutableIntState(i4);
    }

    public static final r0 xray(long j5) {
        return new ParcelableSnapshotMutableLongState(j5);
    }

    public static final ax yankee(Object obj, u0 u0Var) {
        return new t0(obj, u0Var);
    }

    public static ax zulu(Object obj) {
        return new t0(obj, as.white);
    }
}
