package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.j0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1451j0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AtomicReference purple;
    public final /* synthetic */ C1459n0 red;

    public /* synthetic */ RunnableC1451j0(C1459n0 c1459n0, AtomicReference atomicReference, int i4) {
        this.alpha = i4;
        this.purple = atomicReference;
        this.red = c1459n0;
    }

    private final void alpha() {
        AtomicReference atomicReference = this.purple;
        synchronized (atomicReference) {
            try {
                try {
                    G g2 = (G) this.red.alpha;
                    atomicReference.set(Boolean.valueOf(g2.yellow.j0(g2.india().c0(), ac.pink)));
                } finally {
                    this.purple.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                alpha();
                return;
            default:
                AtomicReference atomicReference = this.purple;
                synchronized (atomicReference) {
                    try {
                        try {
                            G g2 = (G) this.red.alpha;
                            atomicReference.set(Integer.valueOf(g2.yellow.c0(g2.india().c0(), ac.red)));
                        } finally {
                            this.purple.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
