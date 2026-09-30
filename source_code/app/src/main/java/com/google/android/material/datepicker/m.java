package com.google.android.material.datepicker;

/* loaded from: classes2.dex */
public final class m implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;

    public m(r rVar, int i4) {
        this.purple = rVar;
        this.alpha = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.purple.f7989c.smoothScrollToPosition(this.alpha);
    }
}
