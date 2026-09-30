package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import o9.ViewOnTouchListenerC2201a;

/* loaded from: classes2.dex */
public final class f implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object bravo;

    public /* synthetic */ f(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.alpha) {
            case 0:
                ((CollapsingToolbarLayout) this.bravo).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 1:
                ((TextInputLayout) this.bravo).f8208p0.amber(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                ((TabLayout) this.bravo).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            default:
                ViewOnTouchListenerC2201a viewOnTouchListenerC2201a = (ViewOnTouchListenerC2201a) this.bravo;
                viewOnTouchListenerC2201a.white.invoke(Float.valueOf(viewOnTouchListenerC2201a.silver.getTranslationY()), Integer.valueOf(viewOnTouchListenerC2201a.alpha));
                return;
        }
    }
}
