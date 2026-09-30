package a7;

import ae.C0423b;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import delivery.samurai.android.R;

/* renamed from: a7.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0415j extends AbstractC0406a {
    public final float golf;
    public final float hotel;
    public final float india;

    public C0415j(View view) {
        super(view);
        Resources resources = view.getResources();
        this.golf = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.hotel = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.india = resources.getDimension(R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    public final void alpha() {
        if (this.foxtrot == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        C0423b c0423b = this.foxtrot;
        this.foxtrot = null;
        if (c0423b == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.bravo;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f));
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i4), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.echo);
        animatorSet.start();
    }

    public final void bravo(C0423b c0423b, int i4, AnimatorListenerAdapter animatorListenerAdapter, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        boolean z2;
        boolean z10;
        int i5;
        if (c0423b.delta == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.bravo;
        if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        float scaleX = view.getScaleX() * view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (z10) {
                i5 = marginLayoutParams.leftMargin;
            } else {
                i5 = marginLayoutParams.rightMargin;
            }
        } else {
            i5 = 0;
        }
        float f5 = scaleX + i5;
        Property property = View.TRANSLATION_X;
        if (z10) {
            f5 = -f5;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, f5);
        if (animatorUpdateListener != null) {
            ofFloat.addUpdateListener(animatorUpdateListener);
        }
        ofFloat.setInterpolator(new P1.a(1));
        ofFloat.setDuration(M6.a.charlie(this.charlie, this.delta, c0423b.charlie));
        ofFloat.addListener(new C0414i(this, z2, i4));
        ofFloat.addListener(animatorListenerAdapter);
        ofFloat.start();
    }

    public final void charlie(float f5, boolean z2, int i4) {
        boolean z10;
        float f10;
        float f11;
        float f12;
        float interpolation = this.alpha.getInterpolation(f5);
        View view = this.bravo;
        boolean z11 = true;
        if ((Gravity.getAbsoluteGravity(i4, view.getLayoutDirection()) & 3) == 3) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z2 != z10) {
            z11 = false;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        float f13 = width;
        if (f13 > 0.0f) {
            float f14 = height;
            if (f14 > 0.0f) {
                float f15 = this.golf / f13;
                float f16 = this.hotel / f13;
                float f17 = this.india / f14;
                if (z10) {
                    f13 = 0.0f;
                }
                view.setPivotX(f13);
                if (!z11) {
                    f16 = -f15;
                }
                float alpha = M6.a.alpha(0.0f, f16, interpolation);
                float f18 = alpha + 1.0f;
                float alpha2 = 1.0f - M6.a.alpha(0.0f, f17, interpolation);
                if (!Float.isNaN(f18) && !Float.isNaN(alpha2)) {
                    view.setScaleX(f18);
                    view.setScaleY(alpha2);
                    if (view instanceof ViewGroup) {
                        ViewGroup viewGroup = (ViewGroup) view;
                        for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                            View childAt = viewGroup.getChildAt(i5);
                            if (z10) {
                                f10 = childAt.getWidth() + (width - childAt.getRight());
                            } else {
                                f10 = -childAt.getLeft();
                            }
                            childAt.setPivotX(f10);
                            childAt.setPivotY(-childAt.getTop());
                            if (z11) {
                                f11 = 1.0f - alpha;
                            } else {
                                f11 = 1.0f;
                            }
                            if (alpha2 != 0.0f) {
                                f12 = (f18 / alpha2) * f11;
                            } else {
                                f12 = 1.0f;
                            }
                            if (!Float.isNaN(f11) && !Float.isNaN(f12)) {
                                childAt.setScaleX(f11);
                                childAt.setScaleY(f12);
                            }
                        }
                    }
                }
            }
        }
    }
}
