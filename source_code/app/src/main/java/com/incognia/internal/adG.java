package com.incognia.internal;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class adG {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f10107b = new AtomicReference(null);

    /* renamed from: W, reason: collision with root package name */
    public static final AtomicReference f10106W = new AtomicReference(null);

    public static void b() {
        long startUptimeMillis;
        if (Build.VERSION.SDK_INT >= 24) {
            AtomicReference atomicReference = f10107b;
            long uptimeMillis = SystemClock.uptimeMillis();
            startUptimeMillis = Process.getStartUptimeMillis();
            Long valueOf = Long.valueOf(uptimeMillis - startUptimeMillis);
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        AtomicReference atomicReference2 = f10106W;
        Long valueOf2 = Long.valueOf(System.currentTimeMillis());
        while (!atomicReference2.compareAndSet(null, valueOf2) && atomicReference2.get() == null) {
        }
    }
}
