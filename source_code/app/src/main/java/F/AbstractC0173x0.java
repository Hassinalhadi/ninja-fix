package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2913f0;

/* renamed from: F.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0173x0 {
    public static final float alpha;
    public static final float bravo;
    public static final float charlie = 12;
    public static final float delta = 8;
    public static final float echo = 112;
    public static final float foxtrot = 280;

    static {
        float f5 = 48;
        alpha = f5;
        bravo = f5;
    }

    public static final void alpha(T.s sVar, bz.an anVar, androidx.compose.runtime.ax axVar, b.g0 g0Var, a0.as asVar, long j5, float f5, float f10, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        float f12;
        b.ab abVar;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-151448888);
        if (c0585q2.golf(sVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i18 = i4 | i5;
        if (c0585q2.golf(anVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i19 = i18 | i10;
        if (c0585q2.golf(g0Var)) {
            i11 = 2048;
        } else {
            i11 = Barcode.FORMAT_UPC_E;
        }
        int i20 = i19 | i11;
        if (c0585q2.golf(asVar)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i21 = i20 | i12;
        if (c0585q2.foxtrot(j5)) {
            i13 = 131072;
        } else {
            i13 = 65536;
        }
        int i22 = i21 | i13;
        if (c0585q2.delta(f5)) {
            i14 = 1048576;
        } else {
            i14 = 524288;
        }
        int i23 = i22 | i14;
        if (c0585q2.delta(f10)) {
            i15 = 8388608;
        } else {
            i15 = 4194304;
        }
        int i24 = i23 | i15;
        if (c0585q2.golf(null)) {
            i16 = 67108864;
        } else {
            i16 = 33554432;
        }
        int i25 = i24 | i16;
        if (c0585q2.india(dVar)) {
            i17 = 536870912;
        } else {
            i17 = 268435456;
        }
        int i26 = i25 | i17;
        if ((i26 & 306783379) == 306783378 && c0585q2.bronze()) {
            c0585q2.ochre();
            c0585q = c0585q2;
        } else {
            bz.a0 delta2 = bz.e0.delta(anVar, "DropDownMenu", c0585q2, (((i26 >> 3) & 14) | 48) & 126);
            bz.g0 g0Var2 = AbstractC0779d.juliet;
            boolean booleanValue = ((Boolean) delta2.alpha.L()).booleanValue();
            c0585q2.purple(2139028452);
            float f13 = 0.8f;
            float f14 = 1.0f;
            if (booleanValue) {
                f11 = 1.0f;
            } else {
                f11 = 0.8f;
            }
            c0585q2.quebec(false);
            Float valueOf = Float.valueOf(f11);
            androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) delta2.delta;
            boolean booleanValue2 = ((Boolean) t0Var.getValue()).booleanValue();
            c0585q2.purple(2139028452);
            if (booleanValue2) {
                f13 = 1.0f;
            }
            c0585q2.quebec(false);
            bz.X charlie2 = bz.e0.charlie(delta2, valueOf, Float.valueOf(f13), (bz.aa) D.f1001c.invoke(delta2.foxtrot(), c0585q2, 0), g0Var2, c0585q2, 0);
            boolean booleanValue3 = ((Boolean) delta2.alpha.L()).booleanValue();
            c0585q2.purple(-249413128);
            if (booleanValue3) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            c0585q2.quebec(false);
            Float valueOf2 = Float.valueOf(f12);
            boolean booleanValue4 = ((Boolean) t0Var.getValue()).booleanValue();
            c0585q2.purple(-249413128);
            if (!booleanValue4) {
                f14 = 0.0f;
            }
            boolean z2 = false;
            c0585q2.quebec(false);
            bz.X charlie3 = bz.e0.charlie(delta2, valueOf2, Float.valueOf(f14), (bz.aa) D.yellow.invoke(delta2.foxtrot(), c0585q2, 0), g0Var2, c0585q2, 0);
            boolean booleanValue5 = ((Boolean) c0585q2.kilo(AbstractC2913f0.alpha)).booleanValue();
            T.p pVar = T.p.alpha;
            boolean hotel = c0585q2.hotel(booleanValue5) | c0585q2.golf(charlie2);
            if ((i26 & 112) == 32) {
                z2 = true;
            }
            boolean golf = hotel | z2 | c0585q2.golf(charlie3);
            Object jade = c0585q2.jade();
            if (!golf && jade != C0580l.alpha) {
                abVar = null;
            } else {
                abVar = null;
                C0160t0 c0160t0 = new C0160t0(booleanValue5, anVar, axVar, charlie2, charlie3);
                c0585q2.f(c0160t0);
                jade = c0160t0;
            }
            int i27 = i26 >> 9;
            int i28 = i26 >> 6;
            AbstractC0127k2.alpha(androidx.compose.ui.graphics.a.alpha(pVar, (Function1) jade), asVar, j5, 0L, f5, f10, abVar, P.e.echo(1573559053, new C0164u0(sVar, g0Var, dVar, 0), c0585q2), c0585q2, (i27 & 896) | (i27 & 112) | 12582912 | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 8);
            c0585q = c0585q2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0132m(sVar, anVar, axVar, g0Var, asVar, j5, f5, f10, dVar, i4);
        }
    }

    public static final void bravo(P.d dVar, Function0 function0, T.s sVar, boolean z2, C0156s0 c0156s0, androidx.compose.foundation.layout.M m4, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1564716777);
        if ((i4 & 6) == 0) {
            if (c0585q.india(dVar)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i5 = i18 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i5 |= i17;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i16 = Barcode.FORMAT_QR_CODE;
            } else {
                i16 = 128;
            }
            i5 |= i16;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(null)) {
                i15 = 2048;
            } else {
                i15 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i15;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(null)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i5 |= i14;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i5 |= i13;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(c0156s0)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i5 |= i12;
        }
        if ((12582912 & i4) == 0) {
            if (c0585q.golf(m4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i5 |= i11;
        }
        if ((100663296 & i4) == 0) {
            if (c0585q.golf(null)) {
                i10 = 67108864;
            } else {
                i10 = 33554432;
            }
            i5 |= i10;
        }
        if ((i5 & 38347923) == 38347922 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            T.s romeo = AbstractC0538d.romeo(androidx.compose.foundation.layout.V.november(androidx.compose.foundation.layout.V.charlie(androidx.compose.foundation.a.charlie(sVar, null, L1.bravo(true, 0.0f, c0585q, 6, 6), z2, null, function0, 24), 1.0f), echo, bravo, foxtrot, 8), m4);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q, 48);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(romeo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            G2.alpha(((S2) c0585q.kilo(T2.alpha)).mike, P.e.echo(1065051884, new C0167v0(c0156s0, z2, dVar), c0585q), c0585q, 48);
            c0585q.quebec(true);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0170w0(dVar, function0, sVar, z2, c0156s0, m4, i4);
        }
    }
}
