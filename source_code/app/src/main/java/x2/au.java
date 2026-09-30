package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class au extends AnimatorListenerAdapter implements x {
    public final ViewGroup alpha;
    public final View bravo;
    public final View charlie;
    public boolean delta = true;
    public final /* synthetic */ aw echo;

    public au(aw awVar, ViewGroup viewGroup, View view, View view2) {
        this.echo = awVar;
        this.alpha = viewGroup;
        this.bravo = view;
        this.charlie = view2;
    }

    public final void alpha() {
        this.charlie.setTag(R.id.save_overlay_view, null);
        this.alpha.getOverlay().remove(this.bravo);
        this.delta = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        alpha();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.alpha.getOverlay().remove(this.bravo);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.bravo;
        if (view.getParent() == null) {
            this.alpha.getOverlay().add(view);
        } else {
            this.echo.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z2) {
        if (z2) {
            View view = this.charlie;
            View view2 = this.bravo;
            view.setTag(R.id.save_overlay_view, view2);
            this.alpha.getOverlay().add(view2);
            this.delta = true;
        }
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
        if (this.delta) {
            alpha();
        }
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        zVar.azure(this);
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar, boolean z2) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        alpha();
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
        onTransitionEnd(zVar);
    }
}
