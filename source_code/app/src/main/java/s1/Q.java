package s1;

import android.view.WindowInsets;
import j1.C1929c;

/* loaded from: classes3.dex */
public class Q extends P {
    public C1929c november;

    public Q(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
        this.november = null;
    }

    @Override // s1.X
    public a0 bravo() {
        return a0.hotel(null, this.charlie.consumeStableInsets());
    }

    @Override // s1.X
    public a0 charlie() {
        return a0.hotel(null, this.charlie.consumeSystemWindowInsets());
    }

    @Override // s1.X
    public final C1929c juliet() {
        if (this.november == null) {
            WindowInsets windowInsets = this.charlie;
            this.november = C1929c.bravo(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.november;
    }

    @Override // s1.X
    public boolean oscar() {
        return this.charlie.isConsumed();
    }

    @Override // s1.X
    public void uniform(C1929c c1929c) {
        this.november = c1929c;
    }

    public Q(a0 a0Var, Q q4) {
        super(a0Var, q4);
        this.november = null;
        this.november = q4.november;
    }
}
