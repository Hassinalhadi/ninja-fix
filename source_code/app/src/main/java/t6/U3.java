package t6;

import T.p;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import g.AbstractC1719b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.U3;
import t6.V3;
import zb.AbstractC3503f;
import zb.C3504g;

/* loaded from: classes2.dex */
public abstract class U3 {
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(final String str, final C3504g stats, final T.s sVar, C2093f c2093f, long j5, long j6, D0.an anVar, long j7, long j10, long j11, long j12, float f5, long j13, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        String str2;
        int i10;
        long j14;
        D0.an anVar2;
        int i11;
        final long j15;
        int i12;
        int i13;
        C0585q c0585q;
        final D0.an anVar3;
        final long j16;
        final C2093f c2093f2;
        final long j17;
        final long j18;
        final long j19;
        final long j20;
        final float f10;
        final long j21;
        androidx.compose.runtime.Q uniform;
        C2093f bravo;
        long j22;
        int i14;
        long j23;
        float f11;
        long j24;
        long j25;
        Intrinsics.echo(stats, "stats");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(865845798);
        if ((i4 & 6) == 0) {
            str2 = str;
            i10 = (c0585q2.golf(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i10 = i4;
        }
        int i15 = i10 | (c0585q2.golf(stats) ? 32 : 16) | Barcode.FORMAT_UPC_E;
        if ((i4 & 24576) == 0) {
            j14 = j5;
            i15 |= ((i5 & 16) == 0 && c0585q2.foxtrot(j14)) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        } else {
            j14 = j5;
        }
        int i16 = i15 | 65536;
        if ((i5 & 64) == 0) {
            anVar2 = anVar;
            if (c0585q2.golf(anVar2)) {
                i11 = 1048576;
                int i17 = i16 | i11;
                if ((i5 & 128) != 0) {
                    j15 = j7;
                    if (c0585q2.foxtrot(j15)) {
                        i12 = 8388608;
                        i13 = i17 | i12 | 301989888;
                        if (c0585q2.magenta(i13 & 1, (306783379 & i13) != 306783378)) {
                            c0585q2.orange();
                            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                                c0585q2.ochre();
                                int i18 = i13 & (-7169);
                                if ((i5 & 16) != 0) {
                                    i18 = i13 & (-64513);
                                }
                                int i19 = i18 & (-458753);
                                if ((i5 & 64) != 0) {
                                    i19 = i18 & (-4128769);
                                }
                                if ((i5 & 128) != 0) {
                                    i19 &= -29360129;
                                }
                                bravo = c2093f;
                                j22 = j6;
                                j25 = j10;
                                j23 = j11;
                                j24 = j12;
                                j21 = j13;
                                i14 = i19 & (-2113929217);
                                f11 = f5;
                            } else {
                                bravo = AbstractC2094g.bravo(16);
                                int i20 = i13 & (-7169);
                                if ((i5 & 16) != 0) {
                                    j14 = ((F.O) c0585q2.kilo(F.Q.alpha)).papa;
                                    i20 = i13 & (-64513);
                                }
                                androidx.compose.runtime.E0 e02 = F.Q.alpha;
                                j22 = ((F.O) c0585q2.kilo(e02)).azure;
                                int i21 = i20 & (-458753);
                                if ((i5 & 64) != 0) {
                                    anVar2 = ((F.S2) c0585q2.kilo(F.T2.alpha)).hotel;
                                    i21 = i20 & (-4128769);
                                }
                                if ((i5 & 128) != 0) {
                                    j15 = ((F.O) c0585q2.kilo(e02)).sierra;
                                    i21 &= -29360129;
                                }
                                long bravo2 = C0366t.bravo(0.3f, ((F.O) c0585q2.kilo(e02)).azure);
                                i14 = i21 & (-2113929217);
                                j23 = ((F.O) c0585q2.kilo(e02)).oscar;
                                long bravo3 = C0366t.bravo(0.5f, ((F.O) c0585q2.kilo(e02)).azure);
                                f11 = 44;
                                j21 = a0.ao.charlie(251658240);
                                j24 = bravo3;
                                j25 = bravo2;
                            }
                            c0585q2.romeo();
                            final long j26 = j25;
                            final float f12 = f11;
                            final C2093f c2093f3 = bravo;
                            final long j27 = j14;
                            final long j28 = j22;
                            final long j29 = j23;
                            final long j30 = j24;
                            final long j31 = j21;
                            int i22 = i14 >> 9;
                            bravo(str2, sVar, j22, anVar2, j15, 0.0f, P.e.echo(-987741838, new Xd.l() { // from class: zb.c
                                @Override // Xd.l
                                public final Object invoke(Object obj, Object obj2) {
                                    boolean z2;
                                    InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if ((intValue & 3) != 2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                                    if (c0585q3.magenta(intValue & 1, z2)) {
                                        V3.alpha(C3504g.this, V.charlie(p.alpha, 1.0f), c2093f3, j27, j28, j26, j29, j30, f12, j31, c0585q3, 48, 0);
                                    } else {
                                        c0585q3.ochre();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, c0585q2), c0585q2, (i14 & 14) | 1572912 | (i22 & 7168) | (i22 & 57344));
                            c0585q = c0585q2;
                            c2093f2 = bravo;
                            f10 = f11;
                            anVar3 = anVar2;
                            j16 = j14;
                            j17 = j22;
                            j19 = j23;
                            j20 = j24;
                            j18 = j26;
                        } else {
                            c0585q = c0585q2;
                            c0585q.ochre();
                            anVar3 = anVar2;
                            j16 = j14;
                            c2093f2 = c2093f;
                            j17 = j6;
                            j18 = j10;
                            j19 = j11;
                            j20 = j12;
                            f10 = f5;
                            j21 = j13;
                        }
                        uniform = c0585q.uniform();
                        if (uniform != null) {
                            uniform.delta = new Xd.l() { // from class: zb.d
                                @Override // Xd.l
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int cyan = C0564b.cyan(i4 | 1);
                                    String str3 = str;
                                    long j32 = j21;
                                    int i23 = i5;
                                    U3.alpha(str3, stats, sVar, c2093f2, j16, j17, anVar3, j15, j18, j19, j20, f10, j32, (InterfaceC0581m) obj, cyan, i23);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    j15 = j7;
                }
                i12 = 4194304;
                i13 = i17 | i12 | 301989888;
                if (c0585q2.magenta(i13 & 1, (306783379 & i13) != 306783378)) {
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                }
            }
        } else {
            anVar2 = anVar;
        }
        i11 = 524288;
        int i172 = i16 | i11;
        if ((i5 & 128) != 0) {
        }
        i12 = 4194304;
        i13 = i172 | i12 | 301989888;
        if (c0585q2.magenta(i13 & 1, (306783379 & i13) != 306783378)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void bravo(final String str, final T.s sVar, final long j5, final D0.an anVar, final long j6, float f5, final P.d dVar, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z2;
        final float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-39768560);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
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
            if (c0585q.foxtrot(j5)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(anVar)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.foxtrot(j6)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        int i16 = i5 | 196608;
        if ((1572864 & i4) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i16 |= i10;
        }
        if ((599187 & i16) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            c0585q.orange();
            int i17 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i17 != 0 && !c0585q.beige()) {
                c0585q.ochre();
                f11 = f5;
            } else {
                f11 = AbstractC3503f.alpha;
            }
            c0585q.romeo();
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            int i18 = i16 << 3;
            r.alpha(str, androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), j5, 0.0f, anVar, j6, c0585q, (i16 & 14) | 48 | (i16 & 896) | (57344 & i18) | (i18 & 458752), 8);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f11), c0585q);
            androidx.appcompat.widget.P0.indigo((i16 >> 18) & 14, dVar, c0585q, true);
            f10 = f11;
        } else {
            c0585q.ochre();
            f10 = f5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: zb.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    String str2 = str;
                    P.d dVar2 = dVar;
                    U3.bravo(str2, sVar, j5, anVar, j6, f10, dVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(long j5, d.K k6) {
        if (k6 == d.K.alpha) {
            if (Q0.a.golf(j5) == Integer.MAX_VALUE) {
                AbstractC1719b.charlie("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (Q0.a.hotel(j5) != Integer.MAX_VALUE) {
                return;
            }
            AbstractC1719b.charlie("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
}
