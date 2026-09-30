package W;

import O7.j;
import T.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import q0.z;
import s0.AbstractC2557q;
import s0.aa;
import s0.j0;
import t6.AbstractC3033o;

/* loaded from: classes3.dex */
public final class g extends r implements j0, aa {
    public g alpha;
    public g purple;
    public long red;

    public final boolean b(j jVar) {
        g gVar = this.alpha;
        if (gVar == null) {
            g gVar2 = this.purple;
            if (gVar2 != null) {
                return gVar2.b(jVar);
            }
            return false;
        }
        return gVar.b(jVar);
    }

    public final void c(j jVar) {
        g gVar = this.purple;
        if (gVar == null) {
            g gVar2 = this.alpha;
            if (gVar2 != null) {
                gVar2.c(jVar);
                return;
            }
            return;
        }
        gVar.c(jVar);
    }

    public final void d(j jVar) {
        g gVar = this.purple;
        if (gVar != null) {
            gVar.d(jVar);
        }
        g gVar2 = this.alpha;
        if (gVar2 != null) {
            gVar2.d(jVar);
        }
        this.alpha = null;
    }

    public final void e(j jVar) {
        j0 j0Var;
        g gVar;
        g gVar2 = this.alpha;
        if (gVar2 != null && h.alpha(gVar2, AbstractC3033o.bravo(jVar))) {
            gVar = gVar2;
        } else {
            if (!getNode().isAttached()) {
                j0Var = null;
            } else {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                AbstractC2557q.romeo(this, new f(objectRef, this, jVar));
                j0Var = (j0) objectRef.alpha;
            }
            gVar = (g) j0Var;
        }
        if (gVar != null && gVar2 == null) {
            gVar.c(jVar);
            gVar.e(jVar);
            g gVar3 = this.purple;
            if (gVar3 != null) {
                gVar3.d(jVar);
            }
        } else if (gVar == null && gVar2 != null) {
            g gVar4 = this.purple;
            if (gVar4 != null) {
                gVar4.c(jVar);
                gVar4.e(jVar);
            }
            gVar2.d(jVar);
        } else if (!Intrinsics.areEqual(gVar, gVar2)) {
            if (gVar != null) {
                gVar.c(jVar);
                gVar.e(jVar);
            }
            if (gVar2 != null) {
                gVar2.d(jVar);
            }
        } else if (gVar != null) {
            gVar.e(jVar);
        } else {
            g gVar5 = this.purple;
            if (gVar5 != null) {
                gVar5.e(jVar);
            }
        }
        this.alpha = gVar;
    }

    public final void f(j jVar) {
        g gVar = this.purple;
        if (gVar == null) {
            g gVar2 = this.alpha;
            if (gVar2 != null) {
                gVar2.f(jVar);
                return;
            }
            return;
        }
        gVar.f(jVar);
    }

    @Override // s0.aa
    public final /* synthetic */ void foxtrot(z zVar) {
    }

    @Override // s0.j0
    public final Object golf() {
        return d.alpha;
    }

    @Override // s0.aa
    public final void kilo(long j5) {
        this.red = j5;
    }

    @Override // T.r
    public final void onDetach() {
        this.purple = null;
        this.alpha = null;
    }
}
