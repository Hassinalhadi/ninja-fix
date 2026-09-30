package androidx.compose.foundation;

import T.r;
import b.e0;
import b.g0;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Ls0/F;", "Lb/e0;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ScrollingLayoutElement extends F {
    public final g0 alpha;
    public final boolean purple;

    public ScrollingLayoutElement(g0 g0Var, boolean z2) {
        this.alpha = g0Var;
        this.purple = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, b.e0] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ScrollingLayoutElement) {
            ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
            if (Intrinsics.areEqual(this.alpha, scrollingLayoutElement.alpha) && this.purple == scrollingLayoutElement.purple) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4 = 1237;
        int hashCode = ((this.alpha.hashCode() * 31) + 1237) * 31;
        if (this.purple) {
            i4 = 1231;
        }
        return hashCode + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "scroll";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "state");
        oVar.bravo(Boolean.FALSE, "reverseScrolling");
        oVar.bravo(Boolean.valueOf(this.purple), "isVertical");
    }

    @Override // s0.F
    public final void update(r rVar) {
        e0 e0Var = (e0) rVar;
        e0Var.alpha = this.alpha;
        e0Var.purple = this.purple;
    }
}
