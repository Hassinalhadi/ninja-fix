package androidx.compose.ui.draw;

import T.r;
import X.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "Ls0/F;", "LX/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DrawBehindElement extends F {
    public final Function1 alpha;

    public DrawBehindElement(Function1 function1) {
        this.alpha = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, X.d] */
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
        if (!(obj instanceof DrawBehindElement)) {
            return false;
        }
        if (this.alpha == ((DrawBehindElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "drawBehind";
        c2915g0.charlie.bravo(this.alpha, "onDraw");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((d) rVar).alpha = this.alpha;
    }
}
