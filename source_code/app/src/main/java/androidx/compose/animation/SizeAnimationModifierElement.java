package androidx.compose.animation;

import T.d;
import T.k;
import T.r;
import bx.J;
import bz.aa;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/SizeAnimationModifierElement;", "Ls0/F;", "Lbx/J;", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SizeAnimationModifierElement extends F {
    public final aa alpha;

    public SizeAnimationModifierElement(aa aaVar) {
        this.alpha = aaVar;
    }

    @Override // s0.F
    public final r create() {
        return new J(this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeAnimationModifierElement)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.alpha, ((SizeAnimationModifierElement) obj).alpha)) {
            return false;
        }
        k kVar = d.alpha;
        return Intrinsics.areEqual(kVar, kVar) && Intrinsics.areEqual(null, null);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(-1.0f) + (Float.floatToIntBits(-1.0f) * 31) + (this.alpha.hashCode() * 31)) * 31;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "animateContentSize";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "animationSpec");
        oVar.bravo(d.alpha, "alignment");
        oVar.bravo(null, "finishedListener");
    }

    public final String toString() {
        return "SizeAnimationModifierElement(animationSpec=" + this.alpha + ", alignment=" + d.alpha + ", finishedListener=null)";
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((J) rVar).purple = this.alpha;
    }
}
