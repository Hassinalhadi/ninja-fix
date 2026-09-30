package g7;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class t extends u {
    public float bravo;
    public float charlie;

    @Override // g7.u
    public final void alpha(Matrix matrix, Path path) {
        Matrix matrix2 = this.alpha;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.bravo, this.charlie);
        path.transform(matrix);
    }
}
