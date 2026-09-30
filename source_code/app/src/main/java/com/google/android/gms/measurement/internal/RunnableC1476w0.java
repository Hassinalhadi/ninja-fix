package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.w0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1476w0 implements Runnable {
    public final /* synthetic */ C1474v0 alpha;
    public final /* synthetic */ C1474v0 purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ C1480y0 teal;

    public RunnableC1476w0(C1480y0 c1480y0, C1474v0 c1474v0, C1474v0 c1474v02, long j5, boolean z2) {
        this.alpha = c1474v0;
        this.purple = c1474v02;
        this.red = j5;
        this.silver = z2;
        this.teal = c1480y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.teal.b0(this.alpha, this.purple, this.red, this.silver, null);
    }
}
