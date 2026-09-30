package bc;

import android.content.Context;
import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.mlkit.vision.barcode.common.Barcode;

/* loaded from: classes3.dex */
public abstract class d {
    public static Context alpha(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon bravo(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String charlie(Context context) {
        return context.getAttributionTag();
    }

    public static CharSequence delta(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static Insets echo(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static void foxtrot(Window window, boolean z2) {
        int i4;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z2) {
            i4 = systemUiVisibility & (-257);
        } else {
            i4 = systemUiVisibility | Barcode.FORMAT_QR_CODE;
        }
        decorView.setSystemUiVisibility(i4);
        window.setDecorFitsSystemWindows(z2);
    }

    public static void golf(Window window, boolean z2) {
        window.setDecorFitsSystemWindows(z2);
    }

    public static void hotel(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void india(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
