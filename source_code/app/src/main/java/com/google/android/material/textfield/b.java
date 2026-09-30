package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes2.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ c bravo;

    public /* synthetic */ b(c cVar, int i4) {
        this.alpha = i4;
        this.bravo = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.alpha) {
            case 1:
                this.bravo.bravo.hotel(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.alpha) {
            case 0:
                this.bravo.bravo.hotel(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
