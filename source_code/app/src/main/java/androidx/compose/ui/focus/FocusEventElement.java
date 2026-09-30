package androidx.compose.ui.focus;

import T.r;
import Y.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/focus/FocusEventElement;", "Ls0/F;", "LY/f;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FocusEventElement extends F {
    public final Function1 alpha;

    public FocusEventElement(Function1 function1) {
        this.alpha = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y.f, T.r] */
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
        if (!(obj instanceof FocusEventElement)) {
            return false;
        }
        if (this.alpha == ((FocusEventElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "onFocusEvent";
        c2915g0.charlie.bravo(this.alpha, "onFocusEvent");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((f) rVar).alpha = this.alpha;
    }
}
