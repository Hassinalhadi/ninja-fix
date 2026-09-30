package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1455l0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ V purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ C1459n0 teal;

    public /* synthetic */ RunnableC1455l0(C1459n0 c1459n0, V v4, long j5, boolean z2, int i4) {
        this.alpha = i4;
        this.purple = v4;
        this.red = j5;
        this.silver = z2;
        this.teal = c1459n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                V v4 = this.purple;
                C1459n0 c1459n0 = this.teal;
                c1459n0.o0(v4);
                C1459n0.a0(c1459n0, v4, this.red, this.silver);
                return;
            default:
                V v6 = this.purple;
                C1459n0 c1459n02 = this.teal;
                c1459n02.o0(v6);
                C1459n0.a0(c1459n02, v6, this.red, this.silver);
                return;
        }
    }
}
