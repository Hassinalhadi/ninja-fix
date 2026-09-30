package db;

import F.AbstractC0141o0;
import F.G2;
import H0.v;
import a0.C0355i;
import a0.C0366t;
import a0.an;
import a0.ao;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0537c;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.as;
import ao.ad;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f.InterfaceC1673j;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import q0.C2391j;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2636d7;
import t0.AbstractC2901T;
import t6.AbstractC3076w3;
import t6.AbstractC3086y3;
import t6.AbstractC3087z;
import t6.R3;
import t6.W3;

/* loaded from: classes2.dex */
public abstract class s {
    public static final long alpha = ao.delta(4292138200L);
    public static final long bravo = ao.delta(4294638330L);
    public static final long charlie = ao.delta(4294243573L);
    public static final long delta = ao.delta(4294243573L);
    public static final long echo = ao.delta(4285624698L);
    public static final long foxtrot = ao.delta(4279673674L);

    public static final void alpha(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 onClick, boolean z2) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z10;
        C0585q c0585q;
        T.s alpha2;
        boolean z11;
        T.k kVar;
        C2549i c2549i;
        C2549i c2549i2;
        C2550j c2550j;
        C2549i c2549i3;
        C2093f c2093f;
        C0585q c0585q2;
        boolean z12;
        long j5;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(-1181265901);
        if (c0585q3.india(onClick)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q3.golf(sVar)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q3.hotel(z2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q3.golf(str)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q3.magenta(i16 & 1, z10)) {
            T.p pVar = T.p.alpha;
            C2093f bravo2 = AbstractC2094g.bravo(12);
            Object jade = c0585q3.jade();
            as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = ad.xray(c0585q3);
            }
            InterfaceC1673j interfaceC1673j = (InterfaceC1673j) jade;
            Q0.d dVar = (Q0.d) c0585q3.kilo(AbstractC2901T.hotel);
            float f5 = 4;
            final float lavender = dVar.lavender(f5);
            final float lavender2 = dVar.lavender(f5);
            float f10 = 1;
            final float lavender3 = dVar.lavender(f10);
            if (z2) {
                c0585q3.purple(1870071415);
                c0585q3.quebec(false);
                alpha2 = R3.charlie(pVar, f10, alpha, bravo2);
            } else {
                c0585q3.purple(1870147768);
                boolean delta2 = c0585q3.delta(lavender3) | c0585q3.delta(lavender) | c0585q3.delta(lavender2);
                Object jade2 = c0585q3.jade();
                if (delta2 || jade2 == asVar) {
                    jade2 = new Function1() { // from class: db.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            c0.d drawBehind = (c0.d) obj;
                            Intrinsics.echo(drawBehind, "$this$drawBehind");
                            float f11 = lavender3;
                            float f12 = f11 / 2.0f;
                            float f13 = 12;
                            ad.papa(drawBehind, s.alpha, (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.bravo() >> 32)) - f11) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.bravo() & 4294967295L)) - f11) & 4294967295L), (Float.floatToRawIntBits(drawBehind.lavender(f13)) << 32) | (Float.floatToRawIntBits(drawBehind.lavender(f13)) & 4294967295L), new c0.h(f11, 0.0f, 0, 0, new C0355i(new DashPathEffect(new float[]{lavender, lavender2}, 0.0f)), 14), 224);
                            return Unit.INSTANCE;
                        }
                    };
                    c0585q3.f(jade2);
                }
                alpha2 = androidx.compose.ui.draw.a.alpha(pVar, (Function1) jade2);
                c0585q3.quebec(false);
            }
            T.s alpha3 = AbstractC3087z.alpha(V.echo(V.charlie(sVar, 1.0f), 82), bravo2);
            long j6 = C0366t.echo;
            an anVar = ao.alpha;
            T.s charlie2 = androidx.compose.foundation.a.charlie(androidx.compose.foundation.a.bravo(alpha3, j6, anVar).then(alpha2), interfaceC1673j, null, false, null, onClick, 28);
            Object jade3 = c0585q3.jade();
            if (jade3 == asVar) {
                jade3 = new com.clevertap.android.sdk.inapp.images.preload.a(11);
                c0585q3.f(jade3);
            }
            T.s bravo3 = A0.o.bravo(charlie2, false, (Function1) jade3);
            float f11 = 8;
            T.s tango = AbstractC0538d.tango(bravo3, f11, f11);
            T.k kVar2 = T.d.teal;
            ap delta3 = AbstractC0547m.delta(kVar2, false);
            int romeo = C0564b.romeo(c0585q3);
            I mike = c0585q3.mike();
            T.s charlie3 = T.a.charlie(tango, c0585q3);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j2 = C2551k.bravo;
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C2549i c2549i4 = C2551k.foxtrot;
            C0564b.blue(c2549i4, c0585q3, delta3);
            C2549i c2549i5 = C2551k.echo;
            C0564b.blue(c2549i5, c0585q3, mike);
            C2549i c2549i6 = C2551k.golf;
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q3, romeo, c2549i6);
            }
            C2549i c2549i7 = C2551k.delta;
            C0564b.blue(c2549i7, c0585q3, charlie3);
            T.i iVar = T.d.f2063g;
            C0537c c0537c = AbstractC0542h.alpha;
            C0554u alpha4 = AbstractC0553t.alpha(AbstractC0542h.india(f5, T.d.f2061d), iVar, c0585q3, 54);
            int romeo2 = C0564b.romeo(c0585q3);
            I mike2 = c0585q3.mike();
            T.s charlie4 = T.a.charlie(pVar, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i4, c0585q3, alpha4);
            C0564b.blue(c2549i5, c0585q3, mike2);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo2))) {
                ad.blue(romeo2, c0585q3, romeo2, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q3, charlie4);
            T.s kilo = V.kilo(pVar, 44);
            ap delta4 = AbstractC0547m.delta(T.d.alpha, false);
            int romeo3 = C0564b.romeo(c0585q3);
            I mike3 = c0585q3.mike();
            T.s charlie5 = T.a.charlie(kilo, c0585q3);
            c0585q3.white();
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i4, c0585q3, delta4);
            C0564b.blue(c2549i5, c0585q3, mike3);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo3))) {
                ad.blue(romeo3, c0585q3, romeo3, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q3, charlie5);
            C0551q c0551q = C0551q.alpha;
            if (str != null && new File(str).exists()) {
                z11 = true;
            } else {
                z11 = false;
            }
            T.s bravo4 = c0551q.bravo();
            C2093f c2093f2 = AbstractC2094g.alpha;
            T.s charlie6 = R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(bravo4, c2093f2), bravo, anVar), 2, charlie, c2093f2);
            ap delta5 = AbstractC0547m.delta(kVar2, false);
            int romeo4 = C0564b.romeo(c0585q3);
            I mike4 = c0585q3.mike();
            T.s charlie7 = T.a.charlie(charlie6, c0585q3);
            c0585q3.white();
            boolean z13 = z11;
            if (c0585q3.lime) {
                c0585q3.lima(c2550j2);
            } else {
                c0585q3.i();
            }
            C0564b.blue(c2549i4, c0585q3, delta5);
            C0564b.blue(c2549i5, c0585q3, mike4);
            if (c0585q3.lime || !Intrinsics.areEqual(c0585q3.jade(), Integer.valueOf(romeo4))) {
                ad.blue(romeo4, c0585q3, romeo4, c2549i6);
            }
            C0564b.blue(c2549i7, c0585q3, charlie7);
            if (z13 && str != null) {
                c0585q3.purple(-2121339956);
                c2093f = c2093f2;
                c2549i = c2549i5;
                c2549i2 = c2549i6;
                c2550j = c2550j2;
                c2549i3 = c2549i4;
                kVar = kVar2;
                z12 = true;
                W3.alpha(N2.p.juliet(new File(str), c0585q3, 0), null, AbstractC3087z.alpha(c0551q.bravo(), c2093f2), null, C2391j.alpha, 0.0f, null, c0585q3, 24624, 104);
                c0585q2 = c0585q3;
                c0585q2.quebec(false);
            } else {
                kVar = kVar2;
                c2549i = c2549i5;
                c2549i2 = c2549i6;
                c2550j = c2550j2;
                c2549i3 = c2549i4;
                c2093f = c2093f2;
                c0585q2 = c0585q3;
                z12 = true;
                c0585q2.purple(-2120974838);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_upload_invoice, c0585q2, 0), null, V.kilo(pVar, 24), C0366t.kilo, c0585q2, 3504, 0);
                c0585q2.quebec(false);
            }
            c0585q2.quebec(z12);
            T.s alpha5 = AbstractC3087z.alpha(V.kilo(c0551q.alpha(pVar, T.d.f2059b), 18), c2093f);
            if (z2) {
                j5 = foxtrot;
            } else {
                j5 = delta;
            }
            T.s bravo5 = androidx.compose.foundation.a.bravo(alpha5, j5, anVar);
            ap delta6 = AbstractC0547m.delta(kVar, false);
            int romeo5 = C0564b.romeo(c0585q2);
            I mike5 = c0585q2.mike();
            T.s charlie8 = T.a.charlie(bravo5, c0585q2);
            c0585q2.white();
            if (c0585q2.lime) {
                c0585q2.lima(c2550j);
            } else {
                c0585q2.i();
            }
            C0564b.blue(c2549i3, c0585q2, delta6);
            C0564b.blue(c2549i, c0585q2, mike5);
            if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo5))) {
                ad.blue(romeo5, c0585q2, romeo5, c2549i2);
            }
            C0564b.blue(c2549i7, c0585q2, charlie8);
            if (z2) {
                c0585q2.purple(1950085373);
                AbstractC0141o0.bravo(i6.d.alpha(), null, V.kilo(pVar, 11), j6, c0585q2, 3504, 0);
                c0585q2.quebec(false);
            } else {
                c0585q2.purple(1950394691);
                AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_upload_arrow, c0585q2, 0), null, V.kilo(pVar, 14), C0366t.kilo, c0585q2, 3504, 0);
                c0585q2.quebec(false);
            }
            c0585q2.quebec(z12);
            c0585q2.quebec(z12);
            C0585q c0585q4 = c0585q2;
            G2.bravo(AbstractC3086y3.bravo(c0585q2, R.string.upload_invoice), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, new D0.an(echo, AbstractC2636d7.charlie(14), v.yellow, null, null, 0L, 3, AbstractC2636d7.charlie(18), 0, 16613368), c0585q4, 0, 3072, 57342);
            c0585q = c0585q4;
            c0585q.quebec(z12);
            c0585q.quebec(z12);
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.f(onClick, sVar, z2, str, i4, 1);
        }
    }
}
