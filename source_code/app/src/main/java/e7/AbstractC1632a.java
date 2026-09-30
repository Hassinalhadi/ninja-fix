package e7;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import j1.AbstractC1928b;

/* renamed from: e7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1632a {
    public static final int[] alpha = {R.attr.state_pressed};
    public static final int[] bravo = {R.attr.state_focused};
    public static final int[] charlie = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] delta = {R.attr.state_selected};
    public static final int[] echo = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String foxtrot = AbstractC1632a.class.getSimpleName();

    public static int alpha(ColorStateList colorStateList, int[] iArr) {
        int i4;
        if (colorStateList != null) {
            i4 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i4 = 0;
        }
        return AbstractC1928b.delta(i4, Math.min(Color.alpha(i4) * 2, 255));
    }

    public static ColorStateList bravo(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(echo, 0)) != 0) {
                Log.w(foxtrot, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }
}
