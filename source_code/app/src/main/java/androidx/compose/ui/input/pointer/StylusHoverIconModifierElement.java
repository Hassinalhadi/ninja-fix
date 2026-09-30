package androidx.compose.ui.input.pointer;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import m0.C2095a;
import m0.f;
import m0.z;
import n.at;
import s0.F;
import s0.r;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/StylusHoverIconModifierElement;", "Ls0/F;", "Lm0/z;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StylusHoverIconModifierElement extends F {
    public final r alpha;

    public StylusHoverIconModifierElement(r rVar) {
        this.alpha = rVar;
    }

    @Override // s0.F
    public final T.r create() {
        return new f(at.bravo, this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StylusHoverIconModifierElement)) {
            return false;
        }
        StylusHoverIconModifierElement stylusHoverIconModifierElement = (StylusHoverIconModifierElement) obj;
        stylusHoverIconModifierElement.getClass();
        C2095a c2095a = at.bravo;
        return Intrinsics.areEqual(c2095a, c2095a) && Intrinsics.areEqual(this.alpha, stylusHoverIconModifierElement.alpha);
    }

    public final int hashCode() {
        int i4 = ((1022 * 31) + 1237) * 31;
        r rVar = this.alpha;
        return i4 + (rVar == null ? 0 : rVar.hashCode());
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "stylusHoverIcon";
        C2095a c2095a = at.bravo;
        o oVar = c2915g0.charlie;
        oVar.bravo(c2095a, Constants.KEY_ICON);
        oVar.bravo(Boolean.FALSE, "overrideDescendants");
        oVar.bravo(this.alpha, "touchBoundsExpansion");
    }

    public final String toString() {
        return "StylusHoverIconModifierElement(icon=" + at.bravo + ", overrideDescendants=false, touchBoundsExpansion=" + this.alpha + ')';
    }

    @Override // s0.F
    public final void update(T.r rVar) {
        z zVar = (z) rVar;
        C2095a c2095a = at.bravo;
        if (!Intrinsics.areEqual(zVar.purple, c2095a)) {
            zVar.purple = c2095a;
            if (zVar.red) {
                zVar.d();
            }
        }
        zVar.alpha = this.alpha;
    }
}
