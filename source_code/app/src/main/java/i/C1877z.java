package i;

import androidx.compose.runtime.p0;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import q0.ar;
import s0.ab;

/* renamed from: i.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1877z extends T.r implements ab {
    public float alpha;
    public p0 purple;

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
        int i4;
        int juliet;
        p0 p0Var = this.purple;
        if (p0Var != null && ((Number) p0Var.getValue()).intValue() != Integer.MAX_VALUE) {
            i4 = Math.round(((Number) p0Var.getValue()).floatValue() * this.alpha);
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (i4 != Integer.MAX_VALUE) {
            juliet = i4;
        } else {
            juliet = Q0.a.juliet(j5);
        }
        int india = Q0.a.india(j5);
        if (i4 == Integer.MAX_VALUE) {
            i4 = Q0.a.hotel(j5);
        }
        AbstractC2367C victor = aoVar.victor(Q0.b.alpha(juliet, i4, india, Q0.a.golf(j5)));
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 8));
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
