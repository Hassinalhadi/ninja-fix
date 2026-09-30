package androidx.compose.foundation.layout;

import h.AbstractC1797a;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class N extends T.r implements s0.ab {
    public L alpha;

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
        boolean z2;
        boolean z10;
        boolean z11;
        float bravo = this.alpha.bravo(arVar.getLayoutDirection());
        float charlie = this.alpha.charlie();
        float delta = this.alpha.delta(arVar.getLayoutDirection());
        float alpha = this.alpha.alpha();
        boolean z12 = false;
        float f5 = 0;
        if (Float.compare(bravo, f5) >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Float.compare(charlie, f5) >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z2 & z10;
        if (Float.compare(delta, f5) >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z13 & z11;
        if (Float.compare(alpha, f5) >= 0) {
            z12 = true;
        }
        if (!(z12 & z14)) {
            AbstractC1797a.alpha("Padding must be non-negative");
        }
        int ochre = arVar.ochre(bravo);
        int ochre2 = arVar.ochre(delta) + ochre;
        int ochre3 = arVar.ochre(charlie);
        int ochre4 = arVar.ochre(alpha) + ochre3;
        AbstractC2367C victor = aoVar.victor(Q0.b.india(-ochre2, -ochre4, j5));
        return arVar.papa(Q0.b.golf(victor.alpha + ochre2, j5), Q0.b.foxtrot(victor.purple + ochre4, j5), kotlin.collections.t.alpha, new aw(victor, ochre, ochre3, 1));
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
