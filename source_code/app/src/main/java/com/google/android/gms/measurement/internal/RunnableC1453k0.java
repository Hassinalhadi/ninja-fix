package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1453k0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AtomicReference purple;
    public final /* synthetic */ C1459n0 red;

    public /* synthetic */ RunnableC1453k0(C1459n0 c1459n0, AtomicReference atomicReference, int i4) {
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
                    atomicReference.set(g2.yellow.i0(g2.india().c0(), ac.plum));
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
                            atomicReference.set(Double.valueOf(g2.yellow.b0(g2.india().c0(), ac.silver)));
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
