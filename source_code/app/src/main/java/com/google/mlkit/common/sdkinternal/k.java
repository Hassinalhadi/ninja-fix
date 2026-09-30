package com.google.mlkit.common.sdkinternal;

import V5.x;
import com.google.android.gms.measurement.internal.H;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import s6.E;

/* loaded from: classes2.dex */
public abstract class k {
    private final AtomicInteger zza = new AtomicInteger(0);
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    protected final n taskQueue = new n();

    public <T> Task callAfterLoad(Executor executor, Callable<T> callable, G6.a aVar) {
        boolean z2;
        if (this.zza.get() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.kilo(z2);
        if (((G6.l) aVar).alpha.india()) {
            G6.q qVar = new G6.q();
            qVar.quebec();
            return qVar;
        }
        G6.b bVar = new G6.b();
        G6.h hVar = new G6.h(bVar.alpha);
        this.taskQueue.alpha(new H(this, aVar, bVar, callable, hVar, 3), new K2.i(executor, aVar, bVar, hVar));
        return hVar.alpha;
    }

    public boolean isLoaded() {
        return this.zzb.get();
    }

    public abstract void load();

    public void pin() {
        this.zza.incrementAndGet();
    }

    public abstract void release();

    public void unpin(Executor executor) {
        unpinWithTask(executor);
    }

    public Task unpinWithTask(Executor executor) {
        boolean z2;
        if (this.zza.get() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.kilo(z2);
        G6.h hVar = new G6.h();
        this.taskQueue.alpha(new E(17, this, hVar), executor);
        return hVar.alpha;
    }

    public final void zza(G6.a aVar, G6.b bVar, Callable callable, G6.h hVar) {
        G6.l lVar = (G6.l) aVar;
        try {
            if (lVar.alpha.india()) {
                bVar.alpha();
                return;
            }
            try {
                if (!this.zzb.get()) {
                    load();
                    this.zzb.set(true);
                }
                if (((G6.l) aVar).alpha.india()) {
                    bVar.alpha();
                    return;
                }
                Object call = callable.call();
                if (((G6.l) aVar).alpha.india()) {
                    bVar.alpha();
                } else {
                    hVar.bravo(call);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e4) {
            if (lVar.alpha.india()) {
                bVar.alpha();
            } else {
                hVar.alpha(e4);
            }
        }
    }

    public final void zzb(G6.h hVar) {
        boolean z2;
        int decrementAndGet = this.zza.decrementAndGet();
        if (decrementAndGet >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        x.kilo(z2);
        if (decrementAndGet == 0) {
            release();
            this.zzb.set(false);
        }
        r6.n.alpha.clear();
        r6.t.alpha.clear();
        hVar.bravo(null);
    }
}
