package androidx.compose.ui.layout;

import T.r;
import Xd.m;
import kotlin.Metadata;
import q0.ac;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "Ls0/F;", "Lq0/ac;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class LayoutElement extends F {
    public final m alpha;

    public LayoutElement(m mVar) {
        this.alpha = mVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, q0.ac] */
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
        if (!(obj instanceof LayoutElement)) {
            return false;
        }
        if (this.alpha == ((LayoutElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "layout";
        c2915g0.charlie.bravo(this.alpha, "measure");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((ac) rVar).alpha = this.alpha;
    }
}
