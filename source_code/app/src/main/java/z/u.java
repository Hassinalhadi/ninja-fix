package z;

import androidx.compose.foundation.layout.aw;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import q0.ar;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;

/* loaded from: classes3.dex */
public final class u extends T.r implements InterfaceC2553m, s0.ab {
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
        boolean z2;
        int i4;
        int i5;
        if (isAttached() && ((Boolean) AbstractC2557q.echo(this, t.alpha)).booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j6 = t.bravo;
        AbstractC2367C victor = aoVar.victor(j5);
        if (z2) {
            i4 = Math.max(victor.alpha, arVar.ochre(Q0.i.bravo(j6)));
        } else {
            i4 = victor.alpha;
        }
        if (z2) {
            i5 = Math.max(victor.purple, arVar.ochre(Q0.i.alpha(j6)));
        } else {
            i5 = victor.purple;
        }
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new aw(i4, victor, i5));
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
