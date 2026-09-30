package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.t0;
import d.K;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import p0.AbstractC2264a;
import pe.AbstractC2327c;
import q0.AbstractC2367C;
import q0.AbstractC2388g;
import q0.InterfaceC2386e;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import s0.AbstractC2555o;
import s6.J7;

/* loaded from: classes3.dex */
public final class n extends T.r implements r0.e, InterfaceC2386e, s0.ab {
    public static final k silver = new Object();
    public o alpha;
    public i purple;
    public K red;

    public final boolean b(h hVar, int i4) {
        if (i4 == 5 || i4 == 6) {
            if (this.red == K.purple) {
                return false;
            }
        } else if (i4 == 3 || i4 == 4) {
            if (this.red == K.alpha) {
                return false;
            }
        } else if (i4 != 1 && i4 != 2) {
            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
        }
        if (c(i4)) {
            if (hVar.bravo >= this.alpha.getItemCount() - 1) {
                return false;
            }
        } else if (hVar.alpha <= 0) {
            return false;
        }
        return true;
    }

    public final boolean c(int i4) {
        if (i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            return true;
        }
        if (i4 == 5) {
            return false;
        }
        if (i4 == 6) {
            return true;
        }
        if (i4 == 3) {
            int i5 = l.$EnumSwitchMapping$0[AbstractC2555o.golf(this).f13299r.ordinal()];
            if (i5 == 1) {
                return false;
            }
            if (i5 == 2) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (i4 == 4) {
            int i10 = l.$EnumSwitchMapping$0[AbstractC2555o.golf(this).f13299r.ordinal()];
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }

    @Override // r0.f
    public final /* synthetic */ Object coral(r0.g gVar) {
        return AbstractC2327c.alpha(this, gVar);
    }

    @Override // r0.e
    public final J7 green() {
        Pair pair = new Pair(AbstractC2388g.alpha, this);
        r0.g gVar = (r0.g) pair.getFirst();
        r0.h hVar = new r0.h(gVar);
        r0.g gVar2 = (r0.g) pair.getFirst();
        Object second = pair.getSecond();
        if (gVar2 != gVar) {
            AbstractC2264a.bravo("Check failed.");
        }
        ((t0) hVar.bravo).setValue(second);
        return hVar;
    }

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
        AbstractC2367C victor = aoVar.victor(j5);
        return arVar.papa(victor.alpha, victor.purple, kotlin.collections.t.alpha, new N2.t(victor, 7));
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
