package O6;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes2.dex */
public final class c {
    public final /* synthetic */ int alpha;

    public static float alpha(float f5, float f10, float f11) {
        if (f5 < f10) {
            return f10;
        }
        if (f5 > f11) {
            return f11;
        }
        return f5;
    }

    public static int bravo(int i4, int i5, int i10) {
        if (i4 < i5) {
            return i5;
        }
        if (i4 > i10) {
            return i10;
        }
        return i4;
    }

    public final ViewPropertyAnimator charlie(int i4, View view) {
        switch (this.alpha) {
            case 0:
                return view.animate().translationY(i4);
            case 1:
                return view.animate().translationX(-i4);
            default:
                return view.animate().translationX(i4);
        }
    }
}
