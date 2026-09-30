package androidx.compose.ui.layout;

import T.r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import q0.ay;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Ls0/F;", "Lq0/ay;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class OnSizeChangedModifier extends F {
    public final Function1 alpha;

    public OnSizeChangedModifier(Function1 function1) {
        this.alpha = function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, q0.ay] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        long j5 = RecyclerView.UNDEFINED_DURATION;
        rVar.purple = (j5 & 4294967295L) | (j5 << 32);
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnSizeChangedModifier)) {
            return false;
        }
        if (this.alpha == ((OnSizeChangedModifier) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "onSizeChanged";
        c2915g0.charlie.bravo(this.alpha, "onSizeChanged");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ay ayVar = (ay) rVar;
        ayVar.alpha = this.alpha;
        long j5 = RecyclerView.UNDEFINED_DURATION;
        ayVar.purple = (j5 & 4294967295L) | (j5 << 32);
    }
}
