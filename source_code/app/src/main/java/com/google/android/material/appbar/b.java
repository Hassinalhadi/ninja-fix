package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes2.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout alpha;
    public final /* synthetic */ AppBarLayout bravo;
    public final /* synthetic */ AppBarLayout.BaseBehavior charlie;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.charlie = baseBehavior;
        this.alpha = coordinatorLayout;
        this.bravo = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.charlie.golf(this.alpha, this.bravo, intValue);
    }
}
