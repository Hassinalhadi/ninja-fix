package t1;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import g.C1718a;
import java.util.List;

/* renamed from: t1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2953e extends AccessibilityNodeProvider {
    public final C1718a alpha;

    public C2953e(C1718a c1718a) {
        this.alpha = c1718a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i4) {
        C2952d romeo = this.alpha.romeo(i4);
        if (romeo == null) {
            return null;
        }
        return romeo.alpha;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i4) {
        this.alpha.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i4) {
        C2952d victor = this.alpha.victor(i4);
        if (victor == null) {
            return null;
        }
        return victor.alpha;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i4, int i5, Bundle bundle) {
        return this.alpha.blue(i4, i5, bundle);
    }
}
