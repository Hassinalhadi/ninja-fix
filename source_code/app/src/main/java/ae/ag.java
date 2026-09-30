package ae;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ag implements androidx.lifecycle.aj, InterfaceC0424c {
    public final androidx.lifecycle.ac alpha;
    public final ac purple;
    public ah red;
    public final /* synthetic */ ai silver;

    public ag(ai aiVar, androidx.lifecycle.ac acVar, ac onBackPressedCallback) {
        Intrinsics.echo(onBackPressedCallback, "onBackPressedCallback");
        this.silver = aiVar;
        this.alpha = acVar;
        this.purple = onBackPressedCallback;
        acVar.alpha(this);
    }

    @Override // ae.InterfaceC0424c
    public final void cancel() {
        this.alpha.charlie(this);
        this.purple.removeCancellable(this);
        ah ahVar = this.red;
        if (ahVar != null) {
            ahVar.cancel();
        }
        this.red = null;
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        if (aaVar == androidx.lifecycle.aa.ON_START) {
            this.red = this.silver.bravo(this.purple);
            return;
        }
        if (aaVar == androidx.lifecycle.aa.ON_STOP) {
            ah ahVar = this.red;
            if (ahVar != null) {
                ahVar.cancel();
                return;
            }
            return;
        }
        if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
            cancel();
        }
    }
}
