package androidx.compose.foundation;

import T.r;
import b.ai;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m0.ah;
import s0.AbstractC2555o;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/CombinedClickableElement;", "Ls0/F;", "Lb/ai;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CombinedClickableElement extends F {
    public final InterfaceC1673j alpha;
    public final Function0 purple;

    public CombinedClickableElement(InterfaceC1673j interfaceC1673j, Function0 function0) {
        this.alpha = interfaceC1673j;
        this.purple = function0;
    }

    @Override // s0.F
    public final r create() {
        return new ai(this.alpha, this.purple);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CombinedClickableElement.class == obj.getClass()) {
            CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
            if (Intrinsics.areEqual(this.alpha, combinedClickableElement.alpha) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && this.purple == combinedClickableElement.purple && Intrinsics.areEqual(null, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        InterfaceC1673j interfaceC1673j = this.alpha;
        if (interfaceC1673j != null) {
            i4 = interfaceC1673j.hashCode();
        } else {
            i4 = 0;
        }
        return ((this.purple.hashCode() + (((((i4 * 961) + 1237) * 31) + 1231) * 29791)) * 923521) + 1231;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "combinedClickable";
        o oVar = c2915g0.charlie;
        oVar.bravo(null, "indicationNodeFactory");
        oVar.bravo(this.alpha, "interactionSource");
        Boolean bool = Boolean.TRUE;
        oVar.bravo(bool, "enabled");
        oVar.bravo(null, "onClickLabel");
        oVar.bravo(null, "role");
        oVar.bravo(this.purple, "onClick");
        oVar.bravo(null, "onDoubleClick");
        oVar.bravo(null, "onLongClick");
        oVar.bravo(null, "onLongClickLabel");
        oVar.bravo(bool, "hapticFeedbackEnabled");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ah ahVar;
        ai aiVar = (ai) rVar;
        boolean z2 = true;
        aiVar.f3295p = true;
        if (!Intrinsics.areEqual(null, null)) {
            AbstractC2555o.golf(aiVar).coral();
        }
        if (aiVar.f3307a) {
            z2 = false;
        }
        aiVar.n(this.alpha, null, false, true, null, null, this.purple);
        if (z2 && (ahVar = aiVar.e) != null) {
            ahVar.d();
        }
    }
}
