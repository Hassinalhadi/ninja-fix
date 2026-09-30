package androidx.compose.foundation.lazy.layout;

import d.K;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Ls0/F;", "Landroidx/compose/foundation/lazy/layout/aq;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LazyLayoutSemanticsModifier extends F {
    public final ge.s alpha;
    public final am purple;
    public final K red;
    public final boolean silver;

    public LazyLayoutSemanticsModifier(ge.s sVar, am amVar, K k6, boolean z2) {
        this.alpha = sVar;
        this.purple = amVar;
        this.red = k6;
        this.silver = z2;
    }

    @Override // s0.F
    public final T.r create() {
        K k6 = this.red;
        return new aq(this.alpha, this.purple, k6, this.silver);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LazyLayoutSemanticsModifier) {
            LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
            if (this.alpha == lazyLayoutSemanticsModifier.alpha && Intrinsics.areEqual(this.purple, lazyLayoutSemanticsModifier.purple) && this.red == lazyLayoutSemanticsModifier.red && this.silver == lazyLayoutSemanticsModifier.silver) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.red.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31)) * 31;
        if (this.silver) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return ((hashCode + i4) * 31) + 1237;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        aq aqVar = (aq) rVar;
        aqVar.alpha = this.alpha;
        aqVar.purple = this.purple;
        K k6 = aqVar.red;
        K k10 = this.red;
        if (k6 != k10) {
            aqVar.red = k10;
            AbstractC2555o.golf(aqVar).coral();
        }
        boolean z2 = aqVar.silver;
        boolean z10 = this.silver;
        if (z2 == z10) {
            return;
        }
        aqVar.silver = z10;
        aqVar.b();
        AbstractC2555o.golf(aqVar).coral();
    }
}
