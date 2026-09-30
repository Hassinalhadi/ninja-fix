package Vc;

import A0.z;
import F.AbstractC0141o0;
import F.G2;
import F.K1;
import F.ak;
import F.al;
import H0.v;
import T.s;
import a0.C0366t;
import a0.an;
import a0.ao;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import ao.ad;
import b.ab;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import h.AbstractC1797a;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.S3;
import t6.ac;

/* loaded from: classes2.dex */
public abstract class j {
    public static final long alpha = ao.delta(4280468830L);
    public static final long bravo = ao.delta(4293870660L);
    public static final long charlie = ao.delta(4292617766L);
    public static final long delta = ao.delta(4294898418L);
    public static final long echo = ao.delta(4280756010L);
    public static final long foxtrot = ao.delta(4288782762L);
    public static final long golf = ao.delta(4285624698L);
    public static final C2093f hotel = AbstractC2094g.bravo(16);
    public static final C2093f india = AbstractC2094g.bravo(10);

    /* JADX WARN: Removed duplicated region for block: B:153:0x08a3  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final float f5, final String str, final boolean z2, String str2, Function0 function0, s sVar, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        String str3;
        int i11;
        int i12;
        int i13;
        Function0 function02;
        int i14;
        int i15;
        s sVar2;
        int i16;
        int i17;
        boolean z10;
        final Function0 function03;
        final s sVar3;
        final String str4;
        Q uniform;
        String str5;
        long j5;
        String oscar;
        float f10;
        boolean z11;
        C2549i c2549i;
        float f11;
        int i18;
        int i19;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1154391479);
        if ((i4 & 6) == 0) {
            if (c0585q.delta(f5)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.hotel(z2)) {
                i18 = Barcode.FORMAT_QR_CODE;
            } else {
                i18 = 128;
            }
            i10 |= i18;
        }
        int i20 = i5 & 8;
        if (i20 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            str3 = str2;
            if (c0585q.golf(str3)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            i12 = i5 & 16;
            if (i12 == 0) {
                i10 |= 24576;
                function02 = function0;
                i13 = 32;
            } else {
                i13 = 32;
                if ((i4 & 24576) == 0) {
                    function02 = function0;
                    if (c0585q.india(function02)) {
                        i14 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i14 = 8192;
                    }
                    i10 |= i14;
                } else {
                    function02 = function0;
                }
            }
            i15 = i5 & 32;
            if (i15 == 0) {
                i10 |= 196608;
                sVar2 = sVar;
            } else {
                sVar2 = sVar;
                if ((i4 & 196608) == 0) {
                    if (c0585q.golf(sVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i10 |= i16;
                }
            }
            i17 = i10;
            if ((i17 & 74883) == 74882) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!c0585q.magenta(i17 & 1, z10)) {
                if (i20 != 0) {
                    str5 = "";
                } else {
                    str5 = str3;
                }
                as asVar = C0580l.alpha;
                if (i12 != 0) {
                    Object jade = c0585q.jade();
                    if (jade == asVar) {
                        jade = new Q4.a(29);
                        c0585q.f(jade);
                    }
                    function02 = (Function0) jade;
                }
                T.p pVar = T.p.alpha;
                if (i15 != 0) {
                    sVar2 = pVar;
                }
                if (f5 < 0.0f) {
                    j5 = bravo;
                } else {
                    j5 = alpha;
                }
                long j6 = j5;
                if (z2) {
                    oscar = Q0.c.oscar(c0585q, 673753222, R.string.balance_on_hold, c0585q, false);
                } else {
                    oscar = Q0.c.oscar(c0585q, 673827374, R.string.balance, c0585q, false);
                }
                s charlie2 = V.charlie(sVar2, 1.0f);
                float f12 = 8;
                C2093f c2093f = hotel;
                s alpha2 = AbstractC3087z.alpha(ac.alpha(charlie2, f12, c2093f, 0L, 0L, 28), c2093f);
                float f13 = 1;
                long j7 = Db.c.beige;
                s charlie3 = R3.charlie(alpha2, f13, j7, c2093f);
                long j10 = Db.c.bronze;
                an anVar = ao.alpha;
                s bravo2 = androidx.compose.foundation.a.bravo(charlie3, j10, anVar);
                float f14 = 16;
                s sierra = AbstractC0538d.sierra(bravo2, f14);
                float f15 = 24;
                C0540f golf2 = AbstractC0542h.golf(f15);
                T.i iVar = T.d.f2062f;
                C0554u alpha3 = AbstractC0553t.alpha(golf2, iVar, c0585q, 6);
                long j11 = c0585q.magenta;
                int i21 = (int) (j11 ^ (j11 >>> i13));
                I mike = c0585q.mike();
                s charlie4 = T.a.charlie(sierra, c0585q);
                InterfaceC2552l.maroon.getClass();
                s sVar4 = sVar2;
                C2550j c2550j = C2551k.bravo;
                c0585q.white();
                Function0 function04 = function02;
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C2549i c2549i2 = C2551k.foxtrot;
                C0564b.blue(c2549i2, c0585q, alpha3);
                C2549i c2549i3 = C2551k.echo;
                C0564b.blue(c2549i3, c0585q, mike);
                C2549i c2549i4 = C2551k.golf;
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i21))) {
                    ad.blue(i21, c0585q, i21, c2549i4);
                }
                C2549i c2549i5 = C2551k.delta;
                C0564b.blue(c2549i5, c0585q, charlie4);
                C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), iVar, c0585q, 6);
                long j12 = c0585q.magenta;
                int i22 = (int) (j12 ^ (j12 >>> i13));
                I mike2 = c0585q.mike();
                s charlie5 = T.a.charlie(pVar, c0585q);
                c0585q.white();
                String str6 = oscar;
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha4);
                C0564b.blue(c2549i3, c0585q, mike2);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                    ad.blue(i22, c0585q, i22, c2549i4);
                }
                C0564b.blue(c2549i5, c0585q, charlie5);
                float f16 = 4;
                C0554u alpha5 = AbstractC0553t.alpha(AbstractC0542h.golf(f16), iVar, c0585q, 6);
                long j13 = c0585q.magenta;
                int i23 = (int) (j13 ^ (j13 >>> i13));
                I mike3 = c0585q.mike();
                s charlie6 = T.a.charlie(pVar, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha5);
                C0564b.blue(c2549i3, c0585q, mike3);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i23))) {
                    ad.blue(i23, c0585q, i23, c2549i4);
                }
                C0564b.blue(c2549i5, c0585q, charlie6);
                long charlie7 = AbstractC2636d7.charlie(16);
                H0.n nVar = Db.g.alpha;
                v vVar = v.yellow;
                G2.bravo(str6, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j7, charlie7, vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                T.j jVar = T.d.f2061d;
                S alpha6 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
                long j14 = c0585q.magenta;
                int i24 = (int) (j14 ^ (j14 >>> i13));
                I mike4 = c0585q.mike();
                s charlie8 = T.a.charlie(pVar, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha6);
                C0564b.blue(c2549i3, c0585q, mike4);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i24))) {
                    ad.blue(i24, c0585q, i24, c2549i4);
                }
                C0564b.blue(c2549i5, c0585q, charlie8);
                AbstractC1680b charlie9 = AbstractC3076w3.charlie(R.drawable.ic_cash_fill, c0585q, 6);
                s kilo = V.kilo(pVar, f15);
                long j15 = foxtrot;
                AbstractC0141o0.alpha(charlie9, null, kilo, j15, c0585q, 3504, 0);
                String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f5)}, 1));
                long charlie10 = AbstractC2636d7.charlie(24);
                v vVar2 = v.f1409c;
                D0.an anVar2 = new D0.an(j6, charlie10, vVar2, null, nVar, 0L, 0, 0L, 0, 16777176);
                long charlie11 = AbstractC2636d7.charlie(14);
                if (1.0f <= 0.0d) {
                    AbstractC1797a.alpha("invalid weight; must be greater than zero");
                }
                if (1.0f > Float.MAX_VALUE) {
                    f10 = Float.MAX_VALUE;
                } else {
                    f10 = 1.0f;
                }
                c.alpha(format, anVar2, new LayoutWeightElement(f10, false), charlie11, 0, 0, c0585q, 3072, 48);
                c0585q.quebec(true);
                c0585q.quebec(true);
                s charlie12 = V.charlie(pVar, 1.0f);
                float f17 = 12;
                C0540f golf3 = AbstractC0542h.golf(f17);
                T.j jVar2 = T.d.f2060c;
                S alpha7 = androidx.compose.foundation.layout.Q.alpha(golf3, jVar2, c0585q, 6);
                long j16 = c0585q.magenta;
                int i25 = (int) (j16 ^ (j16 >>> i13));
                I mike5 = c0585q.mike();
                s charlie13 = T.a.charlie(charlie12, c0585q);
                c0585q.white();
                if (c0585q.lime) {
                    c0585q.lima(c2550j);
                } else {
                    c0585q.i();
                }
                C0564b.blue(c2549i2, c0585q, alpha7);
                C0564b.blue(c2549i3, c0585q, mike5);
                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i25))) {
                    ad.blue(i25, c0585q, i25, c2549i4);
                }
                C0564b.blue(c2549i5, c0585q, charlie13);
                s maroon = P0.maroon(1.0f);
                ab alpha8 = S3.alpha(f13, j7);
                M m4 = al.alpha;
                long j17 = Db.c.amber;
                ak delta2 = al.delta(0L, 0L, j17, j15, c0585q, 3);
                M m5 = al.alpha;
                Object jade2 = c0585q.jade();
                if (jade2 == asVar) {
                    jade2 = new i(0);
                    c0585q.f(jade2);
                }
                P.d dVar = c.bravo;
                C2093f c2093f2 = india;
                K1.hotel((Function0) jade2, maroon, false, c2093f2, delta2, null, alpha8, m5, dVar, c0585q, 805309830, 288);
                s maroon2 = P0.maroon(1.0f);
                ab alpha9 = S3.alpha(f13, j7);
                ak delta3 = al.delta(0L, 0L, j17, j15, c0585q, 3);
                Object jade3 = c0585q.jade();
                if (jade3 == asVar) {
                    jade3 = new i(1);
                    c0585q.f(jade3);
                }
                K1.hotel((Function0) jade3, maroon2, false, c2093f2, delta3, null, alpha9, m5, c.charlie, c0585q, 805309830, 288);
                c0585q = c0585q;
                c0585q.quebec(true);
                c0585q.quebec(true);
                if (z2) {
                    c0585q.purple(-353005505);
                    C0554u alpha10 = AbstractC0553t.alpha(AbstractC0542h.golf(f17), iVar, c0585q, 6);
                    long j18 = c0585q.magenta;
                    int i26 = (int) (j18 ^ (j18 >>> i13));
                    I mike6 = c0585q.mike();
                    s charlie14 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha10);
                    C0564b.blue(c2549i3, c0585q, mike6);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i26))) {
                        c2549i = c2549i4;
                        ad.blue(i26, c0585q, i26, c2549i);
                    } else {
                        c2549i = c2549i4;
                    }
                    C0564b.blue(c2549i5, c0585q, charlie14);
                    s charlie15 = V.charlie(pVar, 1.0f);
                    C2093f bravo3 = AbstractC2094g.bravo(f17);
                    long j19 = bravo;
                    s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(R3.charlie(charlie15, f13, j19, bravo3), AbstractC2094g.bravo(f17)), C0366t.echo, anVar), f17);
                    C0554u alpha11 = AbstractC0553t.alpha(AbstractC0542h.golf(f14), iVar, c0585q, 6);
                    long j20 = c0585q.magenta;
                    int i27 = (int) (j20 ^ (j20 >>> i13));
                    I mike7 = c0585q.mike();
                    s charlie16 = T.a.charlie(sierra2, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha11);
                    C0564b.blue(c2549i3, c0585q, mike7);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i27))) {
                        ad.blue(i27, c0585q, i27, c2549i);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie16);
                    s charlie17 = V.charlie(pVar, 1.0f);
                    S alpha12 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, jVar2, c0585q, 54);
                    long j21 = c0585q.magenta;
                    int i28 = (int) (j21 ^ (j21 >>> i13));
                    I mike8 = c0585q.mike();
                    s charlie18 = T.a.charlie(charlie17, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha12);
                    C0564b.blue(c2549i3, c0585q, mike8);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i28))) {
                        ad.blue(i28, c0585q, i28, c2549i);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie18);
                    C0554u alpha13 = AbstractC0553t.alpha(AbstractC0542h.golf(f16), iVar, c0585q, 6);
                    long j22 = c0585q.magenta;
                    int i29 = (int) (j22 ^ (j22 >>> i13));
                    I mike9 = c0585q.mike();
                    s charlie19 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha13);
                    C0564b.blue(c2549i3, c0585q, mike9);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i29))) {
                        ad.blue(i29, c0585q, i29, c2549i);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie19);
                    C2549i c2549i6 = c2549i;
                    G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.amount_to_settle), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(golf, AbstractC2636d7.charlie(16), vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                    S alpha14 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
                    long j23 = c0585q.magenta;
                    int i30 = (int) (j23 ^ (j23 >>> i13));
                    I mike10 = c0585q.mike();
                    s charlie20 = T.a.charlie(pVar, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha14);
                    C0564b.blue(c2549i3, c0585q, mike10);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i30))) {
                        ad.blue(i30, c0585q, i30, c2549i6);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie20);
                    AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_cash_fill, c0585q, 6), null, V.kilo(pVar, f15), j15, c0585q, 3504, 0);
                    D0.an anVar3 = new D0.an(j19, AbstractC2636d7.charlie(i13), vVar2, null, nVar, 0L, 0, 0L, 0, 16777176);
                    long charlie21 = AbstractC2636d7.charlie(16);
                    if (1.0f <= 0.0d) {
                        AbstractC1797a.alpha("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f11 = Float.MAX_VALUE;
                    } else {
                        f11 = 1.0f;
                    }
                    c.alpha(str5, anVar3, new LayoutWeightElement(f11, false), charlie21, 0, 0, c0585q, ((i17 >> 9) & 14) | 3072, 48);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    String bravo4 = AbstractC3086y3.bravo(c0585q, R.string.action_needed);
                    long charlie22 = AbstractC2636d7.charlie(12);
                    long j24 = echo;
                    G2.bravo(bravo4, AbstractC0538d.tango(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(pVar, AbstractC2094g.bravo(f16)), j7, anVar), f16, 2), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j24, charlie22, vVar2, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65532);
                    c0585q.quebec(true);
                    K1.bravo(function04, V.charlie(pVar, 1.0f), false, c2093f2, al.alpha(j24, 0L, 0L, 0L, c0585q, 14), null, null, m5, c.delta, c0585q, ((i17 >> 12) & 14) | 805309488, 356);
                    c0585q.quebec(true);
                    s sierra3 = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(R3.charlie(V.charlie(pVar, 1.0f), f13, j19, AbstractC2094g.bravo(f12)), AbstractC2094g.bravo(f12)), delta, anVar), f17);
                    S alpha15 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(f17), jVar, c0585q, 54);
                    long j25 = c0585q.magenta;
                    int i31 = (int) (j25 ^ (j25 >>> i13));
                    I mike11 = c0585q.mike();
                    s charlie23 = T.a.charlie(sierra3, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i2, c0585q, alpha15);
                    C0564b.blue(c2549i3, c0585q, mike11);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i31))) {
                        ad.blue(i31, c0585q, i31, c2549i6);
                    }
                    C0564b.blue(c2549i5, c0585q, charlie23);
                    AbstractC1680b charlie24 = AbstractC3076w3.charlie(R.drawable.ic_info_icon, c0585q, 6);
                    s kilo2 = V.kilo(pVar, 18);
                    long j26 = charlie;
                    AbstractC0141o0.alpha(charlie24, null, kilo2, j26, c0585q, 3504, 0);
                    G2.bravo(AbstractC3086y3.bravo(c0585q, R.string.settle_balance_warning), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(j26, AbstractC2636d7.charlie(12), vVar, null, nVar, 0L, 0, 0L, 0, 16777176), c0585q, 0, 0, 65534);
                    c0585q = c0585q;
                    z11 = true;
                    z.papa(c0585q, true, true, false);
                } else {
                    z11 = true;
                    c0585q.purple(-360707455);
                    c0585q.quebec(false);
                }
                c0585q.quebec(z11);
                str4 = str5;
                sVar3 = sVar4;
                function03 = function04;
            } else {
                c0585q.ochre();
                function03 = function02;
                sVar3 = sVar2;
                str4 = str3;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Xd.l() { // from class: Vc.h
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int cyan = C0564b.cyan(i4 | 1);
                        String str7 = str;
                        s sVar5 = sVar3;
                        j.alpha(f5, str7, z2, str4, function03, sVar5, (InterfaceC0581m) obj, cyan, i5);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        str3 = str2;
        i12 = i5 & 16;
        if (i12 == 0) {
        }
        i15 = i5 & 32;
        if (i15 == 0) {
        }
        i17 = i10;
        if ((i17 & 74883) == 74882) {
        }
        if (!c0585q.magenta(i17 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
