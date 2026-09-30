package G;

import A2.ai;
import F.O;
import F.Q;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import ao.ad;
import bz.AbstractC0779d;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public final class d {
    public static final d alpha = new Object();
    public static final C2093f bravo = AbstractC2094g.alpha;
    public static final float charlie = 80;
    public static final float delta = H.f.charlie;

    public final void alpha(v vVar, boolean z2, T.s sVar, long j5, long j6, float f5, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        float f10;
        long j7;
        long j10;
        float f11;
        long j11;
        long j12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1076870256);
        if (c0585q.golf(vVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.golf(sVar)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11 | 74752;
        if ((599187 & i15) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
            j11 = j5;
            j12 = j6;
            f11 = f5;
        } else {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i12 = i15 & (-523265);
                j10 = j5;
                j7 = j6;
                f10 = f5;
            } else {
                E0 e02 = Q.alpha;
                long j13 = ((O) c0585q.kilo(e02)).coral;
                long j14 = ((O) c0585q.kilo(e02)).sierra;
                i12 = i15 & (-523265);
                f10 = charlie;
                j7 = j14;
                j10 = j13;
            }
            c0585q.romeo();
            float f12 = l.alpha;
            T.s charlie2 = androidx.compose.ui.draw.a.charlie(V.kilo(sVar, l.delta), i.purple);
            float f13 = delta;
            C2093f c2093f = bravo;
            float f14 = f10;
            T.s bravo2 = androidx.compose.foundation.a.bravo(androidx.compose.ui.graphics.a.alpha(charlie2, new j(vVar, z2, f14, f13, c2093f)), j10, c2093f);
            ap delta2 = AbstractC0547m.delta(T.d.teal, false);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie3 = T.a.charlie(bravo2, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta2);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie3);
            ai.bravo(Boolean.valueOf(z2), null, AbstractC0779d.kilo(100, 0, null, 6), null, P.e.echo(167807595, new b(j7, vVar), c0585q), c0585q, ((i12 >> 3) & 14) | 24960);
            c0585q.quebec(true);
            f11 = f14;
            j11 = j10;
            j12 = j7;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new c(this, vVar, z2, sVar, j11, j12, f11, i4);
        }
    }
}
