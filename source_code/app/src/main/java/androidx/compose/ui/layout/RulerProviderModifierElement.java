package androidx.compose.ui.layout;

import T.r;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import q0.C2371G;
import q0.RunnableC2400s;
import s0.AbstractC2555o;
import s0.F;
import s0.al;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/RulerProviderModifierElement;", "Ls0/F;", "Lq0/G;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ModifierNodeInspectableProperties"})
/* loaded from: classes3.dex */
public final class RulerProviderModifierElement extends F {
    public final RunnableC2400s alpha;

    public RulerProviderModifierElement(RunnableC2400s runnableC2400s) {
        this.alpha = runnableC2400s;
    }

    @Override // s0.F
    public final r create() {
        return new C2371G(this.alpha);
    }

    public final boolean equals(Object obj) {
        RulerProviderModifierElement rulerProviderModifierElement;
        if (obj == this) {
            return true;
        }
        RunnableC2400s runnableC2400s = null;
        if (obj instanceof RulerProviderModifierElement) {
            rulerProviderModifierElement = (RulerProviderModifierElement) obj;
        } else {
            rulerProviderModifierElement = null;
        }
        if (rulerProviderModifierElement != null) {
            runnableC2400s = rulerProviderModifierElement.alpha;
        }
        if (runnableC2400s == this.alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // s0.F
    public final void update(r rVar) {
        C2371G c2371g = (C2371G) rVar;
        RunnableC2400s runnableC2400s = c2371g.alpha;
        RunnableC2400s runnableC2400s2 = this.alpha;
        if (runnableC2400s != runnableC2400s2) {
            c2371g.alpha = runnableC2400s2;
            al.olive(AbstractC2555o.golf(c2371g), false, 7);
        }
    }
}
