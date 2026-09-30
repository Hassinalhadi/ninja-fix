package androidx.appcompat.widget;

import android.transition.Transition;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0470n0 {
    public static void alpha(PopupWindow popupWindow, Transition transition) {
        popupWindow.setEnterTransition(transition);
    }

    public static void bravo(PopupWindow popupWindow, Transition transition) {
        popupWindow.setExitTransition(transition);
    }
}
