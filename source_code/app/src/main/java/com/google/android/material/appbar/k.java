package com.google.android.material.appbar;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import s1.a0;

/* loaded from: classes2.dex */
public abstract class k extends l {
    private int overlayTop;
    final Rect tempRect1;
    final Rect tempRect2;
    private int verticalLayoutGap;

    public k() {
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }

    public abstract View findFirstDependency(List list);

    public final int getOverlapPixelsForOffset(View view) {
        if (this.overlayTop == 0) {
            return 0;
        }
        float overlapRatioForOffset = getOverlapRatioForOffset(view);
        int i4 = this.overlayTop;
        return O6.c.bravo((int) (overlapRatioForOffset * i4), 0, i4);
    }

    public abstract float getOverlapRatioForOffset(View view);

    public final int getOverlayTop() {
        return this.overlayTop;
    }

    public final int getVerticalLayoutGap() {
        return this.verticalLayoutGap;
    }

    @Override // com.google.android.material.appbar.l
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.getDependencies(view));
        if (findFirstDependency != null) {
            androidx.coordinatorlayout.widget.f fVar = (androidx.coordinatorlayout.widget.f) view.getLayoutParams();
            Rect rect = this.tempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, findFirstDependency.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((findFirstDependency.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
            a0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.bravo() + rect.left;
                rect.right -= lastWindowInsets.charlie();
            }
            Rect rect2 = this.tempRect2;
            int i5 = fVar.charlie;
            if (i5 == 0) {
                i5 = 8388659;
            }
            Gravity.apply(i5, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.verticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        coordinatorLayout.onLayoutChild(view, i4);
        this.verticalLayoutGap = 0;
    }

    public final void setOverlayTop(int i4) {
        this.overlayTop = i4;
    }

    public boolean shouldHeaderOverlapScrollingChild() {
        return false;
    }

    public k(int i4) {
        super(0);
        this.tempRect1 = new Rect();
        this.tempRect2 = new Rect();
        this.verticalLayoutGap = 0;
    }
}
