package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.AbstractC2367C;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2769s6;
import s6.AbstractC2797v7;
import t0.AbstractC2901T;
import y.AbstractC3355O;

/* loaded from: classes3.dex */
public abstract class z2 {
    public static final float alpha = 8;

    public static final void alpha(String str, Function1 function1, T.s sVar, boolean z2, boolean z10, D0.an anVar, P.d dVar, P.d dVar2, Xd.l lVar, Xd.l lVar2, boolean z11, A8.a aVar, boolean z12, int i4, int i5, a0.as asVar, C0143o2 c0143o2, InterfaceC0581m interfaceC0581m, int i10, int i11) {
        String str2;
        int i12;
        T.s sVar2;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        D0.an anVar2;
        A8.a aVar2;
        a0.as alpha2;
        int i15;
        InterfaceC1673j interfaceC1673j;
        long j5;
        C0585q c0585q;
        int i16;
        a0.as asVar2;
        D0.an anVar3;
        n.aw awVar = n.aw.delta;
        n.av avVar = n.av.bravo;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-676242365);
        if ((i10 & 6) == 0) {
            str2 = str;
            i12 = (c0585q2.golf(str2) ? 4 : 2) | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0585q2.india(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            sVar2 = sVar;
            i12 |= c0585q2.golf(sVar2) ? Barcode.FORMAT_QR_CODE : 128;
        } else {
            sVar2 = sVar;
        }
        int i17 = i10 & 3072;
        int i18 = Barcode.FORMAT_UPC_E;
        if (i17 == 0) {
            i12 |= c0585q2.hotel(z2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            z13 = z10;
            i12 |= c0585q2.hotel(z13) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            z13 = z10;
        }
        if ((i10 & 196608) == 0) {
            i12 |= 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0585q2.india(dVar) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0585q2.india(dVar2) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0585q2.india(lVar) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0585q2.india(lVar2) ? 536870912 : 268435456;
        }
        int i19 = i11 | 438;
        if ((i11 & 3072) == 0) {
            if (c0585q2.hotel(z11)) {
                i18 = 2048;
            }
            i13 = i19 | i18;
        } else {
            i13 = i19;
        }
        int i20 = i13 | 24576;
        if ((i11 & 196608) == 0) {
            i20 |= c0585q2.golf(awVar) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i20 |= c0585q2.golf(avVar) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            z14 = z12;
            i20 |= c0585q2.hotel(z14) ? 8388608 : 4194304;
        } else {
            z14 = z12;
        }
        if ((i11 & 100663296) == 0) {
            i14 = i4;
            i20 |= c0585q2.echo(i14) ? 67108864 : 33554432;
        } else {
            i14 = i4;
        }
        int i21 = i20 | 805306368;
        int i22 = 22 | (c0585q2.golf(c0143o2) ? (char) 256 : (char) 128);
        if ((i12 & 306783379) == 306783378 && (i21 & 306783379) == 306783378 && (i22 & 147) == 146 && c0585q2.bronze()) {
            c0585q2.ochre();
            anVar3 = anVar;
            aVar2 = aVar;
            i16 = i5;
            asVar2 = asVar;
            c0585q = c0585q2;
        } else {
            c0585q2.orange();
            if ((i10 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                anVar2 = anVar;
                aVar2 = aVar;
                i15 = i5;
                alpha2 = asVar;
            } else {
                anVar2 = (D0.an) c0585q2.kilo(G2.alpha);
                A8.a aVar3 = I0.ai.alpha;
                C0162t2 c0162t2 = C0162t2.alpha;
                aVar2 = aVar3;
                alpha2 = Z1.alpha(c0585q2, 4);
                i15 = 1;
            }
            c0585q2.romeo();
            c0585q2.purple(-508515290);
            Object jade = c0585q2.jade();
            if (jade == C0580l.alpha) {
                jade = ao.ad.xray(c0585q2);
            }
            InterfaceC1673j interfaceC1673j2 = (InterfaceC1673j) jade;
            c0585q2.quebec(false);
            c0585q2.purple(-508509180);
            long bravo = anVar2.bravo();
            if (bravo != 16) {
                interfaceC1673j = interfaceC1673j2;
            } else {
                boolean booleanValue = ((Boolean) s6.J0.alpha(interfaceC1673j2, c0585q2, 0).getValue()).booleanValue();
                if (z2) {
                    interfaceC1673j = interfaceC1673j2;
                    j5 = z11 ? c0143o2.delta : booleanValue ? c0143o2.alpha : c0143o2.bravo;
                } else {
                    interfaceC1673j = interfaceC1673j2;
                    j5 = c0143o2.charlie;
                }
                bravo = j5;
            }
            long j6 = bravo;
            c0585q2.quebec(false);
            c0585q = c0585q2;
            C0564b.alpha(AbstractC3355O.alpha.alpha(c0143o2.kilo), P.e.echo(1859145987, new v2(sVar2, z11, c0143o2, str2, function1, z2, z13, anVar2.delta(new D0.an(j6, 0L, null, null, null, 0L, 0, 0L, 0, 16777214)), z14, i14, i15, aVar2, interfaceC1673j, dVar, dVar2, lVar, lVar2, alpha2), c0585q), c0585q, 56);
            i16 = i15;
            asVar2 = alpha2;
            anVar3 = anVar2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new w2(str, function1, sVar, z2, z10, anVar3, dVar, dVar2, lVar, lVar2, z11, aVar2, z12, i4, i16, asVar2, c0143o2, i10, i11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [P.d] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.q, androidx.compose.runtime.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r43v0, types: [P.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [Xd.l] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v36 */
    public static final void bravo(Xd.l lVar, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, P.d dVar5, P.d dVar6, boolean z2, float f5, P.d dVar7, P.d dVar8, androidx.compose.foundation.layout.M m4, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        androidx.compose.foundation.layout.M m5;
        boolean z10;
        boolean z11;
        boolean z12;
        Q0.n nVar;
        P.d dVar9;
        float f10;
        float f11;
        float f12;
        float f13;
        P.d dVar10;
        P.d dVar11;
        boolean z13;
        P.d dVar12;
        Xd.l lVar2;
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
        T.p pVar = T.p.alpha;
        ?? r15 = (C0585q) interfaceC0581m;
        r15.silver(-1830307184);
        int i22 = 4;
        if ((i4 & 6) == 0) {
            if (r15.golf(pVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i10 = i4 | i21;
        } else {
            i10 = i4;
        }
        int i23 = 16;
        if ((i4 & 48) == 0) {
            if (r15.india(lVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i10 |= i20;
        }
        int i24 = 128;
        if ((i4 & 384) == 0) {
            if (r15.india(dVar)) {
                i19 = Barcode.FORMAT_QR_CODE;
            } else {
                i19 = 128;
            }
            i10 |= i19;
        }
        if ((i4 & 3072) == 0) {
            if (r15.india(dVar2)) {
                i18 = 2048;
            } else {
                i18 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i18;
        }
        if ((i4 & 24576) == 0) {
            if (r15.india(dVar3)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i10 |= i17;
        }
        if ((196608 & i4) == 0) {
            if (r15.india(dVar4)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i10 |= i16;
        }
        if ((1572864 & i4) == 0) {
            if (r15.india(dVar5)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i10 |= i15;
        }
        if ((12582912 & i4) == 0) {
            if (r15.india(dVar6)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i10 |= i14;
        }
        if ((100663296 & i4) == 0) {
            if (r15.hotel(z2)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i10 |= i13;
        }
        if ((i4 & 805306368) == 0) {
            if (r15.delta(f5)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i10 |= i12;
        }
        if ((i5 & 6) == 0) {
            if (!r15.india(dVar7)) {
                i22 = 2;
            }
            i11 = i5 | i22;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (r15.india(dVar8)) {
                i23 = 32;
            }
            i11 |= i23;
        }
        if ((i5 & 384) == 0) {
            m5 = m4;
            if (r15.golf(m5)) {
                i24 = Barcode.FORMAT_QR_CODE;
            }
            i11 |= i24;
        } else {
            m5 = m4;
        }
        int i25 = i11;
        if ((i10 & 306783379) == 306783378 && (i25 & 147) == 146 && r15.bronze()) {
            r15.ochre();
            lVar2 = lVar;
            dVar12 = dVar2;
            f11 = f5;
            dVar11 = dVar8;
        } else {
            if ((i10 & 234881024) == 67108864) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z10;
            if ((i10 & 1879048192) == 536870912) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z14 | z11;
            if ((i25 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z16 = z15 | z12;
            Object jade = r15.jade();
            if (z16 || jade == C0580l.alpha) {
                jade = new B2(z2, f5, m5);
                r15.f(jade);
            }
            B2 b2 = (B2) jade;
            Q0.n nVar2 = (Q0.n) r15.kilo(AbstractC2901T.november);
            int romeo = C0564b.romeo(r15);
            androidx.compose.runtime.I mike = r15.mike();
            T.s charlie = T.a.charlie(pVar, r15);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            r15.white();
            if (r15.lime) {
                r15.lima(c2550j);
            } else {
                r15.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, r15, b2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, r15, mike);
            C2549i c2549i3 = C2551k.golf;
            if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, r15, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, r15, charlie);
            dVar7.invoke(r15, Integer.valueOf(i25 & 14));
            r15.purple(1341517187);
            T.k kVar = T.d.teal;
            if (dVar3 != null) {
                T.s then = androidx.compose.ui.layout.a.charlie(pVar, "Leading").then(androidx.compose.material3.internal.at.india);
                q0.ap delta = AbstractC0547m.delta(kVar, false);
                int romeo2 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike2 = r15.mike();
                T.s charlie2 = T.a.charlie(then, r15);
                r15.white();
                nVar = nVar2;
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta);
                C0564b.blue(c2549i2, r15, mike2);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo2))) {
                    ao.ad.blue(romeo2, r15, romeo2, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie2);
                androidx.appcompat.widget.P0.indigo((i10 >> 12) & 14, dVar3, r15, true);
            } else {
                nVar = nVar2;
            }
            ?? r92 = 0;
            r15.quebec(false);
            r15.purple(1341526310);
            if (dVar4 != null) {
                T.s then2 = androidx.compose.ui.layout.a.charlie(pVar, "Trailing").then(androidx.compose.material3.internal.at.india);
                q0.ap delta2 = AbstractC0547m.delta(kVar, false);
                int romeo3 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike3 = r15.mike();
                T.s charlie3 = T.a.charlie(then2, r15);
                r15.white();
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta2);
                C0564b.blue(c2549i2, r15, mike3);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo3))) {
                    ao.ad.blue(romeo3, r15, romeo3, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie3);
                androidx.appcompat.widget.P0.indigo((i10 >> 15) & 14, dVar4, r15, true);
                r92 = 0;
            }
            r15.quebec(r92);
            Q0.n nVar3 = nVar;
            float india = AbstractC0538d.india(m5, nVar3);
            float hotel = AbstractC0538d.hotel(m5, nVar3);
            if (dVar3 != null) {
                india -= androidx.compose.material3.internal.at.charlie;
                float f14 = (float) r92;
                if (india < f14) {
                    india = f14;
                }
            }
            float f15 = india;
            if (dVar4 != null) {
                hotel -= androidx.compose.material3.internal.at.charlie;
                float f16 = 0;
                if (hotel < f16) {
                    hotel = f16;
                }
            }
            r15.purple(1341556924);
            T.k kVar2 = T.d.alpha;
            if (dVar5 != null) {
                T.s whiskey = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.golf(androidx.compose.ui.layout.a.charlie(pVar, "Prefix"), androidx.compose.material3.internal.at.foxtrot, 0.0f, 2)), f15, 0.0f, androidx.compose.material3.internal.at.echo, 0.0f, 10);
                q0.ap delta3 = AbstractC0547m.delta(kVar2, false);
                int romeo4 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike4 = r15.mike();
                T.s charlie4 = T.a.charlie(whiskey, r15);
                r15.white();
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta3);
                C0564b.blue(c2549i2, r15, mike4);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo4))) {
                    ao.ad.blue(romeo4, r15, romeo4, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie4);
                dVar9 = dVar5;
                androidx.appcompat.widget.P0.indigo((i10 >> 18) & 14, dVar9, r15, true);
            } else {
                dVar9 = dVar5;
            }
            r15.quebec(false);
            r15.purple(1341568890);
            if (dVar6 != null) {
                float f17 = hotel;
                T.s whiskey2 = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.golf(androidx.compose.ui.layout.a.charlie(pVar, "Suffix"), androidx.compose.material3.internal.at.foxtrot, 0.0f, 2)), androidx.compose.material3.internal.at.echo, 0.0f, f17, 0.0f, 10);
                f10 = f17;
                q0.ap delta4 = AbstractC0547m.delta(kVar2, false);
                int romeo5 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike5 = r15.mike();
                T.s charlie5 = T.a.charlie(whiskey2, r15);
                r15.white();
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta4);
                C0564b.blue(c2549i2, r15, mike5);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo5))) {
                    ao.ad.blue(romeo5, r15, romeo5, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie5);
                androidx.appcompat.widget.P0.indigo((i10 >> 21) & 14, dVar6, r15, true);
            } else {
                f10 = hotel;
            }
            r15.quebec(false);
            r15.purple(1341581092);
            if (dVar != null) {
                f11 = f5;
                T.s whiskey3 = AbstractC0538d.whiskey(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.golf(androidx.compose.ui.layout.a.charlie(pVar, "Label"), AbstractC2797v7.echo(androidx.compose.material3.internal.at.foxtrot, androidx.compose.material3.internal.at.golf, f11), 0.0f, 2)), f15, 0.0f, f10, 0.0f, 10);
                q0.ap delta5 = AbstractC0547m.delta(kVar2, false);
                int romeo6 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike6 = r15.mike();
                T.s charlie6 = T.a.charlie(whiskey3, r15);
                r15.white();
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta5);
                C0564b.blue(c2549i2, r15, mike6);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo6))) {
                    ao.ad.blue(romeo6, r15, romeo6, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie6);
                androidx.appcompat.widget.P0.indigo((i10 >> 6) & 14, dVar, r15, true);
            } else {
                f11 = f5;
            }
            r15.quebec(false);
            T.s romeo7 = androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.golf(pVar, androidx.compose.material3.internal.at.foxtrot, 0.0f, 2));
            if (dVar9 == null) {
                f12 = f15;
            } else {
                f12 = 0;
            }
            if (dVar6 == null) {
                f13 = f10;
            } else {
                f13 = 0;
            }
            T.s whiskey4 = AbstractC0538d.whiskey(romeo7, f12, 0.0f, f13, 0.0f, 10);
            r15.purple(1341611627);
            if (dVar2 != null) {
                ?? r10 = dVar2;
                r10.invoke(androidx.compose.ui.layout.a.charlie(pVar, "Hint").then(whiskey4), r15, Integer.valueOf((i10 >> 6) & 112));
                dVar10 = r10;
            } else {
                dVar10 = dVar2;
            }
            r15.quebec(false);
            T.s then3 = androidx.compose.ui.layout.a.charlie(pVar, "TextField").then(whiskey4);
            q0.ap delta6 = AbstractC0547m.delta(kVar2, true);
            int romeo8 = C0564b.romeo(r15);
            androidx.compose.runtime.I mike7 = r15.mike();
            T.s charlie7 = T.a.charlie(then3, r15);
            r15.white();
            if (r15.lime) {
                r15.lima(c2550j);
            } else {
                r15.i();
            }
            C0564b.blue(c2549i, r15, delta6);
            C0564b.blue(c2549i2, r15, mike7);
            if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo8))) {
                ao.ad.blue(romeo8, r15, romeo8, c2549i3);
            }
            C0564b.blue(c2549i4, r15, charlie7);
            ?? r5 = lVar;
            r5.invoke(r15, Integer.valueOf((i10 >> 3) & 14));
            r15.quebec(true);
            r15.purple(1341622624);
            if (dVar8 != null) {
                T.s romeo9 = AbstractC0538d.romeo(androidx.compose.foundation.layout.V.romeo(androidx.compose.foundation.layout.V.golf(androidx.compose.ui.layout.a.charlie(pVar, "Supporting"), androidx.compose.material3.internal.at.hotel, 0.0f, 2)), C0162t2.charlie());
                q0.ap delta7 = AbstractC0547m.delta(kVar2, false);
                int romeo10 = C0564b.romeo(r15);
                androidx.compose.runtime.I mike8 = r15.mike();
                T.s charlie8 = T.a.charlie(romeo9, r15);
                r15.white();
                if (r15.lime) {
                    r15.lima(c2550j);
                } else {
                    r15.i();
                }
                C0564b.blue(c2549i, r15, delta7);
                C0564b.blue(c2549i2, r15, mike8);
                if (r15.lime || !Intrinsics.areEqual(r15.jade(), Integer.valueOf(romeo10))) {
                    ao.ad.blue(romeo10, r15, romeo10, c2549i3);
                }
                C0564b.blue(c2549i4, r15, charlie8);
                dVar11 = dVar8;
                z13 = true;
                androidx.appcompat.widget.P0.indigo((i25 >> 3) & 14, dVar11, r15, true);
            } else {
                dVar11 = dVar8;
                z13 = true;
            }
            r15.quebec(false);
            r15.quebec(z13);
            lVar2 = r5;
            dVar12 = dVar10;
        }
        androidx.compose.runtime.Q uniform = r15.uniform();
        if (uniform != null) {
            uniform.delta = new x2(lVar2, dVar, dVar12, dVar3, dVar4, dVar5, dVar6, z2, f11, dVar7, dVar11, m5, i4, i5);
        }
    }

    public static final int charlie(int i4, int i5, int i10, int i11, int i12, int i13, int i14, int i15, float f5, long j5, float f10, androidx.compose.foundation.layout.M m4) {
        boolean z2;
        if (i5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f11 = (m4.delta + m4.bravo) * f10;
        if (z2) {
            f11 = AbstractC2797v7.echo(androidx.compose.material3.internal.at.bravo * 2 * f10, f11, f5);
        }
        return Math.max(Q0.a.india(j5), Math.max(i10, Math.max(i11, Zd.a.delta(f11 + AbstractC2797v7.foxtrot(0, i5, f5) + AbstractC2769s6.charlie(i4, i14, i12, i13, AbstractC2797v7.foxtrot(i5, 0, f5))))) + i15);
    }

    public static final int delta(boolean z2, int i4, int i5, AbstractC2367C abstractC2367C) {
        if (z2) {
            return Math.round((1 + 0.0f) * ((i4 - abstractC2367C.purple) / 2.0f));
        }
        return i5;
    }
}
