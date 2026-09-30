package t0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import org.jetbrains.annotations.NotNull;

/* renamed from: t0.M, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2895M implements InterfaceC2894L {
    public final Matrix alpha = new Matrix();
    public final int[] purple = new int[2];

    @Override // t0.InterfaceC2894L
    public void charlie(@NotNull View view, @NotNull float[] fArr) {
        Matrix matrix = this.alpha;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.purple;
        view.getLocationOnScreen(iArr);
        int i4 = iArr[0];
        int i5 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i4, iArr[1] - i5);
        a0.ao.victor(matrix, fArr);
    }
}
