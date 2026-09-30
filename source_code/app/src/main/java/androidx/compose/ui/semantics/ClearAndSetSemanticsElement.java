package androidx.compose.ui.semantics;

import A0.c;
import A0.k;
import A0.n;
import A0.o;
import F.C0172x;
import T.r;
import kotlin.Metadata;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/ClearAndSetSemanticsElement;", "Ls0/F;", "LA0/c;", "LA0/n;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ClearAndSetSemanticsElement extends F implements n {
    public final C0172x alpha;

    public ClearAndSetSemanticsElement(C0172x c0172x) {
        this.alpha = c0172x;
    }

    @Override // s0.F
    public final r create() {
        return new c(false, true, this.alpha);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClearAndSetSemanticsElement) {
                if (this.alpha != ((ClearAndSetSemanticsElement) obj).alpha) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // A0.n
    public final k hotel() {
        k kVar = new k();
        kVar.red = false;
        kVar.silver = true;
        this.alpha.getClass();
        return kVar;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "clearAndSetSemantics";
        o.alpha(c2915g0, hotel());
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((c) rVar).red = this.alpha;
    }
}
