package uk.co.samuelwall.materialtaptargetprompt;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ MaterialTapTargetPrompt bravo;

    public /* synthetic */ a(MaterialTapTargetPrompt materialTapTargetPrompt, int i4) {
        this.alpha = i4;
        this.bravo = materialTapTargetPrompt;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.alpha) {
            case 0:
                this.bravo.lambda$startIdleAnimations$5(valueAnimator);
                return;
            case 1:
                this.bravo.lambda$finish$2(valueAnimator);
                return;
            case 2:
                this.bravo.lambda$dismiss$3(valueAnimator);
                return;
            default:
                this.bravo.lambda$startRevealAnimation$4(valueAnimator);
                return;
        }
    }
}
