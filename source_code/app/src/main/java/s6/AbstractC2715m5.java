package s6;

import F.AbstractC0141o0;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g0.C1726f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2210c;
import ob.C2211d;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2715m5;
import t6.AbstractC3076w3;
import t6.AbstractC3087z;

/* renamed from: s6.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2715m5 {
    public static H0.z alpha(int i4, H0.v vVar, int i5, int i10) {
        if ((i10 & 2) != 0) {
            vVar = H0.v.yellow;
        }
        if ((i10 & 4) != 0) {
            i5 = 0;
        }
        return new H0.z(i4, vVar, i5, new H0.u(new H0.t[0]));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final String text, final Function0 onClick, final T.s sVar, final boolean z2, C1726f c1726f, boolean z10, boolean z11, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        C1726f c1726f2;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int i14;
        boolean z13;
        int i15;
        boolean z14;
        final boolean z15;
        final boolean z16;
        androidx.compose.runtime.Q uniform;
        C1726f c1726f3;
        boolean z17;
        boolean z18;
        P.d dVar;
        boolean z19;
        C1726f c1726f4;
        int i16;
        int i17;
        int i18;
        int i19;
        Intrinsics.echo(text, "text");
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(920841634);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(text)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(onClick)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i17 = Barcode.FORMAT_QR_CODE;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 2048;
            } else {
                i16 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i16;
        }
        int i20 = i5 & 16;
        if (i20 != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            c1726f2 = c1726f;
            if (c0585q.golf(c1726f2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
            i12 = i5 & 32;
            if (i12 == 0) {
                i10 |= 196608;
            } else if ((196608 & i4) == 0) {
                z12 = z10;
                if (c0585q.hotel(z12)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i10 |= i13;
                i14 = i5 & 64;
                if (i14 != 0) {
                    i10 |= 1572864;
                } else if ((1572864 & i4) == 0) {
                    z13 = z11;
                    if (c0585q.hotel(z13)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i10 |= i15;
                    if ((599187 & i10) == 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (!c0585q.magenta(i10 & 1, z14)) {
                        T.p pVar = T.p.alpha;
                        if (i20 != 0) {
                            c1726f3 = null;
                        } else {
                            c1726f3 = c1726f2;
                        }
                        if (i12 != 0) {
                            z17 = false;
                        } else {
                            z17 = z12;
                        }
                        if (i14 != 0) {
                            z18 = false;
                        } else {
                            z18 = z13;
                        }
                        float f5 = 8;
                        C2093f bravo = AbstractC2094g.bravo(f5);
                        float f10 = C2211d.bravo;
                        T.j jVar = T.d.f2061d;
                        a0.an anVar = a0.ao.alpha;
                        if (z17 && !z2) {
                            c0585q.purple(837407648);
                            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 56), bravo), 1, AbstractC2210c.delta, bravo), AbstractC2210c.alpha, anVar), 16);
                            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, jVar, c0585q, 54);
                            int romeo = C0564b.romeo(c0585q);
                            androidx.compose.runtime.I mike = c0585q.mike();
                            T.s charlie = T.a.charlie(sierra, c0585q);
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
                            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_mark_complete_disabled, c0585q, 0), null, androidx.compose.foundation.layout.V.kilo(pVar, 24), C0366t.kilo, c0585q, 3504, 0);
                            AbstractC0538d.echo(androidx.compose.foundation.layout.V.kilo(pVar, f5), c0585q);
                            F.G2.bravo(text, null, C2211d.amber, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, null, AbstractC2636d7.charlie(18), 0, false, 0, 0, null, null, c0585q, (i10 & 14) | 200064, 6, 130002);
                            c0585q = c0585q;
                            c0585q.quebec(true);
                            c0585q.quebec(false);
                            c1726f2 = c1726f3;
                        } else if (z18 && z2) {
                            c0585q.purple(838433872);
                            T.s sierra2 = AbstractC0538d.sierra(androidx.compose.foundation.a.delta(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), 56), bravo), AbstractC2210c.golf, anVar), false, null, null, onClick, 7), 16);
                            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, jVar, c0585q, 54);
                            int romeo2 = C0564b.romeo(c0585q);
                            androidx.compose.runtime.I mike2 = c0585q.mike();
                            T.s charlie2 = T.a.charlie(sierra2, c0585q);
                            InterfaceC2552l.maroon.getClass();
                            C2550j c2550j2 = C2551k.bravo;
                            c0585q.white();
                            if (c0585q.lime) {
                                c0585q.lima(c2550j2);
                            } else {
                                c0585q.i();
                            }
                            C0564b.blue(C2551k.foxtrot, c0585q, alpha2);
                            C0564b.blue(C2551k.echo, c0585q, mike2);
                            C2549i c2549i2 = C2551k.golf;
                            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                                ao.ad.blue(romeo2, c0585q, romeo2, c2549i2);
                            }
                            C0564b.blue(C2551k.delta, c0585q, charlie2);
                            if (c1726f3 == null) {
                                c0585q.purple(1476640313);
                                c0585q.quebec(false);
                                z19 = true;
                                c1726f4 = c1726f3;
                            } else {
                                c0585q.purple(1476640314);
                                z19 = true;
                                c1726f4 = c1726f3;
                                AbstractC0141o0.bravo(c1726f4, null, androidx.compose.foundation.layout.V.kilo(pVar, 24), C2211d.azure, c0585q, 3504, 0);
                                AbstractC0538d.echo(androidx.compose.foundation.layout.V.kilo(pVar, f5), c0585q);
                                c0585q.quebec(false);
                            }
                            F.G2.bravo(text, null, C2211d.azure, AbstractC2636d7.charlie(18), H0.v.f1409c, null, 0L, null, AbstractC2636d7.charlie(18), 0, false, 0, 0, null, null, c0585q, (i10 & 14) | 200064, 6, 130002);
                            c0585q = c0585q;
                            c0585q.quebec(true);
                            c0585q.quebec(false);
                            c1726f2 = c1726f4;
                        } else {
                            c0585q.purple(839425159);
                            c1726f2 = c1726f3;
                            if (c1726f2 != null) {
                                c0585q.purple(839599255);
                                P.d echo = P.e.echo(238896232, new bz.af(11, c1726f2), c0585q);
                                c0585q.quebec(false);
                                dVar = echo;
                            } else {
                                c0585q.purple(839921499);
                                c0585q.quebec(false);
                                dVar = null;
                            }
                            AbstractC2726n7.alpha(text, onClick, z2, sVar, dVar, c0585q, (i10 & 126) | ((i10 >> 3) & 896) | ((i10 << 3) & 7168), 0);
                            c0585q.quebec(false);
                        }
                        z15 = z17;
                        z16 = z18;
                    } else {
                        c0585q.ochre();
                        z15 = z12;
                        z16 = z13;
                    }
                    final C1726f c1726f5 = c1726f2;
                    uniform = c0585q.uniform();
                    if (uniform == null) {
                        uniform.delta = new Xd.l() { // from class: ib.b
                            @Override // Xd.l
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int cyan = C0564b.cyan(i4 | 1);
                                boolean z20 = z16;
                                AbstractC2715m5.bravo(text, onClick, sVar, z2, c1726f5, z15, z20, (InterfaceC0581m) obj, cyan, i5);
                                return Unit.INSTANCE;
                            }
                        };
                        return;
                    }
                    return;
                }
                z13 = z11;
                if ((599187 & i10) == 599186) {
                }
                if (!c0585q.magenta(i10 & 1, z14)) {
                }
                final C1726f c1726f52 = c1726f2;
                uniform = c0585q.uniform();
                if (uniform == null) {
                }
            }
            z12 = z10;
            i14 = i5 & 64;
            if (i14 != 0) {
            }
            z13 = z11;
            if ((599187 & i10) == 599186) {
            }
            if (!c0585q.magenta(i10 & 1, z14)) {
            }
            final C1726f c1726f522 = c1726f2;
            uniform = c0585q.uniform();
            if (uniform == null) {
            }
        }
        c1726f2 = c1726f;
        i12 = i5 & 32;
        if (i12 == 0) {
        }
        z12 = z10;
        i14 = i5 & 64;
        if (i14 != 0) {
        }
        z13 = z11;
        if ((599187 & i10) == 599186) {
        }
        if (!c0585q.magenta(i10 & 1, z14)) {
        }
        final C1726f c1726f5222 = c1726f2;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
