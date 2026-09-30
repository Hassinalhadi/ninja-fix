package g7;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class s extends u {
    public static final RectF hotel = new RectF();
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public float foxtrot;
    public float golf;

    public s(float f5, float f10, float f11, float f12) {
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
        this.echo = f12;
    }

    @Override // g7.u
    public final void alpha(Matrix matrix, Path path) {
        Matrix matrix2 = this.alpha;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = hotel;
        rectF.set(this.bravo, this.charlie, this.delta, this.echo);
        path.arcTo(rectF, this.foxtrot, this.golf, false);
        path.transform(matrix);
    }
}
