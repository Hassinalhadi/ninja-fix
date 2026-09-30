package zf;

import kotlin.Unit;
import xf.EnumC3340a;
import yf.InterfaceC3439i;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class n extends h {
    public final Pd.i teal;

    /* JADX WARN: Multi-variable type inference failed */
    public n(Xd.m mVar, InterfaceC3439i interfaceC3439i, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        super(interfaceC3439i, hVar, i4, enumC3340a);
        this.teal = (Pd.i) mVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Xd.m, Pd.i] */
    @Override // zf.f
    public final f echo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return new n(this.teal, this.silver, hVar, i4, enumC3340a);
    }

    @Override // zf.h
    public final Object hotel(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        Object mike = vf.ad.mike(new m(this, interfaceC3440j, null), cVar);
        if (mike == Od.a.alpha) {
            return mike;
        }
        return Unit.INSTANCE;
    }
}
