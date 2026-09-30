package s6;

import F.AbstractC0141o0;
import T.s;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import f0.AbstractC1680b;
import fb.C1705d;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import m.C2093f;
import ob.AbstractC2214g;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.G4;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class G4 {
    public static final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1049894726);
        if (i4 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(1 & i4, z2)) {
            float f5 = AbstractC2214g.alpha;
            AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.echo(androidx.compose.foundation.layout.V.oscar(T.p.alpha, AbstractC2214g.oscar), AbstractC2214g.papa), Db.c.azure, a0.ao.alpha), c0585q, 0);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new com.checkout.components.kmp.rememberme.di.b(i4, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final T.s sVar, final C1705d c1705d, C1705d c1705d2, C2093f c2093f, final long j5, final float f5, final long j6, InterfaceC0581m interfaceC0581m, final int i4, final int i5) {
        int i10;
        C1705d c1705d3;
        int i11;
        float f10;
        int i12;
        boolean z2;
        C0585q c0585q;
        androidx.compose.runtime.Q uniform;
        boolean z10;
        float f11;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        final C2093f shape = c2093f;
        Intrinsics.echo(shape, "shape");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(2064835467);
        if ((i4 & 6) == 0) {
            if (c0585q2.golf(sVar)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q2.india(c1705d)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        int i20 = i5 & 4;
        if (i20 != 0) {
            i10 |= 384;
        } else if ((i4 & 384) == 0) {
            c1705d3 = c1705d2;
            if (c0585q2.india(c1705d3)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 |= i11;
            if ((i4 & 3072) == 0) {
                if (c0585q2.golf(null)) {
                    i17 = 2048;
                } else {
                    i17 = Barcode.FORMAT_UPC_E;
                }
                i10 |= i17;
            }
            if ((i4 & 24576) == 0) {
                if (c0585q2.golf(shape)) {
                    i16 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i16 = 8192;
                }
                i10 |= i16;
            }
            if ((196608 & i4) == 0) {
                if (c0585q2.foxtrot(j5)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
                i10 |= i15;
            }
            if ((1572864 & i4) != 0) {
                f10 = f5;
                if (c0585q2.delta(f10)) {
                    i14 = 1048576;
                } else {
                    i14 = 524288;
                }
                i10 |= i14;
            } else {
                f10 = f5;
            }
            if ((12582912 & i4) == 0) {
                if (c0585q2.foxtrot(j6)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i10 |= i13;
            }
            i12 = 100663296 | i10;
            if ((38347923 & i12) == 38347922) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!c0585q2.magenta(i12 & 1, z2)) {
                c0585q2.orange();
                int i21 = i4 & 1;
                T.p pVar = T.p.alpha;
                if (i21 != 0 && !c0585q2.beige()) {
                    c0585q2.ochre();
                } else if (i20 != 0) {
                    c1705d3 = null;
                }
                c0585q2.romeo();
                float f12 = AbstractC2214g.alpha;
                if (c1705d3 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f13 = AbstractC2214g.alpha + AbstractC2214g.kilo;
                float f14 = AbstractC2214g.bravo + AbstractC2214g.lima;
                androidx.compose.foundation.layout.M m4 = new androidx.compose.foundation.layout.M(f13, f14, f13, f14);
                C1705d c1705d4 = c1705d3;
                T.s alpha = t6.ac.alpha(androidx.compose.foundation.layout.V.charlie(sVar, 1.0f), f10, shape, j6, j6, 4);
                shape = shape;
                T.s romeo = AbstractC0538d.romeo(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(alpha, shape), j5, a0.ao.alpha).then(pVar), m4);
                q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                int romeo2 = C0564b.romeo(c0585q2);
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(romeo, c0585q2);
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
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
                    ao.ad.blue(romeo2, c0585q2, romeo2, c2549i3);
                }
                C2549i c2549i4 = C2551k.delta;
                C0564b.blue(c2549i4, c0585q2, charlie);
                T.s charlie2 = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, c0585q2, 54);
                int romeo3 = C0564b.romeo(c0585q2);
                androidx.compose.runtime.I mike2 = c0585q2.mike();
                T.s charlie3 = T.a.charlie(charlie2, c0585q2);
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(c2549i, c0585q2, alpha2);
                C0564b.blue(c2549i2, c0585q2, mike2);
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
                    ao.ad.blue(romeo3, c0585q2, romeo3, c2549i3);
                }
                C0564b.blue(c2549i4, c0585q2, charlie3);
                T.s maroon = androidx.appcompat.widget.P0.maroon(1.0f);
                if (z10) {
                    f11 = AbstractC2214g.quebec;
                } else {
                    f11 = 0;
                }
                charlie(AbstractC0538d.whiskey(maroon, 0.0f, 0.0f, f11, 0.0f, 11), c1705d.alpha, c1705d.bravo, c1705d.charlie, c0585q2, (i12 >> 12) & 57344, 0);
                c0585q = c0585q2;
                if (z10) {
                    c0585q.purple(1639048287);
                    alpha(c0585q, 0);
                    c1705d3 = c1705d4;
                    charlie(AbstractC0538d.whiskey(androidx.appcompat.widget.P0.maroon(1.0f), AbstractC2214g.quebec, 0.0f, 0.0f, 0.0f, 14), c1705d3.alpha, c1705d3.bravo, c1705d3.charlie, c0585q, 0, 16);
                    z11 = false;
                } else {
                    c1705d3 = c1705d4;
                    z11 = false;
                    c0585q.purple(1635231629);
                }
                c0585q.quebec(z11);
                c0585q.quebec(true);
                c0585q.quebec(true);
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
            }
            final C1705d c1705d5 = c1705d3;
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new Xd.l() { // from class: fb.c
                    @Override // Xd.l
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int cyan = C0564b.cyan(i4 | 1);
                        C1705d c1705d6 = c1705d;
                        long j7 = j6;
                        G4.bravo(s.this, c1705d6, c1705d5, shape, j5, f5, j7, (InterfaceC0581m) obj, cyan, i5);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        c1705d3 = c1705d2;
        if ((i4 & 3072) == 0) {
        }
        if ((i4 & 24576) == 0) {
        }
        if ((196608 & i4) == 0) {
        }
        if ((1572864 & i4) != 0) {
        }
        if ((12582912 & i4) == 0) {
        }
        i12 = 100663296 | i10;
        if ((38347923 & i12) == 38347922) {
        }
        if (!c0585q2.magenta(i12 & 1, z2)) {
        }
        final C1705d c1705d52 = c1705d3;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void charlie(T.s sVar, AbstractC1680b abstractC1680b, String str, String str2, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        AbstractC1680b abstractC1680b2;
        int i11;
        boolean z2;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-318311261);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i10 = i15 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            abstractC1680b2 = abstractC1680b;
            if (c0585q.india(abstractC1680b2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i10 |= i14;
        } else {
            abstractC1680b2 = abstractC1680b;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(str)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i10 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.golf(str2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i12;
        }
        if ((i5 & 16) != 0) {
            i10 |= 24576;
        } else if ((i4 & 24576) == 0) {
            if (c0585q.india(null)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i10 |= i11;
        }
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            float f5 = AbstractC2214g.alpha;
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            C0537c c0537c = AbstractC0542h.alpha;
            T.j jVar = T.d.f2061d;
            androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(c0537c, jVar, c0585q, 54);
            int romeo = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(charlie, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C2549i c2549i = C2551k.foxtrot;
            C0564b.blue(c2549i, c0585q, alpha);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            T.s maroon = androidx.appcompat.widget.P0.maroon(1.0f);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.golf(AbstractC2214g.mike), jVar, c0585q, 48);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(maroon, c0585q);
            c0585q.white();
            int i16 = i10;
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha2);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                ao.ad.blue(romeo2, c0585q, romeo2, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie3);
            AbstractC0141o0.alpha(abstractC1680b2, null, androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2214g.hotel), AbstractC2214g.golf, c0585q, ((i16 >> 3) & 14) | 48, 0);
            T.s maroon2 = androidx.appcompat.widget.P0.maroon(1.0f);
            androidx.compose.runtime.E0 e02 = F.T2.alpha;
            F.G2.bravo(str, maroon2, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, D0.an.alpha(((F.S2) c0585q.kilo(e02)).kilo, Db.c.black, AbstractC2214g.india, H0.v.yellow, null, 0L, 0, 0L, null, null, 16777208), c0585q, (i16 >> 6) & 14, 3120, 55292);
            c0585q.quebec(true);
            c0585q.purple(1091091016);
            F.G2.bravo(str2, AbstractC0538d.whiskey(pVar, AbstractC2214g.november, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, D0.an.alpha(((F.S2) c0585q.kilo(e02)).kilo, Db.c.juliet, AbstractC2214g.juliet, H0.v.f1409c, null, 0L, 0, 0L, null, null, 16777208), c0585q, (i16 >> 9) & 14, 0, 65532);
            c0585q = c0585q;
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Bb.e(sVar, abstractC1680b, str, str2, i4, i5);
        }
    }

    public static De.a delta(int i4, boolean z2, Ce.am amVar, int i5) {
        boolean z10;
        boolean z11 = false;
        if ((i5 & 1) != 0) {
            z10 = false;
        } else {
            z10 = z2;
        }
        if ((i5 & 2) == 0) {
            z11 = true;
        }
        boolean z12 = z11;
        int i10 = i5 & 4;
        Set set = null;
        if (i10 != 0) {
            amVar = null;
        }
        com.google.android.material.datepicker.j.papa(i4, "<this>");
        if (amVar != null) {
            set = kotlin.collections.ab.oscar(amVar);
        }
        return new De.a(i4, z12, z10, set, 34);
    }
}
