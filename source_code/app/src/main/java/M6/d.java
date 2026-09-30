package M6;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class d extends Property {
    public final Matrix alpha;

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.alpha = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix matrix = this.alpha;
        matrix.set(((ImageView) obj).getImageMatrix());
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
