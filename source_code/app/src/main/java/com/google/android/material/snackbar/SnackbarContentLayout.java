package com.google.android.material.snackbar;

import M6.a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import delivery.samurai.android.R;
import x2.q;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView alpha;
    public Button purple;
    public final TimeInterpolator red;
    public int silver;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.red = q.foxtrot(context, R.attr.motionEasingEmphasizedInterpolator, a.bravo);
    }

    public final boolean alpha(int i4, int i5, int i10) {
        boolean z2;
        if (i4 != getOrientation()) {
            setOrientation(i4);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.alpha.getPaddingTop() == i5 && this.alpha.getPaddingBottom() == i10) {
            return z2;
        }
        TextView textView = this.alpha;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i10);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i10);
        return true;
    }

    public Button getActionView() {
        return this.purple;
    }

    public TextView getMessageView() {
        return this.alpha;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.alpha = (TextView) findViewById(R.id.snackbar_text);
        this.purple = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        boolean z2;
        super.onMeasure(i4, i5);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.alpha.getLayout();
            if (layout != null && layout.getLineCount() > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.silver > 0 && this.purple.getMeasuredWidth() > this.silver) {
                if (!alpha(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z2) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!alpha(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i4, i5);
        }
    }

    public void setMaxInlineActionWidth(int i4) {
        this.silver = i4;
    }
}
