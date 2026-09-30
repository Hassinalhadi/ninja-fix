package x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public final class aj extends AnimatorListenerAdapter implements x {
    public final View alpha;
    public final View bravo;
    public int[] charlie;
    public float delta;
    public float echo;
    public final float foxtrot;
    public final float golf;
    public boolean hotel;

    public aj(View view, View view2, float f5, float f10) {
        this.bravo = view;
        this.alpha = view2;
        this.foxtrot = f5;
        this.golf = f10;
        int[] iArr = (int[]) view2.getTag(R.id.transition_position);
        this.charlie = iArr;
        if (iArr != null) {
            view2.setTag(R.id.transition_position, null);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.hotel = true;
        float f5 = this.foxtrot;
        View view = this.bravo;
        view.setTranslationX(f5);
        view.setTranslationY(this.golf);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z2) {
        if (z2) {
            return;
        }
        float f5 = this.foxtrot;
        View view = this.bravo;
        view.setTranslationX(f5);
        view.setTranslationY(this.golf);
    }

    @Override // x2.x
    public final void onTransitionCancel(z zVar) {
        this.hotel = true;
        float f5 = this.foxtrot;
        View view = this.bravo;
        view.setTranslationX(f5);
        view.setTranslationY(this.golf);
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionEnd(z zVar, boolean z2) {
        if (this.hotel) {
            return;
        }
        this.alpha.setTag(R.id.transition_position, null);
    }

    @Override // x2.x
    public final void onTransitionPause(z zVar) {
        if (this.charlie == null) {
            this.charlie = new int[2];
        }
        int[] iArr = this.charlie;
        View view = this.bravo;
        view.getLocationOnScreen(iArr);
        this.alpha.setTag(R.id.transition_position, this.charlie);
        this.delta = view.getTranslationX();
        this.echo = view.getTranslationY();
        view.setTranslationX(this.foxtrot);
        view.setTranslationY(this.golf);
    }

    @Override // x2.x
    public final void onTransitionResume(z zVar) {
        float f5 = this.delta;
        View view = this.bravo;
        view.setTranslationX(f5);
        view.setTranslationY(this.echo);
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar) {
        throw null;
    }

    @Override // x2.x
    public final void onTransitionStart(z zVar, boolean z2) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
