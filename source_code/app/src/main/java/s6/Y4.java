package s6;

import F.AbstractC0141o0;
import a0.C0366t;
import android.content.Context;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import g0.AbstractC1722b;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.C2211d;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.Y4;

/* loaded from: classes2.dex */
public abstract class Y4 {
    public static final void alpha(final String str, T.s sVar, final C1726f c1726f, final String str2, final String str3, final boolean z2, final boolean z10, final Function0 function0, final long j5, final long j6, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z11;
        C0585q c0585q;
        final T.s sVar2;
        T.s sVar3;
        boolean z12;
        C0585q c0585q2;
        androidx.compose.runtime.E0 e02;
        T.s sVar4;
        T.p pVar;
        D0.an anVar;
        int i10;
        T.s sVar5;
        T.p pVar2;
        C2549i c2549i;
        C2549i c2549i2;
        T.s sVar6;
        C0551q c0551q;
        boolean z13;
        C2549i c2549i3;
        int i11;
        C2550j c2550j;
        C0585q c0585q3;
        C2549i c2549i4;
        boolean z14;
        boolean z15;
        C2549i c2549i5;
        C2549i c2549i6;
        T.s charlie;
        boolean z16;
        boolean z17;
        g0.aj ajVar;
        C2549i c2549i7;
        g0.aj ajVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C0585q c0585q4 = (C0585q) interfaceC0581m;
        c0585q4.silver(-205577340);
        if ((i4 & 6) == 0) {
            if (c0585q4.golf(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i5 = i20 | i4;
        } else {
            i5 = i4;
        }
        int i21 = i5 | 48;
        if ((i4 & 384) == 0) {
            if (c0585q4.golf(c1726f)) {
                i19 = Barcode.FORMAT_QR_CODE;
            } else {
                i19 = 128;
            }
            i21 |= i19;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q4.golf(str2)) {
                i18 = 2048;
            } else {
                i18 = Barcode.FORMAT_UPC_E;
            }
            i21 |= i18;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q4.golf(str3)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i21 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (c0585q4.hotel(z2)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i21 |= i16;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q4.hotel(z10)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i21 |= i15;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q4.india(function0)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i21 |= i14;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q4.foxtrot(j5)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i21 |= i13;
        }
        if ((805306368 & i4) == 0) {
            if (c0585q4.foxtrot(j6)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i21 |= i12;
        }
        int i22 = i21;
        if ((i22 & 306783379) == 306783378) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (c0585q4.magenta(i22 & 1, z11)) {
            c0585q4.orange();
            int i23 = i4 & 1;
            T.p pVar3 = T.p.alpha;
            if (i23 != 0 && !c0585q4.beige()) {
                c0585q4.ochre();
                sVar3 = sVar;
            } else {
                sVar3 = pVar3;
            }
            c0585q4.romeo();
            c0585q4.purple(8698286);
            androidx.compose.runtime.E0 e03 = F.T2.alpha;
            D0.an anVar2 = ((F.S2) c0585q4.kilo(e03)).oscar;
            c0585q4.quebec(false);
            if (z10 && function0 != null) {
                c0585q4.purple(8701006);
                Object jade = c0585q4.jade();
                if (jade == C0580l.alpha) {
                    jade = ao.ad.xray(c0585q4);
                }
                InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
                pVar = pVar3;
                anVar = anVar2;
                sVar4 = sVar3;
                e02 = e03;
                c0585q2 = c0585q4;
                i10 = 2;
                z12 = false;
                sVar5 = androidx.compose.foundation.a.charlie(pVar, interfaceC1673j, null, false, null, function0, 28);
                c0585q2.quebec(false);
            } else {
                z12 = false;
                c0585q2 = c0585q4;
                e02 = e03;
                sVar4 = sVar3;
                pVar = pVar3;
                anVar = anVar2;
                i10 = 2;
                c0585q2.purple(8705484);
                c0585q2.quebec(false);
                sVar5 = pVar;
            }
            T.s quebec = androidx.compose.foundation.layout.V.quebec(sVar4.then(sVar5), C2211d.blue, 0.0f, i10);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, z12);
            int romeo = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie2 = T.a.charlie(quebec, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C2549i c2549i8 = C2551k.foxtrot;
            C0564b.blue(c2549i8, c0585q2, delta);
            C2549i c2549i9 = C2551k.echo;
            C0564b.blue(c2549i9, c0585q2, mike);
            C2549i c2549i10 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q2, romeo, c2549i10);
            }
            C2549i c2549i11 = C2551k.delta;
            C0564b.blue(c2549i11, c0585q2, charlie2);
            C0551q c0551q2 = C0551q.alpha;
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(C2211d.black), iVar, c0585q2, 54);
            int romeo2 = C0564b.romeo(c0585q2);
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie3 = T.a.charlie(pVar, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j2);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i8, c0585q2, alpha);
            C0564b.blue(c2549i9, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q2, romeo2, c2549i10);
            }
            C0564b.blue(c2549i11, c0585q2, charlie3);
            if (str2 != null) {
                c0585q2.purple(-1693243805);
                X2.g gVar = new X2.g((Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo));
                gVar.charlie = str2;
                gVar.bravo();
                X2.h alpha2 = gVar.alpha();
                q0.av avVar = C2391j.bravo;
                T.s kilo = androidx.compose.foundation.layout.V.kilo(pVar, C2211d.beige);
                if (c1726f != null) {
                    c0585q2.purple(-1162984157);
                    ajVar = AbstractC1722b.bravo(c1726f, c0585q2);
                    z17 = false;
                    c0585q2.quebec(false);
                } else {
                    z17 = false;
                    c0585q2.purple(-1692738475);
                    c0585q2.quebec(false);
                    ajVar = null;
                }
                if (c1726f != null) {
                    c0585q2.purple(-1162981309);
                    ajVar2 = AbstractC1722b.bravo(c1726f, c0585q2);
                    c2549i7 = c2549i11;
                    c0585q2.quebec(false);
                } else {
                    c2549i7 = c2549i11;
                    c0585q2.purple(-1692650187);
                    c0585q2.quebec(z17);
                    ajVar2 = null;
                }
                C0585q c0585q5 = c0585q2;
                N2.p.bravo(alpha2, str3, kilo, ajVar, ajVar2, avVar, c0585q5, ((i22 >> 9) & 112) | 37248, 64480);
                c0585q5.quebec(false);
                pVar2 = pVar;
                c2549i = c2549i8;
                c2549i2 = c2549i10;
                sVar6 = sVar4;
                c0551q = c0551q2;
                z13 = false;
                c2549i3 = c2549i7;
                i11 = -1696741318;
                c2550j = c2550j2;
                c0585q3 = c0585q5;
                c2549i4 = c2549i9;
            } else {
                C0585q c0585q6 = c0585q2;
                T.p pVar4 = pVar;
                if (c1726f != null) {
                    c0585q6.purple(-1692564874);
                    c2549i2 = c2549i10;
                    sVar6 = sVar4;
                    c0551q = c0551q2;
                    z13 = false;
                    c2549i = c2549i8;
                    c2549i3 = c2549i11;
                    i11 = -1696741318;
                    pVar2 = pVar4;
                    c2550j = c2550j2;
                    c0585q3 = c0585q6;
                    c2549i4 = c2549i9;
                    AbstractC0141o0.bravo(c1726f, null, androidx.compose.foundation.layout.V.kilo(pVar4, C2211d.beige), j5, c0585q3, ((i22 >> 6) & 14) | 432 | ((i22 >> 15) & 7168), 0);
                } else {
                    pVar2 = pVar4;
                    c2549i = c2549i8;
                    c2549i2 = c2549i10;
                    sVar6 = sVar4;
                    c0551q = c0551q2;
                    z13 = false;
                    c2549i3 = c2549i11;
                    i11 = -1696741318;
                    c2550j = c2550j2;
                    c0585q3 = c0585q6;
                    c2549i4 = c2549i9;
                    c0585q3.purple(-1696741318);
                }
                c0585q3.quebec(z13);
            }
            boolean z18 = z13;
            int i24 = i11;
            C2549i c2549i12 = c2549i4;
            C2549i c2549i13 = c2549i2;
            C0585q c0585q7 = c0585q3;
            C2550j c2550j3 = c2550j;
            T.p pVar5 = pVar2;
            C2549i c2549i14 = c2549i;
            F.G2.bravo(str, null, j6, 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, anVar, c0585q7, (i22 & 14) | ((i22 >> 21) & 896), 0, 65018);
            long j7 = j6;
            c0585q = c0585q7;
            if (str3 != null) {
                c0585q.purple(-1692048011);
                F.G2.bravo(str3, null, C0366t.bravo(0.8f, j7), 0L, null, null, 0L, new O0.k(3), 0L, 0, false, 0, 0, null, ((F.S2) c0585q.kilo(e02)).oscar, c0585q, (i22 >> 12) & 14, 0, 65018);
                c0585q = c0585q;
                c0585q.quebec(z18);
                j7 = j6;
            } else {
                c0585q.purple(i24);
                c0585q.quebec(z18);
            }
            c0585q.quebec(true);
            T.k kVar = T.d.teal;
            T.k kVar2 = T.d.red;
            if (z10) {
                c0585q.purple(-1245570067);
                float f5 = C2211d.bronze;
                C2093f bravo = AbstractC2094g.bravo(2);
                T.s kilo2 = androidx.compose.foundation.layout.V.kilo(AbstractC0538d.sierra(c0551q.alpha(pVar5, kVar2), C2211d.coral), f5);
                if (z2) {
                    charlie = androidx.compose.foundation.a.bravo(pVar5, j7, bravo);
                    c2549i5 = c2549i14;
                    c2549i6 = c2549i12;
                } else {
                    c2549i5 = c2549i14;
                    c2549i6 = c2549i12;
                    charlie = t6.R3.charlie(pVar5, (float) 1.5d, C0366t.bravo(0.6f, j7), bravo);
                }
                T.s then = kilo2.then(charlie);
                q0.ap delta2 = AbstractC0547m.delta(kVar, false);
                int romeo3 = C0564b.romeo(c0585q);
                androidx.compose.runtime.I mike3 = c0585q.mike();
                T.s charlie4 = T.a.charlie(then, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j3);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i5, c0585q, delta2);
                C0564b.blue(c2549i6, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                    ao.ad.blue(romeo3, c0585q, romeo3, c2549i13);
                }
                C0564b.blue(c2549i3, c0585q, charlie4);
                if (z2) {
                    c0585q.purple(812163474);
                    AbstractC0141o0.bravo(i6.d.alpha(), null, androidx.compose.foundation.layout.V.kilo(pVar5, f5 * 0.6f), ((F.O) c0585q.kilo(F.Q.alpha)).papa, c0585q, 432, 0);
                    z16 = false;
                } else {
                    z16 = false;
                    c0585q.purple(806450050);
                }
                c0585q.quebec(z16);
                c0585q.quebec(true);
                c0585q.quebec(z16);
                z14 = true;
            } else {
                C2549i c2549i15 = c2549i3;
                C0551q c0551q3 = c0551q;
                if (z2) {
                    c0585q.purple(-1244478991);
                    T.s sierra = AbstractC0538d.sierra(c0551q3.alpha(pVar5, kVar2), C2211d.coral);
                    float f10 = C2211d.bronze;
                    T.s kilo3 = androidx.compose.foundation.layout.V.kilo(sierra, f10);
                    androidx.compose.runtime.E0 e04 = F.Q.alpha;
                    T.s bravo2 = androidx.compose.foundation.a.bravo(kilo3, ((F.O) c0585q.kilo(e04)).quebec, AbstractC2094g.alpha);
                    q0.ap delta3 = AbstractC0547m.delta(kVar, false);
                    int romeo4 = C0564b.romeo(c0585q);
                    androidx.compose.runtime.I mike4 = c0585q.mike();
                    T.s charlie5 = T.a.charlie(bravo2, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j3);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i14, c0585q, delta3);
                    C0564b.blue(c2549i12, c0585q, mike4);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo4))) {
                        ao.ad.blue(romeo4, c0585q, romeo4, c2549i13);
                    }
                    C0564b.blue(c2549i15, c0585q, charlie5);
                    AbstractC0141o0.bravo(i6.d.alpha(), null, androidx.compose.foundation.layout.V.kilo(pVar5, f10 * 0.6f), ((F.O) c0585q.kilo(e04)).papa, c0585q, 432, 0);
                    z14 = true;
                    c0585q.quebec(true);
                    z15 = false;
                } else {
                    z14 = true;
                    z15 = false;
                    c0585q.purple(-1250601212);
                }
                c0585q.quebec(z15);
            }
            c0585q.quebec(z14);
            sVar2 = sVar6;
        } else {
            c0585q = c0585q4;
            c0585q.ochre();
            sVar2 = sVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: hb.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str4 = str;
                    long j10 = j5;
                    long j11 = j6;
                    Y4.alpha(str4, sVar2, c1726f, str2, str3, z2, z10, function0, j10, j11, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long bravo(Gf.i iVar, long j5) {
        Intrinsics.echo(iVar, "<this>");
        iVar.request(j5);
        long min = Math.min(j5, charlie(iVar));
        iVar.delta().india(min);
        return min;
    }

    public static final long charlie(Gf.i iVar) {
        Intrinsics.echo(iVar, "<this>");
        return iVar.delta().red;
    }
}
