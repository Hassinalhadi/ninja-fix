package k7;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes2.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ View bravo;
    public final /* synthetic */ f charlie;

    public e(f fVar, View view, View view2) {
        this.charlie = fVar;
        this.alpha = view;
        this.bravo = view2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.charlie.charlie(this.alpha, this.bravo, valueAnimator.getAnimatedFraction());
    }
}
