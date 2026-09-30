package androidx.compose.ui.input.rotary;

import T.r;
import kotlin.Metadata;
import o0.C2186a;
import s0.F;
import t0.C2915g0;
import t0.C2932p;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "Ls0/F;", "Lo0/a;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RotaryInputElement extends F {
    public final C2932p alpha;

    public RotaryInputElement(C2932p c2932p) {
        this.alpha = c2932p;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o0.a, T.r] */
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
        if (obj instanceof RotaryInputElement) {
            if (this.alpha == ((RotaryInputElement) obj).alpha) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        C2932p c2932p = this.alpha;
        if (c2932p != null) {
            i4 = c2932p.hashCode();
        } else {
            i4 = 0;
        }
        return i4 * 31;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        C2932p c2932p = this.alpha;
        if (c2932p != null) {
            c2915g0.alpha = "onRotaryScrollEvent";
            c2915g0.charlie.bravo(c2932p, "onRotaryScrollEvent");
        }
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((C2186a) rVar).alpha = this.alpha;
    }
}
