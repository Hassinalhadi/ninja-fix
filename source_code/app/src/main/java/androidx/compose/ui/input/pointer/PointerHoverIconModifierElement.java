package androidx.compose.ui.input.pointer;

import T.r;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import m0.C2095a;
import m0.f;
import m0.m;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "Ls0/F;", "Lm0/m;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PointerHoverIconModifierElement extends F {
    public final C2095a alpha;

    public PointerHoverIconModifierElement(C2095a c2095a) {
        this.alpha = c2095a;
    }

    @Override // s0.F
    public final r create() {
        return new f(this.alpha, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PointerHoverIconModifierElement) {
            return Intrinsics.areEqual(this.alpha, ((PointerHoverIconModifierElement) obj).alpha);
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.bravo * 31) + 1237;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "pointerHoverIcon";
        C2095a c2095a = this.alpha;
        o oVar = c2915g0.charlie;
        oVar.bravo(c2095a, Constants.KEY_ICON);
        oVar.bravo(Boolean.FALSE, "overrideDescendants");
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.alpha + ", overrideDescendants=false)";
    }

    @Override // s0.F
    public final void update(r rVar) {
        m mVar = (m) rVar;
        C2095a c2095a = this.alpha;
        if (!Intrinsics.areEqual(mVar.purple, c2095a)) {
            mVar.purple = c2095a;
            if (mVar.red) {
                mVar.d();
            }
        }
    }
}
