package t0;

import androidx.compose.runtime.C0590w;
import androidx.compose.runtime.InterfaceC0586s;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class T0 implements InterfaceC0586s, androidx.lifecycle.aj {
    public final C2946x alpha;
    public final C0590w purple;
    public boolean red;
    public androidx.lifecycle.ac silver;
    public P.d teal = AbstractC2900S.alpha;

    public T0(C2946x c2946x, C0590w c0590w) {
        this.alpha = c2946x;
        this.purple = c0590w;
    }

    public final void alpha() {
        if (!this.red) {
            this.red = true;
            this.alpha.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.ac acVar = this.silver;
            if (acVar != null) {
                acVar.charlie(this);
            }
        }
        this.purple.mike();
    }

    public final void bravo(Xd.l lVar) {
        this.alpha.setOnViewTreeOwnersAvailable(new as(4, this, (P.d) lVar));
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(androidx.lifecycle.al alVar, androidx.lifecycle.aa aaVar) {
        if (aaVar == androidx.lifecycle.aa.ON_DESTROY) {
            alpha();
        } else if (aaVar == androidx.lifecycle.aa.ON_CREATE && !this.red) {
            bravo(this.teal);
        }
    }
}
