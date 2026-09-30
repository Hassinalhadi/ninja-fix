package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class E implements ThreadFactory {
    public final ThreadFactory alpha = Executors.defaultThreadFactory();

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.alpha.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
