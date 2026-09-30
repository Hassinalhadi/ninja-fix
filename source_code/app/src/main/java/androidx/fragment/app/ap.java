package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import s1.ViewTreeObserverOnPreDrawListenerC2589w;

/* loaded from: classes3.dex */
public final class ap extends AnimationSet implements Runnable {
    public final ViewGroup alpha;
    public final View purple;
    public boolean red;
    public boolean silver;
    public boolean teal;

    public ap(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.teal = true;
        this.alpha = viewGroup;
        this.purple = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation) {
        this.teal = true;
        if (this.red) {
            return !this.silver;
        }
        if (!super.getTransformation(j5, transformation)) {
            this.red = true;
            ViewTreeObserverOnPreDrawListenerC2589w.alpha(this.alpha, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2 = this.red;
        ViewGroup viewGroup = this.alpha;
        if (!z2 && this.teal) {
            this.teal = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.purple);
            this.silver = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j5, Transformation transformation, float f5) {
        this.teal = true;
        if (this.red) {
            return !this.silver;
        }
        if (!super.getTransformation(j5, transformation, f5)) {
            this.red = true;
            ViewTreeObserverOnPreDrawListenerC2589w.alpha(this.alpha, this);
        }
        return true;
    }
}
