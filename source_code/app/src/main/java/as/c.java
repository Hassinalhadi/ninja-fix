package as;

import android.app.ActivityOptions;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes3.dex */
public abstract class c {
    public static int alpha(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    public static int bravo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    public static CharSequence charlie(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    public static boolean delta(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    public static void echo(ActivityOptions activityOptions, boolean z2) {
        activityOptions.setAllowPassThroughOnTouchOutside(z2);
    }
}
