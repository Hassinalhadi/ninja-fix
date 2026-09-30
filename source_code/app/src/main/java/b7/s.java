package b7;

import android.graphics.Matrix;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s {
    public final float[] alpha;
    public final float[] bravo;
    public final Matrix charlie;

    public s() {
        this.alpha = new float[2];
        this.bravo = r0;
        float[] fArr = {1.0f};
        this.charlie = new Matrix();
    }

    public final void alpha(float f5) {
        float[] fArr = this.bravo;
        float atan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.alpha;
        double d4 = f5;
        double d9 = atan2;
        fArr2[0] = (float) ((Math.cos(d9) * d4) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d9) * d4) + fArr2[1]);
    }

    public final void bravo() {
        Arrays.fill(this.alpha, 0.0f);
        float[] fArr = this.bravo;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.charlie.reset();
    }

    public final void charlie(float f5) {
        Matrix matrix = this.charlie;
        matrix.reset();
        matrix.setRotate(f5);
        matrix.mapPoints(this.alpha);
        matrix.mapPoints(this.bravo);
    }

    public final void delta(float f5) {
        float[] fArr = this.alpha;
        fArr[0] = fArr[0] * 1.0f;
        fArr[1] = fArr[1] * f5;
        float[] fArr2 = this.bravo;
        fArr2[0] = fArr2[0] * 1.0f;
        fArr2[1] = fArr2[1] * f5;
    }

    public final void echo(float f5) {
        float[] fArr = this.alpha;
        fArr[0] = fArr[0] + f5;
        fArr[1] = fArr[1] + 0.0f;
    }

    public s(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[2];
        this.alpha = fArr3;
        float[] fArr4 = new float[2];
        this.bravo = fArr4;
        System.arraycopy(fArr, 0, fArr3, 0, 2);
        System.arraycopy(fArr2, 0, fArr4, 0, 2);
        this.charlie = new Matrix();
    }
}
