package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.h0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1447h0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1459n0 f7664a;
    public final /* synthetic */ String alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ Bundle silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ boolean yellow;

    public RunnableC1447h0(C1459n0 c1459n0, String str, String str2, long j5, Bundle bundle, boolean z2, boolean z10, boolean z11) {
        this.alpha = str;
        this.purple = str2;
        this.red = j5;
        this.silver = bundle;
        this.teal = z2;
        this.white = z10;
        this.yellow = z11;
        this.f7664a = c1459n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7664a.j0(this.alpha, this.purple, this.red, this.silver, this.teal, this.white, this.yellow);
    }
}
