package androidx.compose.foundation;

import T.r;
import b.G;
import b.H;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2556p;
import s0.F;
import s0.InterfaceC2554n;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Ls0/F;", "Lb/G;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class IndicationModifierElement extends F {
    public final InterfaceC1673j alpha;
    public final H purple;

    public IndicationModifierElement(InterfaceC1673j interfaceC1673j, H h4) {
        this.alpha = interfaceC1673j;
        this.purple = h4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T.r, s0.p, b.G] */
    @Override // s0.F
    public final r create() {
        InterfaceC2554n alpha = this.purple.alpha(this.alpha);
        ?? abstractC2556p = new AbstractC2556p();
        abstractC2556p.red = alpha;
        abstractC2556p.b(alpha);
        return abstractC2556p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        if (Intrinsics.areEqual(this.alpha, indicationModifierElement.alpha) && Intrinsics.areEqual(this.purple, indicationModifierElement.purple)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.purple.hashCode() + (this.alpha.hashCode() * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "indication";
        o oVar = c2915g0.charlie;
        oVar.bravo(this.alpha, "interactionSource");
        oVar.bravo(this.purple, "indication");
    }

    @Override // s0.F
    public final void update(r rVar) {
        G g2 = (G) rVar;
        InterfaceC2554n alpha = this.purple.alpha(this.alpha);
        g2.c(g2.red);
        g2.red = alpha;
        g2.b(alpha);
    }
}
