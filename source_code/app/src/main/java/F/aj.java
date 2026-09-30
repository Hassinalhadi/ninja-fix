package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import delivery.samurai.android.R;
import kotlin.jvm.functions.Function1;
import m.AbstractC2088a;

/* loaded from: classes3.dex */
public final class aj {
    public static final aj alpha = new Object();
    public static final float bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [F.aj, java.lang.Object] */
    static {
        float f5 = H.s.alpha;
        float f10 = H.s.charlie;
        bravo = 640;
    }

    public final void alpha(T.p pVar, float f5, float f10, AbstractC2088a abstractC2088a, long j5, InterfaceC0581m interfaceC0581m, int i4) {
        T.p pVar2;
        float f11;
        float f12;
        AbstractC2088a abstractC2088a2;
        long delta;
        C0585q c0585q;
        float f13;
        AbstractC2088a abstractC2088a3;
        long j6;
        float f14;
        T.p pVar3;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1364277227);
        if (((i4 | 9654) & 9363) == 9362 && c0585q2.bronze()) {
            c0585q2.ochre();
            pVar3 = pVar;
            f14 = f5;
            f13 = f10;
            abstractC2088a3 = abstractC2088a;
            j6 = j5;
            c0585q = c0585q2;
        } else {
            c0585q2.orange();
            if ((i4 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
                pVar2 = pVar;
                f11 = f5;
                f12 = f10;
                abstractC2088a2 = abstractC2088a;
                delta = j5;
            } else {
                pVar2 = T.p.alpha;
                f11 = H.s.bravo;
                f12 = H.s.alpha;
                abstractC2088a2 = ((Y1) c0585q2.kilo(Z1.alpha)).echo;
                delta = Q.delta(c0585q2, 19);
            }
            c0585q2.romeo();
            String echo = androidx.compose.material3.internal.i.echo(c0585q2, R.string.m3c_bottom_sheet_drag_handle_description);
            T.s uniform = AbstractC0538d.uniform(pVar2, 0.0f, AbstractC0095c2.alpha, 1);
            boolean golf = c0585q2.golf(echo);
            Object jade = c0585q2.jade();
            if (golf || jade == C0580l.alpha) {
                jade = new A0.q(echo, 2);
                c0585q2.f(jade);
            }
            c0585q = c0585q2;
            AbstractC0127k2.alpha(A0.o.bravo(uniform, false, (Function1) jade), abstractC2088a2, delta, 0L, 0.0f, 0.0f, null, P.e.echo(-1039573072, new ah(f11, f12), c0585q2), c0585q, 12582912, 120);
            f13 = f12;
            abstractC2088a3 = abstractC2088a2;
            j6 = delta;
            f14 = f11;
            pVar3 = pVar2;
        }
        androidx.compose.runtime.Q uniform2 = c0585q.uniform();
        if (uniform2 != null) {
            uniform2.delta = new ai(this, pVar3, f14, f13, abstractC2088a3, j6, i4);
        }
    }
}
