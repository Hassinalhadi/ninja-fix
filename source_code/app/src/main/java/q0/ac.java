package q0;

import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class ac extends T.r implements s0.ab {
    public Xd.m alpha;

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.echo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.hotel(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final aq mo0measure3p2s80s(ar arVar, ao aoVar, long j5) {
        return (aq) this.alpha.invoke(arVar, aoVar, new Q0.a(j5));
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.alpha + ')';
    }
}
