package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ BottomSheetBehavior alpha;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.alpha = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g7.i iVar = this.alpha.f7877b;
        if (iVar != null) {
            iVar.romeo(floatValue);
        }
    }
}
