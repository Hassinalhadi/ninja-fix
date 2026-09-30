package u;

import T.s;
import Xd.l;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import ao.ad;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s.C2530i;
import s.C2531j;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* renamed from: u.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3131e implements l {
    public final /* synthetic */ s alpha;
    public final /* synthetic */ ax purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ C3130d silver;

    public C3131e(s sVar, ax axVar, P.d dVar, C3130d c3130d) {
        this.alpha = sVar;
        this.purple = axVar;
        this.red = dVar;
        this.silver = c3130d;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            Object jade = c0585q.jade();
            as asVar = C0580l.alpha;
            ax axVar = this.purple;
            if (jade == asVar) {
                jade = new C2531j(axVar, 2);
                c0585q.f(jade);
            }
            s delta = androidx.compose.ui.layout.a.delta(this.alpha, (Function1) jade);
            ap delta2 = AbstractC0547m.delta(T.d.alpha, true);
            long j5 = c0585q.magenta;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            I mike = c0585q.mike();
            s charlie = T.a.charlie(delta, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                ad.blue(i4, c0585q, i4, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            this.red.invoke(c0585q, 0);
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = new C2530i(axVar, 2);
                c0585q.f(jade2);
            }
            this.silver.bravo((Function0) jade2, c0585q, 6);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
