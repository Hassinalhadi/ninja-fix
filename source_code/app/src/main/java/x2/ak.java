package x2;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class ak {
    public static int alpha(ViewGroup viewGroup, int i4) {
        return viewGroup.getChildDrawingOrder(i4);
    }

    public static void bravo(ViewGroup viewGroup, boolean z2) {
        viewGroup.suppressLayout(z2);
    }
}
