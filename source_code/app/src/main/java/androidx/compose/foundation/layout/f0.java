package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import pe.AbstractC2327c;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s6.J4;

/* loaded from: classes3.dex */
public final class f0 extends T.r implements s0.ab {
    public aa alpha;
    public Xd.l purple;

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
    public final q0.aq mo0measure3p2s80s(final q0.ar arVar, q0.ao aoVar, long j5) {
        int juliet;
        int i4 = 0;
        if (this.alpha != aa.alpha) {
            juliet = 0;
        } else {
            juliet = Q0.a.juliet(j5);
        }
        if (this.alpha == aa.purple) {
            i4 = Q0.a.india(j5);
        }
        final AbstractC2367C victor = aoVar.victor(Q0.b.alpha(juliet, Q0.a.hotel(j5), i4, Q0.a.golf(j5)));
        final int delta = J4.delta(victor.alpha, Q0.a.juliet(j5), Q0.a.hotel(j5));
        final int delta2 = J4.delta(victor.purple, Q0.a.india(j5), Q0.a.golf(j5));
        return arVar.papa(delta, delta2, kotlin.collections.t.alpha, new Function1() { // from class: androidx.compose.foundation.layout.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Xd.l lVar = f0.this.purple;
                AbstractC2366B.india((AbstractC2366B) obj, victor, ((Q0.k) lVar.invoke(new Q0.m(((delta - r1.alpha) << 32) | ((delta2 - r1.purple) & 4294967295L)), arVar.getLayoutDirection())).alpha);
                return Unit.INSTANCE;
            }
        });
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
