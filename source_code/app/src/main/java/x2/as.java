package x2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public final class as extends ar {
    @Override // t6.AbstractC2992f3
    public final float alpha(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // t6.AbstractC2992f3
    public final void bravo(View view, float f5) {
        view.setTransitionAlpha(f5);
    }

    @Override // x2.ar, t6.AbstractC2992f3
    public final void charlie(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // x2.ar
    public final void echo(View view, int i4, int i5, int i10, int i11) {
        view.setLeftTopRightBottom(i4, i5, i10, i11);
    }

    @Override // x2.ar
    public final void foxtrot(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // x2.ar
    public final void golf(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
