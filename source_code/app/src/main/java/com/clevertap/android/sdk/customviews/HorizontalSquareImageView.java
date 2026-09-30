package com.clevertap.android.sdk.customviews;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class HorizontalSquareImageView extends ImageView {
    public HorizontalSquareImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int measuredHeight = getMeasuredHeight();
        setMeasuredDimension(measuredHeight, measuredHeight);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HorizontalSquareImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
