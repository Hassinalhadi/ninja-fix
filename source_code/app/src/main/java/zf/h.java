package zf;

import a2.C0398w;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vf.AbstractC3218w;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public abstract class h extends f {
    public final InterfaceC3439i silver;

    public h(InterfaceC3439i interfaceC3439i, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        super(hVar, i4, enumC3340a);
        this.silver = interfaceC3439i;
    }

    @Override // zf.f, yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Nd.h alpha;
        if (this.purple == -3) {
            Nd.h context = cVar.getContext();
            Boolean bool = Boolean.FALSE;
            ud.f fVar = new ud.f(2);
            Nd.h hVar = this.alpha;
            if (!((Boolean) hVar.fold(bool, fVar)).booleanValue()) {
                alpha = context.plus(hVar);
            } else {
                alpha = AbstractC3218w.alpha(context, hVar, false);
            }
            if (Intrinsics.areEqual(alpha, context)) {
                Object hotel = hotel(interfaceC3440j, cVar);
                if (hotel == Od.a.alpha) {
                    return hotel;
                }
                return Unit.INSTANCE;
            }
            Nd.d dVar = Nd.d.alpha;
            if (Intrinsics.areEqual(alpha.get(dVar), context.get(dVar))) {
                Nd.h context2 = cVar.getContext();
                if (!(interfaceC3440j instanceof ab) && !(interfaceC3440j instanceof x)) {
                    interfaceC3440j = new C0398w(interfaceC3440j, context2);
                }
                Object charlie = b.charlie(alpha, interfaceC3440j, Af.f.lima(alpha), new g(this, null), cVar);
                if (charlie == Od.a.alpha) {
                    return charlie;
                }
                return Unit.INSTANCE;
            }
        }
        Object collect = super.collect(interfaceC3440j, cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    @Override // zf.f
    public final Object delta(xf.r rVar, Nd.c cVar) {
        Object hotel = hotel(new ab(rVar), cVar);
        if (hotel == Od.a.alpha) {
            return hotel;
        }
        return Unit.INSTANCE;
    }

    public abstract Object hotel(InterfaceC3440j interfaceC3440j, Nd.c cVar);

    @Override // zf.f
    public final String toString() {
        return this.silver + " -> " + super.toString();
    }
}
