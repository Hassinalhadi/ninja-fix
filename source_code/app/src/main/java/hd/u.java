package hd;

import od.C2226c;
import od.InterfaceC2225b;

/* loaded from: classes2.dex */
public final class u implements InterfaceC2225b {
    public final sd.s alpha;
    public final sd.af purple;
    public final zd.i red;
    public final sd.o silver;

    public u(C2226c c2226c) {
        this.alpha = c2226c.bravo;
        this.purple = c2226c.alpha.bravo();
        this.red = c2226c.foxtrot;
        this.silver = c2226c.charlie.X();
    }

    @Override // sd.r
    public final sd.m alpha() {
        return this.silver;
    }

    @Override // od.InterfaceC2225b
    public final zd.i beige() {
        return this.red;
    }

    @Override // od.InterfaceC2225b, vf.ab
    public final Nd.h charlie() {
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // od.InterfaceC2225b
    public final sd.af getUrl() {
        return this.purple;
    }

    @Override // od.InterfaceC2225b
    public final sd.s uniform() {
        return this.alpha;
    }
}
