package com.google.android.material.divider;

import L6.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.z;
import delivery.samurai.android.R;
import g7.i;
import l7.AbstractC2059a;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public class MaterialDivider extends View {
    public final i alpha;
    public int purple;
    public int red;
    public int silver;
    public int teal;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.materialDividerStyle, 2132083944), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.alpha = new i();
        TypedArray golf = z.golf(context2, attributeSet, a.amber, R.attr.materialDividerStyle, 2132083944, new int[0]);
        this.purple = golf.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.silver = golf.getDimensionPixelOffset(2, 0);
        this.teal = golf.getDimensionPixelOffset(1, 0);
        setDividerColor(AbstractC2719n0.alpha(context2, golf, 0).getDefaultColor());
        golf.recycle();
    }

    public int getDividerColor() {
        return this.red;
    }

    public int getDividerInsetEnd() {
        return this.teal;
    }

    public int getDividerInsetStart() {
        return this.silver;
    }

    public int getDividerThickness() {
        return this.purple;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i4;
        int width;
        int i5;
        super.onDraw(canvas);
        boolean z2 = true;
        if (getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            i4 = this.teal;
        } else {
            i4 = this.silver;
        }
        if (z2) {
            width = getWidth();
            i5 = this.silver;
        } else {
            width = getWidth();
            i5 = this.teal;
        }
        int i10 = width - i5;
        i iVar = this.alpha;
        iVar.setBounds(i4, 0, i10, getBottom() - getTop());
        iVar.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i5);
        int measuredHeight = getMeasuredHeight();
        if (mode != Integer.MIN_VALUE && mode != 0) {
            return;
        }
        int i10 = this.purple;
        if (i10 > 0 && measuredHeight != i10) {
            measuredHeight = i10;
        }
        setMeasuredDimension(getMeasuredWidth(), measuredHeight);
    }

    public void setDividerColor(int i4) {
        if (this.red != i4) {
            this.red = i4;
            this.alpha.quebec(ColorStateList.valueOf(i4));
            invalidate();
        }
    }

    public void setDividerColorResource(int i4) {
        setDividerColor(getContext().getColor(i4));
    }

    public void setDividerInsetEnd(int i4) {
        this.teal = i4;
    }

    public void setDividerInsetEndResource(int i4) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerInsetStart(int i4) {
        this.silver = i4;
    }

    public void setDividerInsetStartResource(int i4) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i4));
    }

    public void setDividerThickness(int i4) {
        if (this.purple != i4) {
            this.purple = i4;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i4) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i4));
    }
}
