package androidx.compose.foundation;

import T.r;
import b.ar;
import f.InterfaceC1673j;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import s0.F;
import t0.C2915g0;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Ls0/F;", "Lb/ar;", "foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FocusableElement extends F {
    public final InterfaceC1673j alpha;

    public FocusableElement(InterfaceC1673j interfaceC1673j) {
        this.alpha = interfaceC1673j;
    }

    @Override // s0.F
    public final r create() {
        return new ar(this.alpha, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FocusableElement)) {
            return false;
        }
        if (Intrinsics.areEqual(this.alpha, ((FocusableElement) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        InterfaceC1673j interfaceC1673j = this.alpha;
        if (interfaceC1673j != null) {
            return interfaceC1673j.hashCode();
        }
        return 0;
    }

    @Override // s0.F
    public final void inspectableProperties(C2915g0 c2915g0) {
        c2915g0.alpha = "focusable";
        Boolean bool = Boolean.TRUE;
        o oVar = c2915g0.charlie;
        oVar.bravo(bool, "enabled");
        oVar.bravo(this.alpha, "interactionSource");
    }

    @Override // s0.F
    public final void update(r rVar) {
        ((ar) rVar).g(this.alpha);
    }
}
