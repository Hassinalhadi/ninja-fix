package X6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class d extends AnimatorListenerAdapter {
    public boolean alpha;
    public final /* synthetic */ boolean bravo;
    public final /* synthetic */ i charlie;

    public d(i iVar, boolean z2) {
        this.charlie = iVar;
        this.bravo = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.alpha = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i4;
        i iVar = this.charlie;
        iVar.romeo = 0;
        iVar.mike = null;
        if (!this.alpha) {
            boolean z2 = this.bravo;
            if (z2) {
                i4 = 8;
            } else {
                i4 = 4;
            }
            iVar.sierra.alpha(i4, z2);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        i iVar = this.charlie;
        iVar.sierra.alpha(0, this.bravo);
        iVar.romeo = 1;
        iVar.mike = animator;
        this.alpha = false;
    }
}
