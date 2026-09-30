package ae;

import android.app.ActivityOptions;
import android.content.Context;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ae.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0422a {
    public static Context alpha(int i4, Context context) {
        return context.createDeviceContext(i4);
    }

    public static AccessibilityNodeInfo.AccessibilityAction bravo() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float charlie(VelocityTracker velocityTracker, int i4) {
        return velocityTracker.getAxisVelocity(i4);
    }

    public static void delta(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence echo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int foxtrot(Context context) {
        return context.getDeviceId();
    }

    public static int golf(Context context) {
        return context.getDeviceId();
    }

    public static int hotel(ViewConfiguration viewConfiguration, int i4, int i5, int i10) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i10);
    }

    public static int india(ViewConfiguration viewConfiguration, int i4, int i5, int i10) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i10);
    }

    public static boolean juliet(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean kilo(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float lima(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static void mike(AccessibilityEvent accessibilityEvent, boolean z2) {
        accessibilityEvent.setAccessibilityDataSensitive(z2);
    }

    public static void november(AccessibilityNodeInfo accessibilityNodeInfo, boolean z2) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z2);
    }

    public static void oscar(TextView textView, int i4, float f5) {
        textView.setLineHeight(i4, f5);
    }

    public static void papa(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static int quebec(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float romeo(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float sierra(BackEvent backEvent) {
        Intrinsics.echo(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
