package t0;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* renamed from: t0.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2890H implements InterfaceC2888F {
    public static final C2890H alpha = new Object();

    @Override // t0.InterfaceC2888F
    public final Rect alpha(Activity activity) {
        int i4;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i4 = resources.getDimensionPixelSize(identifier);
            } else {
                i4 = 0;
            }
            int i5 = rect.bottom + i4;
            if (i5 == point.y) {
                rect.bottom = i5;
                return rect;
            }
            int i10 = rect.right + i4;
            if (i10 == point.x) {
                rect.right = i10;
            }
        }
        return rect;
    }
}
