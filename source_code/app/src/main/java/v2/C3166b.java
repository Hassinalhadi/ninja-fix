package v2;

import android.animation.ValueAnimator;

/* renamed from: v2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3166b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C3168d alpha;
    public final /* synthetic */ C3169e bravo;

    public C3166b(C3169e c3169e, C3168d c3168d) {
        this.bravo = c3169e;
        this.alpha = c3168d;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C3169e c3169e = this.bravo;
        c3169e.getClass();
        C3168d c3168d = this.alpha;
        C3169e.delta(floatValue, c3168d);
        c3169e.alpha(floatValue, c3168d, false);
        c3169e.invalidateSelf();
    }
}
