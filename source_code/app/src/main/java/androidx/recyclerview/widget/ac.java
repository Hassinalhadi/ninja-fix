package androidx.recyclerview.widget;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class ac implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ad alpha;

    public ac(ad adVar) {
        this.alpha = adVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        ad adVar = this.alpha;
        adVar.charlie.setAlpha(floatValue);
        adVar.delta.setAlpha(floatValue);
        adVar.sierra.invalidate();
    }
}
