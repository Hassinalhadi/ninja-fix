package androidx.compose.foundation.text.input.internal;

import T.r;
import g.AbstractC1719b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.ax;
import s0.F;
import t0.C2915g0;
import w.C3227e;
import w.q;
import y.C3344D;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Ls0/F;", "Lw/q;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LegacyAdaptingPlatformTextInputModifier extends F {
    public final C3227e alpha;
    public final ax purple;
    public final C3344D red;

    public LegacyAdaptingPlatformTextInputModifier(C3227e c3227e, ax axVar, C3344D c3344d) {
        this.alpha = c3227e;
        this.purple = axVar;
        this.red = c3344d;
    }

    @Override // s0.F
    public final r create() {
        C3344D c3344d = this.red;
        return new q(this.alpha, this.purple, c3344d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return Intrinsics.areEqual(this.alpha, legacyAdaptingPlatformTextInputModifier.alpha) && Intrinsics.areEqual(this.purple, legacyAdaptingPlatformTextInputModifier.purple) && Intrinsics.areEqual(this.red, legacyAdaptingPlatformTextInputModifier.red);
    }

    public final int hashCode() {
        return this.red.hashCode() + ((this.purple.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.alpha + ", legacyTextFieldState=" + this.purple + ", textFieldSelectionManager=" + this.red + ')';
    }

    @Override // s0.F
    public final void update(r rVar) {
        q qVar = (q) rVar;
        if (qVar.isAttached()) {
            qVar.alpha.echo();
            qVar.alpha.kilo(qVar);
        }
        qVar.alpha = this.alpha;
        if (qVar.isAttached()) {
            C3227e c3227e = qVar.alpha;
            if (c3227e.alpha != null) {
                AbstractC1719b.charlie("Expected textInputModifierNode to be null");
            }
            c3227e.alpha = qVar;
        }
        qVar.purple = this.purple;
        qVar.red = this.red;
    }
}
