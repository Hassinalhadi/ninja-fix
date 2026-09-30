package U0;

import F.B0;
import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class o {
    public static OnBackInvokedDispatcher alpha(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        Intrinsics.delta(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
        return onBackInvokedDispatcher;
    }

    public static Object bravo(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList charlie(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static androidx.camera.core.t delta(androidx.camera.camera2.internal.compat.j jVar) {
        Long l10 = (Long) jVar.alpha(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
        if (l10 != null) {
            return (androidx.camera.core.t) aw.b.alpha.get(l10);
        }
        return null;
    }

    public static String echo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean foxtrot(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void golf(z zVar, B0 b02) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (av.q.kilo(b02) && (findOnBackInvokedDispatcher = zVar.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, b02);
        }
    }

    public static final void hotel(z zVar, B0 b02) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (av.q.kilo(b02) && (findOnBackInvokedDispatcher = zVar.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(b02);
        }
    }

    public static void india(Object dispatcher, Object callback) {
        Intrinsics.echo(dispatcher, "dispatcher");
        Intrinsics.echo(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) callback);
    }

    public static void juliet(Object dispatcher, Object callback) {
        Intrinsics.echo(dispatcher, "dispatcher");
        Intrinsics.echo(callback, "callback");
        ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
    }
}
