package com.incognia.internal;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class Nkf {

    /* renamed from: W, reason: collision with root package name */
    public final long f9246W;

    /* renamed from: b, reason: collision with root package name */
    public final W6 f9247b;
    public Object sVU = null;

    /* renamed from: f9, reason: collision with root package name */
    public long f9248f9 = 0;

    public Nkf(W6 w62, long j5) {
        this.f9247b = w62;
        this.f9246W = j5;
    }

    public final void b(Object obj) {
        this.f9247b.getClass();
        this.f9248f9 = SystemClock.elapsedRealtime();
        this.sVU = obj;
    }

    public final boolean b() {
        if (this.sVU == null) {
            return true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j5 = this.f9248f9;
        return elapsedRealtime < j5 || elapsedRealtime - j5 >= this.f9246W;
    }
}
