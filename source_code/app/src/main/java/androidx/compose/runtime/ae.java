package androidx.compose.runtime;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ae implements InterfaceC0563a0 {
    public final Function1 alpha;
    public af purple;

    public ae(Function1 function1) {
        this.alpha = function1;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void alpha() {
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void bravo() {
        af afVar = this.purple;
        if (afVar != null) {
            afVar.dispose();
        }
        this.purple = null;
    }

    @Override // androidx.compose.runtime.InterfaceC0563a0
    public final void delta() {
        this.purple = (af) this.alpha.invoke(C0564b.bravo);
    }
}
