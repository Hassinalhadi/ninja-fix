package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean alpha;
    public boolean purple;
    public int red;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.red = -1;
        int[] iArr = aj.a.kilo;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        s1.au.mike(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.alpha = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.alpha);
        }
    }

    private void setStacked(boolean z2) {
        int i4;
        int i5;
        if (this.purple != z2) {
            if (!z2 || this.alpha) {
                this.purple = z2;
                setOrientation(z2 ? 1 : 0);
                if (z2) {
                    i4 = 8388613;
                } else {
                    i4 = 80;
                }
                setGravity(i4);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z2) {
                        i5 = 8;
                    } else {
                        i5 = 4;
                    }
                    findViewById.setVisibility(i5);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i10;
        boolean z2;
        int i11;
        int size = View.MeasureSpec.getSize(i4);
        int i12 = 0;
        if (this.alpha) {
            if (size > this.red && this.purple) {
                setStacked(false);
            }
            this.red = size;
        }
        if (!this.purple && View.MeasureSpec.getMode(i4) == 1073741824) {
            i10 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z2 = true;
        } else {
            i10 = i4;
            z2 = false;
        }
        super.onMeasure(i10, i5);
        if (this.alpha && !this.purple && (getMeasuredWidthAndState() & ShapeBuilder.DEFAULT_SHAPE_COLOR) == 16777216) {
            setStacked(true);
            z2 = true;
        }
        if (z2) {
            super.onMeasure(i4, i5);
        }
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            i11 = -1;
            if (i13 < childCount) {
                if (getChildAt(i13).getVisibility() == 0) {
                    break;
                } else {
                    i13++;
                }
            } else {
                i13 = -1;
                break;
            }
        }
        if (i13 >= 0) {
            View childAt = getChildAt(i13);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.purple) {
                int i14 = i13 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i14 >= childCount2) {
                        break;
                    }
                    if (getChildAt(i14).getVisibility() == 0) {
                        i11 = i14;
                        break;
                    }
                    i14++;
                }
                if (i11 >= 0) {
                    i12 = getChildAt(i11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i12 = measuredHeight;
                }
            } else {
                i12 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = s1.au.alpha;
        if (getMinimumHeight() != i12) {
            setMinimumHeight(i12);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.alpha != z2) {
            this.alpha = z2;
            if (!z2 && this.purple) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
