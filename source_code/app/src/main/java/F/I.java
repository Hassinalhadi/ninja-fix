package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public final class I extends Lambda implements Xd.l {
    public final /* synthetic */ float alpha;
    public final /* synthetic */ androidx.compose.foundation.layout.M purple;
    public final /* synthetic */ P.d red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(float f5, androidx.compose.foundation.layout.M m4, long j5, P.d dVar, long j6) {
        super(2);
        this.alpha = f5;
        this.purple = m4;
        this.red = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        T.p pVar = T.p.alpha;
        T.s romeo = AbstractC0538d.romeo(androidx.compose.foundation.layout.V.bravo(pVar, 0.0f, this.alpha, 1), this.purple);
        H h4 = H.bravo;
        int romeo2 = C0564b.romeo(interfaceC0581m);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        androidx.compose.runtime.I mike = c0585q2.mike();
        T.s charlie = T.a.charlie(romeo, interfaceC0581m);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        c0585q2.white();
        if (c0585q2.lime) {
            c0585q2.lima(c2550j);
        } else {
            c0585q2.i();
        }
        C2549i c2549i = C2551k.foxtrot;
        C0564b.blue(c2549i, interfaceC0581m, h4);
        C2549i c2549i2 = C2551k.echo;
        C0564b.blue(c2549i2, interfaceC0581m, mike);
        C2549i c2549i3 = C2551k.golf;
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo2))) {
            ao.ad.blue(romeo2, c0585q2, romeo2, c2549i3);
        }
        C2549i c2549i4 = C2551k.delta;
        C0564b.blue(c2549i4, interfaceC0581m, charlie);
        c0585q2.purple(-1293169671);
        c0585q2.quebec(false);
        T.s tango = AbstractC0538d.tango(androidx.compose.ui.layout.a.charlie(pVar, "label"), N.alpha, 0);
        androidx.compose.foundation.layout.S alpha = androidx.compose.foundation.layout.Q.alpha(AbstractC0542h.alpha, T.d.f2061d, interfaceC0581m, 54);
        int romeo3 = C0564b.romeo(interfaceC0581m);
        androidx.compose.runtime.I mike2 = c0585q2.mike();
        T.s charlie2 = T.a.charlie(tango, interfaceC0581m);
        c0585q2.white();
        if (c0585q2.lime) {
            c0585q2.lima(c2550j);
        } else {
            c0585q2.i();
        }
        C0564b.blue(c2549i, interfaceC0581m, alpha);
        C0564b.blue(c2549i2, interfaceC0581m, mike2);
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo3))) {
            ao.ad.blue(romeo3, c0585q2, romeo3, c2549i3);
        }
        C0564b.blue(c2549i4, interfaceC0581m, charlie2);
        this.red.invoke(interfaceC0581m, 0);
        c0585q2.quebec(true);
        c0585q2.purple(-1293135324);
        c0585q2.quebec(false);
        c0585q2.quebec(true);
        return Unit.INSTANCE;
    }
}
