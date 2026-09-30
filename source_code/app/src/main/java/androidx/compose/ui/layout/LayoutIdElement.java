package androidx.compose.ui.layout;

import T.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import q0.aa;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "Ls0/F;", "Lq0/aa;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LayoutIdElement extends F {
    public final String alpha;

    public LayoutIdElement(String str) {
        this.alpha = str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q0.aa, T.r] */
    @Override // s0.F
    public final r create() {
        ?? rVar = new r();
        rVar.alpha = this.alpha;
        return rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && Intrinsics.areEqual(this.alpha, ((LayoutIdElement) obj).alpha);
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "layoutId";
        c2915g0.bravo = this.alpha;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.alpha) + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((aa) rVar).alpha = this.alpha;
    }
}
