package v2;

import android.graphics.drawable.ShapeDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3165a extends ImageView {
    public Animation.AnimationListener alpha;

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.alpha;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.alpha;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i4) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i4);
        }
    }
}
