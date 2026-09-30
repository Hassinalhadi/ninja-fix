package F;

import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s0.AbstractC2557q;
import s0.InterfaceC2553m;

/* renamed from: F.z0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0179z0 extends T.r implements InterfaceC2553m, s0.ab {
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
        int i4;
        int i5;
        float f5 = ((Q0.g) AbstractC2557q.echo(this, AbstractC0145p0.alpha)).alpha;
        int i10 = 0;
        float f10 = 0;
        if (f5 < f10) {
            f5 = f10;
        }
        AbstractC2367C victor = aoVar.victor(j5);
        if (isAttached() && !Float.isNaN(f5) && Float.compare(f5, f10) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!Float.isNaN(f5)) {
            i10 = arVar.ochre(f5);
        }
        if (z2) {
            i4 = Math.max(victor.alpha, i10);
        } else {
            i4 = victor.alpha;
        }
        if (z2) {
            i5 = Math.max(victor.purple, i10);
        } else {
            i5 = victor.purple;
        }
        return arVar.papa(i4, i5, kotlin.collections.t.alpha, new C0176y0(i4, victor, i5));
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
