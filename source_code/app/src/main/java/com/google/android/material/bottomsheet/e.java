package com.google.android.material.bottomsheet;

import T5.o;
import y1.C3391d;

/* loaded from: classes2.dex */
public final class e implements Runnable {
    public final /* synthetic */ o alpha;

    public e(o oVar) {
        this.alpha = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o oVar = this.alpha;
        oVar.bravo = false;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) oVar.echo;
        C3391d c3391d = bottomSheetBehavior.f7858H;
        if (c3391d != null && c3391d.golf()) {
            oVar.charlie(oVar.charlie);
        } else if (bottomSheetBehavior.f7857G == 2) {
            bottomSheetBehavior.tango(oVar.charlie);
        }
    }
}
