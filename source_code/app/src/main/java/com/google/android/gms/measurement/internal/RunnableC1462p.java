package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1462p implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ AbstractC1479y red;

    public /* synthetic */ RunnableC1462p(AbstractC1479y abstractC1479y, long j5, int i4) {
        this.alpha = i4;
        this.purple = j5;
        this.red = abstractC1479y;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ((C1464q) this.red).c0(this.purple);
                return;
            default:
                C1480y0 c1480y0 = (C1480y0) this.red;
                C1464q c1464q = ((G) c1480y0.alpha).f7514j;
                G.charlie(c1464q);
                c1464q.Z(this.purple);
                c1480y0.teal = null;
                return;
        }
    }
}
