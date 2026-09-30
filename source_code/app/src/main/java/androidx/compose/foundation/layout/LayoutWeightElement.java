package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/F;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutWeightElement extends s0.F {
    public final float alpha;
    public final boolean purple;

    public LayoutWeightElement(float f5, boolean z2) {
        this.alpha = f5;
        this.purple = z2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.F, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        LayoutWeightElement layoutWeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutWeightElement) {
            layoutWeightElement = (LayoutWeightElement) obj;
        } else {
            layoutWeightElement = null;
        }
        if (layoutWeightElement != null && this.alpha == layoutWeightElement.alpha && this.purple == layoutWeightElement.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int floatToIntBits = Float.floatToIntBits(this.alpha) * 31;
        if (this.purple) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return floatToIntBits + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "weight";
        float f5 = this.alpha;
        c2915g0.bravo = Float.valueOf(f5);
        Float valueOf = Float.valueOf(f5);
        kotlin.collections.o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "weight");
        oVar.bravo(Boolean.valueOf(this.purple), "fill");
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        F f5 = (F) rVar;
        f5.alpha = this.alpha;
        f5.purple = this.purple;
    }
}
