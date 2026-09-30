package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import delivery.samurai.android.R;

/* renamed from: x2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3285f extends AnimatorListenerAdapter implements x {
    public final View alpha;
    public boolean bravo = false;

    public C3285f(View view) {
        this.alpha = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        al.alpha.bravo(this.alpha, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.alpha;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.bravo = true;
            view.setLayerType(2, null);
        }
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
        float f5;
        View view = this.alpha;
        if (view.getVisibility() == 0) {
            f5 = al.alpha.alpha(view);
        } else {
            f5 = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f5));
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
        this.alpha.setTag(R.id.transition_pause_alpha, null);
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
        boolean z10 = this.bravo;
        View view = this.alpha;
        if (z10) {
            view.setLayerType(0, null);
        }
        if (z2) {
            return;
        }
        ar arVar = al.alpha;
        arVar.bravo(view, 1.0f);
        arVar.getClass();
    }
}
