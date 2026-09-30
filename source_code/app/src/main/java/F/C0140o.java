package F;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.E7;

/* renamed from: F.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0140o extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0140o(androidx.compose.runtime.ax axVar, int i4) {
        super(2);
        this.alpha = i4;
        this.purple = axVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    @Override // Xd.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float min;
        boolean z2;
        androidx.compose.runtime.ax axVar = this.purple;
        switch (this.alpha) {
            case 0:
                Q0.l lVar = (Q0.l) obj;
                Q0.l lVar2 = (Q0.l) obj2;
                float f5 = AbstractC0173x0.alpha;
                float f10 = 1.0f;
                if (lVar2.alpha < lVar.charlie) {
                    if (lVar2.charlie <= lVar.alpha) {
                        min = 1.0f;
                    } else if (lVar2.delta() != 0) {
                        int i4 = lVar2.alpha;
                        min = (((Math.min(lVar.charlie, r0) + Math.max(r1, i4)) / 2) - i4) / lVar2.delta();
                    }
                    if (lVar2.bravo < lVar.delta) {
                        if (lVar2.delta > lVar.bravo) {
                            if (lVar2.bravo() != 0) {
                                f10 = (((Math.min(r6, r7) + Math.max(r10, r1)) / 2) - r1) / lVar2.bravo();
                            }
                        }
                        axVar.setValue(new a0.aw(a0.ao.hotel(min, f10)));
                        return Unit.INSTANCE;
                    }
                    f10 = 0.0f;
                    axVar.setValue(new a0.aw(a0.ao.hotel(min, f10)));
                    return Unit.INSTANCE;
                }
                min = 0.0f;
                if (lVar2.bravo < lVar.delta) {
                }
                f10 = 0.0f;
                axVar.setValue(new a0.aw(a0.ao.hotel(min, f10)));
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C0585q c0585q = (C0585q) interfaceC0581m;
                    if (c0585q.bronze()) {
                        c0585q.ochre();
                        return Unit.INSTANCE;
                    }
                }
                AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement(C0172x.white, false);
                q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
                int romeo = C0564b.romeo(interfaceC0581m);
                C0585q c0585q2 = (C0585q) interfaceC0581m;
                androidx.compose.runtime.I mike = c0585q2.mike();
                T.s charlie = T.a.charlie(appendedSemanticsElement, interfaceC0581m);
                InterfaceC2552l.maroon.getClass();
                C2550j c2550j = C2551k.bravo;
                c0585q2.white();
                if (c0585q2.lime) {
                    c0585q2.lima(c2550j);
                } else {
                    c0585q2.i();
                }
                C0564b.blue(C2551k.foxtrot, interfaceC0581m, delta);
                C0564b.blue(C2551k.echo, interfaceC0581m, mike);
                C2549i c2549i = C2551k.golf;
                if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
                    ao.ad.blue(romeo, c0585q2, romeo, c2549i);
                }
                C0564b.blue(C2551k.delta, interfaceC0581m, charlie);
                ((Xd.l) axVar.getValue()).invoke(interfaceC0581m, 0);
                c0585q2.quebec(true);
                return Unit.INSTANCE;
            default:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q3 = (C0585q) interfaceC0581m2;
                if (c0585q3.magenta(intValue & 1, z2)) {
                    Object jade = c0585q3.jade();
                    if (jade == C0580l.alpha) {
                        jade = U0.c.purple;
                        c0585q3.f(jade);
                    }
                    E7.bravo(new AppendedSemanticsElement((Function1) jade, false), (Xd.l) axVar.getValue(), c0585q3, 0);
                } else {
                    c0585q3.ochre();
                }
                return Unit.INSTANCE;
        }
    }
}
