package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0669n extends AnimatorListenerAdapter {
    public final /* synthetic */ f0 alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ View charlie;
    public final /* synthetic */ int delta;
    public final /* synthetic */ ViewPropertyAnimator echo;
    public final /* synthetic */ r foxtrot;

    public C0669n(r rVar, f0 f0Var, int i4, View view, int i5, ViewPropertyAnimator viewPropertyAnimator) {
        this.foxtrot = rVar;
        this.alpha = f0Var;
        this.bravo = i4;
        this.charlie = view;
        this.delta = i5;
        this.echo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i4 = this.bravo;
        View view = this.charlie;
        if (i4 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.delta != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.echo.setListener(null);
        r rVar = this.foxtrot;
        f0 f0Var = this.alpha;
        rVar.dispatchMoveFinished(f0Var);
        rVar.mMoveAnimations.remove(f0Var);
        rVar.dispatchFinishedWhenDone();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.foxtrot.dispatchMoveStarting(this.alpha);
    }
}
