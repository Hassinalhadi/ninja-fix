package z;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.L;
import androidx.compose.foundation.layout.Q;
import androidx.compose.foundation.layout.S;
import androidx.compose.foundation.layout.U;
import androidx.compose.foundation.layout.V;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: z.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3448b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ L purple;
    public final /* synthetic */ P.d red;

    public /* synthetic */ C3448b(L l10, P.d dVar, int i4) {
        this.alpha = i4;
        this.purple = l10;
        this.red = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        boolean z10;
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
                    T.s romeo = AbstractC0538d.romeo(V.alpha(T.p.alpha, AbstractC3447a.bravo, AbstractC3447a.charlie), this.purple);
                    S alpha = Q.alpha(AbstractC0542h.echo, T.d.f2061d, c0585q, 54);
                    int romeo2 = C0564b.romeo(c0585q);
                    I mike = c0585q.mike();
                    T.s charlie = T.a.charlie(romeo, c0585q);
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
                    if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo2))) {
                        ao.ad.blue(romeo2, c0585q, romeo2, c2549i);
                    }
                    C0564b.blue(C2551k.delta, c0585q, charlie);
                    this.red.invoke(U.alpha, c0585q, 6);
                    c0585q.quebec(true);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C0585q c0585q2 = (C0585q) interfaceC0581m2;
                if (c0585q2.magenta(intValue2 & 1, z10)) {
                    ak.alpha(((al) c0585q2.kilo(am.bravo)).kilo, P.e.echo(165539859, new C3448b(this.purple, this.red, 0), c0585q2), c0585q2, 48);
                } else {
                    c0585q2.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
