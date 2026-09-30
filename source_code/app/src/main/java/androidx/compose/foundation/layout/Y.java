package androidx.compose.foundation.layout;

import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public final class Y extends T.r implements s0.ab {
    public float alpha;
    public float purple;

    @Override // s0.ab
    public final int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        int i5;
        int delta = interfaceC2401t.delta(i4);
        if (!Float.isNaN(this.purple)) {
            i5 = Q0.c.bravo((s0.at) interfaceC2402u, this.purple);
        } else {
            i5 = 0;
        }
        if (delta < i5) {
            return i5;
        }
        return delta;
    }

    @Override // s0.ab
    public final int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        int i5;
        int romeo = interfaceC2401t.romeo(i4);
        if (!Float.isNaN(this.alpha)) {
            i5 = Q0.c.bravo((s0.at) interfaceC2402u, this.alpha);
        } else {
            i5 = 0;
        }
        if (romeo < i5) {
            return i5;
        }
        return romeo;
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public final q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        int juliet;
        int india;
        int i4 = 0;
        if (!Float.isNaN(this.alpha) && Q0.a.juliet(j5) == 0) {
            int ochre = arVar.ochre(this.alpha);
            juliet = Q0.a.hotel(j5);
            if (ochre < 0) {
                ochre = 0;
            }
            if (ochre <= juliet) {
                juliet = ochre;
            }
        } else {
            juliet = Q0.a.juliet(j5);
        }
        int hotel = Q0.a.hotel(j5);
        if (!Float.isNaN(this.purple) && Q0.a.india(j5) == 0) {
            int ochre2 = arVar.ochre(this.purple);
            india = Q0.a.golf(j5);
            if (ochre2 >= 0) {
                i4 = ochre2;
            }
            if (i4 <= india) {
                india = i4;
            }
        } else {
            india = Q0.a.india(j5);
        }
        AbstractC2367C victor = aoVar.victor(Q0.b.alpha(juliet, hotel, india, Q0.a.golf(j5)));
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 6));
    }

    @Override // s0.ab
    public final int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        int i5;
        int jade = interfaceC2401t.jade(i4);
        if (!Float.isNaN(this.purple)) {
            i5 = Q0.c.bravo((s0.at) interfaceC2402u, this.purple);
        } else {
            i5 = 0;
        }
        if (jade < i5) {
            return i5;
        }
        return jade;
    }

    @Override // s0.ab
    public final int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        int i5;
        int lima = interfaceC2401t.lima(i4);
        if (!Float.isNaN(this.alpha)) {
            i5 = Q0.c.bravo((s0.at) interfaceC2402u, this.alpha);
        } else {
            i5 = 0;
        }
        if (lima < i5) {
            return i5;
        }
        return lima;
    }
}
