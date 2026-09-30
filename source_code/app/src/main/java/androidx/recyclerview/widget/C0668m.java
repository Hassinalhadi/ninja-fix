package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0668m extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ f0 bravo;
    public final /* synthetic */ View charlie;
    public final /* synthetic */ ViewPropertyAnimator delta;
    public final /* synthetic */ r echo;

    public C0668m(r rVar, f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.echo = rVar;
        this.bravo = f0Var;
        this.delta = viewPropertyAnimator;
        this.charlie = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.alpha) {
            case 1:
                this.charlie.setAlpha(1.0f);
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
                this.delta.setListener(null);
                this.charlie.setAlpha(1.0f);
                r rVar = this.echo;
                f0 f0Var = this.bravo;
                rVar.dispatchRemoveFinished(f0Var);
                rVar.mRemoveAnimations.remove(f0Var);
                rVar.dispatchFinishedWhenDone();
                return;
            default:
                this.delta.setListener(null);
                r rVar2 = this.echo;
                f0 f0Var2 = this.bravo;
                rVar2.dispatchAddFinished(f0Var2);
                rVar2.mAddAnimations.remove(f0Var2);
                rVar2.dispatchFinishedWhenDone();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 0:
                this.echo.dispatchRemoveStarting(this.bravo);
                return;
            default:
                this.echo.dispatchAddStarting(this.bravo);
                return;
        }
    }

    public C0668m(r rVar, f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.echo = rVar;
        this.bravo = f0Var;
        this.charlie = view;
        this.delta = viewPropertyAnimator;
    }
}
