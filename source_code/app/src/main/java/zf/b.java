package zf;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s6.B0;
import s6.J6;
import vf.AbstractC3220y;
import vf.Z;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public abstract class b {
    public static final Nd.c[] alpha = new Nd.c[0];
    public static final Af.t bravo = new Af.t("NULL", 0);
    public static final Af.t charlie = new Af.t("UNINITIALIZED", 0);

    public static final Object alpha(Nd.c cVar, Xd.m mVar, Function0 function0, InterfaceC3440j interfaceC3440j, InterfaceC3439i[] interfaceC3439iArr) {
        t tVar = new t(null, mVar, function0, interfaceC3440j, interfaceC3439iArr);
        Z z2 = new Z(cVar.getContext(), cVar, 1);
        Object bravo2 = B0.bravo(z2, true, z2, tVar);
        if (bravo2 == Od.a.alpha) {
            return bravo2;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InterfaceC3439i bravo(v vVar, AbstractC3220y abstractC3220y, int i4, EnumC3340a enumC3340a, int i5) {
        Nd.h hVar = abstractC3220y;
        if ((i5 & 1) != 0) {
            hVar = Nd.i.alpha;
        }
        if ((i5 & 2) != 0) {
            i4 = -3;
        }
        if ((i5 & 4) != 0) {
            enumC3340a = EnumC3340a.alpha;
        }
        return vVar.bravo(hVar, i4, enumC3340a);
    }

    public static final Object charlie(Nd.h hVar, Object obj, Object obj2, Xd.l lVar, Nd.c frame) {
        Object invoke;
        Object mike = Af.f.mike(hVar, obj2);
        try {
            ac acVar = new ac(frame, hVar);
            if (!av.q.kilo(lVar)) {
                invoke = J6.echo(lVar, obj, acVar);
            } else {
                kotlin.jvm.internal.x.echo(2, lVar);
                invoke = lVar.invoke(obj, acVar);
            }
            Af.f.foxtrot(hVar, mike);
            if (invoke == Od.a.alpha) {
                Intrinsics.echo(frame, "frame");
            }
            return invoke;
        } catch (Throwable th) {
            Af.f.foxtrot(hVar, mike);
            throw th;
        }
    }
}
