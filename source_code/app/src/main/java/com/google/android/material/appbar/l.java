package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class l extends androidx.coordinatorlayout.widget.c {
    private m viewOffsetHelper;
    private int tempTopBottomOffset = 0;
    private int tempLeftRightOffset = 0;

    public l() {
    }

    public int getLeftAndRightOffset() {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            return mVar.echo;
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            return mVar.delta;
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        m mVar = this.viewOffsetHelper;
        if (mVar != null && mVar.golf) {
            return true;
        }
        return false;
    }

    public boolean isVerticalOffsetEnabled() {
        m mVar = this.viewOffsetHelper;
        if (mVar != null && mVar.foxtrot) {
            return true;
        }
        return false;
    }

    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        coordinatorLayout.onLayoutChild(view, i4);
    }

    @Override // androidx.coordinatorlayout.widget.c
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i4) {
        layoutChild(coordinatorLayout, view, i4);
        if (this.viewOffsetHelper == null) {
            this.viewOffsetHelper = new m(view);
        }
        m mVar = this.viewOffsetHelper;
        View view2 = mVar.alpha;
        mVar.bravo = view2.getTop();
        mVar.charlie = view2.getLeft();
        this.viewOffsetHelper.alpha();
        int i5 = this.tempTopBottomOffset;
        if (i5 != 0) {
            this.viewOffsetHelper.bravo(i5);
            this.tempTopBottomOffset = 0;
        }
        int i10 = this.tempLeftRightOffset;
        if (i10 != 0) {
            m mVar2 = this.viewOffsetHelper;
            if (mVar2.golf && mVar2.echo != i10) {
                mVar2.echo = i10;
                mVar2.alpha();
            }
            this.tempLeftRightOffset = 0;
            return true;
        }
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z2) {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            mVar.golf = z2;
        }
    }

    public boolean setLeftAndRightOffset(int i4) {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            if (!mVar.golf || mVar.echo == i4) {
                return false;
            }
            mVar.echo = i4;
            mVar.alpha();
            return true;
        }
        this.tempLeftRightOffset = i4;
        return false;
    }

    public boolean setTopAndBottomOffset(int i4) {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            return mVar.bravo(i4);
        }
        this.tempTopBottomOffset = i4;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z2) {
        m mVar = this.viewOffsetHelper;
        if (mVar != null) {
            mVar.foxtrot = z2;
        }
    }

    public l(int i4) {
    }
}
