package androidx.compose.foundation.layout;

import kotlin.NoWhenBranchMatchedException;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;

/* loaded from: classes3.dex */
public final class ao {
    public q0.ao alpha;
    public AbstractC2367C bravo;
    public q0.ao charlie;
    public AbstractC2367C delta;
    public bv.k echo;
    public bv.k foxtrot;

    public final bv.k alpha(int i4, int i5, boolean z2) {
        int[] iArr = an.$EnumSwitchMapping$0;
        ak akVar = ak.alpha;
        int i10 = iArr[1];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 == 4) {
                    if (z2) {
                        return this.echo;
                    }
                    if (i4 + 1 >= 0 && i5 >= 0) {
                        return this.foxtrot;
                    }
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                return this.echo;
            }
            return null;
        }
        return null;
    }

    public final void bravo(InterfaceC2401t interfaceC2401t, InterfaceC2401t interfaceC2401t2, long j5) {
        q0.ao aoVar;
        q0.ao aoVar2;
        long juliet = AbstractC0538d.juliet(j5, E.alpha);
        if (interfaceC2401t != null) {
            int lima = interfaceC2401t.lima(Q0.a.golf(juliet));
            this.echo = new bv.k(bv.k.alpha(lima, interfaceC2401t.jade(lima)));
            if (interfaceC2401t instanceof q0.ao) {
                aoVar2 = (q0.ao) interfaceC2401t;
            } else {
                aoVar2 = null;
            }
            this.alpha = aoVar2;
            this.bravo = null;
        }
        if (interfaceC2401t2 != null) {
            int lima2 = interfaceC2401t2.lima(Q0.a.golf(juliet));
            this.foxtrot = new bv.k(bv.k.alpha(lima2, interfaceC2401t2.jade(lima2)));
            if (interfaceC2401t2 instanceof q0.ao) {
                aoVar = (q0.ao) interfaceC2401t2;
            } else {
                aoVar = null;
            }
            this.charlie = aoVar;
            this.delta = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ((ao) obj).getClass();
        ak akVar = ak.alpha;
        return true;
    }

    public final int hashCode() {
        return ak.alpha.hashCode() * 961;
    }

    public final String toString() {
        return "FlowLayoutOverflowState(type=" + ak.alpha + ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)";
    }
}
