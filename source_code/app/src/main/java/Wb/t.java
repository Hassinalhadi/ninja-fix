package Wb;

import D0.an;
import F.K1;
import a0.C0366t;
import androidx.appcompat.widget.P0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.M;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import delivery.samurai.android.R;
import h.AbstractC1797a;
import java.io.File;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import okhttp3.internal.http2.Http2;
import q0.C2391j;
import q0.av;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import s6.AbstractC2715m5;
import t6.AbstractC3087z;
import t6.M3;
import t6.S3;
import t6.W3;
import z.AbstractC3447a;
import z.ak;

/* loaded from: classes2.dex */
public abstract class t {
    public static final P.d alpha = new P.d(new S4.b(8), 644438354, false);
    public static final P.d bravo = new P.d(new Vc.d(2), -188954404, false);
    public static final P.d charlie = new P.d(new Vc.d(3), 558311646, false);

    public static final void alpha(File imageFile, Function0 onClose, Function0 onUsePhoto, Function0 onRetake, String str, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        int i11;
        int i12;
        int i13;
        String str2;
        int i14;
        int i15;
        boolean z2;
        String str3;
        String str4;
        int i16;
        String str5;
        Intrinsics.echo(imageFile, "imageFile");
        Intrinsics.echo(onClose, "onClose");
        Intrinsics.echo(onUsePhoto, "onUsePhoto");
        Intrinsics.echo(onRetake, "onRetake");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-689087973);
        if (c0585q.india(imageFile)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i4 | i10;
        if (c0585q.india(onClose)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if (c0585q.india(onUsePhoto)) {
            i12 = Barcode.FORMAT_QR_CODE;
        } else {
            i12 = 128;
        }
        int i19 = i18 | i12;
        if (c0585q.india(onRetake)) {
            i13 = 2048;
        } else {
            i13 = Barcode.FORMAT_UPC_E;
        }
        int i20 = i19 | i13;
        int i21 = i5 & 16;
        if (i21 != 0) {
            i15 = i20 | 24576;
            str2 = str;
        } else {
            str2 = str;
            if (c0585q.golf(str2)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = 8192;
            }
            i15 = i20 | i14;
        }
        int i22 = i15;
        if ((i22 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i22 & 1, z2)) {
            if (i21 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            T.p pVar = T.p.alpha;
            float f5 = 24;
            float f10 = 0;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.bravo(V.echo(V.charlie(pVar, 1.0f), HttpConstants.HTTP_INTERNAL_ERROR), C0366t.echo, AbstractC2094g.charlie(f5, f5, f10, f10)), f5);
            C0537c c0537c = AbstractC0542h.alpha;
            float f11 = 16;
            C0554u alpha2 = AbstractC0553t.alpha(AbstractC0542h.india(f11, T.d.f2060c), T.d.f2062f, c0585q, 54);
            long j5 = c0585q.magenta;
            int i23 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(sierra, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i23))) {
                ad.blue(i23, c0585q, i23, c2549i3);
            }
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            T.s charlie3 = V.charlie(pVar, 1.0f);
            T.j jVar = T.d.f2061d;
            S alpha3 = Q.alpha(AbstractC0542h.alpha, jVar, c0585q, 48);
            long j6 = c0585q.magenta;
            int i24 = (int) (j6 ^ (j6 >>> 32));
            I mike2 = c0585q.mike();
            T.s charlie4 = T.a.charlie(charlie3, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha3);
            C0564b.blue(c2549i2, c0585q, mike2);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i24))) {
                ad.blue(i24, c0585q, i24, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie4);
            if (str4 == null) {
                i16 = 0;
                str5 = Q0.c.oscar(c0585q, 1253989094, R.string.image_proof, c0585q, false);
            } else {
                i16 = 0;
                c0585q.purple(1253988815);
                c0585q.quebec(false);
                str5 = str4;
            }
            long charlie5 = AbstractC2636d7.charlie(18);
            H0.i[] iVarArr = new H0.i[1];
            iVarArr[i16] = AbstractC2715m5.alpha(R.font.circularstd, null, i16, 14);
            String str6 = str5;
            ak.bravo(str6, V.echo(pVar, 23), 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, new an(ab.delta, charlie5, new H0.v(900), null, new H0.n(ArraysKt.sierra(iVarArr)), 0L, 5, 0L, 0, 16744408), c0585q, 48, 0, 65532);
            AbstractC0538d.echo(P0.maroon(1.0f), c0585q);
            K1.foxtrot(onClose, V.kilo(pVar, 40), false, null, alpha, c0585q, ((i22 >> 3) & 14) | 196656, 28);
            c0585q.quebec(true);
            N2.n juliet = N2.p.juliet(imageFile, c0585q, i22 & 14);
            av avVar = C2391j.foxtrot;
            T.s charlie6 = V.charlie(pVar, 1.0f);
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            W3.alpha(juliet, null, AbstractC3087z.alpha(charlie6.then(new LayoutWeightElement(1.0f, true)), AbstractC2094g.bravo(f11)), null, avVar, 0.0f, null, c0585q, 24624, 104);
            T.s charlie7 = V.charlie(pVar, 1.0f);
            float f12 = 8;
            S alpha4 = Q.alpha(AbstractC0542h.golf(f12), jVar, c0585q, 54);
            long j7 = c0585q.magenta;
            int i25 = (int) (j7 ^ (j7 >>> 32));
            I mike3 = c0585q.mike();
            T.s charlie8 = T.a.charlie(charlie7, c0585q);
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(c2549i, c0585q, alpha4);
            C0564b.blue(c2549i2, c0585q, mike3);
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i25))) {
                ad.blue(i25, c0585q, i25, c2549i3);
            }
            C0564b.blue(c2549i4, c0585q, charlie8);
            float f13 = 60;
            T.s echo = V.echo(P0.maroon(1.0f), f13);
            float f14 = 12;
            C2093f bravo2 = AbstractC2094g.bravo(f14);
            M m4 = AbstractC3447a.alpha;
            M3.alpha(onUsePhoto, echo, false, AbstractC3447a.bravo(f10, f10, c0585q, 54, 28), bravo2, null, AbstractC3447a.alpha(ab.bravo, 0L, c0585q, 6, 14), new M(f11, f11, f11, f11), bravo, c0585q, ((i22 >> 6) & 14) | 905969664, 76);
            M3.bravo(onRetake, V.echo(P0.maroon(1.0f), f13), AbstractC3447a.bravo(f10, f10, c0585q, 54, 28), AbstractC2094g.bravo(f14), S3.alpha(1, ab.charlie), AbstractC3447a.charlie(ab.alpha, c0585q, 6), new M(f12, f11, f12, f11), charlie, c0585q, ((i22 >> 9) & 14) | 907542528, 12);
            c0585q = c0585q;
            c0585q.quebec(true);
            c0585q.quebec(true);
            str3 = str4;
        } else {
            c0585q.ochre();
            str3 = str2;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.b(imageFile, onClose, onUsePhoto, onRetake, str3, i4, i5);
        }
    }
}
