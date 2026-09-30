package Pa;

import D0.an;
import Ec.aa;
import F.AbstractC0141o0;
import F.G1;
import F.G2;
import F.K1;
import F.O;
import F.ak;
import F.al;
import H0.v;
import T.p;
import T.s;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.FillElement;
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
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import h.AbstractC1797a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t6.AbstractC3071v3;
import t6.AbstractC3076w3;
import t6.AbstractC3081x3;
import t6.AbstractC3086y3;
import t6.R3;

/* loaded from: classes2.dex */
public abstract class i {
    public static final an alpha = new an(C0366t.echo, AbstractC2636d7.charlie(16), v.f1407a, null, null, 0, 0, 0, 0, 16777208);

    public static final void alpha(String message, p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        p pVar2;
        int i10;
        Intrinsics.echo(message, "message");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1908397205);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(message)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i4 | i10;
        } else {
            i5 = i4;
        }
        int i11 = i5 | 48;
        if ((i11 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            p pVar3 = p.alpha;
            s sierra = AbstractC0538d.sierra(V.charlie(pVar3, 1.0f), AbstractC3081x3.bravo(c0585q, R.dimen.spacing_31));
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            G2.bravo(message, null, AbstractC3071v3.alpha(c0585q, R.color.dark_gray_2), AbstractC2636d7.charlie(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, (i11 & 14) | 3072, 0, 131058);
            c0585q = c0585q;
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(message, pVar2, i4, 4);
        }
    }

    public static final void bravo(int i4, p pVar, InterfaceC0581m interfaceC0581m, String message, Function0 onRetry) {
        int i5;
        boolean z2;
        p pVar2;
        int i10;
        int i11;
        Intrinsics.echo(message, "message");
        Intrinsics.echo(onRetry, "onRetry");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1642915950);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(message)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onRetry)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        int i12 = i5 | 384;
        if ((i12 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            p pVar3 = p.alpha;
            s sierra = AbstractC0538d.sierra(V.charlie(pVar3, 1.0f), AbstractC3081x3.bravo(c0585q, R.dimen.spacing_31));
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(AbstractC3081x3.bravo(c0585q, R.dimen.spacing_16)), iVar, c0585q, 48);
            long j5 = c0585q.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            G2.bravo(message, null, ((O) c0585q.kilo(F.Q.alpha)).whiskey, AbstractC2636d7.charlie(16), null, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, (i12 & 14) | 3072, 0, 131058);
            c0585q = c0585q;
            M m4 = al.alpha;
            K1.bravo(onRetry, null, false, null, al.alpha(AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), 0L, 0L, 0L, c0585q, 14), null, null, null, a.alpha, c0585q, ((i12 >> 3) & 14) | 805306368, 494);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(message, onRetry, pVar2, i4, 0);
        }
    }

    public static final void charlie(int i4, P.d dVar, p pVar, InterfaceC0581m interfaceC0581m) {
        boolean z2;
        p pVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1243001645);
        int i5 = i4 | 6;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar2 = p.alpha;
            float f5 = 12;
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar2, 1.0f), 1, AbstractC3071v3.alpha(c0585q, R.color.blue_200), AbstractC2094g.bravo(f5)), AbstractC3071v3.alpha(c0585q, R.color.blue_info_box), AbstractC2094g.bravo(f5)), 20);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q, i10, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie);
            s charlie2 = V.charlie(pVar2, 1.0f);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(16), T.d.f2062f, c0585q, 6);
            long j6 = c0585q.magenta;
            int i11 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(charlie2, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i11))) {
                ad.blue(i11, c0585q, i11, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            dVar.invoke(C0556w.alpha, c0585q, 54);
            c0585q.quebec(true);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new d(pVar2, dVar, i4);
        }
    }

    public static final void delta(int i4, D0.g gVar, p pVar, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        boolean z2;
        p pVar2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1747925563);
        if (c0585q.golf(gVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i11 = i5 | i10 | 384;
        if ((i11 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i11 & 1, z2)) {
            p pVar3 = p.alpha;
            s charlie = V.charlie(pVar3, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(AbstractC3081x3.bravo(c0585q, R.dimen.spacing_8)), T.d.f2060c, c0585q, 48);
            long j5 = c0585q.magenta;
            int i12 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha2);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i12))) {
                ad.blue(i12, c0585q, i12, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            float f5 = 1;
            long alpha3 = AbstractC3071v3.alpha(c0585q, R.color.type_border_unselected);
            C2093f c2093f = AbstractC2094g.alpha;
            s sierra = AbstractC0538d.sierra(R3.charlie(pVar3, f5, alpha3, c2093f), f5);
            float f10 = 24;
            s bravo = androidx.compose.foundation.a.bravo(V.echo(V.oscar(sierra, f10), f10), AbstractC3071v3.alpha(c0585q, R.color.white), c2093f);
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j6 = c0585q.magenta;
            int i13 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            s charlie3 = T.a.charlie(bravo, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, delta);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q, i13, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            G2.bravo(String.valueOf(i4), null, C0366t.bravo, AbstractC2636d7.charlie(10), v.f1409c, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, 200064, 0, 131026);
            c0585q.quebec(true);
            long charlie4 = AbstractC2636d7.charlie(12);
            long j7 = ((O) c0585q.kilo(F.Q.alpha)).oscar;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.charlie(gVar, AbstractC0538d.whiskey(new LayoutWeightElement(1.0f, true), 0.0f, 2, 0.0f, 0.0f, 13), j7, charlie4, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c0585q, ((i11 >> 3) & 14) | 3072, 262128);
            c0585q = c0585q;
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new aa(i4, gVar, pVar2, i5, 3);
        }
    }

    public static final void echo(p pVar, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(997227799);
        int i5 = i4 | 6;
        if ((i5 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            pVar = p.alpha;
            s sierra = AbstractC0538d.sierra(V.charlie(pVar, 1.0f), AbstractC3081x3.bravo(c0585q, R.dimen.spacing_31));
            ap delta = AbstractC0547m.delta(T.d.teal, false);
            long j5 = c0585q.magenta;
            int i10 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(sierra, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i10))) {
                ad.blue(i10, c0585q, i10, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            G1.bravo(null, AbstractC3071v3.alpha(c0585q, R.color.colorPrimary), 0.0f, 0L, 0, c0585q, 0, 29);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(pVar, i4, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void foxtrot(String text, Function0 onClick, boolean z2, s sVar, P.d dVar, an anVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        s sVar2;
        int i13;
        int i14;
        P.d dVar2;
        int i15;
        int i16;
        boolean z11;
        an anVar2;
        boolean z12;
        s sVar3;
        P.d dVar3;
        Q uniform;
        boolean z13;
        s sVar4;
        P.d dVar4;
        an anVar3;
        int i17;
        int i18;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1514900503);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i10 |= i17;
        }
        int i19 = i5 & 4;
        if (i19 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            i12 = i5 & 8;
            if (i12 == 0) {
                i10 |= 3072;
            } else if ((i4 & 3072) == 0) {
                sVar2 = sVar;
                if (c0585q.golf(sVar2)) {
                    i13 = 2048;
                } else {
                    i13 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i13;
                i14 = i5 & 16;
                if (i14 != 0) {
                    i10 |= 24576;
                } else if ((i4 & 24576) == 0) {
                    dVar2 = dVar;
                    if (c0585q.india(dVar2)) {
                        i15 = Http2.INITIAL_MAX_FRAME_SIZE;
                    } else {
                        i15 = 8192;
                    }
                    i10 |= i15;
                    i16 = i10 | 196608;
                    if ((74899 & i16) == 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!c0585q.magenta(i16 & 1, z11)) {
                        if (i19 != 0) {
                            z13 = true;
                        } else {
                            z13 = z10;
                        }
                        s sVar5 = p.alpha;
                        if (i12 != 0) {
                            sVar4 = sVar5;
                        } else {
                            sVar4 = sVar2;
                        }
                        if (i14 != 0) {
                            dVar4 = null;
                        } else {
                            dVar4 = dVar2;
                        }
                        if ((i5 & 64) != 0) {
                            anVar3 = alpha;
                        } else {
                            anVar3 = anVar;
                        }
                        s charlie = V.charlie(V.golf(sVar4, 52, 0.0f, 2), 1.0f);
                        if (!z13) {
                            sVar5 = R3.charlie(sVar5, 1, Db.c.magenta, AbstractC2094g.bravo(12));
                        }
                        s then = charlie.then(sVar5);
                        M m4 = al.alpha;
                        ak alpha2 = al.alpha(C0366t.bravo, C0366t.echo, Db.c.amber, Db.c.zulu, c0585q, 0);
                        c0585q = c0585q;
                        boolean z14 = z13;
                        K1.bravo(onClick, then, z14, AbstractC2094g.bravo(12), alpha2, null, null, null, P.e.echo(1954523143, new e(dVar4, 0, text), c0585q), c0585q, ((i16 >> 3) & 14) | 805306368 | (i16 & 896), 480);
                        z12 = z14;
                        dVar3 = dVar4;
                        anVar2 = anVar3;
                        sVar3 = sVar4;
                    } else {
                        c0585q.ochre();
                        anVar2 = anVar;
                        z12 = z10;
                        sVar3 = sVar2;
                        dVar3 = dVar2;
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new f(text, onClick, z12, sVar3, dVar3, anVar2, i4, i5);
                        return;
                    }
                    return;
                }
                dVar2 = dVar;
                i16 = i10 | 196608;
                if ((74899 & i16) == 74898) {
                }
                if (!c0585q.magenta(i16 & 1, z11)) {
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            sVar2 = sVar;
            i14 = i5 & 16;
            if (i14 != 0) {
            }
            dVar2 = dVar;
            i16 = i10 | 196608;
            if ((74899 & i16) == 74898) {
            }
            if (!c0585q.magenta(i16 & 1, z11)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        z10 = z2;
        i12 = i5 & 8;
        if (i12 == 0) {
        }
        sVar2 = sVar;
        i14 = i5 & 16;
        if (i14 != 0) {
        }
        dVar2 = dVar;
        i16 = i10 | 196608;
        if ((74899 & i16) == 74898) {
        }
        if (!c0585q.magenta(i16 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void golf(int i4, p pVar, InterfaceC0581m interfaceC0581m, String storeName, Function0 onClick) {
        int i5;
        boolean z2;
        C0585q c0585q;
        p pVar2;
        int i10;
        int i11;
        Intrinsics.echo(storeName, "storeName");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-2135567238);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(storeName)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i4 | i11;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(onClick)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        int i12 = i5 | 384;
        if ((i12 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i12 & 1, z2)) {
            p pVar3 = p.alpha;
            s bravo = androidx.compose.foundation.a.bravo(R3.charlie(V.charlie(pVar3, 1.0f), 1, AbstractC3071v3.alpha(c0585q2, R.color.coolgray_100), AbstractC2094g.bravo(12)), C0366t.echo, AbstractC2094g.bravo(4));
            Object jade = c0585q2.jade();
            if (jade == C0580l.alpha) {
                jade = ad.xray(c0585q2);
            }
            s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.charlie(bravo, (InterfaceC1673j) jade, null, false, null, onClick, 28), 16);
            ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q2.magenta;
            int i13 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q2.mike();
            s charlie = T.a.charlie(sierra, c0585q2);
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
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i13))) {
                ad.blue(i13, c0585q2, i13, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie);
            FillElement fillElement = V.charlie;
            S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q2, 54);
            long j6 = c0585q2.magenta;
            int i14 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q2.mike();
            s charlie2 = T.a.charlie(fillElement, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, alpha2);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i14))) {
                ad.blue(i14, c0585q2, i14, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie2);
            long charlie3 = AbstractC2636d7.charlie(14);
            v vVar = v.f1407a;
            long j7 = ((O) c0585q2.kilo(F.Q.alpha)).quebec;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            G2.bravo(storeName, new LayoutWeightElement(1.0f, true), j7, charlie3, vVar, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q2, (14 & i12) | 199680, 0, 131024);
            c0585q = c0585q2;
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_location_icon, c0585q, 6), AbstractC3086y3.bravo(c0585q, R.string.location_icon), V.kilo(pVar3, 20), AbstractC3071v3.alpha(c0585q, R.color.dark_gray_2), c0585q, 384, 0);
            c0585q.quebec(true);
            c0585q.quebec(true);
            pVar2 = pVar3;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new g(storeName, onClick, pVar2, i4, 1);
        }
    }
}
