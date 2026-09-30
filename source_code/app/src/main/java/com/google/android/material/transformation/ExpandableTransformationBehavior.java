package com.google.android.material.transformation;

import O6.b;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes2.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {
    public AnimatorSet purple;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void echo(View view, View view2, boolean z2, boolean z10) {
        boolean z11;
        AnimatorSet animatorSet = this.purple;
        if (animatorSet != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            animatorSet.cancel();
        }
        AnimatorSet foxtrot = foxtrot(view, view2, z2, z11);
        this.purple = foxtrot;
        foxtrot.addListener(new b(11, this));
        this.purple.start();
        if (!z10) {
            this.purple.end();
        }
    }

    public abstract AnimatorSet foxtrot(View view, View view2, boolean z2, boolean z10);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
