package w;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import g.AbstractC1719b;
import n.ax;
import s0.InterfaceC2553m;
import s0.InterfaceC2554n;
import s0.InterfaceC2559t;
import s0.L;
import y.C3344D;

/* loaded from: classes3.dex */
public final class q extends T.r implements InterfaceC2553m, InterfaceC2559t, InterfaceC2554n {
    public C3227e alpha;
    public ax purple;
    public C3344D red;
    public final androidx.compose.runtime.ax silver = C0564b.zulu(null);

    public q(C3227e c3227e, ax axVar, C3344D c3344d) {
        this.alpha = c3227e;
        this.purple = axVar;
        this.red = c3344d;
    }

    @Override // s0.InterfaceC2559t
    public final void hotel(L l10) {
        ((t0) this.silver).setValue(l10);
    }

    @Override // T.r
    public final void onAttach() {
        C3227e c3227e = this.alpha;
        if (c3227e.alpha != null) {
            AbstractC1719b.charlie("Expected textInputModifierNode to be null");
        }
        c3227e.alpha = this;
    }

    @Override // T.r
    public final void onDetach() {
        this.alpha.kilo(this);
    }
}
