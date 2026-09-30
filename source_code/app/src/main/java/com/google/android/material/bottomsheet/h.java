package com.google.android.material.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import s1.C2569b;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class h extends C2569b {
    public final /* synthetic */ l delta;

    public h(l lVar) {
        this.delta = lVar;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.delta.cancelable) {
            c2952d.alpha(1048576);
            accessibilityNodeInfo.setDismissable(true);
        } else {
            accessibilityNodeInfo.setDismissable(false);
        }
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        if (i4 == 1048576) {
            l lVar = this.delta;
            if (lVar.cancelable) {
                lVar.cancel();
                return true;
            }
        }
        return super.golf(view, i4, bundle);
    }
}
