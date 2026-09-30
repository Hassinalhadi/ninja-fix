package v2;

import android.animation.Animator;

/* renamed from: v2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3167c implements Animator.AnimatorListener {
    public final /* synthetic */ C3168d alpha;
    public final /* synthetic */ C3169e bravo;

    public C3167c(C3169e c3169e, C3168d c3168d) {
        this.bravo = c3169e;
        this.alpha = c3168d;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C3169e c3169e = this.bravo;
        C3168d c3168d = this.alpha;
        c3169e.alpha(1.0f, c3168d, true);
        c3168d.kilo = c3168d.echo;
        c3168d.lima = c3168d.foxtrot;
        c3168d.mike = c3168d.golf;
        c3168d.alpha((c3168d.juliet + 1) % c3168d.india.length);
        if (c3169e.white) {
            c3169e.white = false;
            animator.cancel();
            animator.setDuration(1332L);
            animator.start();
            if (c3168d.november) {
                c3168d.november = false;
                return;
            }
            return;
        }
        c3169e.teal += 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.bravo.teal = 0.0f;
    }
}
