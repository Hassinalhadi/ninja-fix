package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicHeightElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/A;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IntrinsicHeightElement extends s0.F {
    public final C2932p alpha;

    public IntrinsicHeightElement(C2932p c2932p) {
        B b2 = B.alpha;
        this.alpha = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.C, T.r, androidx.compose.foundation.layout.A] */
    @Override // s0.F
    public final T.r create() {
        ?? c3 = new C(0);
        c3.purple = B.alpha;
        c3.red = true;
        return c3;
    }

    public final boolean equals(Object obj) {
        IntrinsicHeightElement intrinsicHeightElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntrinsicHeightElement) {
            intrinsicHeightElement = (IntrinsicHeightElement) obj;
        } else {
            intrinsicHeightElement = null;
        }
        if (intrinsicHeightElement == null) {
            return false;
        }
        B b2 = B.alpha;
        return true;
    }

    public final int hashCode() {
        return (B.alpha.hashCode() * 31) + 1231;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.alpha.getClass();
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        A a6 = (A) rVar;
        a6.purple = B.alpha;
        a6.red = true;
    }
}
