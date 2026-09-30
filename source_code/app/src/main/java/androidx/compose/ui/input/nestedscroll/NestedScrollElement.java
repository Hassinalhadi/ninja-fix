package androidx.compose.ui.input.nestedscroll;

import T.r;
import je.ab;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import l0.C2047d;
import l0.C2050g;
import l0.InterfaceC2044a;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollElement;", "Ls0/F;", "Ll0/g;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class NestedScrollElement extends F {
    public final InterfaceC2044a alpha;
    public final C2047d purple;

    public NestedScrollElement(InterfaceC2044a interfaceC2044a, C2047d c2047d) {
        this.alpha = interfaceC2044a;
        this.purple = c2047d;
    }

    @Override // s0.F
    public final r create() {
        return new C2050g(this.alpha, this.purple);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        if (!Intrinsics.areEqual(nestedScrollElement.alpha, this.alpha) || !Intrinsics.areEqual(nestedScrollElement.purple, this.purple)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        C2047d c2047d = this.purple;
        if (c2047d != null) {
            i4 = c2047d.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "nestedScroll";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "connection");
        oVar.bravo(this.purple, "dispatcher");
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2050g c2050g = (C2050g) rVar;
        c2050g.alpha = this.alpha;
        C2047d c2047d = c2050g.purple;
        if (c2047d.alpha == c2050g) {
            c2047d.alpha = null;
        }
        C2047d c2047d2 = this.purple;
        if (c2047d2 == null) {
            c2050g.purple = new C2047d();
        } else if (!Intrinsics.areEqual(c2047d2, c2047d)) {
            c2050g.purple = c2047d2;
        }
        if (c2050g.isAttached()) {
            C2047d c2047d3 = c2050g.purple;
            c2047d3.alpha = c2050g;
            c2047d3.bravo = null;
            c2050g.red = null;
            c2047d3.charlie = new ab(10, c2050g);
            c2050g.purple.delta = c2050g.getCoroutineScope();
        }
    }
}
