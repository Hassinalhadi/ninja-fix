package s6;

import F.AbstractC0141o0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0540f;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import g0.C1726f;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l3.AbstractC2056a;
import m.AbstractC2094g;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class N6 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(int i4, int i5, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 function0) {
        int i10;
        boolean z2;
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-187904967);
        if ((i5 & 6) == 0) {
            if (c0585q.golf(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i5;
        } else {
            i10 = i5;
        }
        if ((i5 & 48) == 0) {
            if (c0585q.echo(i4)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i5 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i5 & 3072) == 0) {
            if (c0585q.india(function0)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            T.p pVar = T.p.alpha;
            T.j jVar = T.d.f2061d;
            C0537c c0537c = AbstractC0542h.alpha;
            C0540f hotel = AbstractC0542h.hotel(8, T.d.f2063g);
            float f5 = 12;
            T.s bravo = androidx.compose.foundation.a.bravo(t6.R3.charlie(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.echo(sVar, 56), AbstractC2094g.bravo(f5)), 1, Pc.i.bravo, AbstractC2094g.bravo(f5)), Pc.i.alpha, a0.ao.alpha);
            if ((i10 & 7168) == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == C0580l.alpha) {
                jade = new Bb.a(function0, 12);
                c0585q.f(jade);
            }
            T.s uniform = AbstractC0538d.uniform(androidx.compose.foundation.a.echo(15, bravo, null, (Function0) jade, false), 16, 0.0f, 2);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(hotel, jVar, c0585q, 54);
            long j5 = c0585q.magenta;
            int i15 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(uniform, c0585q);
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
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(i4, c0585q, (i10 >> 3) & 14), null, androidx.compose.foundation.layout.V.kilo(pVar, 20), Pc.i.charlie, c0585q, 3504, 0);
            F.G2.bravo(str, pVar, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new D0.an(a0.ao.delta(4280756010L), AbstractC2636d7.charlie(18), new H0.v(700), null, new H0.n(ArraysKt.sierra(new H0.i[]{AbstractC2715m5.alpha(R.font.circularstd, null, 0, 14)})), 0L, 3, 0L, 0, 16744408), c0585q, (i10 & 14) | 48, 0, 65532);
            c0585q = c0585q;
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new Lb.at(str, i4, sVar, function0, i5);
        }
    }

    public static final void bravo(boolean z2, boolean z10, Function0 onGalleryClick, Function0 onCameraClick, Function0 onDismiss, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        C0585q c0585q;
        boolean z12;
        boolean z13;
        InterfaceC0539e interfaceC0539e;
        int i14;
        T.p pVar;
        float f5;
        T.s charlie;
        T.s charlie2;
        Intrinsics.echo(onGalleryClick, "onGalleryClick");
        Intrinsics.echo(onCameraClick, "onCameraClick");
        Intrinsics.echo(onDismiss, "onDismiss");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(1905080220);
        if (c0585q2.hotel(z2)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i15 = i4 | i5;
        if (c0585q2.hotel(z10)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i16 = i15 | i10;
        if (c0585q2.india(onGalleryClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i17 = i16 | i11;
        if (c0585q2.india(onCameraClick)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i18 = i17 | i12;
        if (c0585q2.india(onDismiss)) {
            i13 = Http2.INITIAL_MAX_FRAME_SIZE;
        } else {
            i13 = 8192;
        }
        int i19 = i18 | i13;
        if ((i19 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q2.magenta(i19 & 1, z11)) {
            T.p pVar2 = T.p.alpha;
            float f10 = 16;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f), AbstractC2094g.delta(f10, f10)), Pc.i.alpha, AbstractC2094g.delta(f10, f10)), f10);
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q2, 0);
            long j5 = c0585q2.magenta;
            int i20 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q2.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q2);
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
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i20))) {
                ao.ad.blue(i20, c0585q2, i20, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q2, charlie3);
            T.s charlie4 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j6 = c0585q2.magenta;
            int i21 = (int) (j6 ^ (j6 >>> 32));
            androidx.compose.runtime.I mike2 = c0585q2.mike();
            T.s charlie5 = T.a.charlie(charlie4, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i, c0585q2, delta);
            C0564b.blue(c2549i2, c0585q2, mike2);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i21))) {
                ao.ad.blue(i21, c0585q2, i21, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q2, charlie5);
            C0551q c0551q = C0551q.alpha;
            C1726f alpha3 = AbstractC2056a.alpha();
            long j7 = Pc.i.charlie;
            T.s kilo = androidx.compose.foundation.layout.V.kilo(c0551q.alpha(pVar2, T.d.red), 24);
            if ((57344 & i19) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object jade = c0585q2.jade();
            if (z12 || jade == C0580l.alpha) {
                jade = new Bb.a(onDismiss, 11);
                c0585q2.f(jade);
            }
            c0585q = c0585q2;
            AbstractC0141o0.bravo(alpha3, "Close", androidx.compose.foundation.a.echo(15, kilo, null, (Function0) jade, false), j7, c0585q, 3120, 0);
            c0585q.quebec(true);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar2, f10), c0585q);
            if (z2 && z10) {
                z13 = true;
            } else {
                z13 = false;
            }
            T.s charlie6 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
            if (z13) {
                interfaceC0539e = AbstractC0542h.golf(12);
            } else {
                interfaceC0539e = AbstractC0542h.echo;
            }
            androidx.compose.foundation.layout.S alpha4 = androidx.compose.foundation.layout.Q.alpha(interfaceC0539e, T.d.f2060c, c0585q, 0);
            long j10 = c0585q.magenta;
            int i22 = (int) (j10 ^ (j10 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie7 = T.a.charlie(charlie6, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i22))) {
                ao.ad.blue(i22, c0585q, i22, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie7);
            if (z2) {
                c0585q.purple(-278634806);
                String bravo = AbstractC3086y3.bravo(c0585q, R.string.gallery);
                if (z13) {
                    charlie2 = androidx.appcompat.widget.P0.maroon(1.0f);
                } else {
                    charlie2 = androidx.compose.foundation.layout.V.charlie(pVar2, 1.0f);
                }
                pVar = pVar2;
                f5 = f10;
                i14 = i19;
                alpha(R.drawable.icongallery, ((i19 << 3) & 7168) | 48, charlie2, c0585q, bravo, onGalleryClick);
            } else {
                i14 = i19;
                pVar = pVar2;
                f5 = f10;
                c0585q.purple(-281254368);
            }
            c0585q.quebec(false);
            if (z10) {
                c0585q.purple(-278266309);
                String bravo2 = AbstractC3086y3.bravo(c0585q, R.string.camera);
                if (z13) {
                    charlie = androidx.appcompat.widget.P0.maroon(1.0f);
                } else {
                    charlie = androidx.compose.foundation.layout.V.charlie(pVar, 1.0f);
                }
                alpha(R.drawable.cameranew, (i14 & 7168) | 48, charlie, c0585q, bravo2, onCameraClick);
            } else {
                c0585q.purple(-281254368);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.echo(pVar, f5), c0585q);
            c0585q.quebec(true);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Yb.Y(z2, z10, onGalleryClick, onCameraClick, onDismiss, i4);
        }
    }
}
