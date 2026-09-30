package be;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: be.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0756b extends C0758d implements Runnable {
    public InterfaceC0755a red;
    public final LinkedBlockingQueue silver = new LinkedBlockingQueue(1);
    public final CountDownLatch teal = new CountDownLatch(1);
    public com.google.common.util.concurrent.e white;
    public volatile com.google.common.util.concurrent.e yellow;

    public RunnableC0756b(InterfaceC0755a interfaceC0755a, com.google.common.util.concurrent.e eVar) {
        this.red = interfaceC0755a;
        eVar.getClass();
        this.white = eVar;
    }

    public static Object bravo(LinkedBlockingQueue linkedBlockingQueue) {
        Object take;
        boolean z2 = false;
        while (true) {
            try {
                take = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return take;
    }

    @Override // be.C0758d, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        boolean z10 = false;
        if (!this.alpha.cancel(z2)) {
            return false;
        }
        while (true) {
            try {
                this.silver.put(Boolean.valueOf(z2));
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        com.google.common.util.concurrent.e eVar = this.white;
        if (eVar != null) {
            eVar.cancel(z2);
        }
        com.google.common.util.concurrent.e eVar2 = this.yellow;
        if (eVar2 != null) {
            eVar2.cancel(z2);
        }
        return true;
    }

    @Override // be.C0758d, java.util.concurrent.Future
    public final Object get() {
        if (!this.alpha.isDone()) {
            com.google.common.util.concurrent.e eVar = this.white;
            if (eVar != null) {
                eVar.get();
            }
            this.teal.await();
            com.google.common.util.concurrent.e eVar2 = this.yellow;
            if (eVar2 != null) {
                eVar2.get();
            }
        }
        return this.alpha.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.e, be.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.e, be.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.common.util.concurrent.e, be.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r02;
        ?? r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        r03 = 0;
        try {
            try {
                try {
                    try {
                        try {
                            com.google.common.util.concurrent.e apply = this.red.apply(h.bravo(this.white));
                            this.yellow = apply;
                            if (this.alpha.isCancelled()) {
                                apply.cancel(((Boolean) bravo(this.silver)).booleanValue());
                                this.yellow = null;
                            } else {
                                apply.foxtrot(new g(8, this, apply, false), tg.k.bravo());
                            }
                        } catch (Exception e) {
                            V0.h hVar = this.purple;
                            r02 = r03;
                            if (hVar != null) {
                                hVar.delta(e);
                                r02 = r03;
                            }
                        }
                    } catch (Error e4) {
                        V0.h hVar2 = this.purple;
                        r02 = r03;
                        if (hVar2 != null) {
                            hVar2.delta(e4);
                            r02 = r03;
                        }
                    }
                } finally {
                    this.red = r03;
                    this.white = r03;
                    this.teal.countDown();
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e5) {
                Throwable cause = e5.getCause();
                V0.h hVar3 = this.purple;
                if (hVar3 != null) {
                    hVar3.delta(cause);
                }
            }
        } catch (UndeclaredThrowableException e10) {
            Throwable cause2 = e10.getCause();
            V0.h hVar4 = this.purple;
            r02 = r03;
            if (hVar4 != null) {
                hVar4.delta(cause2);
                r02 = r03;
            }
        }
    }

    @Override // be.C0758d, java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        if (!this.alpha.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j5 = timeUnit2.convert(j5, timeUnit);
                timeUnit = timeUnit2;
            }
            com.google.common.util.concurrent.e eVar = this.white;
            if (eVar != null) {
                long nanoTime = System.nanoTime();
                eVar.get(j5, timeUnit);
                j5 -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.teal.await(j5, timeUnit)) {
                j5 -= Math.max(0L, System.nanoTime() - nanoTime2);
                com.google.common.util.concurrent.e eVar2 = this.yellow;
                if (eVar2 != null) {
                    eVar2.get(j5, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.alpha.get(j5, timeUnit);
    }
}
