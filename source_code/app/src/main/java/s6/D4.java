package s6;

import F.AbstractC0141o0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0551q;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import ob.AbstractC2212e;
import okhttp3.internal.http2.Http2;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.AbstractC3076w3;
import t6.AbstractC3087z;

/* loaded from: classes2.dex */
public abstract class D4 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11.jade(), java.lang.Integer.valueOf(r13)) == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, Function0 function0, boolean z2) {
        int i5;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1567074121);
        if ((i4 & 6) == 0) {
            if (c0585q.india(function0)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(str)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        int i15 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            if (c0585q.hotel(z2)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i15 |= i11;
        }
        if ((i15 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i15 & 1, z10)) {
            c0585q.orange();
            int i16 = i4 & 1;
            T.p pVar = T.p.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            C2093f bravo = AbstractC2094g.bravo(AbstractC2212e.delta);
            T.s charlie = androidx.compose.foundation.layout.V.charlie(sVar, 1.0f);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
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
            C0564b.blue(c2549i, c0585q, delta);
            C2549i c2549i2 = C2551k.echo;
            C0564b.blue(c2549i2, c0585q, mike);
            C2549i c2549i3 = C2551k.golf;
            if (!c0585q.lime) {
                i10 = i15;
            } else {
                i10 = i15;
            }
            ao.ad.blue(romeo, c0585q, romeo, c2549i3);
            C2549i c2549i4 = C2551k.delta;
            C0564b.blue(c2549i4, c0585q, charlie2);
            C0551q c0551q = C0551q.alpha;
            T.s sierra = AbstractC0538d.sierra(androidx.compose.foundation.a.delta(t6.R3.charlie(androidx.compose.foundation.a.bravo(AbstractC3087z.alpha(androidx.compose.foundation.layout.V.charlie(pVar, 1.0f), bravo), AbstractC2212e.alpha, a0.ao.alpha), AbstractC2212e.charlie, AbstractC2212e.bravo, bravo), false, str, new A0.h(0), function0, 1), AbstractC2212e.echo);
            androidx.compose.foundation.layout.S alpha2 = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
            int romeo2 = C0564b.romeo(c0585q);
            androidx.compose.runtime.I mike2 = c0585q.mike();
            T.s charlie3 = T.a.charlie(sierra, c0585q);
            c0585q.white();
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
            int i17 = i10 >> 6;
            AbstractC0141o0.alpha(AbstractC3076w3.charlie(R.drawable.ic_chat, c0585q, 0), null, androidx.compose.foundation.layout.V.kilo(pVar, AbstractC2212e.golf), AbstractC2212e.hotel, c0585q, (i17 & 112) | 3456, 0);
            AbstractC0538d.echo(androidx.compose.foundation.layout.V.oscar(pVar, AbstractC2212e.foxtrot), c0585q);
            F.G2.bravo(str, null, AbstractC2212e.india, AbstractC2212e.juliet, AbstractC2212e.kilo, null, 0L, null, 0L, 0, false, 0, 0, null, null, c0585q, (i17 & 14) | 200064, 0, 131026);
            c0585q = c0585q;
            c0585q.quebec(true);
            if (z2) {
                c0585q.purple(-1077525652);
                AbstractC0547m.alpha(androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.kilo(AbstractC0538d.sierra(c0551q.alpha(pVar, T.d.red), 9), 6), Db.c.delta, AbstractC2094g.alpha), c0585q, 0);
            } else {
                c0585q.purple(-1080509185);
            }
            c0585q.quebec(false);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.z(i4, sVar, str, function0, z2);
        }
    }
}
