package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.I;
import androidx.compose.runtime.InterfaceC0581m;
import bz.X;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public final class ao extends Lambda implements Xd.m {
    public final /* synthetic */ X alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ Xd.l silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(X x4, long j5, D0.an anVar, Xd.l lVar) {
        super(3);
        this.alpha = x4;
        this.purple = j5;
        this.red = anVar;
        this.silver = lVar;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i4;
        T.s sVar = (T.s) obj;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (((C0585q) interfaceC0581m).golf(sVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            intValue |= i4;
        }
        if ((intValue & 19) == 18) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        X x4 = this.alpha;
        boolean golf = c0585q2.golf(x4);
        Object jade = c0585q2.jade();
        if (golf || jade == C0580l.alpha) {
            jade = new an(x4, 0);
            c0585q2.f(jade);
        }
        T.s alpha = androidx.compose.ui.graphics.a.alpha(sVar, (Function1) jade);
        q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
        int romeo = C0564b.romeo(c0585q2);
        I mike = c0585q2.mike();
        T.s charlie = T.a.charlie(alpha, c0585q2);
        InterfaceC2552l.maroon.getClass();
        C2550j c2550j = C2551k.bravo;
        c0585q2.white();
        if (c0585q2.lime) {
            c0585q2.lima(c2550j);
        } else {
            c0585q2.i();
        }
        C0564b.blue(C2551k.foxtrot, c0585q2, delta);
        C0564b.blue(C2551k.echo, c0585q2, mike);
        C2549i c2549i = C2551k.golf;
        if (c0585q2.lime || !Intrinsics.areEqual(c0585q2.jade(), Integer.valueOf(romeo))) {
            ao.ad.blue(romeo, c0585q2, romeo, c2549i);
        }
        C0564b.blue(C2551k.delta, c0585q2, charlie);
        at.bravo(this.purple, this.red, this.silver, c0585q2, 0);
        c0585q2.quebec(true);
        return Unit.INSTANCE;
    }
}
