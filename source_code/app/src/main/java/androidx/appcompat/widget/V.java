package androidx.appcompat.widget;

import android.widget.AbsListView;

/* loaded from: classes3.dex */
public abstract class V {
    public static boolean alpha(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void bravo(AbsListView absListView, boolean z2) {
        absListView.setSelectedChildViewEnabled(z2);
    }
}
