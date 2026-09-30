package zendesk.classic.messaging.ui;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
class ValueAnimators {
    private ValueAnimators() {
    }

    public static ValueAnimator bottomPaddingAnimator(View view, int i4, int i5, long j5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, ofInt) { // from class: zendesk.classic.messaging.ui.ValueAnimators.2
            final int paddingLeft;
            final int paddingRight;
            final int paddingTop;
            final /* synthetic */ ValueAnimator val$valueAnimator;
            final /* synthetic */ View val$view;

            {
                this.val$view = view;
                this.val$valueAnimator = ofInt;
                this.paddingLeft = view.getPaddingLeft();
                this.paddingRight = view.getPaddingRight();
                this.paddingTop = view.getPaddingTop();
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.val$view.setPadding(this.paddingLeft, this.paddingTop, this.paddingRight, ((Integer) this.val$valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(j5);
        return ofInt;
    }

    public static ValueAnimator minHeightAnimator(final View view, int i4, int i5, long j5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.classic.messaging.ui.ValueAnimators.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setMinimumHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        });
        ofInt.setDuration(j5);
        return ofInt;
    }

    public static ValueAnimator sideMarginsAnimator(final View view, int i4, int i5, long j5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.classic.messaging.ui.ValueAnimators.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                marginLayoutParams.leftMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                marginLayoutParams.rightMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration(j5);
        return ofInt;
    }

    public static ValueAnimator topMarginAnimator(final View view, int i4, int i5, long j5) {
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zendesk.classic.messaging.ui.ValueAnimators.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                marginLayoutParams.topMargin = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                view.requestLayout();
            }
        });
        ofInt.setDuration(j5);
        return ofInt;
    }

    public static ValueAnimator topPaddingAnimator(View view, int i4, int i5, long j5) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i4, i5);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(view, ofInt) { // from class: zendesk.classic.messaging.ui.ValueAnimators.1
            final int paddingBottom;
            final int paddingLeft;
            final int paddingRight;
            final /* synthetic */ ValueAnimator val$valueAnimator;
            final /* synthetic */ View val$view;

            {
                this.val$view = view;
                this.val$valueAnimator = ofInt;
                this.paddingLeft = view.getPaddingLeft();
                this.paddingRight = view.getPaddingRight();
                this.paddingBottom = view.getPaddingBottom();
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.val$view.setPadding(this.paddingLeft, ((Integer) this.val$valueAnimator.getAnimatedValue()).intValue(), this.paddingRight, this.paddingBottom);
            }
        });
        ofInt.setDuration(j5);
        return ofInt;
    }
}
