package a7;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;

/* renamed from: a7.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0413h extends AbstractC0406a {
    public final float golf;
    public final float hotel;

    public C0413h(View view) {
        super(view);
        Resources resources = view.getResources();
        this.golf = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.hotel = resources.getDimension(R.dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet alpha() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.bravo;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new P1.a(1));
        return animatorSet;
    }

    public final void bravo(float f5) {
        float f10;
        float interpolation = this.alpha.getInterpolation(f5);
        View view = this.bravo;
        float width = view.getWidth();
        float height = view.getHeight();
        if (width > 0.0f && height > 0.0f) {
            float f11 = this.golf / width;
            float f12 = this.hotel / height;
            float alpha = 1.0f - M6.a.alpha(0.0f, f11, interpolation);
            float alpha2 = 1.0f - M6.a.alpha(0.0f, f12, interpolation);
            if (!Float.isNaN(alpha) && !Float.isNaN(alpha2)) {
                view.setScaleX(alpha);
                view.setPivotY(height);
                view.setScaleY(alpha2);
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                        View childAt = viewGroup.getChildAt(i4);
                        childAt.setPivotY(-childAt.getTop());
                        if (alpha2 != 0.0f) {
                            f10 = alpha / alpha2;
                        } else {
                            f10 = 1.0f;
                        }
                        childAt.setScaleY(f10);
                    }
                }
            }
        }
    }
}
