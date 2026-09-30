package androidx.viewpager.widget;

import android.view.animation.Interpolator;

/* loaded from: classes3.dex */
public final class b implements Interpolator {
    public final /* synthetic */ int alpha;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f5) {
        switch (this.alpha) {
            case 0:
                float f10 = f5 - 1.0f;
                return (f10 * f10 * f10 * f10 * f10) + 1.0f;
            default:
                float f11 = f5 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
