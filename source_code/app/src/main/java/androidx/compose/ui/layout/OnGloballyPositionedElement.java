package androidx.compose.ui.layout;

import T.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import q0.ax;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedElement;", "Ls0/F;", "Lq0/ax;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnGloballyPositionedElement extends F {
    public final Function1 alpha;

    public OnGloballyPositionedElement(Function1 function1) {
        this.alpha = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q0.ax, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnGloballyPositionedElement)) {
            return false;
        }
        if (this.alpha == ((OnGloballyPositionedElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "onGloballyPositioned";
        c2915g0.charlie.bravo(this.alpha, "onGloballyPositioned");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((ax) rVar).alpha = this.alpha;
    }
}
