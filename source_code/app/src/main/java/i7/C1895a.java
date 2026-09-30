package i7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* renamed from: i7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1895a extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC1900f bravo;

    public /* synthetic */ C1895a(AbstractC1900f abstractC1900f, int i4) {
        this.alpha = i4;
        this.bravo = abstractC1900f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 0:
                this.bravo.charlie();
                return;
            case 1:
                this.bravo.delta();
                return;
            case 2:
                this.bravo.charlie();
                return;
            default:
                this.bravo.delta();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 1:
                AbstractC1900f abstractC1900f = this.bravo;
                SnackbarContentLayout snackbarContentLayout = abstractC1900f.juliet;
                int i4 = abstractC1900f.charlie;
                int i5 = abstractC1900f.alpha;
                int i10 = i4 - i5;
                snackbarContentLayout.alpha.setAlpha(0.0f);
                long j5 = i5;
                ViewPropertyAnimator duration = snackbarContentLayout.alpha.animate().alpha(1.0f).setDuration(j5);
                TimeInterpolator timeInterpolator = snackbarContentLayout.red;
                long j6 = i10;
                duration.setInterpolator(timeInterpolator).setStartDelay(j6).start();
                if (snackbarContentLayout.purple.getVisibility() == 0) {
                    snackbarContentLayout.purple.setAlpha(0.0f);
                    snackbarContentLayout.purple.animate().alpha(1.0f).setDuration(j5).setInterpolator(timeInterpolator).setStartDelay(j6).start();
                    return;
                }
                return;
            case 2:
                AbstractC1900f abstractC1900f2 = this.bravo;
                SnackbarContentLayout snackbarContentLayout2 = abstractC1900f2.juliet;
                snackbarContentLayout2.alpha.setAlpha(1.0f);
                ViewPropertyAnimator alpha = snackbarContentLayout2.alpha.animate().alpha(0.0f);
                long j7 = abstractC1900f2.bravo;
                ViewPropertyAnimator duration2 = alpha.setDuration(j7);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.red;
                long j10 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                if (snackbarContentLayout2.purple.getVisibility() == 0) {
                    snackbarContentLayout2.purple.setAlpha(1.0f);
                    snackbarContentLayout2.purple.animate().alpha(0.0f).setDuration(j7).setInterpolator(timeInterpolator2).setStartDelay(j10).start();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ C1895a(AbstractC1900f abstractC1900f, int i4, int i5) {
        this.alpha = i5;
        this.bravo = abstractC1900f;
    }
}
