package zf;

import kotlin.Unit;
import vf.AbstractC3220y;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class i extends h {
    public i(InterfaceC3439i interfaceC3439i, AbstractC3220y abstractC3220y, int i4, EnumC3340a enumC3340a, int i5) {
        super(interfaceC3439i, (i5 & 2) != 0 ? Nd.i.alpha : abstractC3220y, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? EnumC3340a.alpha : enumC3340a);
    }

    @Override // zf.f
    public final f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return new h(this.silver, hVar, i4, enumC3340a);
    }

    @Override // zf.f
    public final InterfaceC3439i foxtrot() {
        return this.silver;
    }

    @Override // zf.h
    public final Object hotel(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object collect = this.silver.collect(interfaceC3440j, cVar);
        if (collect == Od.a.alpha) {
            return collect;
        }
        return Unit.INSTANCE;
    }
}
