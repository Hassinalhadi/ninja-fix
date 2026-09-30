package androidx.compose.foundation.layout;

import a2.C0393r;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class K extends T.r implements s0.ab {
    public float alpha;
    public float purple;
    public float red;
    public float silver;
    public boolean teal;

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
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        int ochre = arVar.ochre(this.red) + arVar.ochre(this.alpha);
        int ochre2 = arVar.ochre(this.silver) + arVar.ochre(this.purple);
        AbstractC2367C victor = aoVar.victor(Q0.b.india(-ochre, -ochre2, j5));
        return arVar.papa(Q0.b.golf(victor.alpha + ochre, j5), Q0.b.foxtrot(victor.purple + ochre2, j5), kotlin.collections.t.alpha, new C0393r(6, this, victor));
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }
}
