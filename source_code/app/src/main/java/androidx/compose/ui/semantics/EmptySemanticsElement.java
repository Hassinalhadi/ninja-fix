package androidx.compose.ui.semantics;

import A0.d;
import T.r;
import kotlin.Metadata;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Ls0/F;", "LA0/d;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptySemanticsElement extends F {
    public final d alpha;

    public EmptySemanticsElement(d dVar) {
        this.alpha = dVar;
    }

    @Override // s0.F
    public final r create() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    @Override // s0.F
    public final /* bridge */ /* synthetic */ void update(r rVar) {
    }
}
