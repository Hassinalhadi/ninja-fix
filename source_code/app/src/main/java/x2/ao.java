package x2;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes3.dex */
public abstract class ao {
    public static void alpha(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    public static void bravo(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void charlie(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
