package X6;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class f implements TypeEvaluator {
    public final float[] alpha = new float[9];
    public final float[] bravo = new float[9];
    public final Matrix charlie = new Matrix();
    public final /* synthetic */ i delta;

    public f(i iVar) {
        this.delta = iVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f5, Object obj, Object obj2) {
        this.delta.papa = f5;
        float[] fArr = this.alpha;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.bravo;
        ((Matrix) obj2).getValues(fArr2);
        for (int i4 = 0; i4 < 9; i4++) {
            float f10 = fArr2[i4];
            float f11 = fArr[i4];
            fArr2[i4] = Q0.c.lima(f10, f11, f5, f11);
        }
        Matrix matrix = this.charlie;
        matrix.setValues(fArr2);
        return matrix;
    }
}
