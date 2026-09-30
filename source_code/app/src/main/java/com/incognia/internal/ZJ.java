package com.incognia.internal;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ZJ implements d7p {

    /* renamed from: W, reason: collision with root package name */
    public final AtomicInteger f10037W = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f10038b;

    public ZJ(Runnable runnable) {
        this.f10038b = runnable;
    }

    @Override // com.incognia.internal.d7p
    public final void run() {
        if (!this.f10037W.compareAndSet(0, 1)) {
            return;
        }
        try {
            this.f10038b.run();
        } finally {
            this.f10037W.set(2);
        }
    }
}
