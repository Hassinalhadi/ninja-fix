package X6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.recyclerview.widget.ad;

/* loaded from: classes2.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public boolean bravo;
    public final /* synthetic */ Object charlie;

    public e(View view, boolean z2) {
        this.alpha = 2;
        this.bravo = z2;
        this.charlie = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.alpha) {
            case 1:
                this.bravo = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 0:
                i iVar = (i) this.charlie;
                iVar.romeo = 0;
                iVar.mike = null;
                return;
            case 1:
                if (this.bravo) {
                    this.bravo = false;
                    return;
                }
                ad adVar = (ad) this.charlie;
                if (((Float) adVar.zulu.getAnimatedValue()).floatValue() == 0.0f) {
                    adVar.amber = 0;
                    adVar.delta(0);
                    return;
                } else {
                    adVar.amber = 2;
                    adVar.sierra.invalidate();
                    return;
                }
            default:
                if (!this.bravo) {
                    ((View) this.charlie).setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 0:
                i iVar = (i) this.charlie;
                iVar.sierra.alpha(0, this.bravo);
                iVar.romeo = 2;
                iVar.mike = animator;
                return;
            case 1:
            default:
                super.onAnimationStart(animator);
                return;
            case 2:
                if (this.bravo) {
                    ((View) this.charlie).setVisibility(0);
                    return;
                }
                return;
        }
    }

    public e(ad adVar) {
        this.alpha = 1;
        this.charlie = adVar;
        this.bravo = false;
    }

    public e(i iVar, boolean z2) {
        this.alpha = 0;
        this.charlie = iVar;
        this.bravo = z2;
    }
}
