package androidx.compose.foundation.layout;

import h.AbstractC1797a;
import kotlin.Metadata;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/AspectRatioElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/i;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AspectRatioElement extends s0.F {
    public final float alpha;
    public final C2932p purple;

    public AspectRatioElement(float f5, C2932p c2932p) {
        this.alpha = f5;
        this.purple = c2932p;
        if (f5 > 0.0f) {
            return;
        }
        AbstractC1797a.alpha("aspectRatio " + f5 + " must be > 0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.i, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        AspectRatioElement aspectRatioElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AspectRatioElement) {
            aspectRatioElement = (AspectRatioElement) obj;
        } else {
            aspectRatioElement = null;
        }
        if (aspectRatioElement != null && this.alpha == aspectRatioElement.alpha) {
            ((AspectRatioElement) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.alpha) * 31) + 1237;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.purple.getClass();
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        ((C0543i) rVar).alpha = this.alpha;
    }
}
