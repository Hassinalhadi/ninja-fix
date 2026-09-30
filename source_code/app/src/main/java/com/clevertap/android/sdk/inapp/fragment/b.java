package com.clevertap.android.sdk.inapp.fragment;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.textfield.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnTouchListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return CTInAppNativeFooterFragment.kilo((CTInAppNativeFooterFragment) this.purple, view, motionEvent);
            case 1:
                return CTInAppNativeHeaderFragment.juliet((CTInAppNativeHeaderFragment) this.purple, view, motionEvent);
            default:
                i iVar = (i) this.purple;
                iVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - iVar.oscar;
                    if (uptimeMillis >= 0 && uptimeMillis <= 300) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        iVar.mike = false;
                    }
                    iVar.uniform();
                    iVar.mike = true;
                    iVar.oscar = SystemClock.uptimeMillis();
                }
                return false;
        }
    }
}
