package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicWidthElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/D;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntrinsicWidthElement extends s0.F {
    public final C2932p alpha;

    public IntrinsicWidthElement(C2932p c2932p) {
        B b2 = B.alpha;
        this.alpha = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.C, androidx.compose.foundation.layout.D, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? c3 = new C(0);
        c3.purple = B.purple;
        c3.red = true;
        return c3;
    }

    public final boolean equals(Object obj) {
        IntrinsicWidthElement intrinsicWidthElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicWidthElement) {
            intrinsicWidthElement = (IntrinsicWidthElement) obj;
        } else {
            intrinsicWidthElement = null;
        }
        if (intrinsicWidthElement == null) {
            return false;
        }
        B b2 = B.alpha;
        return true;
    }

    public final int hashCode() {
        return (B.purple.hashCode() * 31) + 1231;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.alpha.getClass();
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        D d4 = (D) rVar;
        d4.purple = B.purple;
        d4.red = true;
    }
}
