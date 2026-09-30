package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public abstract class F implements Runnable {
    public final long alpha;
    public final long purple;
    public final boolean red;
    public final /* synthetic */ J silver;

    public F(J j5, boolean z2) {
        this.silver = j5;
        j5.bravo.getClass();
        this.alpha = System.currentTimeMillis();
        j5.bravo.getClass();
        this.purple = SystemClock.elapsedRealtime();
        this.red = z2;
    }

    public abstract void alpha();

    public void bravo() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        J j5 = this.silver;
        if (j5.golf) {
            bravo();
            return;
        }
        try {
            alpha();
        } catch (Exception e) {
            j5.alpha(e, false, this.red);
            bravo();
        }
    }
}
