package androidx.compose.material3;

import A0.h;
import F.AbstractC0145p0;
import F.C0131l2;
import F.C0135m2;
import F.C0139n2;
import F.L1;
import F.Z1;
import H.t;
import T.d;
import T.p;
import T.s;
import a0.as;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.selection.b;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import bz.G;
import bz.InterfaceC0799y;
import bz.f0;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.R3;

/* loaded from: classes3.dex */
public abstract class a {
    public static final float alpha;
    public static final float bravo;
    public static final float charlie;
    public static final float delta;
    public static final float echo;
    public static final G foxtrot;
    public static final f0 golf;

    static {
        float f5 = t.bravo;
        alpha = f5;
        bravo = t.golf;
        charlie = t.foxtrot;
        float f10 = t.delta;
        delta = f10;
        echo = (f10 - f5) / 2;
        foxtrot = new G(0);
        golf = new f0(100, (InterfaceC0799y) null, 6);
    }

    public static final void alpha(boolean z2, Function1 function1, s sVar, boolean z10, C0131l2 c0131l2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1580463220);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        int i15 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q.hotel(z10)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.golf(c0131l2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i15 |= i10;
        }
        int i16 = i15 | 1572864;
        if ((599187 & i16) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            c0585q.orange();
            int i17 = i4 & 1;
            s sVar2 = p.alpha;
            if (i17 != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            c0585q.purple(783532531);
            Object jade = c0585q.jade();
            if (jade == C0580l.alpha) {
                jade = ad.xray(c0585q);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            c0585q.quebec(false);
            if (function1 != null) {
                E0 e02 = AbstractC0145p0.alpha;
                s bravo2 = b.bravo(MinimumInteractiveModifier.alpha, z2, interfaceC1673j, z10, new h(2), function1);
                interfaceC1673j = interfaceC1673j;
                sVar2 = bravo2;
            }
            s india = V.india(V.sierra(sVar.then(sVar2), d.teal, 2), charlie, delta);
            float f5 = t.alpha;
            int i18 = i16 << 3;
            int i19 = i16 >> 6;
            bravo(india, z2, z10, c0131l2, interfaceC1673j, Z1.alpha(c0585q, 5), c0585q, (i18 & 112) | (i19 & 896) | (i19 & 7168) | (i18 & 57344));
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0135m2(z2, function1, sVar, z10, c0131l2, i4);
        }
    }

    public static final void bravo(s sVar, boolean z2, boolean z10, C0131l2 c0131l2, InterfaceC1673j interfaceC1673j, as asVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        long j5;
        long j6;
        long j7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1594099146);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z10)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(c0131l2)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.india(null)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i5 |= i12;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.golf(interfaceC1673j)) {
                i11 = 131072;
            } else {
                i11 = 65536;
            }
            i5 |= i11;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(asVar)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i5 |= i10;
        }
        if ((i5 & 599187) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
        } else {
            if (z10) {
                if (z2) {
                    j5 = c0131l2.bravo;
                } else {
                    j5 = c0131l2.foxtrot;
                }
            } else if (z2) {
                j5 = c0131l2.juliet;
            } else {
                j5 = c0131l2.november;
            }
            if (z10) {
                if (z2) {
                    j6 = c0131l2.alpha;
                } else {
                    j6 = c0131l2.echo;
                }
            } else if (z2) {
                j6 = c0131l2.india;
            } else {
                j6 = c0131l2.mike;
            }
            float f5 = t.alpha;
            as alpha2 = Z1.alpha(c0585q, 5);
            float f10 = t.echo;
            if (z10) {
                if (z2) {
                    j7 = c0131l2.charlie;
                } else {
                    j7 = c0131l2.golf;
                }
            } else if (z2) {
                j7 = c0131l2.kilo;
            } else {
                j7 = c0131l2.oscar;
            }
            s bravo2 = androidx.compose.foundation.a.bravo(R3.charlie(sVar, f10, j7, alpha2), j5, alpha2);
            ap delta2 = AbstractC0547m.delta(d.alpha, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            s bravo3 = androidx.compose.foundation.a.bravo(androidx.compose.foundation.d.alpha(C0551q.alpha.alpha(p.alpha, d.silver).then(new ThumbElement(interfaceC1673j, z2)), interfaceC1673j, L1.bravo(false, t.charlie / 2, c0585q, 54, 4)), j6, asVar);
            ap delta3 = AbstractC0547m.delta(d.teal, false);
            int romeo2 = C0564b.romeo(c0585q);
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(bravo3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            c0585q.purple(1163457794);
            c0585q.quebec(false);
            c0585q.quebec(true);
            c0585q.quebec(true);
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0139n2(sVar, z2, z10, c0131l2, interfaceC1673j, asVar, i4);
        }
    }
}
