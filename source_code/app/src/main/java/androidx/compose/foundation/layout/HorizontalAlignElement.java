package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/au;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HorizontalAlignElement extends s0.F {
    public final T.i alpha;

    public HorizontalAlignElement(T.i iVar) {
        this.alpha = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.au, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, horizontalAlignElement.alpha);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.alpha.alpha);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "align";
        c2915g0.bravo = this.alpha;
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        ((au) rVar).alpha = this.alpha;
    }
}
