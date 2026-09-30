package androidx.compose.foundation.text.handwriting;

import T.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import s0.F;
import t0.C2915g0;
import v.C3163b;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "Ls0/F;", "Lv/b;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class StylusHandwritingElement extends F {
    public final Function0 alpha;

    public StylusHandwritingElement(Function0 function0) {
        this.alpha = function0;
    }

    @Override // s0.F
    public final r create() {
        return new C3163b(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHandwritingElement)) {
            return false;
        }
        if (this.alpha == ((StylusHandwritingElement) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "stylusHandwriting";
        c2915g0.charlie.bravo(this.alpha, "onHandwritingSlopExceeded");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((C3163b) rVar).red = this.alpha;
    }
}
