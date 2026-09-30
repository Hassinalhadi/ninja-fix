package androidx.camera.core.impl;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class S implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2944a = new Object();
    public final Executor alpha;
    public final az purple;
    public final AtomicReference silver;
    public final AtomicBoolean red = new AtomicBoolean(true);
    public Object teal = f2944a;
    public int white = -1;
    public boolean yellow = false;

    public S(AtomicReference atomicReference, Executor executor, az azVar) {
        this.silver = atomicReference;
        this.alpha = executor;
        this.purple = azVar;
    }

    public final void alpha(int i4) {
        synchronized (this) {
            try {
                if (!this.red.get()) {
                    return;
                }
                if (i4 <= this.white) {
                    return;
                }
                this.white = i4;
                if (this.yellow) {
                    return;
                }
                this.yellow = true;
                try {
                    this.alpha.execute(this);
                } catch (Throwable unused) {
                    synchronized (this) {
                        this.yellow = false;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.red.get()) {
                    this.yellow = false;
                    return;
                }
                Object obj = this.silver.get();
                int i4 = this.white;
                while (true) {
                    if (!Objects.equals(this.teal, obj)) {
                        this.teal = obj;
                        if (obj instanceof AbstractC0508f) {
                            az azVar = this.purple;
                            ((AbstractC0508f) obj).getClass();
                            azVar.onError(null);
                        } else {
                            this.purple.foxtrot(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i4 == this.white || !this.red.get()) {
                                break;
                            }
                            obj = this.silver.get();
                            i4 = this.white;
                        } finally {
                        }
                    }
                }
                this.yellow = false;
            } finally {
            }
        }
    }
}
