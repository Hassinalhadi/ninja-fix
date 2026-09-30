package androidx.compose.ui.semantics;

import A0.c;
import A0.k;
import A0.n;
import A0.o;
import T.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Ls0/F;", "LA0/c;", "LA0/n;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppendedSemanticsElement extends F implements n {
    public final boolean alpha;
    public final Function1 purple;

    public AppendedSemanticsElement(Function1 function1, boolean z2) {
        this.alpha = z2;
        this.purple = function1;
    }

    @Override // s0.F
    public final r create() {
        return new c(this.alpha, false, this.purple);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppendedSemanticsElement) {
                AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
                if (this.alpha != appendedSemanticsElement.alpha || this.purple != appendedSemanticsElement.purple) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.purple.hashCode() + (i4 * 31);
    }

    @Override // A0.n
    public final k hotel() {
        k kVar = new k();
        kVar.red = this.alpha;
        this.purple.invoke(kVar);
        return kVar;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "semantics";
        c2915g0.charlie.bravo(Boolean.valueOf(this.alpha), "mergeDescendants");
        o.alpha(c2915g0, hotel());
    }

    @Override // s0.F
    public final void update(r rVar) {
        c cVar = (c) rVar;
        cVar.alpha = this.alpha;
        cVar.red = this.purple;
    }
}
