package m7;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: m7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2107b extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean alpha;
    public final /* synthetic */ View bravo;
    public final /* synthetic */ View charlie;

    public C2107b(boolean z2, View view, View view2) {
        this.alpha = z2;
        this.bravo = view;
        this.charlie = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.alpha) {
            this.bravo.setVisibility(4);
            View view = this.charlie;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.alpha) {
            this.bravo.setVisibility(0);
            View view = this.charlie;
            view.setAlpha(0.0f);
            view.setVisibility(4);
        }
    }
}
