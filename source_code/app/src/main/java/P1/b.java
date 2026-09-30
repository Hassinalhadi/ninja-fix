package P1;

import Q0.c;
import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public abstract class b implements Interpolator {
    public final float[] alpha;
    public final float bravo;

    public b(float[] fArr) {
        this.alpha = fArr;
        this.bravo = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.alpha;
        int min = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f10 = this.bravo;
        float f11 = (f5 - (min * f10)) / f10;
        float f12 = fArr[min];
        return c.lima(fArr[min + 1], f12, f11, f12);
    }
}
