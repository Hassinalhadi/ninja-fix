package androidx.compose.material3.internal;

import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import d.K;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s6.AbstractC2627c7;

/* loaded from: classes3.dex */
public final class w extends T.r implements s0.ab {
    public t alpha;
    public Xd.l purple;
    public K red;
    public boolean silver;

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
        AbstractC2367C victor = aoVar.victor(j5);
        if (!arVar.ivory() || !this.silver) {
            Pair pair = (Pair) this.purple.invoke(new Q0.m(AbstractC2627c7.alpha(victor.alpha, victor.purple)), new Q0.a(j5));
            t tVar = this.alpha;
            ad adVar = (ad) pair.getFirst();
            Object second = pair.getSecond();
            if (!Intrinsics.areEqual(tVar.delta(), adVar)) {
                ((t0) ((ax) tVar.india)).setValue(adVar);
                Xa.f fVar = new Xa.f(5, tVar, second);
                Ef.c cVar = ((ac) tVar.echo).bravo;
                boolean echo = cVar.echo();
                if (echo) {
                    try {
                        fVar.invoke();
                    } finally {
                        cVar.foxtrot(null);
                    }
                }
                if (!echo) {
                    tVar.india(second);
                }
            }
        }
        if (!arVar.ivory() && !this.silver) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.silver = z2;
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new C1.av(arVar, this, victor, 7));
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicHeight(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public final /* synthetic */ int minIntrinsicWidth(InterfaceC2402u interfaceC2402u, InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // T.r
    public final void onDetach() {
        this.silver = false;
    }
}
