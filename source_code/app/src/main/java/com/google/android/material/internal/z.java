package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import delivery.samurai.android.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class z {
    public static final int[] alpha = {R.attr.colorPrimary};
    public static final int[] bravo = {R.attr.colorPrimaryVariant};
    public static final Sb.k charlie = new Sb.k(14);

    public static void alpha(Context context, AttributeSet attributeSet, int i4, int i5) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.magenta, i4, i5);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                charlie(context, bravo, "Theme.MaterialComponents");
            }
        }
        charlie(context, alpha, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void bravo(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L6.a.magenta, i4, i5);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
            for (int i10 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i10, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z2 = true;
            obtainStyledAttributes.recycle();
            if (!z2) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static void charlie(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (!obtainStyledAttributes.hasValue(i4)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(ao.ad.gray("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static float delta(int i4, Context context) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    public static Rect echo(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            bounds = currentWindowMetrics.getBounds();
            return bounds;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        rect.right = point.x;
        rect.bottom = point.y;
        return rect;
    }

    public static ArrayList foxtrot(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < materialToolbar.getChildCount(); i4++) {
            View childAt = materialToolbar.getChildAt(i4);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TypedArray golf(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5, int... iArr2) {
        alpha(context, attributeSet, i4, i5);
        bravo(context, attributeSet, iArr, i4, i5, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
    }

    public static PorterDuff.Mode hotel(int i4, PorterDuff.Mode mode) {
        if (i4 != 3) {
            if (i4 != 5) {
                if (i4 != 9) {
                    switch (i4) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
