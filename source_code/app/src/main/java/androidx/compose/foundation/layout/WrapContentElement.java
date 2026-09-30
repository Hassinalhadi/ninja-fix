package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/WrapContentElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/f0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WrapContentElement extends s0.F {
    public final aa alpha;
    public final Xd.l purple;
    public final Object red;
    public final String silver;

    public WrapContentElement(aa aaVar, Xd.l lVar, Object obj, String str) {
        this.alpha = aaVar;
        this.purple = lVar;
        this.red = obj;
        this.silver = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, androidx.compose.foundation.layout.f0] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && WrapContentElement.class == obj.getClass()) {
                WrapContentElement wrapContentElement = (WrapContentElement) obj;
                if (this.alpha != wrapContentElement.alpha || !Intrinsics.areEqual(this.red, wrapContentElement.red)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.red.hashCode() + (((this.alpha.hashCode() * 31) + 1237) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = this.silver;
        kotlin.collections.o oVar = c2915g0.charlie;
        oVar.bravo(this.red, "align");
        oVar.bravo(Boolean.FALSE, "unbounded");
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        f0 f0Var = (f0) rVar;
        f0Var.alpha = this.alpha;
        f0Var.purple = this.purple;
    }
}
