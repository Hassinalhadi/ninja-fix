package z;

import a0.as;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import q0.ap;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t6.P3;
import y.ar;

/* loaded from: classes3.dex */
public final class ag implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ as purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ P.d white;

    public ag(T.s sVar, as asVar, long j5, float f5, float f10, P.d dVar) {
        this.alpha = sVar;
        this.purple = asVar;
        this.red = j5;
        this.silver = f5;
        this.teal = f10;
        this.white = dVar;
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
            T.s charlie = P3.charlie(this.alpha, this.purple, P3.delta(this.red, (l) c0585q.kilo(q.alpha), this.silver, c0585q), null, this.teal);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (jade == asVar) {
                jade = new ar(5);
                c0585q.f(jade);
            }
            T.s bravo = A0.o.bravo(charlie, false, (Function1) jade);
            Unit unit = Unit.INSTANCE;
            Object jade2 = c0585q.jade();
            if (jade2 == asVar) {
                jade2 = af.alpha;
                c0585q.f(jade2);
            }
            m0.k kVar = m0.ab.alpha;
            T.s then = bravo.then(new SuspendPointerInputElement(unit, null, (PointerInputEventHandler) jade2, 6));
            ap delta = AbstractC0547m.delta(T.d.alpha, true);
            int romeo = C0564b.romeo(c0585q);
            I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(then, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(romeo))) {
                ao.ad.blue(romeo, c0585q, romeo, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            this.white.invoke(c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
