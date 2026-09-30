package x2;

import android.view.ViewGroup;
import t6.AbstractC2987e3;

/* renamed from: x2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3282c extends aa {
    public boolean alpha = false;
    public final ViewGroup bravo;

    public C3282c(ViewGroup viewGroup) {
        this.bravo = viewGroup;
    }

    @Override // x2.aa, x2.x
    public final void onTransitionCancel(z zVar) {
        AbstractC2987e3.bravo(this.bravo, false);
        this.alpha = true;
    }

    @Override // x2.aa, x2.x
    public final void onTransitionEnd(z zVar) {
        if (!this.alpha) {
            AbstractC2987e3.bravo(this.bravo, false);
        }
        zVar.azure(this);
    }

    @Override // x2.aa, x2.x
    public final void onTransitionPause(z zVar) {
        AbstractC2987e3.bravo(this.bravo, false);
    }

    @Override // x2.aa, x2.x
    public final void onTransitionResume(z zVar) {
        AbstractC2987e3.bravo(this.bravo, true);
    }
}
