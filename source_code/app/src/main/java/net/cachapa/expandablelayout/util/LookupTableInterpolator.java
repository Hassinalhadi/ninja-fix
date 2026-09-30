package net.cachapa.expandablelayout.util;

import Q0.c;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
abstract class LookupTableInterpolator implements Interpolator {
    private final float mStepSize;
    private final float[] mValues;

    public LookupTableInterpolator(float[] fArr) {
        this.mValues = fArr;
        this.mStepSize = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f5) {
        if (f5 >= 1.0f) {
            return 1.0f;
        }
        if (f5 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.mValues;
        int min = Math.min((int) ((fArr.length - 1) * f5), fArr.length - 2);
        float f10 = this.mStepSize;
        float f11 = (f5 - (min * f10)) / f10;
        float[] fArr2 = this.mValues;
        float f12 = fArr2[min];
        return c.lima(fArr2[min + 1], f12, f11, f12);
    }
}
