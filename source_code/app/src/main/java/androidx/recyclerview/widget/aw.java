package androidx.recyclerview.widget;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class aw implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        float f10 = f5 - 1.0f;
        return (f10 * f10 * f10 * f10 * f10) + 1.0f;
    }
}
