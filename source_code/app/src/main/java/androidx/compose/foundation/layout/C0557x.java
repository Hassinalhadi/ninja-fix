package androidx.compose.foundation.layout;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r0.InterfaceC2481c;

/* renamed from: androidx.compose.foundation.layout.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0557x implements InterfaceC2481c {
    public final Function1 alpha;
    public a0 purple;

    public C0557x(Function1 function1) {
        this.alpha = function1;
    }

    @Override // T.s
    public final /* synthetic */ boolean all(Function1 function1) {
        return Q0.c.alpha(this, function1);
    }

    @Override // r0.InterfaceC2481c
    public final void bravo(r0.f fVar) {
        a0 a0Var = (a0) fVar.coral(AbstractC0538d.charlie);
        if (!Intrinsics.areEqual(a0Var, this.purple)) {
            this.purple = a0Var;
            this.alpha.invoke(a0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0557x) && ((C0557x) obj).alpha == this.alpha) {
            return true;
        }
        return false;
    }

    @Override // T.s
    public final Object foldIn(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // T.s
    public final /* synthetic */ T.s then(T.s sVar) {
        return Q0.c.charlie(this, sVar);
    }
}
