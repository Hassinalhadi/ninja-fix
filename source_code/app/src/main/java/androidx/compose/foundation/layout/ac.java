package androidx.compose.foundation.layout;

import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class ac extends T.r implements s0.ab {
    public aa alpha;
    public float purple;

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
        int juliet;
        int hotel;
        int golf;
        int i4;
        if (Q0.a.delta(j5) && this.alpha != aa.alpha) {
            int round = Math.round(Q0.a.hotel(j5) * this.purple);
            int juliet2 = Q0.a.juliet(j5);
            juliet = Q0.a.hotel(j5);
            if (round < juliet2) {
                round = juliet2;
            }
            if (round <= juliet) {
                juliet = round;
            }
            hotel = juliet;
        } else {
            juliet = Q0.a.juliet(j5);
            hotel = Q0.a.hotel(j5);
        }
        if (Q0.a.charlie(j5) && this.alpha != aa.purple) {
            int round2 = Math.round(Q0.a.golf(j5) * this.purple);
            int india = Q0.a.india(j5);
            i4 = Q0.a.golf(j5);
            if (round2 < india) {
                round2 = india;
            }
            if (round2 <= i4) {
                i4 = round2;
            }
            golf = i4;
        } else {
            int india2 = Q0.a.india(j5);
            golf = Q0.a.golf(j5);
            i4 = india2;
        }
        AbstractC2367C victor = aoVar.victor(Q0.b.alpha(juliet, hotel, i4, golf));
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 3));
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
