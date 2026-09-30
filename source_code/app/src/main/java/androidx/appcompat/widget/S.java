package androidx.appcompat.widget;

import android.R;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes3.dex */
public abstract class S {
    public static final int[] alpha = {R.attr.state_checked};
    public static final int[] bravo = new int[0];

    static {
        new Rect();
    }

    public static void alpha(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29 && i4 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(bravo);
            } else {
                drawable.setState(alpha);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode bravo(int i4, PorterDuff.Mode mode) {
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
