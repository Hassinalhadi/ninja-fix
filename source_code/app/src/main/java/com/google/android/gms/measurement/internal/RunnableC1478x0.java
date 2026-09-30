package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1478x0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1480y0 purple;

    public /* synthetic */ RunnableC1478x0(C1480y0 c1480y0, int i4) {
        this.alpha = i4;
        this.purple = c1480y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C1480y0 c1480y0 = this.purple;
                c1480y0.teal = c1480y0.f7691c;
                return;
            default:
                this.purple.f7691c = null;
                return;
        }
    }
}
