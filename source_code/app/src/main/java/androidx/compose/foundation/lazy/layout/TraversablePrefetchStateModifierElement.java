package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/TraversablePrefetchStateModifierElement;", "Ls0/F;", "Landroidx/compose/foundation/lazy/layout/B;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class TraversablePrefetchStateModifierElement extends F {
    public final ai alpha;

    public TraversablePrefetchStateModifierElement(ai aiVar) {
        this.alpha = aiVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.B, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TraversablePrefetchStateModifierElement) && Intrinsics.areEqual(this.alpha, ((TraversablePrefetchStateModifierElement) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "traversablePrefetchState";
        c2915g0.bravo = this.alpha;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.alpha + ')';
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        ((B) rVar).alpha = this.alpha;
    }
}
