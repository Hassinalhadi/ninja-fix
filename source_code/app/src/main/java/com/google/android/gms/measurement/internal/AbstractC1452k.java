package com.google.android.gms.measurement.internal;

import android.os.Handler;

/* renamed from: com.google.android.gms.measurement.internal.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1452k {
    public static volatile com.google.android.gms.internal.measurement.ai delta;
    public final Q alpha;
    public final com.google.common.util.concurrent.d bravo;
    public volatile long charlie;

    public AbstractC1452k(Q q4) {
        V5.x.hotel(q4);
        this.alpha = q4;
        this.bravo = new com.google.common.util.concurrent.d(8, this, q4, false);
    }

    public final void alpha() {
        this.charlie = 0L;
        delta().removeCallbacks(this.bravo);
    }

    public abstract void bravo();

    public final void charlie(long j5) {
        alpha();
        if (j5 >= 0) {
            Q q4 = this.alpha;
            q4.pink().getClass();
            this.charlie = System.currentTimeMillis();
            if (!delta().postDelayed(this.bravo, j5)) {
                q4.crimson().white.bravo(Long.valueOf(j5), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler delta() {
        com.google.android.gms.internal.measurement.ai aiVar;
        if (delta != null) {
            return delta;
        }
        synchronized (AbstractC1452k.class) {
            try {
                if (delta == null) {
                    delta = new com.google.android.gms.internal.measurement.ai(this.alpha.green().getMainLooper(), 0);
                }
                aiVar = delta;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aiVar;
    }
}
