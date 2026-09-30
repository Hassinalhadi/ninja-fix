package yf;

import xf.EnumC3340a;

/* loaded from: classes2.dex */
public final class av implements L, InterfaceC3439i, zf.v {
    public final /* synthetic */ at alpha;

    public av(at atVar) {
        this.alpha = atVar;
    }

    @Override // zf.v
    public final InterfaceC3439i bravo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        if (((i4 >= 0 && i4 < 2) || i4 == -2) && enumC3340a == EnumC3340a.purple) {
            return this;
        }
        return AbstractC3428A.quebec(this, hVar, i4, enumC3340a);
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        ((N) this.alpha).collect(interfaceC3440j, cVar);
        return Od.a.alpha;
    }

    @Override // yf.L
    public final Object getValue() {
        return ((N) this.alpha).getValue();
    }
}
