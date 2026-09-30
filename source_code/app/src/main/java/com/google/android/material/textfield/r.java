package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import j1.AbstractC1928b;

/* loaded from: classes2.dex */
public final class r extends ArrayAdapter {
    public ColorStateList alpha;
    public ColorStateList purple;
    public final /* synthetic */ s red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, int i4, String[] strArr) {
        super(context, i4, strArr);
        this.red = sVar;
        alpha();
    }

    public final void alpha() {
        boolean z2;
        ColorStateList colorStateList;
        s sVar = this.red;
        ColorStateList colorStateList2 = sVar.e;
        if (colorStateList2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z2) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.purple = colorStateList;
        if (sVar.f8241d != 0 && sVar.e != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC1928b.bravo(sVar.e.getColorForState(iArr3, 0), sVar.f8241d), AbstractC1928b.bravo(sVar.e.getColorForState(iArr2, 0), sVar.f8241d), sVar.f8241d});
        }
        this.alpha = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i4, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.red;
            Drawable drawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText()) && sVar.f8241d != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(sVar.f8241d);
                if (this.purple != null) {
                    colorDrawable.setTintList(this.alpha);
                    drawable = new RippleDrawable(this.purple, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            textView.setBackground(drawable);
        }
        return view2;
    }
}
