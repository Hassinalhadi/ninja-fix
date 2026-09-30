package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0670o extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0671p bravo;
    public final /* synthetic */ ViewPropertyAnimator charlie;
    public final /* synthetic */ View delta;
    public final /* synthetic */ r echo;

    public /* synthetic */ C0670o(r rVar, C0671p c0671p, ViewPropertyAnimator viewPropertyAnimator, View view, int i4) {
        this.alpha = i4;
        this.echo = rVar;
        this.bravo = c0671p;
        this.charlie = viewPropertyAnimator;
        this.delta = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 0:
                this.charlie.setListener(null);
                View view = this.delta;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                C0671p c0671p = this.bravo;
                f0 f0Var = c0671p.alpha;
                r rVar = this.echo;
                rVar.dispatchChangeFinished(f0Var, true);
                rVar.mChangeAnimations.remove(c0671p.alpha);
                rVar.dispatchFinishedWhenDone();
                return;
            default:
                this.charlie.setListener(null);
                View view2 = this.delta;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                C0671p c0671p2 = this.bravo;
                f0 f0Var2 = c0671p2.bravo;
                r rVar2 = this.echo;
                rVar2.dispatchChangeFinished(f0Var2, false);
                rVar2.mChangeAnimations.remove(c0671p2.bravo);
                rVar2.dispatchFinishedWhenDone();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 0:
                this.echo.dispatchChangeStarting(this.bravo.alpha, true);
                return;
            default:
                this.echo.dispatchChangeStarting(this.bravo.bravo, false);
                return;
        }
    }
}
