package pa;

import A0.z;
import D0.an;
import Ec.af;
import Ec.ai;
import F.AbstractC0174x1;
import F.C0150q1;
import H0.v;
import P.e;
import Q0.n;
import T.i;
import T.p;
import T.s;
import a0.C0366t;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import ao.ad;
import cc.o;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g4.C1752a;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import n.av;
import n.aw;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t0.AbstractC2901T;
import t6.AbstractC3086y3;
import t6.M3;
import t6.S3;
import t6.ac;
import z.AbstractC3447a;
import z.ak;

/* renamed from: pa.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2297c {
    public static final P.d alpha = new P.d(new C1752a(21), -1943990718, false);
    public static final P.d bravo = new P.d(new C1752a(22), -1509613469, false);

    public static final void alpha(String str, String id2, Function0 onLocationClick, Function0 onShiftsClick, p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q;
        Function0 function0;
        p pVar2;
        boolean z10;
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(onLocationClick, "onLocationClick");
        Intrinsics.echo(onShiftsClick, "onShiftsClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1372452424);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q2.golf(id2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q2.india(onLocationClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q2.india(onShiftsClick)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12 | 24576;
        if ((i16 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i16 & 1, z2)) {
            p pVar3 = p.alpha;
            if (c0585q2.kilo(AbstractC2901T.november) == n.purple) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f5 = 16;
            boolean z11 = z10;
            s bravo2 = androidx.compose.foundation.a.bravo(V.charlie(V.romeo(ac.alpha(pVar3, 44, AbstractC2094g.bravo(f5), ao.charlie(251658240), ao.charlie(251658240), 4)), 1.0f), C0366t.echo, AbstractC2094g.bravo(f5));
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q2.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(bravo2, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q2, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q2, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i17))) {
                ad.blue(i17, c0585q2, i17, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie);
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f india = AbstractC0542h.india(24, T.d.f2060c);
            i iVar = T.d.f2062f;
            s whiskey = AbstractC0538d.whiskey(V.charlie(V.romeo(pVar3), 1.0f), 0.0f, f5, 0.0f, f5, 5);
            C0554u alpha2 = AbstractC0553t.alpha(india, iVar, c0585q2, 54);
            long j6 = c0585q2.magenta;
            int i18 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(whiskey, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i18))) {
                ad.blue(i18, c0585q2, i18, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie2);
            C0540f golf = AbstractC0542h.golf(4);
            s uniform = AbstractC0538d.uniform(V.charlie(pVar3, 1.0f), f5, 0.0f, 2);
            C0554u alpha3 = AbstractC0553t.alpha(golf, iVar, c0585q2, 54);
            long j7 = c0585q2.magenta;
            int i19 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q2.mike();
            s charlie3 = T.a.charlie(uniform, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha3);
            C0564b.blue(c2549i2, c0585q2, mike3);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                ad.blue(i19, c0585q2, i19, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie3);
            ak.bravo(str, V.charlie(pVar3, 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(o.alpha, AbstractC2636d7.charlie(18), new v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 5, 0L, 0, 16744408), c0585q2, (i16 & 14) | 48, 0, 65532);
            int i20 = i16 >> 3;
            ak.bravo(id2, j.hotel(pVar3, 2, c0585q2, pVar3, 1.0f), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(AbstractC2298d.charlie, AbstractC2636d7.charlie(12), new v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 5, 0L, 0, 16744408), c0585q2, (i20 & 14) | 48, 0, 65532);
            c0585q = c0585q2;
            int i21 = 1;
            c0585q.quebec(true);
            float f10 = 12;
            C0540f golf2 = AbstractC0542h.golf(f10);
            T.j jVar = T.d.f2061d;
            s whiskey2 = AbstractC0538d.whiskey(V.charlie(pVar3, 1.0f), f5, 0.0f, f5, f10, 2);
            S alpha4 = Q.alpha(golf2, jVar, c0585q, 54);
            long j10 = c0585q.magenta;
            int i22 = (int) (j10 ^ (j10 >>> 32));
            I mike4 = c0585q.mike();
            s charlie4 = T.a.charlie(whiskey2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike4);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                ad.blue(i22, c0585q, i22, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            function0 = onLocationClick;
            bravo(i20 & 112, P0.maroon(1.0f), c0585q, AbstractC3086y3.bravo(c0585q, R.string.location_in_map), function0);
            charlie(AbstractC3086y3.bravo(c0585q, R.string.go_to_shifts), onShiftsClick, P0.maroon(1.0f), e.echo(-1401340392, new Tb.a(i21, z11), c0585q), c0585q, ((i16 >> 6) & 112) | 3072);
            z.papa(c0585q, true, true, true);
            pVar2 = pVar3;
        } else {
            c0585q = c0585q2;
            function0 = onLocationClick;
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Ac.e(str, id2, function0, onShiftsClick, pVar2, i4);
        }
    }

    public static final void bravo(int i4, s sVar, InterfaceC0581m interfaceC0581m, String text, Function0 onClick) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        int i12;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(728496924);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            float f5 = 8;
            float f10 = 10;
            M3.bravo(onClick, V.golf(sVar, 44, 0.0f, 2), null, AbstractC2094g.bravo(12), S3.alpha(1, ao.delta(4292138200L)), null, new M(f5, f10, f5, f10), e.echo(1668848106, new ai(text, 5), c0585q), c0585q, ((i5 >> 3) & 14) | 907542528, 156);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.z(text, onClick, sVar, i4, 2);
        }
    }

    public static final void charlie(String text, Function0 onClick, s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(258942231);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(text)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onClick)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q2.india(dVar)) {
                i10 = 2048;
            } else {
                i10 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i10;
        }
        if ((i5 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(1 & i5, z2)) {
            s golf = V.golf(sVar, 44, 0.0f, 2);
            float f5 = 8;
            float f10 = 10;
            M m4 = new M(f5, f10, f5, f10);
            M m5 = AbstractC3447a.alpha;
            M3.alpha(onClick, golf, false, null, AbstractC2094g.bravo(12), null, AbstractC3447a.alpha(C0366t.bravo, C0366t.echo, c0585q2, 54, 12), m4, e.echo(1729885991, new af(11, text, dVar), c0585q2), c0585q2, ((i5 >> 3) & 14) | 905969664, 92);
            c0585q = c0585q2;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Gb.j(text, onClick, sVar, dVar, i4, 10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(String value, Function1 onValueChange, s sVar, String str, Function0 function0, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        C0585q c0585q;
        s sVar3;
        androidx.compose.runtime.Q uniform;
        s sVar4;
        P.d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 14;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1030082571);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(value)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onValueChange)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        }
        int i17 = i5 & 4;
        if (i17 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) == 0) {
                if (c0585q2.golf(str)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
            }
            if ((i4 & 24576) == 0) {
                if (c0585q2.india(function0)) {
                    i12 = 16384;
                } else {
                    i12 = 8192;
                }
                i10 |= i12;
            }
            boolean z10 = false;
            if ((i10 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i10 & 1, z2)) {
                if (i17 != 0) {
                    sVar4 = p.alpha;
                } else {
                    sVar4 = sVar2;
                }
                as asVar = C0580l.alpha;
                s bravo2 = V.bravo(V.charlie(sVar4, 1.0f), 0.0f, 46, 1);
                if (value.length() > 0) {
                    dVar = alpha;
                } else {
                    dVar = null;
                }
                P.d dVar2 = dVar;
                C2093f bravo3 = AbstractC2094g.bravo(8);
                aw awVar = new aw(1, 3, 115);
                if ((57344 & i10) == 16384) {
                    z10 = true;
                }
                Object jade = c0585q2.jade();
                if (z10 || jade == asVar) {
                    jade = new com.clevertap.android.sdk.variables.b(function0, 1);
                    c0585q2.f(jade);
                }
                av avVar = new av(47, (Function1) jade);
                C0150q1 c0150q1 = C0150q1.alpha;
                long delta = ao.delta(4292138200L);
                long delta2 = ao.delta(4292138200L);
                long j5 = C0366t.echo;
                int i18 = i10;
                c0585q = c0585q2;
                AbstractC0174x1.alpha(value, onValueChange, bravo2, false, null, null, e.echo(-647309308, new Ac.i(str, i16), c0585q), bravo, dVar2, null, false, null, awVar, avVar, true, 0, 0, bravo3, C0150q1.charlie(0L, 0L, j5, j5, 0L, 0L, ao.delta(4280756010L), 0L, delta, delta2, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, c0585q, 2147477199), c0585q, (14 & i18) | 113246208 | (i18 & 112), 12779520, 1866872);
                sVar3 = sVar4;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                sVar3 = sVar2;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C2296b(value, onValueChange, sVar3, str, function0, i4, i5, 0);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        boolean z102 = false;
        if ((i10 & 9363) == 9362) {
        }
        if (!c0585q2.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
