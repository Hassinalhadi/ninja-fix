package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ClockFaceView alpha;

    public b(ClockFaceView clockFaceView) {
        this.alpha = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.alpha;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f8245m.silver) - clockFaceView.f8253u;
        if (height != clockFaceView.f8268k) {
            clockFaceView.f8268k = height;
            clockFaceView.foxtrot();
            int i4 = clockFaceView.f8268k;
            ClockHandView clockHandView = clockFaceView.f8245m;
            clockHandView.e = i4;
            clockHandView.invalidate();
        }
        return true;
    }
}
