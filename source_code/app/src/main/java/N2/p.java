package N2;

import Lb.am;
import a0.C0352f;
import android.content.Context;
import android.os.Trace;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0549o;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0571e0;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import androidx.compose.runtime.t0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bv.al;
import bx.C0768f;
import coil.compose.ContentPainterElement;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.InterfaceC2392k;
import q0.av;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2743p6;
import t0.AbstractC2913f0;
import t6.AbstractC3087z;

/* loaded from: classes3.dex */
public abstract class p {
    public static final o alpha = new Object();
    public static final y bravo = new Object();

    public static final void alpha(q qVar, String str, T.s sVar, Function1 function1, ae aeVar, T.f fVar, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        Function1 function12;
        T.f fVar2;
        int i11;
        T.s sVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-421592773);
        if ((i4 & 14) == 0) {
            if (c0585q.golf(qVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i10 = i22 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 112) == 0) {
            if (c0585q.golf(str)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i10 |= i21;
        }
        if ((i4 & 896) == 0) {
            if (c0585q.golf(sVar)) {
                i20 = Barcode.FORMAT_QR_CODE;
            } else {
                i20 = 128;
            }
            i10 |= i20;
        }
        if ((i4 & 7168) == 0) {
            function12 = function1;
            if (c0585q.india(function12)) {
                i19 = 2048;
            } else {
                i19 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i19;
        } else {
            function12 = function1;
        }
        if ((i4 & 57344) == 0) {
            if (c0585q.india(aeVar)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i10 |= i18;
        }
        if ((i4 & 458752) == 0) {
            fVar2 = fVar;
            if (c0585q.golf(fVar2)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i10 |= i17;
        } else {
            fVar2 = fVar;
        }
        if ((i4 & 3670016) == 0) {
            if (c0585q.golf(interfaceC2392k)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i10 |= i16;
        }
        if ((i4 & 29360128) == 0) {
            if (c0585q.delta(1.0f)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i10 |= i15;
        }
        if ((234881024 & i4) == 0) {
            if (c0585q.golf(null)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i10 |= i14;
        }
        if ((1879048192 & i4) == 0) {
            if (c0585q.echo(1)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i10 |= i13;
        }
        if ((i5 & 14) == 0) {
            if (c0585q.hotel(true)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i5 | i12;
        } else {
            i11 = i5;
        }
        if ((1533916891 & i10) == 306783378 && (i11 & 11) == 2 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            X2.h bravo2 = af.bravo(qVar.alpha, interfaceC2392k, c0585q);
            int i23 = i10 >> 6;
            int i24 = i23 & 57344;
            n india = india(bravo2, qVar.charlie, function12, aeVar, interfaceC2392k, c0585q, 0);
            Y2.i iVar = bravo2.victor;
            if (iVar instanceof v) {
                sVar2 = sVar.then((T.s) iVar);
            } else {
                sVar2 = sVar;
            }
            delta(sVar2, india, str, fVar2, interfaceC2392k, c0585q, ((i10 << 3) & 896) | (i23 & 7168) | i24 | (i23 & 458752) | (i23 & 3670016) | ((i11 << 21) & 29360128));
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a(qVar, str, sVar, function1, aeVar, fVar, interfaceC2392k, i4, i5, 0);
        }
    }

    public static final void bravo(Object obj, String str, T.s sVar, AbstractC1680b abstractC1680b, AbstractC1680b abstractC1680b2, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        Function1 acVar;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1693837359);
        if ((i5 & 8) != 0) {
            abstractC1680b = null;
        }
        T.k kVar = T.d.teal;
        y yVar = bravo;
        M2.f hotel = hotel(z.alpha, c0585q);
        int i10 = i4 << 3;
        int i11 = (i4 & 112) | 2392584 | (i10 & 7168) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192);
        int i12 = ((i4 >> 27) & 14) | 48;
        c0585q.red(-1481548872);
        q qVar = new q(obj, yVar, hotel);
        Y2.e eVar = af.bravo;
        if (abstractC1680b == null && abstractC1680b2 == null && abstractC1680b2 == null) {
            acVar = n.f1858j;
        } else {
            acVar = new Cb.ac(abstractC1680b, abstractC1680b2, abstractC1680b2, 5);
        }
        alpha(qVar, str, sVar, acVar, null, kVar, interfaceC2392k, c0585q, (i11 & 112) | ((i11 >> 3) & 896) | ((i12 << 15) & 458752) | 1572864, 0);
        c0585q.quebec(false);
        c0585q.quebec(false);
    }

    public static final void charlie(Object obj, String str, T.s sVar, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1451072229);
        am amVar = n.f1858j;
        T.k kVar = T.d.teal;
        y yVar = bravo;
        M2.f hotel = hotel(z.alpha, c0585q);
        int i5 = i4 << 3;
        int i10 = (i4 & 112) | 520 | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192);
        c0585q.red(2032051394);
        q qVar = new q(obj, yVar, hotel);
        int i11 = i10 >> 3;
        alpha(qVar, str, sVar, amVar, null, kVar, interfaceC2392k, c0585q, (i10 & 112) | (i11 & 896) | (i11 & 7168) | (i11 & 57344) | (i11 & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | ((((i4 >> 27) & 14) << 27) & 1879048192), 0);
        c0585q.quebec(false);
        c0585q.quebec(false);
    }

    public static final void delta(T.s sVar, n nVar, String str, T.f fVar, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        T.s sVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(777774312);
        if ((i4 & 14) == 0) {
            if (c0585q.golf(sVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i5 = i17 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            if (c0585q.golf(nVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i5 |= i16;
        }
        if ((i4 & 896) == 0) {
            if (c0585q.golf(str)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i5 |= i15;
        }
        if ((i4 & 7168) == 0) {
            if (c0585q.golf(fVar)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i14;
        }
        if ((57344 & i4) == 0) {
            if (c0585q.golf(interfaceC2392k)) {
                i13 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i13 = 8192;
            }
            i5 |= i13;
        }
        if ((458752 & i4) == 0) {
            if (c0585q.delta(1.0f)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i5 |= i12;
        }
        if ((3670016 & i4) == 0) {
            if (c0585q.golf(null)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        if ((29360128 & i4) == 0) {
            if (c0585q.hotel(true)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i5 |= i10;
        }
        if ((i5 & 23967451) == 4793490 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            Y2.e eVar = af.bravo;
            if (str != null) {
                sVar2 = A0.o.bravo(sVar, false, new Lb.ae(str, 5));
            } else {
                sVar2 = sVar;
            }
            T.s then = AbstractC3087z.bravo(sVar2).then(new ContentPainterElement(nVar, fVar, interfaceC2392k, 1.0f));
            c cVar = c.bravo;
            c0585q.red(544976794);
            int romeo = C0564b.romeo(c0585q);
            T.s charlie = T.a.charlie(then, c0585q);
            I mike = c0585q.mike();
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.red(1405779621);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(new b(c2550j, 0));
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, cVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C0564b.blue(C2551k.delta, c0585q, charlie);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            A0.z.papa(c0585q, true, false, false);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.b(sVar, nVar, str, fVar, interfaceC2392k, i4, 1);
        }
    }

    public static final void echo(Object obj, T.s sVar, P.d dVar, P.d dVar2, Function1 function1, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        P.d dVar3;
        P.d dVar4;
        Function1 function12;
        P.d dVar5;
        int i10 = 0;
        av avVar = C2391j.alpha;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(-1555574782);
        am amVar = n.f1858j;
        ae aeVar = null;
        if ((i5 & 16) != 0) {
            dVar3 = null;
        } else {
            dVar3 = dVar;
        }
        if ((i5 & 64) != 0) {
            dVar4 = null;
        } else {
            dVar4 = dVar2;
        }
        if ((i5 & Barcode.FORMAT_QR_CODE) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        T.k kVar = T.d.teal;
        y yVar = bravo;
        M2.f hotel = hotel(z.alpha, c0585q);
        int i11 = i4 << 3;
        int i12 = (i4 & 112) | 520 | (i11 & 7168) | (57344 & i11) | (458752 & i11) | (3670016 & i11) | (29360128 & i11) | (234881024 & i11) | (i11 & 1879048192);
        c0585q.red(-1545157471);
        q qVar = new q(obj, yVar, hotel);
        Y2.e eVar = af.bravo;
        if (function12 != null) {
            aeVar = new ae(i10, function12);
        }
        ae aeVar2 = aeVar;
        if (dVar3 == null && dVar4 == null) {
            dVar5 = s.alpha;
        } else {
            dVar5 = new P.d(new ad(i10, dVar3, dVar4), 750771424, true);
        }
        int i13 = i12 >> 3;
        foxtrot(qVar, null, sVar, amVar, aeVar2, kVar, avVar, dVar5, c0585q, (i12 & 112) | (i13 & 896) | (i13 & 7168) | 1572864, 0);
        c0585q.quebec(false);
        c0585q.quebec(false);
    }

    public static final void foxtrot(q qVar, String str, T.s sVar, Function1 function1, ae aeVar, T.f fVar, InterfaceC2392k interfaceC2392k, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        ae aeVar2;
        int i11;
        P.d dVar2;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-605638725);
        if ((i4 & 14) == 0) {
            if (c0585q.golf(qVar)) {
                i22 = 4;
            } else {
                i22 = 2;
            }
            i10 = i22 | i4;
        } else {
            i10 = i4;
        }
        int i23 = 16;
        if ((i4 & 112) == 0) {
            if (c0585q.golf(str)) {
                i21 = 32;
            } else {
                i21 = 16;
            }
            i10 |= i21;
        }
        if ((i4 & 896) == 0) {
            if (c0585q.golf(sVar)) {
                i20 = Barcode.FORMAT_QR_CODE;
            } else {
                i20 = 128;
            }
            i10 |= i20;
        }
        if ((i4 & 7168) == 0) {
            if (c0585q.india(function1)) {
                i19 = 2048;
            } else {
                i19 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i19;
        }
        if ((57344 & i4) == 0) {
            aeVar2 = aeVar;
            if (c0585q.india(aeVar2)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = 8192;
            }
            i10 |= i18;
        } else {
            aeVar2 = aeVar;
        }
        if ((458752 & i4) == 0) {
            if (c0585q.golf(fVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i10 |= i17;
        }
        if ((3670016 & i4) == 0) {
            if (c0585q.golf(interfaceC2392k)) {
                i16 = 1048576;
            } else {
                i16 = 524288;
            }
            i10 |= i16;
        }
        if ((29360128 & i4) == 0) {
            if (c0585q.delta(1.0f)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i10 |= i15;
        }
        if ((234881024 & i4) == 0) {
            if (c0585q.golf(null)) {
                i14 = 67108864;
            } else {
                i14 = 33554432;
            }
            i10 |= i14;
        }
        if ((1879048192 & i4) == 0) {
            if (c0585q.echo(1)) {
                i13 = 536870912;
            } else {
                i13 = 268435456;
            }
            i10 |= i13;
        }
        if ((i5 & 14) == 0) {
            if (c0585q.hotel(true)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i5 | i12;
        } else {
            i11 = i5;
        }
        if ((i5 & 112) == 0) {
            if (c0585q.india(dVar)) {
                i23 = 32;
            }
            i11 |= i23;
        }
        int i24 = i11;
        if ((1533916891 & i10) == 306783378 && (i24 & 91) == 18 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            X2.h bravo2 = af.bravo(qVar.alpha, interfaceC2392k, c0585q);
            int i25 = i10 >> 6;
            int i26 = i10 >> 12;
            n india = india(bravo2, qVar.charlie, function1, aeVar2, interfaceC2392k, c0585q, 64);
            Y2.i iVar = bravo2.victor;
            boolean z10 = iVar instanceof v;
            as asVar = C0580l.alpha;
            if (!z10) {
                c0585q.red(-2080018031);
                c0585q.red(733328855);
                int i27 = (((((i25 & 14) | 384) | (i26 & 112)) >> 3) & 14) | 48;
                al alVar = AbstractC0547m.alpha;
                Intrinsics.areEqual(fVar, T.d.alpha);
                c0585q.purple(244414741);
                if ((((i27 & 14) ^ 6) > 4 && c0585q.golf(fVar)) || (i27 & 6) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object jade = c0585q.jade();
                if (z2 || jade == asVar) {
                    jade = new C0549o(fVar, true);
                    c0585q.f(jade);
                }
                C0549o c0549o = (C0549o) jade;
                c0585q.quebec(false);
                c0585q.red(-1323940314);
                int romeo = C0564b.romeo(c0585q);
                I mike = c0585q.mike();
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                P.d dVar3 = new P.d(new C0768f(2, sVar), -511438721, true);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(C2551k.foxtrot, c0585q, c0549o);
                C0564b.blue(C2551k.echo, c0585q, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q, romeo, c2549i);
                }
                dVar3.invoke(new C0571e0(c0585q), c0585q, 0);
                c0585q.red(2058660585);
                dVar.invoke(new aa(C0551q.alpha, india, str, fVar, interfaceC2392k), c0585q, Integer.valueOf(i24 & 112));
                c0585q.quebec(false);
                c0585q.quebec(true);
                c0585q.quebec(false);
                c0585q.quebec(false);
                c0585q.quebec(false);
            } else {
                c0585q.red(-2079329304);
                ac acVar = new ac(iVar, dVar, india, str, fVar, interfaceC2392k);
                c0585q.pink(Integer.rotateLeft(-888190719, 1), P.e.alpha);
                Object jade2 = c0585q.jade();
                if (jade2 == asVar) {
                    dVar2 = new P.d(acVar, -888190719, true);
                    c0585q.f(dVar2);
                } else {
                    Intrinsics.charlie(jade2, "null cannot be cast to non-null type androidx.compose.runtime.internal.ComposableLambdaImpl");
                    dVar2 = (P.d) jade2;
                    dVar2.kilo(acVar);
                }
                P.d dVar4 = dVar2;
                c0585q.quebec(false);
                AbstractC0538d.alpha(sVar, fVar, true, dVar4, c0585q, (i25 & 14) | 3456 | (i26 & 112), 0);
                c0585q.quebec(false);
            }
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.y(qVar, str, sVar, function1, aeVar, fVar, interfaceC2392k, dVar, i4, i5);
        }
    }

    public static final void golf(final aa aaVar, T.p pVar, n nVar, String str, T.f fVar, InterfaceC2392k interfaceC2392k, float f5, boolean z2, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        T.p pVar2;
        n nVar2;
        String str2;
        T.f fVar2;
        InterfaceC2392k interfaceC2392k2;
        float f10;
        boolean z10;
        T.s sVar;
        int i10;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(880638523);
        if ((i4 & 14) == 0) {
            if (c0585q.golf(aaVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        int i11 = i5 | 176;
        if ((i4 & 7168) == 0) {
            i11 = i5 | 1200;
        }
        if ((57344 & i4) == 0) {
            i11 |= 8192;
        }
        if ((458752 & i4) == 0) {
            i11 |= 65536;
        }
        if ((3670016 & i4) == 0) {
            i11 |= 524288;
        }
        if ((29360128 & i4) == 0) {
            i11 |= 4194304;
        }
        if ((234881024 & i4) == 0) {
            i11 |= 33554432;
        }
        if ((191739611 & i11) == 38347922 && c0585q.bronze()) {
            c0585q.ochre();
            pVar2 = pVar;
            nVar2 = nVar;
            str2 = str;
            fVar2 = fVar;
            interfaceC2392k2 = interfaceC2392k;
            f10 = f5;
            z10 = z2;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                pVar2 = pVar;
                nVar2 = nVar;
                str2 = str;
                fVar2 = fVar;
                interfaceC2392k2 = interfaceC2392k;
                f10 = f5;
                z10 = z2;
            } else {
                pVar2 = T.p.alpha;
                nVar2 = aaVar.bravo;
                str2 = aaVar.charlie;
                fVar2 = aaVar.delta;
                interfaceC2392k2 = aaVar.echo;
                aaVar.getClass();
                aaVar.getClass();
                aaVar.getClass();
                f10 = 1.0f;
                z10 = true;
            }
            c0585q.romeo();
            Y2.e eVar = af.bravo;
            if (str2 != null) {
                sVar = A0.o.bravo(pVar2, false, new Lb.ae(str2, 5));
            } else {
                sVar = pVar2;
            }
            if (z10) {
                sVar = AbstractC3087z.bravo(sVar);
            }
            T.s then = sVar.then(new ContentPainterElement(nVar2, fVar2, interfaceC2392k2, f10));
            c cVar = c.charlie;
            c0585q.red(544976794);
            int romeo = C0564b.romeo(c0585q);
            T.s charlie = T.a.charlie(then, c0585q);
            I mike = c0585q.mike();
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.red(1405779621);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(new b(c2550j, 1));
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, cVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C0564b.blue(C2551k.delta, c0585q, charlie);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            A0.z.papa(c0585q, true, false, false);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            final T.p pVar3 = pVar2;
            final n nVar3 = nVar2;
            final String str3 = str2;
            final T.f fVar3 = fVar2;
            final InterfaceC2392k interfaceC2392k3 = interfaceC2392k2;
            final float f11 = f10;
            final boolean z11 = z10;
            uniform.delta = new Xd.l() { // from class: N2.ab
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    float f12 = f11;
                    boolean z12 = z11;
                    p.golf(aa.this, pVar3, nVar3, str3, fVar3, interfaceC2392k3, f12, z12, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final M2.f hotel(E0 e02, InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        M2.f fVar = (M2.f) c0585q.kilo(e02);
        if (fVar == null) {
            Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
            M2.k kVar = M2.a.bravo;
            if (kVar == null) {
                synchronized (M2.a.alpha) {
                    M2.k kVar2 = M2.a.bravo;
                    if (kVar2 != null) {
                        return kVar2;
                    }
                    context.getApplicationContext();
                    M2.k bravo2 = AbstractC2743p6.bravo(context);
                    M2.a.bravo = bravo2;
                    return bravo2;
                }
            }
            return kVar;
        }
        return fVar;
    }

    public static final n india(Object obj, M2.f fVar, Function1 function1, ae aeVar, InterfaceC2392k interfaceC2392k, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1645646697);
        c0585q.red(952940650);
        Trace.beginSection("rememberAsyncImagePainter");
        try {
            X2.h alpha2 = af.alpha(obj, c0585q);
            lima(alpha2);
            c0585q.red(1094691773);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new n(alpha2, fVar);
                c0585q.f(jade);
            }
            n nVar = (n) jade;
            c0585q.quebec(false);
            nVar.f1860b = function1;
            nVar.f1861c = aeVar;
            nVar.f1862d = interfaceC2392k;
            nVar.e = 1;
            nVar.f1863f = ((Boolean) c0585q.kilo(AbstractC2913f0.alpha)).booleanValue();
            ((t0) nVar.f1866i).setValue(fVar);
            ((t0) nVar.f1865h).setValue(alpha2);
            nVar.delta();
            c0585q.quebec(false);
            Trace.endSection();
            c0585q.quebec(false);
            return nVar;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public static final n juliet(Object obj, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(236159766);
        n india = india(obj, hotel(z.alpha, c0585q), n.f1858j, null, C2391j.bravo, c0585q, 0);
        c0585q.quebec(false);
        return india;
    }

    public static void kilo(String str) {
        throw new IllegalArgumentException(av.q.foxtrot("Unsupported type: ", str, ". ", ao.ad.gray("If you wish to display this ", str, ", use androidx.compose.foundation.Image.")));
    }

    public static final void lima(X2.h hVar) {
        Object obj = hVar.bravo;
        if (!(obj instanceof X2.g)) {
            if (!(obj instanceof C0352f)) {
                if (!(obj instanceof C1726f)) {
                    if (!(obj instanceof AbstractC1680b)) {
                        if (hVar.charlie == null) {
                            return;
                        } else {
                            throw new IllegalArgumentException("request.target must be null.");
                        }
                    } else {
                        kilo("Painter");
                        throw null;
                    }
                }
                kilo("ImageVector");
                throw null;
            }
            kilo("ImageBitmap");
            throw null;
        }
        throw new IllegalArgumentException("Unsupported type: ImageRequest.Builder. Did you forget to call ImageRequest.Builder.build()?");
    }
}
