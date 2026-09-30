package xb;

import D0.an;
import F.G2;
import F.K1;
import F.O;
import F.Q1;
import F.S2;
import F.T2;
import H0.v;
import T.p;
import T.s;
import Vc.o;
import Xd.l;
import Za.h;
import a0.C0366t;
import a0.ao;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0535a;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.foundation.layout.b0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import h.AbstractC1797a;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import t6.AbstractC3052s;
import t6.R3;
import t6.ac;
import vb.AbstractC3185a;

/* renamed from: xb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3318b {
    public static final P.d alpha = new P.d(new ud.f(13), -192505186, false);
    public static final P.d bravo = new P.d(new ud.f(14), -1671151730, false);
    public static final P.d charlie = new P.d(new ud.f(15), 1204473262, false);
    public static final P.d delta = new P.d(new Vc.d(18), -323874106, false);
    public static final P.d echo = new P.d(new ud.f(16), -908450442, false);

    static {
        new P.d(new Vc.d(19), 736327559, false);
        new P.d(new ud.f(17), 151751223, false);
        new P.d(new Vc.d(20), 630485865, false);
        new P.d(new Vc.d(21), -1020469592, false);
        new P.d(new Vc.d(17), -414976056, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(s sVar, P.d dVar, P.d dVar2, P.d dVar3, int i4, long j5, C0535a c0535a, final P.d dVar4, InterfaceC0581m interfaceC0581m, final int i5, final int i10) {
        s sVar2;
        int i11;
        int i12;
        P.d dVar5;
        int i13;
        int i14;
        boolean z2;
        C0585q c0585q;
        final P.d dVar6;
        final int i15;
        final C0535a c0535a2;
        final s sVar3;
        final P.d dVar7;
        final P.d dVar8;
        final long j6;
        Q uniform;
        P.d dVar9;
        P.d dVar10;
        int i16;
        int i17;
        C0535a c0535a3;
        long j7;
        int i18;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-711346902);
        int i19 = i10 & 1;
        if (i19 != 0) {
            i11 = i5 | 6;
            sVar2 = sVar;
        } else if ((i5 & 6) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i5;
        } else {
            sVar2 = sVar;
            i11 = i5;
        }
        int i20 = i10 & 2;
        if (i20 != 0) {
            i11 |= 48;
        } else if ((i5 & 48) == 0) {
            dVar5 = dVar;
            if (c0585q2.india(dVar5)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
            i14 = i11 | 3456;
            if ((i5 & 24576) == 0) {
                i14 = i11 | 11648;
            }
            if ((196608 & i5) == 0) {
                i14 |= 65536;
            }
            if ((1572864 & i5) == 0) {
                i14 |= 524288;
            }
            if ((12582912 & i5) == 0) {
                if (c0585q2.india(dVar4)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i14 |= i18;
            }
            if ((4793491 & i14) == 4793490) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i14 & 1, z2)) {
                c0585q2.orange();
                if ((1 & i5) != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                    i17 = i14 & (-4186113);
                    dVar9 = dVar2;
                    dVar10 = dVar3;
                    i16 = i4;
                    j7 = j5;
                    c0535a3 = c0535a;
                } else {
                    if (i19 != 0) {
                        sVar2 = p.alpha;
                    }
                    if (i20 != 0) {
                        dVar5 = alpha;
                    }
                    P.d dVar11 = bravo;
                    P.d dVar12 = charlie;
                    long j10 = ((O) c0585q2.kilo(F.Q.alpha)).november;
                    WeakHashMap weakHashMap = b0.whiskey;
                    dVar9 = dVar11;
                    dVar10 = dVar12;
                    i16 = 2;
                    i17 = (-4186113) & i14;
                    c0535a3 = C0537c.foxtrot(c0585q2).golf;
                    j7 = j10;
                }
                s sVar4 = sVar2;
                P.d dVar13 = dVar5;
                c0585q2.romeo();
                c0585q = c0585q2;
                Q1.alpha(sVar4, dVar13, dVar9, null, dVar10, i16, j7, 0L, c0535a3, dVar4, c0585q, (i17 & 1022) | ((i17 << 3) & 57344) | ((i17 << 6) & 1879048192), 136);
                sVar3 = sVar4;
                dVar7 = dVar13;
                dVar6 = dVar9;
                dVar8 = dVar10;
                i15 = i16;
                j6 = j7;
                c0535a2 = c0535a3;
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                dVar6 = dVar2;
                i15 = i4;
                c0535a2 = c0535a;
                sVar3 = sVar2;
                dVar7 = dVar5;
                dVar8 = dVar3;
                j6 = j5;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new l() { // from class: xb.a
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int cyan = C0564b.cyan(i5 | 1);
                        P.d dVar14 = dVar4;
                        AbstractC3318b.alpha(s.this, dVar7, dVar6, dVar8, i15, j6, c0535a2, dVar14, (InterfaceC0581m) obj, cyan, i10);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        dVar5 = dVar;
        i14 = i11 | 3456;
        if ((i5 & 24576) == 0) {
        }
        if ((196608 & i5) == 0) {
        }
        if ((1572864 & i5) == 0) {
        }
        if ((12582912 & i5) == 0) {
        }
        if ((4793491 & i14) == 4793490) {
        }
        if (!c0585q2.magenta(i14 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(String title, Function0 function0, boolean z2, p pVar, P.d dVar, P.d dVar2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        C0585q c0585q;
        p pVar2;
        P.d dVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(title, "title");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-221242753);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(title)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i5 = i13 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i5 |= i12;
        }
        if ((i4 & 384) == 0) {
            if (c0585q2.hotel(z2)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i5 |= i11;
        }
        int i14 = i5 | 27648;
        if ((196608 & i4) == 0) {
            if (c0585q2.india(dVar2)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i14 |= i10;
        }
        if ((74899 & i14) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i14 & 1, z10)) {
            p pVar3 = p.alpha;
            dVar3 = delta;
            c0585q = c0585q2;
            alpha(pVar3, P.e.echo(-775189516, new Ac.f(title, z2, function0), c0585q2), null, null, 0, 0L, null, dVar2, c0585q, ((i14 >> 9) & 14) | 48 | ((i14 << 6) & 29360128), 124);
            pVar2 = pVar3;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            pVar2 = pVar;
            dVar3 = dVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new h(title, function0, z2, pVar2, dVar3, dVar2, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(String str, s sVar, an anVar, P.d content, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        s sVar2;
        int i11;
        boolean z2;
        an anVar2;
        Q uniform;
        s sVar3;
        an anVar3;
        int i12;
        int i13;
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1587432777);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i4;
        } else {
            i10 = i4;
        }
        int i14 = i5 & 2;
        if (i14 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i4 & 384) == 0) {
                i10 |= 128;
            }
            if ((i4 & 3072) == 0) {
                if (c0585q.india(content)) {
                    i12 = 2048;
                } else {
                    i12 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i12;
            }
            if ((i10 & 1171) == 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q.magenta(i10 & 1, z2)) {
                c0585q.orange();
                if ((i4 & 1) != 0 && !c0585q.beige()) {
                    c0585q.ochre();
                    anVar3 = anVar;
                    sVar3 = sVar2;
                } else {
                    if (i14 != 0) {
                        sVar3 = p.alpha;
                    } else {
                        sVar3 = sVar2;
                    }
                    anVar3 = ((S2) c0585q.kilo(T2.alpha)).hotel;
                }
                c0585q.romeo();
                K1.charlie(V.charlie(sVar3, 1.0f), Db.a.bravo, K1.lima(((O) c0585q.kilo(F.Q.alpha)).papa, c0585q, 0), K1.mike(0, 62), null, P.e.echo(2087665157, new o(str, anVar3, content, 7), c0585q), c0585q, 196656, 16);
                sVar2 = sVar3;
                anVar2 = anVar3;
            } else {
                c0585q.ochre();
                anVar2 = anVar;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Bb.e(str, sVar2, anVar2, content, i4, i5, 7);
                return;
            }
            return;
        }
        sVar2 = sVar;
        if ((i4 & 384) == 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        if ((i10 & 1171) == 1170) {
        }
        if (!c0585q.magenta(i10 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void delta(String str, p pVar, P.d content, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        p pVar2;
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1939274086);
        int i5 = i4 | 48;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar3 = p.alpha;
            foxtrot(str, pVar3, ((S2) c0585q.kilo(T2.alpha)).india, Db.d.charlie / 2, content, c0585q, 199734, 16);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C3319c(str, pVar2, content, i4, 1);
        }
    }

    public static final void echo(String str, p pVar, P.d content, InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        p pVar2;
        Intrinsics.echo(content, "content");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(312117246);
        int i5 = i4 | 48;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            p pVar3 = p.alpha;
            foxtrot(str, pVar3, ((S2) c0585q.kilo(T2.alpha)).golf, Db.d.delta, content, c0585q, 199734, 16);
            pVar2 = pVar3;
        } else {
            c0585q.ochre();
            pVar2 = pVar;
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C3319c(str, pVar2, content, i4, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void foxtrot(final String str, s sVar, an anVar, float f5, P.d content, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        s sVar2;
        int i11;
        an anVar2;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        boolean z2;
        final P.d dVar;
        C0585q c0585q;
        final s sVar3;
        final an anVar3;
        final float f11;
        Q uniform;
        an anVar4;
        int i16;
        an anVar5;
        s sVar4;
        s sVar5;
        C0556w c0556w;
        boolean z10;
        boolean z11;
        int i17;
        int i18;
        Intrinsics.echo(content, "content");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-788897438);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(str)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i10 = i18 | i4;
        } else {
            i10 = i4;
        }
        int i19 = i5 & 2;
        if (i19 != 0) {
            i10 |= 48;
        } else if ((i4 & 48) == 0) {
            sVar2 = sVar;
            if (c0585q2.golf(sVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
            if ((i5 & 4) != 0) {
                anVar2 = anVar;
                if (c0585q2.golf(anVar2)) {
                    i12 = Barcode.FORMAT_QR_CODE;
                    int i20 = i10 | i12;
                    i13 = i5 & 8;
                    if (i13 != 0) {
                        i20 |= 3072;
                    } else if ((i4 & 3072) == 0) {
                        f10 = f5;
                        if (c0585q2.delta(f10)) {
                            i14 = 2048;
                        } else {
                            i14 = Barcode.FORMAT_UPC_E;
                        }
                        i20 |= i14;
                        i15 = i20 | 24576;
                        if ((i4 & 196608) == 0) {
                            if (c0585q2.india(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i15 |= i17;
                        }
                        if ((74899 & i15) == 74898) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!c0585q2.magenta(i15 & 1, z2)) {
                            c0585q2.orange();
                            int i21 = i4 & 1;
                            p pVar = p.alpha;
                            if (i21 != 0 && !c0585q2.beige()) {
                                c0585q2.ochre();
                                if ((i5 & 4) != 0) {
                                    i15 &= -897;
                                }
                                i16 = i15;
                                sVar4 = sVar2;
                                anVar5 = anVar2;
                            } else {
                                if (i19 != 0) {
                                    sVar2 = pVar;
                                }
                                if ((i5 & 4) != 0) {
                                    anVar4 = ((S2) c0585q2.kilo(T2.alpha)).hotel;
                                    i15 &= -897;
                                } else {
                                    anVar4 = anVar2;
                                }
                                if (i13 != 0) {
                                    f10 = Db.d.charlie;
                                }
                                i16 = i15;
                                anVar5 = anVar4;
                                sVar4 = sVar2;
                            }
                            float f12 = f10;
                            c0585q2.romeo();
                            s charlie2 = V.charlie(sVar4, 1.0f);
                            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.golf(f12), T.d.f2062f, c0585q2, 0);
                            int romeo = C0564b.romeo(c0585q2);
                            I mike = c0585q2.mike();
                            s charlie3 = T.a.charlie(charlie2, c0585q2);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j = C2551k.bravo;
                            c0585q2.white();
                            if (c0585q2.lime) {
                                c0585q2.lima(c2550j);
                            } else {
                                c0585q2.i();
                            }
                            C2549i c2549i = C2551k.foxtrot;
                            C0564b.blue(c2549i, c0585q2, alpha2);
                            C2549i c2549i2 = C2551k.echo;
                            C0564b.blue(c2549i2, c0585q2, mike);
                            C2549i c2549i3 = C2551k.golf;
                            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                                ad.blue(romeo, c0585q2, romeo, c2549i3);
                            }
                            C2549i c2549i4 = C2551k.delta;
                            C0564b.blue(c2549i4, c0585q2, charlie3);
                            C0556w c0556w2 = C0556w.alpha;
                            if (str != null) {
                                c0585q2.purple(-1037917197);
                                s charlie4 = V.charlie(pVar, 1.0f);
                                S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf, T.d.f2061d, c0585q2, 54);
                                int romeo2 = C0564b.romeo(c0585q2);
                                I mike2 = c0585q2.mike();
                                s charlie5 = T.a.charlie(charlie4, c0585q2);
                                c0585q2.white();
                                if (c0585q2.lime) {
                                    c0585q2.lima(c2550j);
                                } else {
                                    c0585q2.i();
                                }
                                C0564b.blue(c2549i, c0585q2, alpha3);
                                C0564b.blue(c2549i2, c0585q2, mike2);
                                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                                    ad.blue(romeo2, c0585q2, romeo2, c2549i3);
                                }
                                C0564b.blue(c2549i4, c0585q2, charlie5);
                                sVar5 = sVar4;
                                c0556w = c0556w2;
                                G2.bravo(str, null, 0L, 0L, v.f1408b, null, 0L, null, 0L, 0, false, 0, 0, null, anVar5, c0585q2, (i16 & 14) | 196608, (i16 << 12) & 3670016, 65502);
                                c0585q = c0585q2;
                                c0585q.purple(983670859);
                                z10 = false;
                                c0585q.quebec(false);
                                z11 = true;
                                c0585q.quebec(true);
                            } else {
                                c0585q = c0585q2;
                                sVar5 = sVar4;
                                c0556w = c0556w2;
                                z10 = false;
                                z11 = true;
                                c0585q.purple(-1039589430);
                            }
                            c0585q.quebec(z10);
                            dVar = content;
                            dVar.invoke(c0556w, c0585q, Integer.valueOf(((i16 >> 12) & 112) | 6));
                            c0585q.quebec(z11);
                            anVar3 = anVar5;
                            f11 = f12;
                            sVar3 = sVar5;
                        } else {
                            dVar = content;
                            c0585q = c0585q2;
                            c0585q.ochre();
                            sVar3 = sVar2;
                            anVar3 = anVar2;
                            f11 = f10;
                        }
                        uniform = c0585q.uniform();
                        if (uniform == null) {
                            uniform.delta = new l() { // from class: xb.d
                                @Override // Xd.l
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int cyan = C0564b.cyan(i4 | 1);
                                    P.d dVar2 = dVar;
                                    AbstractC3318b.foxtrot(str, sVar3, anVar3, f11, dVar2, (InterfaceC0581m) obj, cyan, i5);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    f10 = f5;
                    i15 = i20 | 24576;
                    if ((i4 & 196608) == 0) {
                    }
                    if ((74899 & i15) == 74898) {
                    }
                    if (!c0585q2.magenta(i15 & 1, z2)) {
                    }
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                    }
                }
            } else {
                anVar2 = anVar;
            }
            i12 = 128;
            int i202 = i10 | i12;
            i13 = i5 & 8;
            if (i13 != 0) {
            }
            f10 = f5;
            i15 = i202 | 24576;
            if ((i4 & 196608) == 0) {
            }
            if ((74899 & i15) == 74898) {
            }
            if (!c0585q2.magenta(i15 & 1, z2)) {
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        sVar2 = sVar;
        if ((i5 & 4) != 0) {
        }
        i12 = 128;
        int i2022 = i10 | i12;
        i13 = i5 & 8;
        if (i13 != 0) {
        }
        f10 = f5;
        i15 = i2022 | 24576;
        if ((i4 & 196608) == 0) {
        }
        if ((74899 & i15) == 74898) {
        }
        if (!c0585q2.magenta(i15 & 1, z2)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void golf(final List stats, final Float f5, final s sVar, C2093f c2093f, long j5, long j6, long j7, long j10, long j11, float f10, long j12, float f11, float f12, float f13, float f14, InterfaceC0581m interfaceC0581m, final int i4, final int i5, final int i10) {
        long j13;
        long j14;
        long j15;
        int i11;
        int i12;
        int i13;
        C2093f c2093f2;
        final float f15;
        final long j16;
        final float f16;
        final float f17;
        final float f18;
        final float f19;
        final long j17;
        final long j18;
        final long j19;
        final long j20;
        final long j21;
        Q uniform;
        C2093f c2093f3;
        int i14;
        int i15;
        long j22;
        long j23;
        long j24;
        long charlie2;
        C2093f c2093f4;
        float f20;
        float f21;
        int i16;
        float f22;
        float f23;
        float f24;
        long j25;
        long j26;
        long j27;
        long j28;
        float f25;
        boolean z2;
        boolean z10;
        int i17;
        int i18;
        int i19;
        Intrinsics.echo(stats, "stats");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1599334557);
        int i20 = (i4 & 6) == 0 ? (c0585q.india(stats) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i20 |= c0585q.golf(f5) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i20 |= c0585q.golf(sVar) ? Barcode.FORMAT_QR_CODE : 128;
        }
        if ((i4 & 3072) == 0) {
            if ((i10 & 8) == 0 && c0585q.golf(c2093f)) {
                i19 = 2048;
                i20 |= i19;
            }
            i19 = Barcode.FORMAT_UPC_E;
            i20 |= i19;
        }
        if ((i4 & 24576) == 0) {
            if ((i10 & 16) == 0) {
                j13 = j5;
                if (c0585q.foxtrot(j13)) {
                    i18 = Http2.INITIAL_MAX_FRAME_SIZE;
                    i20 |= i18;
                }
            } else {
                j13 = j5;
            }
            i18 = 8192;
            i20 |= i18;
        } else {
            j13 = j5;
        }
        if ((196608 & i4) == 0) {
            if ((i10 & 32) == 0) {
                j14 = j6;
                if (c0585q.foxtrot(j14)) {
                    i17 = 131072;
                    i20 |= i17;
                }
            } else {
                j14 = j6;
            }
            i17 = 65536;
            i20 |= i17;
        } else {
            j14 = j6;
        }
        if ((1572864 & i4) == 0) {
            i20 |= ((i10 & 64) == 0 && c0585q.foxtrot(j7)) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            j15 = j10;
            i20 |= ((i10 & 128) == 0 && c0585q.foxtrot(j15)) ? 8388608 : 4194304;
        } else {
            j15 = j10;
        }
        if ((i4 & 100663296) == 0) {
            i20 |= ((i10 & Barcode.FORMAT_QR_CODE) == 0 && c0585q.foxtrot(j11)) ? 67108864 : 33554432;
        }
        int i21 = i10 & 512;
        if (i21 != 0) {
            i20 |= 805306368;
        } else if ((i4 & 805306368) == 0) {
            i20 |= c0585q.delta(f10) ? 536870912 : 268435456;
        }
        int i22 = i10 & Barcode.FORMAT_UPC_E;
        if (i22 != 0) {
            i13 = i5 | 6;
            i11 = i22;
        } else {
            if ((i5 & 6) != 0) {
                i11 = i22;
                i12 = i5;
                if (!c0585q.magenta(i20 & 1, (306783379 & i20) == 306783378 || ((i12 | 28080) & 9363) != 9362)) {
                    c0585q.orange();
                    int i23 = i4 & 1;
                    p pVar = p.alpha;
                    if (i23 != 0 && !c0585q.beige()) {
                        c0585q.ochre();
                        if ((i10 & 8) != 0) {
                            i20 &= -7169;
                        }
                        if ((i10 & 16) != 0) {
                            i20 &= -57345;
                        }
                        if ((i10 & 32) != 0) {
                            i20 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            i20 &= -3670017;
                        }
                        if ((i10 & 128) != 0) {
                            i20 &= -29360129;
                        }
                        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                            i20 &= -234881025;
                        }
                        c2093f4 = c2093f;
                        j25 = j11;
                        f22 = f10;
                        charlie2 = j12;
                        f24 = f11;
                        f21 = f12;
                        f23 = f13;
                        f20 = f14;
                        i16 = i20;
                        j26 = j7;
                    } else {
                        if ((i10 & 8) != 0) {
                            c2093f3 = AbstractC2094g.bravo(16);
                            i20 &= -7169;
                        } else {
                            c2093f3 = c2093f;
                        }
                        if ((i10 & 16) != 0) {
                            j13 = ((O) c0585q.kilo(F.Q.alpha)).papa;
                            i20 &= -57345;
                        }
                        if ((i10 & 32) != 0) {
                            j14 = ((O) c0585q.kilo(F.Q.alpha)).azure;
                            i20 &= -458753;
                        }
                        if ((i10 & 64) != 0) {
                            i14 = -234881025;
                            i15 = -29360129;
                            j22 = C0366t.bravo(0.3f, ((O) c0585q.kilo(F.Q.alpha)).azure);
                            i20 &= -3670017;
                        } else {
                            i14 = -234881025;
                            i15 = -29360129;
                            j22 = j7;
                        }
                        if ((i10 & 128) != 0) {
                            j15 = ((O) c0585q.kilo(F.Q.alpha)).oscar;
                            i20 &= i15;
                        }
                        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
                            j23 = j22;
                            j24 = C0366t.bravo(0.5f, ((O) c0585q.kilo(F.Q.alpha)).azure);
                            i20 &= i14;
                        } else {
                            j23 = j22;
                            j24 = j11;
                        }
                        float f26 = i21 != 0 ? 44 : f10;
                        charlie2 = i11 != 0 ? ao.charlie(251658240) : j12;
                        c2093f4 = c2093f3;
                        f20 = 50;
                        f21 = 12;
                        i16 = i20;
                        f22 = f26;
                        f23 = 12;
                        f24 = 24;
                        j25 = j24;
                        j26 = j23;
                    }
                    c0585q.romeo();
                    long j29 = j26;
                    float f27 = f22;
                    long j30 = j15;
                    C2093f c2093f5 = c2093f4;
                    float f28 = 1;
                    s victor = AbstractC0538d.victor(androidx.compose.foundation.a.bravo(R3.charlie(ac.alpha(sVar, f22, c2093f4, charlie2, charlie2, 4), f28, j25, c2093f5), j13, c2093f5), f24, f21, f24, f21);
                    float f29 = f21;
                    ap delta2 = AbstractC0547m.delta(T.d.alpha, false);
                    int romeo = C0564b.romeo(c0585q);
                    long j31 = j25;
                    I mike = c0585q.mike();
                    s charlie3 = T.a.charlie(victor, c0585q);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q.white();
                    c2093f2 = c2093f5;
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
                    long j32 = j13;
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                        ad.blue(romeo, c0585q, romeo, c2549i3);
                    }
                    C2549i c2549i4 = C2551k.delta;
                    C0564b.blue(c2549i4, c0585q, charlie3);
                    s charlie4 = V.charlie(pVar, 1.0f);
                    float f30 = f24;
                    C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2063g, c0585q, 48);
                    int romeo2 = C0564b.romeo(c0585q);
                    I mike2 = c0585q.mike();
                    s charlie5 = T.a.charlie(charlie4, c0585q);
                    c0585q.white();
                    float f31 = f23;
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha2);
                    C0564b.blue(c2549i2, c0585q, mike2);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                        ad.blue(romeo2, c0585q, romeo2, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie5);
                    s charlie6 = V.charlie(pVar, 1.0f);
                    S alpha3 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.foxtrot, T.d.f2060c, c0585q, 6);
                    int romeo3 = C0564b.romeo(c0585q);
                    I mike3 = c0585q.mike();
                    s charlie7 = T.a.charlie(charlie6, c0585q);
                    c0585q.white();
                    if (c0585q.lime) {
                        c0585q.lima(c2550j);
                    } else {
                        c0585q.i();
                    }
                    C0564b.blue(c2549i, c0585q, alpha3);
                    C0564b.blue(c2549i2, c0585q, mike3);
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo3))) {
                        ad.blue(romeo3, c0585q, romeo3, c2549i3);
                    }
                    C0564b.blue(c2549i4, c0585q, charlie7);
                    c0585q.purple(-166493610);
                    int i24 = 0;
                    for (Object obj : stats) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        C3321e c3321e = (C3321e) obj;
                        String str = c3321e.alpha;
                        if (1.0f <= 0.0d) {
                            AbstractC1797a.alpha("invalid weight; must be greater than zero");
                        }
                        AbstractC3052s.alpha(str, c3321e.bravo, new LayoutWeightElement(1.0f, true), 0L, 0L, 0.0f, null, null, c0585q, 0);
                        if (i24 < stats.size() - 1) {
                            c0585q.purple(-2046317857);
                            hotel((i16 >> 15) & 14, j14, V.echo(V.oscar(pVar, f28), f20), c0585q);
                            z10 = false;
                        } else {
                            z10 = false;
                            c0585q.purple(-2051304641);
                        }
                        c0585q.quebec(z10);
                        i24 = i25;
                    }
                    c0585q.quebec(false);
                    c0585q.quebec(true);
                    if (f5 != null) {
                        c0585q.purple(1623400605);
                        f25 = f31;
                        AbstractC0538d.echo(V.echo(pVar, f25), c0585q);
                        int i26 = i16 >> 9;
                        AbstractC3185a.echo(f5.floatValue(), V.charlie(pVar, 1.0f), 0.0f, j29, j30, null, c0585q, ((i16 >> 3) & 14) | 48 | (i26 & 7168) | (i26 & 57344), 36);
                        j27 = j29;
                        j28 = j30;
                        z2 = false;
                    } else {
                        j27 = j29;
                        j28 = j30;
                        f25 = f31;
                        z2 = false;
                        c0585q.purple(1618017641);
                    }
                    c0585q.quebec(z2);
                    c0585q.quebec(true);
                    c0585q.quebec(true);
                    j20 = j28;
                    j18 = j14;
                    j16 = charlie2;
                    f17 = f29;
                    j19 = j31;
                    f16 = f30;
                    j17 = j32;
                    j21 = j27;
                    f19 = f20;
                    f18 = f25;
                    f15 = f27;
                } else {
                    c0585q.ochre();
                    c2093f2 = c2093f;
                    f15 = f10;
                    j16 = j12;
                    f16 = f11;
                    f17 = f12;
                    f18 = f13;
                    f19 = f14;
                    j17 = j13;
                    j18 = j14;
                    j19 = j11;
                    j20 = j15;
                    j21 = j7;
                }
                uniform = c0585q.uniform();
                if (uniform == null) {
                    final C2093f c2093f6 = c2093f2;
                    uniform.delta = new l() { // from class: xb.f
                        @Override // Xd.l
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int cyan = C0564b.cyan(i4 | 1);
                            int cyan2 = C0564b.cyan(i5);
                            float f32 = f19;
                            int i27 = i10;
                            AbstractC3318b.golf(stats, f5, sVar, c2093f6, j17, j18, j21, j20, j19, f15, j16, f16, f17, f18, f32, (InterfaceC0581m) obj2, cyan, cyan2, i27);
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            i11 = i22;
            i13 = i5 | (c0585q.foxtrot(j12) ? 4 : 2);
        }
        i12 = i13;
        if (!c0585q.magenta(i20 & 1, (306783379 & i20) == 306783378 || ((i12 | 28080) & 9363) != 9362)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void hotel(int i4, long j5, s sVar, InterfaceC0581m interfaceC0581m) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1244968253);
        if ((i4 & 6) == 0) {
            if (c0585q.foxtrot(j5)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(sVar, j5, ao.alpha), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new a5.b(j5, sVar, i4, 1);
        }
    }
}
