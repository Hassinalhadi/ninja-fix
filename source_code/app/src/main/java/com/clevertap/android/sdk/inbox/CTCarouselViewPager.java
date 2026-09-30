package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class CTCarouselViewPager extends ViewPager {
    public CTCarouselViewPager(Context context) {
        super(context);
    }

    private int measureHeight(int i4, View view) {
        int i5;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode == 1073741824) {
            return size;
        }
        if (view != null) {
            i5 = view.getMeasuredHeight();
        } else {
            i5 = 0;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i5, size);
        }
        return i5;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i4, int i5) {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        if (i10 != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    public CTCarouselViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
