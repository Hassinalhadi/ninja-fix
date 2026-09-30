package com.google.mlkit.common.sdkinternal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class n {
    public boolean bravo;
    public final Object alpha = new Object();
    public final ArrayDeque charlie = new ArrayDeque();
    public final AtomicReference delta = new AtomicReference();

    public final void alpha(Runnable runnable, Executor executor) {
        synchronized (this.alpha) {
            try {
                if (this.bravo) {
                    this.charlie.add(new t(runnable, executor));
                } else {
                    this.bravo = true;
                    charlie(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void bravo() {
        synchronized (this.alpha) {
            try {
                if (this.charlie.isEmpty()) {
                    this.bravo = false;
                    return;
                }
                t tVar = (t) this.charlie.remove();
                charlie(tVar.bravo, tVar.alpha);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void charlie(Runnable runnable, Executor executor) {
        try {
            executor.execute(new be.g(17, this, runnable));
        } catch (RejectedExecutionException unused) {
            bravo();
        }
    }
}
