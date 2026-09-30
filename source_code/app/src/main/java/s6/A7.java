package s6;

import D0.an;
import F.AbstractC0127k2;
import F.G2;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import n.AbstractC2134i;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import qb.C2449p;
import qb.C2450q;
import qb.C2452s;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.A7;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;
import t0.InterfaceC2937r0;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.W3;

/* loaded from: classes2.dex */
public abstract class A7 {
    public static final void alpha(Function0 onGoOnlineClick, T.s sVar, String str, String str2, String str3, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        String str4;
        String str5;
        String str6;
        boolean z11;
        boolean z12;
        String bravo;
        int i10;
        String str7;
        String str8;
        Intrinsics.echo(onGoOnlineClick, "onGoOnlineClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1146584249);
        if (c0585q.india(onGoOnlineClick)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i4 | i5 | 1778816;
        if ((599187 & i11) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i11 & 1, z10)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                str8 = str2;
                bravo = str3;
                z12 = z2;
                i10 = i11 & (-65409);
                str7 = str;
            } else {
                String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.offline_card_title);
                String bravo3 = AbstractC3086y3.bravo(c0585q, R.string.offline_card_subtitle);
                z12 = true;
                bravo = AbstractC3086y3.bravo(c0585q, R.string.offline_card_button);
                i10 = i11 & (-65409);
                str7 = bravo2;
                str8 = bravo3;
            }
            c0585q.romeo();
            String str9 = bravo;
            bravo(new C2449p(str7, str8, bravo), onGoOnlineClick, sVar, null, 0L, 0L, 0L, 0L, 0L, z12, c0585q, ((i10 << 3) & 1008) | 805306368, 6, HttpConstants.HTTP_GATEWAY_TIMEOUT);
            z11 = z12;
            str4 = str7;
            str5 = str8;
            str6 = str9;
        } else {
            c0585q.ochre();
            str4 = str;
            str5 = str2;
            str6 = str3;
            z11 = z2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2450q(onGoOnlineClick, sVar, str4, str5, str6, z11, i4, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final C2449p data, final Function0 onGoOnlineClick, T.s sVar, C2093f c2093f, long j5, long j6, long j7, long j10, long j11, boolean z2, InterfaceC0581m interfaceC0581m, int i4, int i5, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        C0585q c0585q;
        C2093f c2093f2;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        androidx.compose.runtime.Q uniform;
        C2093f bravo;
        long j17;
        long j18;
        long j19;
        long j20;
        int i14;
        int i15;
        int i16;
        Intrinsics.echo(data, "data");
        Intrinsics.echo(onGoOnlineClick, "onGoOnlineClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1987195837);
        int i17 = 4;
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(data)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i4;
        } else {
            i11 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onGoOnlineClick)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.golf(sVar)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i4 & 3072) == 0) {
            i11 |= Barcode.FORMAT_UPC_E;
        }
        if ((i4 & 24576) == 0) {
            i11 |= 8192;
        }
        if ((196608 & i4) == 0) {
            i11 |= 65536;
        }
        if ((1572864 & i4) == 0) {
            i11 |= 524288;
        }
        if ((12582912 & i4) == 0) {
            i11 |= 4194304;
        }
        int i18 = i10 & 512;
        if (i18 != 0) {
            i11 |= 805306368;
        } else if ((805306368 & i4) == 0) {
            z10 = z2;
            if (c0585q2.hotel(z10)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i11 |= i12;
            if ((i10 & Barcode.FORMAT_UPC_E) == 0) {
                i13 = i5 | 6;
            } else if ((i5 & 6) == 0) {
                if (!c0585q2.golf(null)) {
                    i17 = 2;
                }
                i13 = i5 | i17;
            } else {
                i13 = i5;
            }
            if ((273228947 & i11) != 273228946 && (i13 & 3) == 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!c0585q2.magenta(i11 & 1, z11)) {
                c0585q2.orange();
                if ((i4 & 1) != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    bravo = c2093f;
                    j17 = j5;
                    j18 = j6;
                    j19 = j7;
                    j15 = j10;
                    j20 = j11;
                } else {
                    bravo = AbstractC2094g.bravo(16);
                    j17 = Db.c.ochre;
                    j18 = Db.c.foxtrot;
                    j19 = Db.c.blue;
                    j15 = Db.c.golf;
                    if (i18 != 0) {
                        z10 = true;
                    }
                    j20 = j18;
                }
                c0585q2.romeo();
                C2093f c2093f3 = bravo;
                c2093f2 = c2093f3;
                final boolean z12 = z10;
                final long j21 = j18;
                final long j22 = j19;
                final long j23 = j15;
                AbstractC0127k2.alpha(t6.ac.alpha(androidx.compose.foundation.layout.V.echo(sVar, 220), 44, c2093f3, Db.c.gray, Db.c.gold, 4), c2093f2, Db.c.emerald, 0L, 0.0f, 0, t6.S3.alpha(1, j17), P.e.echo(843095070, new Xd.l() { // from class: qb.r
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        boolean z13;
                        InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                        int intValue = ((Integer) obj2).intValue();
                        if ((intValue & 3) != 2) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        C0585q c0585q3 = (C0585q) interfaceC0581m2;
                        if (c0585q3.magenta(intValue & 1, z13)) {
                            T.p pVar = T.p.alpha;
                            float f5 = 24;
                            float f10 = 16;
                            T.s victor = AbstractC0538d.victor(V.charlie(pVar, 1.0f), f5, f10, f5, f10);
                            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.golf(8), T.d.f2063g, c0585q3, 54);
                            long j24 = c0585q3.magenta;
                            int i19 = (int) (j24 ^ (j24 >>> 32));
                            I mike = c0585q3.mike();
                            T.s charlie = T.a.charlie(victor, c0585q3);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j = C2551k.bravo;
                            c0585q3.white();
                            if (c0585q3.lime) {
                                c0585q3.lima(c2550j);
                            } else {
                                c0585q3.i();
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q3, alpha);
                            C0564b.blue(C2551k.echo, c0585q3, mike);
                            C2549i c2549i = C2551k.golf;
                            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(i19))) {
                                ao.ad.blue(i19, c0585q3, i19, c2549i);
                            }
                            C0564b.blue(C2551k.delta, c0585q3, charlie);
                            W3.alpha(AbstractC3076w3.charlie(R.drawable.smartphone_line, c0585q3, 6), null, V.kilo(AbstractC0538d.sierra(pVar, 1), 56), null, C2391j.echo, 0.0f, null, c0585q3, 25008, 104);
                            C2449p c2449p = C2449p.this;
                            G2.bravo(c2449p.alpha, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j21, AbstractC2636d7.charlie(22), H0.v.f1409c, null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65534);
                            G2.bravo(c2449p.bravo, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(j22, AbstractC2636d7.charlie(16), H0.v.f1407a, null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q3, 0, 0, 65534);
                            A7.charlie(c2449p.charlie, onGoOnlineClick, V.charlie(pVar, 1.0f), z12, j23, c0585q3, 384);
                            c0585q3.quebec(true);
                        } else {
                            c0585q3.ochre();
                        }
                        return Unit.INSTANCE;
                    }
                }, c0585q2), c0585q2, 12779520, 24);
                c0585q = c0585q2;
                j12 = j17;
                j16 = j20;
                j13 = j18;
                j14 = j19;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                c2093f2 = c2093f;
                j12 = j5;
                j13 = j6;
                j14 = j7;
                j15 = j10;
                j16 = j11;
            }
            boolean z13 = z10;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C2452s(data, onGoOnlineClick, sVar, c2093f2, j12, j13, j14, j15, j16, z13, i4, i5, i10, 0);
                return;
            }
            return;
        }
        z10 = z2;
        if ((i10 & Barcode.FORMAT_UPC_E) == 0) {
        }
        if ((273228947 & i11) != 273228946) {
        }
        z11 = true;
        if (!c0585q2.magenta(i11 & 1, z11)) {
        }
        boolean z132 = z10;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(final String str, final Function0 function0, final T.s sVar, final boolean z2, final long j5, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        C0585q c0585q;
        long bravo;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1383562831);
        if (c0585q2.golf(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i14 = i4 | i5;
        if (c0585q2.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i15 = i14 | i10;
        if (c0585q2.hotel(z2)) {
            i11 = 2048;
        } else {
            i11 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i11;
        if (c0585q2.golf(null)) {
            i12 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i12 = 8192;
        }
        int i17 = i16 | i12;
        if (c0585q2.foxtrot(j5)) {
            i13 = 131072;
        } else {
            i13 = 65536;
        }
        int i18 = i17 | i13;
        if ((74899 & i18) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i18 & 1, z10)) {
            T.s alpha = AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(sVar, 55), AbstractC2094g.bravo(12));
            if (z2) {
                bravo = j5;
            } else {
                bravo = C0366t.bravo(0.55f, j5);
            }
            T.s echo = androidx.compose.foundation.a.echo(12, androidx.compose.foundation.a.bravo(alpha, bravo, a0.ao.alpha), null, function0, z2);
            q0.ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j6 = c0585q2.magenta;
            int i19 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie = T.a.charlie(echo, c0585q2);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q2, delta);
            C0564b.blue(C2551k.echo, c0585q2, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i19))) {
                ao.ad.blue(i19, c0585q2, i19, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q2, charlie);
            F.G2.bravo(str, null, C0366t.echo, 0L, null, null, AbstractC2636d7.bravo(0.5d), null, 0L, 0, false, 0, 0, null, new D0.an(Db.c.emerald, AbstractC2636d7.charlie(18), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q2, (i18 & 14) | 12583296, 0, 65402);
            c0585q = c0585q2;
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l(str, function0, sVar, z2, j5, i4) { // from class: qb.t
                public final /* synthetic */ String alpha;
                public final /* synthetic */ Function0 purple;
                public final /* synthetic */ T.s red;
                public final /* synthetic */ boolean silver;
                public final /* synthetic */ long teal;

                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(385);
                    boolean z11 = this.silver;
                    long j7 = this.teal;
                    A7.charlie(this.alpha, this.purple, this.red, z11, j7, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void delta(int i4, Function1 onVerify, T.p pVar, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        boolean z2;
        T.p pVar2;
        boolean z10;
        androidx.compose.runtime.ax axVar;
        boolean z11;
        int i12 = 0;
        Intrinsics.echo(onVerify, "onVerify");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2088596479);
        if (c0585q.echo(i4)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i5 | i10;
        if (c0585q.india(onVerify)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11 | 384;
        if ((i14 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i14 & 1, z2)) {
            T.p pVar3 = T.p.alpha;
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = C0564b.zulu("");
                c0585q.f(jade);
            }
            androidx.compose.runtime.ax axVar2 = (androidx.compose.runtime.ax) jade;
            if (((String) axVar2.getValue()).length() == i4) {
                z10 = true;
            } else {
                z10 = false;
            }
            float f5 = 24;
            float f10 = 0;
            T.s alpha = T.a.alpha(AbstractC0538d.tango(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie(pVar3, 1.0f), C0366t.echo, AbstractC2094g.charlie(f5, f5, f10, f10)), 16, 20), AbstractC2911e0.alpha, new androidx.compose.foundation.layout.d0(i12));
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(12), T.d.f2062f, c0585q, 6);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(alpha, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i15))) {
                ao.ad.blue(i15, c0585q, i15, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            String bravo = AbstractC3086y3.bravo(c0585q, R.string.verification_required);
            long charlie2 = AbstractC2636d7.charlie(24);
            H0.n nVar = new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)}));
            H0.v vVar = new H0.v(700);
            long j6 = Db.c.lime;
            D0.an anVar = new D0.an(j6, charlie2, vVar, null, nVar, 0L, 0, 0L, 0, 16777176);
            boolean z12 = z10;
            z.ak.bravo(bravo, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, anVar, c0585q, 0, 0, 65534);
            z.ak.bravo(AbstractC3086y3.bravo(c0585q, R.string.enter_verification_pin), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j6, AbstractC2636d7.charlie(14), new H0.v(HttpConstants.HTTP_BLOCKED), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar3, 4), c0585q);
            String str = (String) axVar2.getValue();
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                axVar = axVar2;
                jade2 = new Cb.i(axVar, 18);
                c0585q.f(jade2);
            } else {
                axVar = axVar2;
            }
            androidx.compose.runtime.ax axVar3 = axVar;
            echo(i4, str, (Function1) jade2, null, false, c0585q, (i14 & 14) | 384, 24);
            String juliet = com.google.android.material.datepicker.j.juliet(pVar3, 8, c0585q, R.string.mark_as_complete, c0585q);
            D0.an anVar2 = new D0.an(0L, AbstractC2636d7.charlie(18), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744409);
            T.s echo = androidx.compose.foundation.layout.V.echo(pVar3, 55);
            if ((i14 & 112) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object jade3 = c0585q.jade();
            if (z11 || jade3 == asVar) {
                jade3 = new Ac.j(1, axVar3, onVerify);
                c0585q.f(jade3);
            }
            Pa.i.foxtrot(juliet, (Function0) jade3, z12, echo, P.e.echo(-1045709114, new Tb.a(i12, z12), c0585q), anVar2, c0585q, 27648, 32);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, onVerify, pVar2, i5, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void echo(final int i4, final String value, final Function1 onValueChange, T.s sVar, boolean z2, InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        int i11;
        T.s sVar2;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        C0585q c0585q;
        final T.s sVar3;
        final boolean z12;
        androidx.compose.runtime.Q uniform;
        T.s sVar4;
        boolean z13;
        boolean z14;
        int i16;
        int i17;
        int i18;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(onValueChange, "onValueChange");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1956110020);
        if ((i5 & 6) == 0) {
            if (c0585q2.echo(i4)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i5;
        } else {
            i11 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q2.golf(value)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i5 & 384) == 0) {
            if (c0585q2.india(onValueChange)) {
                i16 = Barcode.FORMAT_QR_CODE;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        int i19 = i10 & 8;
        if (i19 != 0) {
            i11 |= 3072;
        } else if ((i5 & 3072) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i11 |= i12;
            i13 = i10 & 16;
            if (i13 == 0) {
                i11 |= 24576;
            } else if ((i5 & 24576) == 0) {
                z10 = z2;
                if (c0585q2.hotel(z10)) {
                    i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i14 = 8192;
                }
                i11 |= i14;
                i15 = i11;
                if ((i15 & 9363) != 9362) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0585q2.magenta(i15 & 1, z11)) {
                    if (i19 != 0) {
                        sVar4 = T.p.alpha;
                    } else {
                        sVar4 = sVar2;
                    }
                    if (i13 != 0) {
                        z10 = true;
                    }
                    Object jade = c0585q2.jade();
                    androidx.compose.runtime.as asVar = C0580l.alpha;
                    if (jade == asVar) {
                        jade = new Y.s();
                        c0585q2.f(jade);
                    }
                    Y.s sVar5 = (Y.s) jade;
                    InterfaceC2937r0 interfaceC2937r0 = (InterfaceC2937r0) c0585q2.kilo(AbstractC2901T.papa);
                    T.s charlie = androidx.compose.foundation.layout.V.charlie(androidx.compose.ui.focus.a.alpha(sVar4, sVar5), 1.0f);
                    n.aw awVar = new n.aw(3, 7, 115);
                    T.s sVar6 = sVar4;
                    long j5 = C0366t.juliet;
                    a0.au auVar = new a0.au(j5);
                    D0.an anVar = new D0.an(j5, 0L, null, null, null, 0L, 0, 0L, 0, 16777214);
                    if ((i15 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if ((i15 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    boolean z15 = z13 | z14;
                    Object jade2 = c0585q2.jade();
                    if (z15 || jade2 == asVar) {
                        jade2 = new Aa.d(i4, onValueChange, 2);
                        c0585q2.f(jade2);
                    }
                    Function1 function1 = (Function1) jade2;
                    boolean z16 = z10;
                    int i20 = i15 >> 3;
                    AbstractC2134i.alpha(value, function1, charlie, z16, false, anVar, awVar, null, true, 0, 0, null, null, null, auVar, P.e.echo(1594868903, new Tb.b(i4, value, z16, interfaceC2937r0, sVar5, 0), c0585q2), c0585q2, (i20 & 14) | 102432768 | (i20 & 7168), 221184, 16016);
                    c0585q = c0585q2;
                    Unit unit = Unit.INSTANCE;
                    Object jade3 = c0585q.jade();
                    if (jade3 == asVar) {
                        jade3 = new Tb.d(sVar5, null);
                        c0585q.f(jade3);
                    }
                    C0564b.foxtrot((Xd.l) jade3, c0585q, unit);
                    z12 = z16;
                    sVar3 = sVar6;
                } else {
                    c0585q = c0585q2;
                    c0585q.ochre();
                    sVar3 = sVar2;
                    z12 = z10;
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                    uniform.delta = new Xd.l() { // from class: Tb.c
                        @Override // Xd.l
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int cyan = C0564b.cyan(i5 | 1);
                            boolean z17 = z12;
                            A7.echo(i4, value, onValueChange, sVar3, z17, (InterfaceC0581m) obj, cyan, i10);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            z10 = z2;
            i15 = i11;
            if ((i15 & 9363) != 9362) {
            }
            if (c0585q2.magenta(i15 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        sVar2 = sVar;
        i13 = i10 & 16;
        if (i13 == 0) {
        }
        z10 = z2;
        i15 = i11;
        if ((i15 & 9363) != 9362) {
        }
        if (c0585q2.magenta(i15 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }
}
