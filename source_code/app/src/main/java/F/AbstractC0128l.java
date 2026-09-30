package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.E7;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0128l {
    public static final float alpha = 280;
    public static final float bravo = 560;
    public static final float charlie = 8;
    public static final float delta = 12;
    public static final androidx.compose.foundation.layout.M echo;
    public static final androidx.compose.foundation.layout.M foxtrot;
    public static final androidx.compose.foundation.layout.M golf;
    public static final androidx.compose.foundation.layout.M hotel;

    static {
        float f5 = 24;
        echo = new androidx.compose.foundation.layout.M(f5, f5, f5, f5);
        float f10 = 16;
        foxtrot = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f10, 7);
        golf = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f10, 7);
        hotel = AbstractC0538d.delta(0.0f, 0.0f, 0.0f, f5, 7);
    }

    public static final void alpha(P.d dVar, T.p pVar, Xd.l lVar, P.d dVar2, P.d dVar3, a0.as asVar, long j5, float f5, long j6, long j7, long j10, long j11, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        char c3;
        char c4;
        T.p pVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1522575799);
        int i17 = i4 | 48;
        if (c0585q.india(lVar)) {
            i5 = Barcode.FORMAT_QR_CODE;
        } else {
            i5 = 128;
        }
        int i18 = i17 | i5;
        if (c0585q.india(dVar2)) {
            i10 = 2048;
        } else {
            i10 = Barcode.FORMAT_UPC_E;
        }
        int i19 = i18 | i10;
        if (c0585q.india(dVar3)) {
            i11 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i11 = 8192;
        }
        int i20 = i19 | i11;
        if (c0585q.golf(asVar)) {
            i12 = 131072;
        } else {
            i12 = 65536;
        }
        int i21 = i20 | i12;
        if (c0585q.foxtrot(j5)) {
            i13 = 1048576;
        } else {
            i13 = 524288;
        }
        int i22 = i21 | i13;
        if (c0585q.delta(f5)) {
            i14 = 8388608;
        } else {
            i14 = 4194304;
        }
        int i23 = i22 | i14;
        if (c0585q.foxtrot(j6)) {
            i15 = 67108864;
        } else {
            i15 = 33554432;
        }
        int i24 = i23 | i15;
        if (c0585q.foxtrot(j7)) {
            i16 = 536870912;
        } else {
            i16 = 268435456;
        }
        int i25 = i24 | i16;
        if (c0585q.foxtrot(j10)) {
            c3 = 4;
        } else {
            c3 = 2;
        }
        if (c0585q.foxtrot(j11)) {
            c4 = ' ';
        } else {
            c4 = 16;
        }
        int i26 = c3 | c4;
        if ((i25 & 306783379) == 306783378 && (i26 & 19) == 18 && c0585q.bronze()) {
            c0585q.ochre();
            pVar2 = pVar;
        } else {
            T.p pVar3 = T.p.alpha;
            int i27 = i25 >> 12;
            AbstractC0127k2.alpha(pVar3, asVar, j5, 0L, f5, 0.0f, null, P.e.echo(-2126308228, new C0100e(lVar, dVar2, dVar3, j7, j10, j11, j6, dVar), c0585q), c0585q, (i27 & 896) | (i27 & 112) | 12582918 | ((i25 >> 9) & 57344), 104);
            pVar2 = pVar3;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0104f(dVar, pVar2, lVar, dVar2, dVar3, asVar, j5, f5, j6, j7, j10, j11, i4);
        }
    }

    public static final void bravo(P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(586821353);
        if ((i4 & 147) == 146 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = new H(1);
                c0585q.f(jade);
            }
            q0.ap apVar = (q0.ap) jade;
            T.p pVar = T.p.alpha;
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(pVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, apVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            androidx.appcompat.widget.P0.indigo(6, dVar, c0585q, true);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0096d(dVar, i4);
        }
    }

    public static final void charlie(Function0 function0, P.d dVar, T.p pVar, P.d dVar2, Xd.l lVar, P.d dVar3, P.d dVar4, a0.as asVar, long j5, long j6, long j7, long j10, float f5, U0.t tVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        P.d dVar5;
        P.d dVar6;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-919826268);
        if ((i4 & 6) == 0) {
            i10 = (c0585q.india(function0) ? 4 : 2) | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            dVar5 = dVar;
            i10 |= c0585q.india(dVar5) ? 32 : 16;
        } else {
            dVar5 = dVar;
        }
        if ((i4 & 384) == 0) {
            i10 |= c0585q.golf(pVar) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            dVar6 = dVar2;
            i10 |= c0585q.india(dVar6) ? 2048 : Barcode.FORMAT_UPC_E;
        } else {
            dVar6 = dVar2;
        }
        if ((i4 & 24576) == 0) {
            i10 |= c0585q.india(lVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i4 & 196608) == 0) {
            i10 |= c0585q.india(dVar3) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i10 |= c0585q.india(dVar4) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i10 |= c0585q.golf(asVar) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i10 |= c0585q.foxtrot(j5) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i10 |= c0585q.foxtrot(j6) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i11 = i5 | (c0585q.foxtrot(j7) ? 4 : 2);
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            i11 |= c0585q.foxtrot(j10) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i11 |= c0585q.delta(f5) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i5 & 3072) == 0) {
            i11 |= c0585q.golf(tVar) ? 2048 : Barcode.FORMAT_UPC_E;
        }
        int i12 = i11;
        if ((i10 & 306783379) == 306783378 && (i12 & 1171) == 1170 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            delta(function0, pVar, tVar, P.e.echo(-1852840226, new C0116i(lVar, dVar3, dVar4, asVar, j5, f5, j6, j7, j10, dVar6, dVar5), c0585q), c0585q, (i10 & 14) | 3072 | ((i10 >> 3) & 112) | ((i12 >> 3) & 896), 0);
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0120j(function0, dVar, pVar, dVar2, lVar, dVar3, dVar4, asVar, j5, j6, j7, j10, f5, tVar, i4, i5, 0);
        }
    }

    public static final void delta(Function0 function0, T.p pVar, U0.t tVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1922902937);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i4;
        } else {
            i10 = i4;
        }
        int i15 = i5 & 2;
        if (i15 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            if (c0585q.golf(pVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(tVar)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(dVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i12;
        }
        if ((i10 & 1171) == 1170 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            if (i15 != 0) {
                pVar = T.p.alpha;
            }
            E7.alpha(function0, tVar, P.e.echo(905289008, new C0092c(1, pVar, dVar), c0585q), c0585q, (i10 & 14) | 384 | ((i10 >> 3) & 112), 0);
        }
        T.p pVar2 = pVar;
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0124k(function0, pVar2, tVar, dVar, i4, i5, 0);
        }
    }
}
