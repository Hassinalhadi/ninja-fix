package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import t0.AbstractC2901T;

/* renamed from: F.h2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0115h2 extends Lambda implements Xd.l {
    public final /* synthetic */ T.s alpha;
    public final /* synthetic */ a0.as purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ float silver;
    public final /* synthetic */ b.ab teal;
    public final /* synthetic */ float white;
    public final /* synthetic */ Xd.l yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0115h2(T.s sVar, a0.as asVar, long j5, float f5, b.ab abVar, float f10, Xd.l lVar) {
        super(2);
        this.alpha = sVar;
        this.purple = asVar;
        this.red = j5;
        this.silver = f5;
        this.teal = abVar;
        this.white = f10;
        this.yellow = lVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Xd.l, Pd.i] */
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
        long delta = AbstractC0127k2.delta(this.red, this.silver, interfaceC0581m);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        float lavender = ((Q0.d) c0585q2.kilo(AbstractC2901T.hotel)).lavender(this.white);
        T.s bravo = A0.o.bravo(AbstractC0127k2.charlie(this.alpha, this.purple, delta, this.teal, lavender), false, C0172x.f1252f);
        Unit unit = Unit.INSTANCE;
        ?? iVar = new Pd.i(2, null);
        m0.k kVar = m0.ab.alpha;
        T.s then = bravo.then(new SuspendPointerInputElement(unit, null, new m0.aa(iVar), 6));
        q0.ap delta2 = AbstractC0547m.delta(T.d.alpha, true);
        int romeo = C0564b.romeo(c0585q2);
        androidx.compose.runtime.I mike = c0585q2.mike();
        T.s charlie = T.a.charlie(then, c0585q2);
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
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
            ao.ad.blue(romeo, c0585q2, romeo, c2549i);
        }
        C0564b.blue(C2551k.delta, c0585q2, charlie);
        this.yellow.invoke(c0585q2, 0);
        c0585q2.quebec(true);
        return Unit.INSTANCE;
    }
}
