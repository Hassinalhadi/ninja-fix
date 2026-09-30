package s1;

import android.graphics.Insets;
import android.view.WindowInsets;
import j1.C1929c;

/* loaded from: classes3.dex */
public final class W extends V {
    public static final a0 sierra;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        sierra = a0.hotel(null, windowInsets);
    }

    public W(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // s1.U, s1.P, s1.X
    public C1929c golf(int i4) {
        Insets insets;
        insets = this.charlie.getInsets(Z.alpha(i4));
        return C1929c.charlie(insets);
    }

    @Override // s1.U, s1.P, s1.X
    public C1929c hotel(int i4) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.charlie.getInsetsIgnoringVisibility(Z.alpha(i4));
        return C1929c.charlie(insetsIgnoringVisibility);
    }

    @Override // s1.U, s1.P, s1.X
    public boolean quebec(int i4) {
        boolean isVisible;
        isVisible = this.charlie.isVisible(Z.alpha(i4));
        return isVisible;
    }

    public W(a0 a0Var, W w4) {
        super(a0Var, w4);
    }
}
