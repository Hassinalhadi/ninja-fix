package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/Y;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnspecifiedConstraintsElement extends s0.F {
    public final float alpha;
    public final float purple;

    public UnspecifiedConstraintsElement(float f5, float f10) {
        this.alpha = f5;
        this.purple = f10;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.Y, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof UnspecifiedConstraintsElement) {
            UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
            if (Q0.g.alpha(this.alpha, unspecifiedConstraintsElement.alpha) && Q0.g.alpha(this.purple, unspecifiedConstraintsElement.purple)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purple) + (Float.floatToIntBits(this.alpha) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "defaultMinSize";
        Q0.g gVar = new Q0.g(this.alpha);
        kotlin.collections.o oVar = c2915g0.charlie;
        oVar.bravo(gVar, "minWidth");
        oVar.bravo(new Q0.g(this.purple), "minHeight");
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        Y y10 = (Y) rVar;
        y10.alpha = this.alpha;
        y10.purple = this.purple;
    }
}
