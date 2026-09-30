package androidx.compose.foundation.lazy;

import T.r;
import androidx.compose.runtime.p0;
import i.C1877z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/ParentSizeElement;", "Ls0/F;", "Li/z;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ParentSizeElement extends F {
    public final p0 alpha;

    public ParentSizeElement(p0 p0Var) {
        this.alpha = p0Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i.z, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = 1.0f;
        rVar.purple = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParentSizeElement) {
                ParentSizeElement parentSizeElement = (ParentSizeElement) obj;
                parentSizeElement.getClass();
                if (Intrinsics.areEqual(this.alpha, parentSizeElement.alpha) && Intrinsics.areEqual(null, null)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + (this.alpha.hashCode() * 961);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "fillParentMaxWidth";
        c2915g0.bravo = Float.valueOf(1.0f);
    }

    @Override // s0.F
    public final void update(r rVar) {
        C1877z c1877z = (C1877z) rVar;
        c1877z.alpha = 1.0f;
        c1877z.purple = this.alpha;
    }
}
