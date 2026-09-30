package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class j {
    public static final ThreadLocal alpha = new ThreadLocal();
    public static final ThreadLocal bravo = new ThreadLocal();

    public static void alpha(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            alpha(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
