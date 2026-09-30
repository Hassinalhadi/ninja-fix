package androidx.compose.foundation.lazy.layout;

import d.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Ls0/F;", "Landroidx/compose/foundation/lazy/layout/n;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyLayoutBeyondBoundsModifierElement extends F {
    public final o alpha;
    public final i purple;
    public final K red;

    public LazyLayoutBeyondBoundsModifierElement(o oVar, i iVar, K k6) {
        this.alpha = oVar;
        this.purple = iVar;
        this.red = k6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.n, T.r] */
    @Override // s0.F
    public final T.r create() {
        ?? rVar = new T.r();
        rVar.alpha = this.alpha;
        rVar.purple = this.purple;
        rVar.red = this.red;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LazyLayoutBeyondBoundsModifierElement) {
                LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
                if (!Intrinsics.areEqual(this.alpha, lazyLayoutBeyondBoundsModifierElement.alpha) || !Intrinsics.areEqual(this.purple, lazyLayoutBeyondBoundsModifierElement.purple) || this.red != lazyLayoutBeyondBoundsModifierElement.red) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.red.hashCode() + ((((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        n nVar = (n) rVar;
        nVar.alpha = this.alpha;
        nVar.purple = this.purple;
        nVar.red = this.red;
    }
}
