package net.cachapa.expandablelayout;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import net.cachapa.expandablelayout.util.FastOutSlowInInterpolator;

/* loaded from: classes2.dex */
public class ExpandableLayout extends FrameLayout {
    private static final int DEFAULT_DURATION = 300;
    public static final int HORIZONTAL = 0;
    public static final String KEY_EXPANSION = "expansion";
    public static final String KEY_SUPER_STATE = "super_state";
    public static final int VERTICAL = 1;
    private ValueAnimator animator;
    private int duration;
    private float expansion;
    private Interpolator interpolator;
    private OnExpansionUpdateListener listener;
    private int orientation;
    private float parallax;
    private int state;

    /* loaded from: classes2.dex */
    public class ExpansionListener implements Animator.AnimatorListener {
        private boolean canceled;
        private int targetExpansion;

        public ExpansionListener(int i4) {
            this.targetExpansion = i4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.canceled = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i4;
            if (!this.canceled) {
                ExpandableLayout expandableLayout = ExpandableLayout.this;
                if (this.targetExpansion == 0) {
                    i4 = 0;
                } else {
                    i4 = 3;
                }
                expandableLayout.state = i4;
                ExpandableLayout.this.setExpansion(this.targetExpansion);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            int i4;
            ExpandableLayout expandableLayout = ExpandableLayout.this;
            if (this.targetExpansion == 0) {
                i4 = 1;
            } else {
                i4 = 2;
            }
            expandableLayout.state = i4;
        }
    }

    /* loaded from: classes2.dex */
    public interface OnExpansionUpdateListener {
        void onExpansionUpdate(float f5, int i4);
    }

    /* loaded from: classes2.dex */
    public interface State {
        public static final int COLLAPSED = 0;
        public static final int COLLAPSING = 1;
        public static final int EXPANDED = 3;
        public static final int EXPANDING = 2;
    }

    public ExpandableLayout(Context context) {
        this(context, null);
    }

    private void animateSize(int i4) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.animator = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.expansion, i4);
        this.animator = ofFloat;
        ofFloat.setInterpolator(this.interpolator);
        this.animator.setDuration(this.duration);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: net.cachapa.expandablelayout.ExpandableLayout.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ExpandableLayout.this.setExpansion(((Float) valueAnimator2.getAnimatedValue()).floatValue());
            }
        });
        this.animator.addListener(new ExpansionListener(i4));
        this.animator.start();
    }

    public void collapse() {
        collapse(true);
    }

    public void expand() {
        expand(true);
    }

    public int getDuration() {
        return this.duration;
    }

    public float getExpansion() {
        return this.expansion;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public float getParallax() {
        return this.parallax;
    }

    public int getState() {
        return this.state;
    }

    public boolean isExpanded() {
        int i4 = this.state;
        if (i4 != 2 && i4 != 3) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        super.onConfigurationChanged(configuration);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i10;
        int i11;
        super.onMeasure(i4, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.orientation == 0) {
            i10 = measuredWidth;
        } else {
            i10 = measuredHeight;
        }
        if (this.expansion == 0.0f && i10 == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        setVisibility(i11);
        int round = i10 - Math.round(i10 * this.expansion);
        float f5 = this.parallax;
        if (f5 > 0.0f) {
            float f10 = round * f5;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (this.orientation == 0) {
                    int i13 = 1;
                    if (getLayoutDirection() != 1) {
                        i13 = -1;
                    }
                    childAt.setTranslationX(i13 * f10);
                } else {
                    childAt.setTranslationY(-f10);
                }
            }
        }
        if (this.orientation == 0) {
            setMeasuredDimension(measuredWidth - round, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredHeight - round);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i4;
        Bundle bundle = (Bundle) parcelable;
        float f5 = bundle.getFloat(KEY_EXPANSION);
        this.expansion = f5;
        if (f5 == 1.0f) {
            i4 = 3;
        } else {
            i4 = 0;
        }
        this.state = i4;
        super.onRestoreInstanceState(bundle.getParcelable(KEY_SUPER_STATE));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        float f5;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        if (isExpanded()) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        this.expansion = f5;
        bundle.putFloat(KEY_EXPANSION, f5);
        bundle.putParcelable(KEY_SUPER_STATE, onSaveInstanceState);
        return bundle;
    }

    public void setDuration(int i4) {
        this.duration = i4;
    }

    public void setExpanded(boolean z2) {
        setExpanded(z2, true);
    }

    public void setExpansion(float f5) {
        float f10 = this.expansion;
        if (f10 != f5) {
            float f11 = f5 - f10;
            int i4 = 0;
            if (f5 == 0.0f) {
                this.state = 0;
            } else if (f5 == 1.0f) {
                this.state = 3;
            } else if (f11 < 0.0f) {
                this.state = 1;
            } else if (f11 > 0.0f) {
                this.state = 2;
            }
            if (this.state == 0) {
                i4 = 8;
            }
            setVisibility(i4);
            this.expansion = f5;
            requestLayout();
            OnExpansionUpdateListener onExpansionUpdateListener = this.listener;
            if (onExpansionUpdateListener != null) {
                onExpansionUpdateListener.onExpansionUpdate(f5, this.state);
            }
        }
    }

    public void setInterpolator(Interpolator interpolator) {
        this.interpolator = interpolator;
    }

    public void setOnExpansionUpdateListener(OnExpansionUpdateListener onExpansionUpdateListener) {
        this.listener = onExpansionUpdateListener;
    }

    public void setOrientation(int i4) {
        if (i4 >= 0 && i4 <= 1) {
            this.orientation = i4;
            return;
        }
        throw new IllegalArgumentException("Orientation must be either 0 (horizontal) or 1 (vertical)");
    }

    public void setParallax(float f5) {
        this.parallax = Math.min(1.0f, Math.max(0.0f, f5));
    }

    public void toggle() {
        toggle(true);
    }

    public ExpandableLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.duration = 300;
        this.interpolator = new FastOutSlowInInterpolator();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ExpandableLayout);
            this.duration = obtainStyledAttributes.getInt(R.styleable.ExpandableLayout_el_duration, 300);
            this.expansion = obtainStyledAttributes.getBoolean(R.styleable.ExpandableLayout_el_expanded, false) ? 1.0f : 0.0f;
            this.orientation = obtainStyledAttributes.getInt(R.styleable.ExpandableLayout_android_orientation, 1);
            this.parallax = obtainStyledAttributes.getFloat(R.styleable.ExpandableLayout_el_parallax, 1.0f);
            obtainStyledAttributes.recycle();
            this.state = this.expansion != 0.0f ? 3 : 0;
            setParallax(this.parallax);
        }
    }

    public void collapse(boolean z2) {
        setExpanded(false, z2);
    }

    public void expand(boolean z2) {
        setExpanded(true, z2);
    }

    public void setExpanded(boolean z2, boolean z10) {
        if (z2 == isExpanded()) {
            return;
        }
        if (z10) {
            animateSize(z2 ? 1 : 0);
        } else {
            setExpansion(z2 ? 1.0f : 0.0f);
        }
    }

    public void toggle(boolean z2) {
        if (isExpanded()) {
            collapse(z2);
        } else {
            expand(z2);
        }
    }
}
