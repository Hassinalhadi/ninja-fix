package s1;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class ap {
    public static CharSequence alpha(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean bravo(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean charlie(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void delta(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    public static void echo(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void foxtrot(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
