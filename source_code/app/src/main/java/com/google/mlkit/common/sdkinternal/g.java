package com.google.mlkit.common.sdkinternal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.measurement.ai;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class g {
    public static final Object bravo = new Object();
    public static g charlie;
    public final ai alpha;

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Handler, com.google.android.gms.internal.measurement.ai] */
    public g(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.alpha = handler;
    }

    public static g alpha() {
        g gVar;
        synchronized (bravo) {
            try {
                if (charlie == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    charlie = new g(handlerThread.getLooper());
                }
                gVar = charlie;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static G6.q bravo(Callable callable) {
        G6.h hVar = new G6.h();
        p.alpha.execute(new com.google.common.util.concurrent.d(13, callable, hVar));
        return hVar.alpha;
    }
}
