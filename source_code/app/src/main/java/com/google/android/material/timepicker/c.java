package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import delivery.samurai.android.R;
import s1.C2569b;
import s1.C2576i;
import t1.C2951c;
import t1.C2952d;

/* loaded from: classes2.dex */
public final class c extends C2569b {
    public final /* synthetic */ ClockFaceView delta;

    public c(ClockFaceView clockFaceView) {
        this.delta = clockFaceView;
    }

    @Override // s1.C2569b
    public final void delta(View view, C2952d c2952d) {
        View.AccessibilityDelegate accessibilityDelegate = this.alpha;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.delta.f8249q.get(intValue - 1));
        }
        c2952d.lima(C2576i.hotel(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        c2952d.bravo(C2951c.golf);
    }

    @Override // s1.C2569b
    public final boolean golf(View view, int i4, Bundle bundle) {
        if (i4 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.delta;
            view.getHitRect(clockFaceView.f8246n);
            float centerX = clockFaceView.f8246n.centerX();
            float centerY = clockFaceView.f8246n.centerY();
            clockFaceView.f8245m.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f8245m.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.golf(view, i4, bundle);
    }
}
