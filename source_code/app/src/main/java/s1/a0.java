package s1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j1.C1929c;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class a0 {
    public static final a0 bravo;
    public final X alpha;

    static {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            bravo = W.sierra;
        } else if (i4 >= 30) {
            bravo = U.romeo;
        } else {
            bravo = X.bravo;
        }
    }

    public a0(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            this.alpha = new W(this, windowInsets);
            return;
        }
        if (i4 >= 31) {
            this.alpha = new V(this, windowInsets);
            return;
        }
        if (i4 >= 30) {
            this.alpha = new U(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.alpha = new T(this, windowInsets);
        } else if (i4 >= 28) {
            this.alpha = new S(this, windowInsets);
        } else {
            this.alpha = new Q(this, windowInsets);
        }
    }

    public static C1929c echo(C1929c c1929c, int i4, int i5, int i10, int i11) {
        int max = Math.max(0, c1929c.alpha - i4);
        int max2 = Math.max(0, c1929c.bravo - i5);
        int max3 = Math.max(0, c1929c.charlie - i10);
        int max4 = Math.max(0, c1929c.delta - i11);
        if (max == i4 && max2 == i5 && max3 == i10 && max4 == i11) {
            return c1929c;
        }
        return C1929c.bravo(max, max2, max3, max4);
    }

    public static a0 hotel(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        a0 a0Var = new a0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = au.alpha;
            a0 alpha = am.alpha(view);
            X x4 = a0Var.alpha;
            x4.tango(alpha);
            x4.delta(view.getRootView());
            x4.victor(view.getWindowSystemUiVisibility());
        }
        return a0Var;
    }

    public final int alpha() {
        return this.alpha.lima().delta;
    }

    public final int bravo() {
        return this.alpha.lima().alpha;
    }

    public final int charlie() {
        return this.alpha.lima().charlie;
    }

    public final int delta() {
        return this.alpha.lima().bravo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return Objects.equals(this.alpha, ((a0) obj).alpha);
    }

    public final a0 foxtrot(int i4, int i5, int i10, int i11) {
        O j5;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 34) {
            j5 = new N(this);
        } else if (i12 >= 31) {
            j5 = new M(this);
        } else if (i12 >= 30) {
            j5 = new L(this);
        } else if (i12 >= 29) {
            j5 = new K(this);
        } else {
            j5 = new J(this);
        }
        j5.golf(C1929c.bravo(i4, i5, i10, i11));
        return j5.bravo();
    }

    public final WindowInsets golf() {
        X x4 = this.alpha;
        if (x4 instanceof P) {
            return ((P) x4).charlie;
        }
        return null;
    }

    public final int hashCode() {
        X x4 = this.alpha;
        if (x4 == null) {
            return 0;
        }
        return x4.hashCode();
    }

    public a0(a0 a0Var) {
        if (a0Var != null) {
            X x4 = a0Var.alpha;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 34 && (x4 instanceof W)) {
                this.alpha = new W(this, (W) x4);
            } else if (i4 >= 31 && (x4 instanceof V)) {
                this.alpha = new V(this, (V) x4);
            } else if (i4 >= 30 && (x4 instanceof U)) {
                this.alpha = new U(this, (U) x4);
            } else if (i4 >= 29 && (x4 instanceof T)) {
                this.alpha = new T(this, (T) x4);
            } else if (i4 >= 28 && (x4 instanceof S)) {
                this.alpha = new S(this, (S) x4);
            } else if (x4 instanceof Q) {
                this.alpha = new Q(this, (Q) x4);
            } else if (x4 instanceof P) {
                this.alpha = new P(this, (P) x4);
            } else {
                this.alpha = new X(this);
            }
            x4.echo(this);
            return;
        }
        this.alpha = new X(this);
    }
}
