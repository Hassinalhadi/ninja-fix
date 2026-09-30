package P0;

import P.e;
import T.d;
import T.s;
import Xd.l;
import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.L;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.ax;
import ao.ad;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s.C2531j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import z.AbstractC3451e;
import z.C3448b;

/* loaded from: classes3.dex */
public final class c implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
        boolean z11;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    a.charlie((String) this.purple, (String) this.red, c0585q, Arrays.copyOf((Object[]) this.silver, 0));
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    Object jade = c0585q2.jade();
                    if (jade == C0580l.alpha) {
                        jade = new C2531j((ax) this.red, 0);
                        c0585q2.f(jade);
                    }
                    s delta = androidx.compose.ui.layout.a.delta((s) this.purple, (Function1) jade);
                    ap delta2 = AbstractC0547m.delta(d.alpha, true);
                    long j5 = c0585q2.magenta;
                    int i4 = (int) (j5 ^ (j5 >>> 32));
                    I mike = c0585q2.mike();
                    s charlie = T.a.charlie(delta, c0585q2);
                    InterfaceC2552l.maroon.getClass();
                    C2550j c2550j = C2551k.bravo;
                    c0585q2.white();
                    if (c0585q2.lime) {
                        c0585q2.lima(c2550j);
                    } else {
                        c0585q2.i();
                    }
                    C0564b.blue(C2551k.foxtrot, c0585q2, delta2);
                    C0564b.blue(C2551k.echo, c0585q2, mike);
                    C2549i c2549i = C2551k.golf;
                    if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(i4))) {
                        ad.blue(i4, c0585q2, i4, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q2, charlie);
                    ((P.d) this.silver).invoke(c0585q2, 0);
                    c0585q2.quebec(true);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue3 = ((Number) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m3;
                if (c0585q3.magenta(intValue3 & 1, z11)) {
                    C0564b.alpha(AbstractC3451e.alpha.alpha(Float.valueOf(C0366t.delta(((C0366t) ((ax) this.purple).getValue()).alpha))), e.echo(-869936862, new C3448b((L) this.red, (P.d) this.silver, 1), c0585q3), c0585q3, 56);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
