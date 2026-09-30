package bx;

import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import bz.X;
import bz.a0;
import bz.e0;
import bz.f0;
import bz.g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes3.dex */
public final class ah extends Lambda implements Xd.l {
    public final /* synthetic */ a0 alpha;
    public final /* synthetic */ f0 purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ P.d silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(a0 a0Var, f0 f0Var, Object obj, P.d dVar) {
        super(2);
        this.alpha = a0Var;
        this.purple = f0Var;
        this.red = obj;
        this.silver = dVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Object L4;
        float f5;
        Function1 function1;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0585q c0585q = (C0585q) interfaceC0581m;
        if (c0585q.magenta(intValue & 1, z2)) {
            C0768f c0768f = new C0768f(1, this.purple);
            g0 g0Var = AbstractC0779d.juliet;
            a0 a0Var = this.alpha;
            boolean hotel = a0Var.hotel();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            G3.a aVar = a0Var.alpha;
            if (!hotel) {
                c0585q.purple(1666599280);
                boolean golf = c0585q.golf(a0Var);
                L4 = c0585q.jade();
                if (golf || L4 == asVar) {
                    S.g echo = r6.u.echo();
                    if (echo != null) {
                        function1 = echo.echo();
                    } else {
                        function1 = null;
                    }
                    S.g foxtrot = r6.u.foxtrot(echo);
                    try {
                        Object L10 = aVar.L();
                        r6.u.juliet(echo, foxtrot, function1);
                        c0585q.f(L10);
                        L4 = L10;
                    } catch (Throwable th) {
                        r6.u.juliet(echo, foxtrot, function1);
                        throw th;
                    }
                }
                c0585q.quebec(false);
            } else {
                c0585q.purple(1666853325);
                c0585q.quebec(false);
                L4 = aVar.L();
            }
            c0585q.purple(1378811975);
            Object obj3 = this.red;
            float f10 = 0.0f;
            if (Intrinsics.areEqual(L4, obj3)) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            c0585q.quebec(false);
            Float valueOf = Float.valueOf(f5);
            boolean golf2 = c0585q.golf(a0Var);
            Object jade = c0585q.jade();
            if (golf2 || jade == asVar) {
                jade = C0564b.quebec(new ag(a0Var, 0));
                c0585q.f(jade);
            }
            Object value = ((D0) jade).getValue();
            c0585q.purple(1378811975);
            if (Intrinsics.areEqual(value, obj3)) {
                f10 = 1.0f;
            }
            c0585q.quebec(false);
            Float valueOf2 = Float.valueOf(f10);
            boolean golf3 = c0585q.golf(a0Var);
            Object jade2 = c0585q.jade();
            if (golf3 || jade2 == asVar) {
                jade2 = C0564b.quebec(new ag(a0Var, 1));
                c0585q.f(jade2);
            }
            X charlie = e0.charlie(a0Var, valueOf, valueOf2, (bz.aa) c0768f.invoke(((D0) jade2).getValue(), c0585q, 0), g0Var, c0585q, 0);
            T.p pVar = T.p.alpha;
            boolean golf4 = c0585q.golf(charlie);
            Object jade3 = c0585q.jade();
            if (golf4 || jade3 == asVar) {
                jade3 = new androidx.compose.material3.internal.an(charlie, 1);
                c0585q.f(jade3);
            }
            T.s alpha = androidx.compose.ui.graphics.a.alpha(pVar, (Function1) jade3);
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, false);
            long j5 = c0585q.magenta;
            int i4 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie2 = T.a.charlie(alpha, c0585q);
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
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i4))) {
                ao.ad.blue(i4, c0585q, i4, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie2);
            this.silver.invoke(obj3, c0585q, 0);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        return Unit.INSTANCE;
    }
}
