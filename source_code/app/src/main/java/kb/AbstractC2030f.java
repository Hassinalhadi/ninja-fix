package kb;

import D0.an;
import Ec.z;
import F.G2;
import Fc.g;
import H0.i;
import H0.n;
import H0.v;
import T.p;
import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import cb.C0841f;
import com.google.mlkit.vision.barcode.common.Barcode;
import d.C1534h0;
import delivery.samurai.android.R;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ob.AbstractC2210c;
import ob.C2209b;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2616b5;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3086y3;

/* renamed from: kb.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2030f {
    public static final n alpha = new n(ArraysKt.sierra(new i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
    public static final long bravo = AbstractC2636d7.charlie(16);
    public static final long charlie = AbstractC2636d7.charlie(32);
    public static final float delta = 68;
    public static final float echo = 12;
    public static final float foxtrot = 14;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    public static final void alpha(C0841f c0841f, s sVar, boolean z2, l lVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        int i10;
        p pVar;
        C2549i c2549i;
        Object obj;
        C2549i c2549i2;
        C2549i c2549i3;
        ?? r5;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(316672851);
        if ((i4 & 6) == 0) {
            if (c0585q.india(c0841f)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(lVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i5 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            p pVar2 = p.alpha;
            float f5 = C2209b.alpha;
            s charlie2 = V.charlie(sVar, 1.0f);
            C0540f golf = AbstractC0542h.golf(16);
            T.i iVar = T.d.f2062f;
            C0554u alpha2 = AbstractC0553t.alpha(golf, iVar, c0585q, 6);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            s charlie3 = T.a.charlie(charlie2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i4 = C2551k.foxtrot;
            C0564b.blue(c2549i4, c0585q, alpha2);
            C2549i c2549i5 = C2551k.echo;
            C0564b.blue(c2549i5, c0585q, mike);
            C2549i c2549i6 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i6);
            }
            C2549i c2549i7 = C2551k.delta;
            C0564b.blue(c2549i7, c0585q, charlie3);
            boolean isEmpty = c0841f.alpha.isEmpty();
            Object obj2 = C0580l.alpha;
            if (!isEmpty) {
                c0585q.purple(-92565416);
                C0554u alpha3 = AbstractC0553t.alpha(AbstractC0542h.golf(12), iVar, c0585q, 6);
                int romeo2 = C0564b.romeo(c0585q);
                I mike2 = c0585q.mike();
                int i16 = i5;
                s charlie4 = T.a.charlie(pVar2, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i4, c0585q, alpha3);
                C0564b.blue(c2549i5, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                    ad.blue(romeo2, c0585q, romeo2, c2549i6);
                }
                C0564b.blue(c2549i7, c0585q, charlie4);
                bravo(AbstractC3086y3.bravo(c0585q, R.string.handshake_cabinets), c0585q, 0);
                C0540f golf2 = AbstractC0542h.golf(8);
                boolean india = c0585q.india(c0841f);
                Object jade = c0585q.jade();
                if (india || jade == obj2) {
                    jade = new C1534h0(c0841f);
                    c0585q.f(jade);
                }
                c2549i = c2549i5;
                i10 = i16;
                pVar = pVar2;
                c2549i2 = c2549i6;
                c2549i3 = c2549i4;
                obj = obj2;
                r5 = 0;
                AbstractC2616b5.delta(null, null, null, golf2, null, null, false, (Function1) jade, c0585q, 24576, 239);
                c0585q.quebec(true);
                c0585q.quebec(false);
                i11 = -95069627;
            } else {
                i10 = i5;
                pVar = pVar2;
                c2549i = c2549i5;
                obj = obj2;
                c2549i2 = c2549i6;
                c2549i3 = c2549i4;
                r5 = 0;
                i11 = -95069627;
                c0585q.purple(-95069627);
                c0585q.quebec(false);
            }
            if (!c0841f.bravo.isEmpty()) {
                c0585q.purple(-89491332);
                C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(12), iVar, c0585q, 6);
                int romeo3 = C0564b.romeo(c0585q);
                I mike3 = c0585q.mike();
                s charlie5 = T.a.charlie(pVar, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i3, c0585q, alpha4);
                C0564b.blue(c2549i, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                    ad.blue(romeo3, c0585q, romeo3, c2549i2);
                }
                C0564b.blue(c2549i7, c0585q, charlie5);
                bravo(AbstractC3086y3.bravo(c0585q, R.string.handshake_packages), c0585q, r5);
                C0540f golf3 = AbstractC0542h.golf(C2209b.november);
                boolean india2 = c0585q.india(c0841f);
                int i17 = i10;
                if ((i17 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = r5;
                }
                boolean z14 = india2 | z12;
                if ((i17 & 7168) == 2048) {
                    z13 = true;
                } else {
                    z13 = r5;
                }
                boolean z15 = z14 | z13;
                Object jade2 = c0585q.jade();
                if (z15 || jade2 == obj) {
                    jade2 = new g(2, c0841f, lVar, z2);
                    c0585q.f(jade2);
                }
                AbstractC2616b5.delta(null, null, null, golf3, null, null, false, (Function1) jade2, c0585q, 24576, 239);
                z11 = true;
                c0585q.quebec(true);
            } else {
                z11 = true;
                c0585q.purple(i11);
            }
            c0585q.quebec(r5);
            c0585q.quebec(z11);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new z(c0841f, sVar, z2, lVar, i4);
        }
    }

    public static final void bravo(String str, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(866365662);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i4 | i5;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(1 & i10, z2)) {
            float f5 = C2209b.alpha;
            c0585q = c0585q2;
            G2.bravo(str, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(AbstractC2210c.golf, bravo, new v(700), null, alpha, 0L, 0, 0L, 0, 16777176), c0585q, i10 & 14, 0, 65534);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.i(str, i4, 12);
        }
    }
}
