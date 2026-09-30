package androidx.compose.foundation.layout;

import kotlin.Metadata;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/ac;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FillElement extends s0.F {
    public final aa alpha;
    public final float purple;
    public final String red;

    public FillElement(aa aaVar, float f5, String str) {
        this.alpha = aaVar;
        this.purple = f5;
        this.red = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.layout.ac, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        if (this.alpha == fillElement.alpha && this.purple == fillElement.purple) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purple) + (this.alpha.hashCode() * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = this.red;
        c2915g0.charlie.bravo(Float.valueOf(this.purple), "fraction");
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        ac acVar = (ac) rVar;
        acVar.alpha = this.alpha;
        acVar.purple = this.purple;
    }
}
