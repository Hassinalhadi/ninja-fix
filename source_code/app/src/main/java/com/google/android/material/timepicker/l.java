package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes2.dex */
public final class l extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ TimePickerView alpha;

    public l(TimePickerView timePickerView) {
        this.alpha = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        int i4 = TimePickerView.f8265k;
        this.alpha.getClass();
        return false;
    }
}
