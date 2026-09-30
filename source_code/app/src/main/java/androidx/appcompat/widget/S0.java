package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g1.AbstractC1735d;
import j1.AbstractC1928b;

/* loaded from: classes3.dex */
public abstract class S0 {
    public static final ThreadLocal alpha = new ThreadLocal();
    public static final int[] bravo = {-16842910};
    public static final int[] charlie = {R.attr.state_focused};
    public static final int[] delta = {R.attr.state_pressed};
    public static final int[] echo = {R.attr.state_checked};
    public static final int[] foxtrot = new int[0];
    public static final int[] golf = new int[1];

    public static void alpha(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(aj.a.juliet);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int bravo(int i4, Context context) {
        ColorStateList delta2 = delta(i4, context);
        if (delta2 != null && delta2.isStateful()) {
            return delta2.getColorForState(bravo, delta2.getDefaultColor());
        }
        ThreadLocal threadLocal = alpha;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f5 = typedValue.getFloat();
        return AbstractC1928b.delta(charlie(i4, context), Math.round(Color.alpha(r4) * f5));
    }

    public static int charlie(int i4, Context context) {
        int[] iArr = golf;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList delta(int i4, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = golf;
        iArr[0] = i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC1735d.charlie(resourceId, context)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
