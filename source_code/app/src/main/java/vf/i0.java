package vf;

import s6.AbstractC2832z6;

/* loaded from: classes2.dex */
public final class i0 implements Nd.f, Nd.g {
    public static final i0 alpha = new Object();

    @Override // Nd.h
    public final Object fold(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        return AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        return this;
    }

    @Override // Nd.h
    public final Nd.h minusKey(Nd.g gVar) {
        return AbstractC2832z6.bravo(this, gVar);
    }

    @Override // Nd.h
    public final Nd.h plus(Nd.h hVar) {
        return AbstractC2832z6.charlie(this, hVar);
    }
}
