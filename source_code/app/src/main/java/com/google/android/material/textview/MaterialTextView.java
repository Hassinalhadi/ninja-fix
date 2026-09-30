package com.google.android.material.textview;

import L6.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import l7.AbstractC2059a;
import s6.AbstractC2710m0;
import s6.AbstractC2719n0;

/* loaded from: classes2.dex */
public class MaterialTextView extends AppCompatTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(AbstractC2059a.alpha(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        if (AbstractC2710m0.charlie(context2, delivery.samurai.android.R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.bronze;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i4 = -1;
            for (int i5 = 0; i5 < 2 && i4 < 0; i5++) {
                i4 = AbstractC2719n0.charlie(context2, obtainStyledAttributes, iArr2[i5], -1);
            }
            obtainStyledAttributes.recycle();
            if (i4 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a.blue);
                    Context context3 = getContext();
                    int[] iArr3 = {2, 4};
                    int i10 = -1;
                    for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                        i10 = AbstractC2719n0.charlie(context3, obtainStyledAttributes3, iArr3[i11], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i10 >= 0) {
                        setLineHeight(i10);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        if (AbstractC2710m0.charlie(context, delivery.samurai.android.R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i4, a.blue);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int i5 = -1;
            for (int i10 = 0; i10 < 2 && i5 < 0; i10++) {
                i5 = AbstractC2719n0.charlie(context2, obtainStyledAttributes, iArr[i10], -1);
            }
            obtainStyledAttributes.recycle();
            if (i5 >= 0) {
                setLineHeight(i5);
            }
        }
    }
}
