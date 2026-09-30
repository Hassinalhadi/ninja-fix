package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: androidx.appcompat.widget.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0456g0 {
    public static void alpha(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void bravo(PopupWindow popupWindow, boolean z2) {
        popupWindow.setIsClippedToScreen(z2);
    }
}
