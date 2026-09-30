package androidx.legacy.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public class Space extends View {
    @Deprecated
    public Space(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (getVisibility() == 0) {
            setVisibility(4);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                suggestedMinimumWidth = size;
            }
        } else {
            suggestedMinimumWidth = Math.min(suggestedMinimumWidth, size);
        }
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                suggestedMinimumHeight = size2;
            }
        } else {
            suggestedMinimumHeight = Math.min(suggestedMinimumHeight, size2);
        }
        setMeasuredDimension(suggestedMinimumWidth, suggestedMinimumHeight);
    }
}
