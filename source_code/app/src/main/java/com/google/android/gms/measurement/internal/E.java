package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class E extends P {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLong f7502d = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: a, reason: collision with root package name */
    public final B f7503a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7504b;

    /* renamed from: c, reason: collision with root package name */
    public final Semaphore f7505c;
    public D red;
    public D silver;
    public final PriorityBlockingQueue teal;
    public final LinkedBlockingQueue white;
    public final B yellow;

    public E(G g2) {
        super(g2);
        this.f7504b = new Object();
        this.f7505c = new Semaphore(2);
        this.teal = new PriorityBlockingQueue();
        this.white = new LinkedBlockingQueue();
        this.yellow = new B(this, "Thread death: Uncaught exception on worker thread");
        this.f7503a = new B(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // G3.a
    public final void W() {
        if (Thread.currentThread() == this.red) {
        } else {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // com.google.android.gms.measurement.internal.P
    public final boolean X() {
        return false;
    }

    public final void a0() {
        if (Thread.currentThread() == this.silver) {
        } else {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object b0(AtomicReference atomicReference, long j5, String str, Runnable runnable) {
        synchronized (atomicReference) {
            E e = ((G) this.alpha).f7508c;
            G.foxtrot(e);
            e.g0(runnable);
            try {
                atomicReference.wait(j5);
            } catch (InterruptedException unused) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.alpha("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            ar arVar2 = ((G) this.alpha).f7507b;
            G.foxtrot(arVar2);
            arVar2.f7632b.alpha("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final C c0(Callable callable) {
        Y();
        C c3 = new C(this, callable, false);
        if (Thread.currentThread() == this.red) {
            if (!this.teal.isEmpty()) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.alpha("Callable skipped the worker queue.");
            }
            c3.run();
            return c3;
        }
        j0(c3);
        return c3;
    }

    public final C d0(Callable callable) {
        Y();
        C c3 = new C(this, callable, true);
        if (Thread.currentThread() == this.red) {
            c3.run();
            return c3;
        }
        j0(c3);
        return c3;
    }

    public final void e0() {
        if (Thread.currentThread() != this.red) {
        } else {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void f0(Runnable runnable) {
        Y();
        C c3 = new C(this, runnable, false, "Task exception on network thread");
        synchronized (this.f7504b) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.white;
                linkedBlockingQueue.add(c3);
                D d4 = this.silver;
                if (d4 == null) {
                    D d9 = new D(this, "Measurement Network", linkedBlockingQueue);
                    this.silver = d9;
                    d9.setUncaughtExceptionHandler(this.f7503a);
                    this.silver.start();
                } else {
                    d4.alpha();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g0(Runnable runnable) {
        Y();
        V5.x.hotel(runnable);
        j0(new C(this, runnable, false, "Task exception on worker thread"));
    }

    public final void h0(Runnable runnable) {
        Y();
        j0(new C(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean i0() {
        if (Thread.currentThread() == this.red) {
            return true;
        }
        return false;
    }

    public final void j0(C c3) {
        synchronized (this.f7504b) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.teal;
                priorityBlockingQueue.add(c3);
                D d4 = this.red;
                if (d4 == null) {
                    D d9 = new D(this, "Measurement Worker", priorityBlockingQueue);
                    this.red = d9;
                    d9.setUncaughtExceptionHandler(this.yellow);
                    this.red.start();
                } else {
                    d4.alpha();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
