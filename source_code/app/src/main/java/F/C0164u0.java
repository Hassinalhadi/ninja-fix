package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.C0556w;
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
import t0.AbstractC2901T;
import t0.C2883A;
import t0.C2946x;
import t6.X3;

/* renamed from: F.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0164u0 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ P.d purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0164u0(Object obj, Object obj2, P.d dVar, int i4) {
        super(2);
        this.alpha = i4;
        this.red = obj;
        this.silver = obj2;
        this.purple = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        int i4 = 6;
        P.d dVar = this.purple;
        Object obj3 = this.silver;
        Object obj4 = this.red;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                T.s uniform = AbstractC0538d.uniform((T.s) obj4, 0.0f, AbstractC0173x0.delta, 1);
                androidx.compose.foundation.layout.B b2 = androidx.compose.foundation.layout.B.alpha;
                T.s bravo = X3.bravo(AbstractC0538d.amber(uniform), (b.g0) obj3, true);
                C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, interfaceC0581m, 0);
                int romeo = C0564b.romeo(interfaceC0581m);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(bravo, interfaceC0581m);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, interfaceC0581m, alpha);
                C0564b.blue(C2551k.echo, interfaceC0581m, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
                dVar.invoke(C0556w.alpha, interfaceC0581m, 6);
                c0585q2.quebec(true);
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q3 = (C0585q) interfaceC0581m2;
                    if (c0585q3.bronze()) {
                        c0585q3.ochre();
                        return Unit.INSTANCE;
                    }
                }
                T.s charlie2 = androidx.compose.ui.layout.a.charlie(T.p.alpha, "Container");
                kotlin.jvm.internal.p pVar = new kotlin.jvm.internal.p((androidx.compose.runtime.ax) obj4, androidx.compose.runtime.ax.class, "value", "getValue()Ljava/lang/Object;", 0);
                float f5 = AbstractC0174x1.alpha;
                T.s charlie3 = androidx.compose.ui.draw.a.charlie(charlie2, new B2.ap(i4, pVar, (androidx.compose.foundation.layout.M) obj3));
                q0.ap delta = AbstractC0547m.delta(T.d.alpha, true);
                int romeo2 = C0564b.romeo(interfaceC0581m2);
                C0585q c0585q4 = (C0585q) interfaceC0581m2;
                androidx.compose.runtime.I mike2 = c0585q4.mike();
                T.s charlie4 = T.a.charlie(charlie3, interfaceC0581m2);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j2 = C2551k.bravo;
                c0585q4.white();
                if (c0585q4.lime) {
                    c0585q4.lima(c2550j2);
                } else {
                    c0585q4.i();
                }
                C0564b.blue(C2551k.foxtrot, interfaceC0581m2, delta);
                C0564b.blue(C2551k.echo, interfaceC0581m2, mike2);
                C2549i c2549i2 = C2551k.golf;
                if (c0585q4.lime || !Intrinsics.areEqual(c0585q4.jade(), Integer.valueOf(romeo2))) {
                    ao.ad.blue(romeo2, c0585q4, romeo2, c2549i2);
                }
                C0564b.blue(C2551k.delta, interfaceC0581m2, charlie4);
                dVar.invoke(interfaceC0581m2, 0);
                c0585q4.quebec(true);
                return Unit.INSTANCE;
            case 2:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q5 = (C0585q) interfaceC0581m3;
                if (c0585q5.magenta(intValue & 1, z2)) {
                    AbstractC2901T.alpha((C2946x) obj4, (C2883A) obj3, dVar, c0585q5, 0);
                } else {
                    c0585q5.ochre();
                }
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                AbstractC2901T.alpha((s0.W) obj4, (C2883A) obj3, dVar, (InterfaceC0581m) obj, C0564b.cyan(1));
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164u0(s0.W w4, C2883A c2883a, P.d dVar, int i4) {
        super(2);
        this.alpha = 3;
        this.red = w4;
        this.silver = c2883a;
        this.purple = dVar;
    }
}
