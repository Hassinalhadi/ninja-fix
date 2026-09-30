package com.incognia.internal;

import android.os.HandlerThread;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public abstract class TVm {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicInteger f9677b = new AtomicInteger(1);

    public static HandlerThread b(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        HandlerThread handlerThread = new HandlerThread("ibgnd-" + f9677b.getAndIncrement());
        handlerThread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        handlerThread.start();
        return handlerThread;
    }
}
