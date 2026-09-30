package i7;

import android.animation.ValueAnimator;

/* renamed from: i7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1896b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC1900f bravo;

    public /* synthetic */ C1896b(AbstractC1900f abstractC1900f, int i4) {
        this.alpha = i4;
        this.bravo = abstractC1900f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.alpha) {
            case 0:
                this.bravo.india.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                AbstractC1900f abstractC1900f = this.bravo;
                abstractC1900f.india.setScaleX(floatValue);
                abstractC1900f.india.setScaleY(floatValue);
                return;
            case 2:
                this.bravo.india.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            default:
                this.bravo.india.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
