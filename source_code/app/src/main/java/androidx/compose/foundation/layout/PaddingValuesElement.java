package androidx.compose.foundation.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesElement;", "Ls0/F;", "Landroidx/compose/foundation/layout/N;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaddingValuesElement extends s0.F {
    public final L alpha;
    public final Ya.c purple;

    public PaddingValuesElement(L l10, Ya.c cVar) {
        this.alpha = l10;
        this.purple = cVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, androidx.compose.foundation.layout.N] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement;
        if (obj instanceof PaddingValuesElement) {
            paddingValuesElement = (PaddingValuesElement) obj;
        } else {
            paddingValuesElement = null;
        }
        if (paddingValuesElement == null) {
            return false;
        }
        return Intrinsics.areEqual(this.alpha, paddingValuesElement.alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        this.purple.invoke(c2915g0);
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        ((N) rVar).alpha = this.alpha;
    }
}
