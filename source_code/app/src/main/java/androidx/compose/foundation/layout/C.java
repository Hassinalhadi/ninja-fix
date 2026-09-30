package androidx.compose.foundation.layout;

import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;

/* loaded from: classes3.dex */
public abstract class C extends T.r implements s0.ab {
    public final /* synthetic */ int alpha;

    public abstract long b(q0.ao aoVar, long j5);

    public abstract boolean c();

    public int maxIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        switch (this.alpha) {
            case 0:
                return interfaceC2401t.delta(i4);
            default:
                return interfaceC2401t.delta(i4);
        }
    }

    @Override // s0.ab
    public int maxIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        switch (this.alpha) {
            case 0:
                return interfaceC2401t.romeo(i4);
            default:
                return interfaceC2401t.romeo(i4);
        }
    }

    @Override // s0.ab
    /* renamed from: measure-3p2s80s */
    public q0.aq mo0measure3p2s80s(q0.ar arVar, q0.ao aoVar, long j5) {
        long b2 = b(aoVar, j5);
        if (c()) {
            b2 = Q0.b.echo(j5, b2);
        }
        AbstractC2367C victor = aoVar.victor(b2);
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 4));
    }

    public int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        switch (this.alpha) {
            case 0:
                return interfaceC2401t.jade(i4);
            default:
                return interfaceC2401t.jade(i4);
        }
    }

    @Override // s0.ab
    public int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        switch (this.alpha) {
            case 0:
                return interfaceC2401t.lima(i4);
            default:
                return interfaceC2401t.lima(i4);
        }
    }
}
