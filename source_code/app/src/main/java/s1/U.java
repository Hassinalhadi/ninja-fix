package s1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import j1.C1929c;

/* loaded from: classes3.dex */
public class U extends T {
    public static final a0 romeo;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        romeo = a0.hotel(null, windowInsets);
    }

    public U(a0 a0Var, WindowInsets windowInsets) {
        super(a0Var, windowInsets);
    }

    @Override // s1.P, s1.X
    public final void delta(View view) {
    }

    @Override // s1.P, s1.X
    public C1929c golf(int i4) {
        Insets insets;
        insets = this.charlie.getInsets(Y.alpha(i4));
        return C1929c.charlie(insets);
    }

    @Override // s1.P, s1.X
    public C1929c hotel(int i4) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.charlie.getInsetsIgnoringVisibility(Y.alpha(i4));
        return C1929c.charlie(insetsIgnoringVisibility);
    }

    @Override // s1.P, s1.X
    public boolean quebec(int i4) {
        boolean isVisible;
        isVisible = this.charlie.isVisible(Y.alpha(i4));
        return isVisible;
    }

    public U(a0 a0Var, U u4) {
        super(a0Var, u4);
    }
}
