package androidx.compose.animation;

import F.N1;
import P.d;
import P.e;
import T.f;
import T.k;
import T.p;
import T.r;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.C;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import ao.ad;
import bv.al;
import bv.au;
import bx.C0765c;
import bx.C0766d;
import bx.C0767e;
import bx.C0771i;
import bx.C0774l;
import bx.ae;
import bz.AbstractC0779d;
import bz.U;
import bz.a0;
import bz.e0;
import bz.g0;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.F;
import s0.InterfaceC2552l;
import t0.C2915g0;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public abstract class a {
    public static final long alpha;
    public static final /* synthetic */ int bravo = 0;

    static {
        long j5 = RecyclerView.UNDEFINED_DURATION;
        alpha = (j5 & 4294967295L) | (j5 << 32);
    }

    public static final void alpha(a0 a0Var, s sVar, Function1 function1, f fVar, Function1 function12, d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        Function1 function13;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        boolean z12;
        bx.s sVar2;
        Object obj;
        SnapshotStateList snapshotStateList;
        final bx.s sVar3;
        final U u4;
        boolean z13;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Function1 function14 = function1;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(511725103);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(a0Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.india(function14)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.golf(fVar)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q2.india(function12)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        d dVar2 = dVar;
        if ((196608 & i4) == 0) {
            if (c0585q2.india(dVar2)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i5 & 1, z2)) {
            s sVar4 = p.alpha;
            Object obj2 = C0580l.alpha;
            int i17 = i5 & 14;
            if (i17 == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            if (z10 || jade == obj2) {
                jade = new bx.s(a0Var, fVar);
                c0585q2.f(jade);
            }
            bx.s sVar5 = (bx.s) jade;
            if (i17 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade2 = c0585q2.jade();
            if (z11 || jade2 == obj2) {
                Object[] objArr = {a0Var.alpha.L()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(ArraysKt.b(objArr));
                c0585q2.f(snapshotStateList2);
                jade2 = snapshotStateList2;
            }
            SnapshotStateList snapshotStateList3 = (SnapshotStateList) jade2;
            if (i17 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object jade3 = c0585q2.jade();
            if (z12 || jade3 == obj2) {
                long[] jArr = au.alpha;
                jade3 = new al();
                c0585q2.f(jade3);
            }
            al alVar = (al) jade3;
            boolean contains = snapshotStateList3.contains(a0Var.alpha.L());
            G3.a aVar = a0Var.alpha;
            if (!contains) {
                snapshotStateList3.clear();
                snapshotStateList3.add(aVar.L());
            }
            Object L4 = aVar.L();
            t0 t0Var = (t0) a0Var.delta;
            if (Intrinsics.areEqual(L4, t0Var.getValue())) {
                if (snapshotStateList3.size() != 1 || !Intrinsics.areEqual(snapshotStateList3.get(0), aVar.L())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(aVar.L());
                }
                if (alVar.echo != 1 || alVar.charlie(aVar.L())) {
                    alVar.alpha();
                }
                sVar5.bravo = fVar;
            }
            if (!Intrinsics.areEqual(aVar.L(), t0Var.getValue()) && !snapshotStateList3.contains(t0Var.getValue())) {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i18 = 0;
                while (true) {
                    Ld.a aVar2 = (Ld.a) listIterator;
                    ListIterator listIterator2 = listIterator;
                    if (aVar2.hasNext()) {
                        Object invoke = function12.invoke(aVar2.next());
                        int i19 = i18;
                        if (Intrinsics.areEqual(invoke, function12.invoke(t0Var.getValue()))) {
                            i10 = i19;
                            break;
                        } else {
                            i18 = i19 + 1;
                            listIterator = listIterator2;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    snapshotStateList3.add(t0Var.getValue());
                } else {
                    snapshotStateList3.set(i10, t0Var.getValue());
                }
            }
            if (alVar.charlie(t0Var.getValue()) && alVar.charlie(aVar.L())) {
                c0585q2.purple(1969054067);
                c0585q2.quebec(false);
                function13 = function14;
                sVar2 = sVar5;
                obj = obj2;
            } else {
                c0585q2.purple(1966468977);
                alVar.alpha();
                int size = snapshotStateList3.size();
                for (int i20 = 0; i20 < size; i20++) {
                    Object obj3 = snapshotStateList3.get(i20);
                    bx.s sVar6 = sVar5;
                    alVar.mike(obj3, e.echo(-23915175, new C0771i(a0Var, obj3, function14, sVar6, snapshotStateList3, dVar2), c0585q2));
                    function14 = function14;
                    obj2 = obj2;
                    dVar2 = dVar;
                    sVar5 = sVar6;
                }
                function13 = function14;
                sVar2 = sVar5;
                obj = obj2;
                c0585q2.quebec(false);
            }
            boolean golf = c0585q2.golf(a0Var.foxtrot()) | c0585q2.golf(sVar2);
            Object jade4 = c0585q2.jade();
            if (golf || jade4 == obj) {
                jade4 = (ae) function13.invoke(sVar2);
                c0585q2.f(jade4);
            }
            ae aeVar = (ae) jade4;
            sVar2.getClass();
            boolean golf2 = c0585q2.golf(sVar2);
            Object jade5 = c0585q2.jade();
            if (golf2 || jade5 == obj) {
                jade5 = C0564b.zulu(Boolean.FALSE);
                c0585q2.f(jade5);
            }
            ax axVar = (ax) jade5;
            final ax black = C0564b.black(aeVar.delta, c0585q2);
            a0 a0Var2 = sVar2.alpha;
            if (Intrinsics.areEqual(a0Var2.alpha.L(), ((t0) a0Var2.delta).getValue())) {
                axVar.setValue(Boolean.FALSE);
            } else if (black.getValue() != null) {
                axVar.setValue(Boolean.TRUE);
            }
            if (((Boolean) axVar.getValue()).booleanValue()) {
                c0585q2.purple(1353180665);
                g0 g0Var = AbstractC0779d.quebec;
                bx.s sVar7 = sVar2;
                a0 a0Var3 = sVar7.alpha;
                snapshotStateList = snapshotStateList3;
                sVar3 = sVar7;
                c0585q = c0585q2;
                u4 = e0.bravo(a0Var3, g0Var, null, c0585q, 0, 2);
                boolean golf3 = c0585q.golf(u4);
                Object jade6 = c0585q.jade();
                if (golf3 || jade6 == obj) {
                    jade6 = AbstractC3087z.bravo(sVar4);
                    c0585q.f(jade6);
                }
                sVar4 = (s) jade6;
                c0585q.quebec(false);
            } else {
                snapshotStateList = snapshotStateList3;
                c0585q = c0585q2;
                sVar3 = sVar2;
                c0585q.purple(1353446707);
                c0585q.quebec(false);
                u4 = null;
            }
            s then = sVar.then(sVar4.then(new F(u4, black, sVar3) { // from class: androidx.compose.animation.AnimatedContentTransitionScopeImpl$SizeModifierElement
                public final U alpha;
                public final ax purple;
                public final bx.s red;

                {
                    this.alpha = u4;
                    this.purple = black;
                    this.red = sVar3;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.C, bx.r, T.r] */
                @Override // s0.F
                public final r create() {
                    ?? c3 = new C(1);
                    c3.purple = this.alpha;
                    c3.red = this.purple;
                    c3.silver = this.red;
                    c3.teal = a.alpha;
                    return c3;
                }

                public final boolean equals(Object obj4) {
                    if (obj4 instanceof AnimatedContentTransitionScopeImpl$SizeModifierElement) {
                        AnimatedContentTransitionScopeImpl$SizeModifierElement animatedContentTransitionScopeImpl$SizeModifierElement = (AnimatedContentTransitionScopeImpl$SizeModifierElement) obj4;
                        if (Intrinsics.areEqual(animatedContentTransitionScopeImpl$SizeModifierElement.alpha, this.alpha) && Intrinsics.areEqual(animatedContentTransitionScopeImpl$SizeModifierElement.purple, this.purple)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }

                public final int hashCode() {
                    int i21;
                    int hashCode = this.red.hashCode() * 31;
                    U u10 = this.alpha;
                    if (u10 != null) {
                        i21 = u10.hashCode();
                    } else {
                        i21 = 0;
                    }
                    return this.purple.hashCode() + ((hashCode + i21) * 31);
                }

                @Override // s0.F
                public final void inspectableProperties(C2915g0 c2915g0) {
                    c2915g0.alpha = "sizeTransform";
                    o oVar = c2915g0.charlie;
                    oVar.bravo(this.alpha, "sizeAnimation");
                    oVar.bravo(this.purple, "sizeTransform");
                    oVar.bravo(this.red, "scope");
                }

                @Override // s0.F
                public final void update(r rVar) {
                    bx.r rVar2 = (bx.r) rVar;
                    rVar2.purple = this.alpha;
                    rVar2.red = this.purple;
                    rVar2.silver = this.red;
                }
            }));
            Object jade7 = c0585q.jade();
            if (jade7 == obj) {
                jade7 = new C0774l(sVar3);
                c0585q.f(jade7);
            }
            C0774l c0774l = (C0774l) jade7;
            long j5 = c0585q.magenta;
            int i21 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(then, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, c0774l);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                ad.blue(i21, c0585q, i21, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            c0585q.purple(-860173498);
            int size2 = snapshotStateList.size();
            int i22 = 0;
            while (i22 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj4 = snapshotStateList4.get(i22);
                c0585q.pink(-2026002954, function12.invoke(obj4));
                l lVar = (l) alVar.golf(obj4);
                if (lVar == null) {
                    c0585q.purple(1618454323);
                    z13 = false;
                } else {
                    z13 = false;
                    c0585q.purple(-2026001778);
                    lVar.invoke(c0585q, 0);
                }
                c0585q.quebec(z13);
                c0585q.quebec(z13);
                i22++;
                snapshotStateList = snapshotStateList4;
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            function13 = function14;
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new N1(a0Var, sVar, function13, fVar, function12, dVar, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(Boolean bool, p pVar, Function1 function1, k kVar, String str, Function1 function12, d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        String str2;
        int i11;
        int i12;
        boolean z2;
        p pVar2;
        Function1 function13;
        k kVar2;
        Function1 function14;
        Q uniform;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1501828832);
        if (c0585q.golf(bool)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i4;
        int i14 = i13 | 3504;
        int i15 = i5 & 16;
        if (i15 != 0) {
            i14 = i13 | 28080;
        } else if ((i4 & 24576) == 0) {
            str2 = str;
            if (c0585q.golf(str2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i14 |= i11;
            i12 = i14 | 196608;
            if ((599187 & i12) == 599186) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i12 & 1, z2)) {
                p pVar3 = p.alpha;
                Object obj = C0580l.alpha;
                Object jade = c0585q.jade();
                if (jade == obj) {
                    jade = C0765c.alpha;
                    c0585q.f(jade);
                }
                Function1 function15 = (Function1) jade;
                k kVar3 = T.d.alpha;
                if (i15 != 0) {
                    str2 = "AnimatedContent";
                }
                Object jade2 = c0585q.jade();
                if (jade2 == obj) {
                    jade2 = C0766d.alpha;
                    c0585q.f(jade2);
                }
                Function1 function16 = (Function1) jade2;
                alpha(e0.echo(bool, str2, c0585q, ((i12 >> 9) & 112) | (i12 & 14), 0), pVar3, function15, kVar3, function16, dVar, c0585q, 224688);
                pVar2 = pVar3;
                function13 = function15;
                kVar2 = kVar3;
                function14 = function16;
            } else {
                c0585q.ochre();
                pVar2 = pVar;
                function13 = function1;
                kVar2 = kVar;
                function14 = function12;
            }
            String str3 = str2;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C0767e(bool, pVar2, function13, kVar2, str3, function14, dVar, i4, i5);
                return;
            }
            return;
        }
        str2 = str;
        i12 = i14 | 196608;
        if ((599187 & i12) == 599186) {
        }
        if (!c0585q.magenta(i12 & 1, z2)) {
        }
        String str32 = str2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
