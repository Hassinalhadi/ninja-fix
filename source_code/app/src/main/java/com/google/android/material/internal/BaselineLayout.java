package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public class BaselineLayout extends ViewGroup {
    public int alpha;
    public boolean purple;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.alpha = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.alpha;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        int i12;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i10 - i4) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.alpha != -1 && childAt.getBaseline() != -1) {
                    i12 = (this.alpha + paddingTop) - childAt.getBaseline();
                } else {
                    i12 = paddingTop;
                }
                childAt.layout(i14, i12, measuredWidth + i14, measuredHeight + i12);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        int i15 = -1;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                i10 = Math.max(i10, childAt.getMeasuredHeight());
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i14 = Math.max(i14, baseline);
                    i15 = Math.max(i15, childAt.getMeasuredHeight() - baseline);
                }
                i12 = Math.max(i12, childAt.getMeasuredWidth());
                i11 = Math.max(i11, childAt.getMeasuredHeight());
                i13 = View.combineMeasuredStates(i13, childAt.getMeasuredState());
            }
        }
        if (i14 != -1) {
            if (this.purple) {
                i11 = Math.max(i11, Math.max(i15, getPaddingBottom()) + i14);
            }
            this.alpha = i14;
        }
        if (!this.purple) {
            i11 = getPaddingBottom() + i10;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i12, getSuggestedMinimumWidth()), i4, i13), View.resolveSizeAndState(Math.max(i11, getSuggestedMinimumHeight()), i5, i13 << 16));
    }

    public void setMeasurePaddingFromBaseline(boolean z2) {
        this.purple = z2;
    }
}
