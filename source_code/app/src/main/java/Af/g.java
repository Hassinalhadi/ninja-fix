package Af;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import vf.AbstractC3220y;
import vf.C3207k;
import vf.af;
import vf.ai;
import vf.aq;
import vf.d0;

/* loaded from: classes2.dex */
public final class g extends AbstractC3220y implements ai {
    public static final /* synthetic */ AtomicIntegerFieldUpdater yellow = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final /* synthetic */ ai purple;
    public final AbstractC3220y red;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final int silver;
    public final k teal;
    public final Object white;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC3220y abstractC3220y, int i4) {
        ai aiVar;
        if (abstractC3220y instanceof ai) {
            aiVar = (ai) abstractC3220y;
        } else {
            aiVar = null;
        }
        this.purple = aiVar == null ? af.alpha : aiVar;
        this.red = abstractC3220y;
        this.silver = i4;
        this.teal = new k();
        this.white = new Object();
    }

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        Runnable magenta;
        this.teal.alpha(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yellow;
        if (atomicIntegerFieldUpdater.get(this) < this.silver && navy() && (magenta = magenta()) != null) {
            try {
                f.hotel(this.red, this, new be.g(1, this, magenta, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // vf.ai
    public final aq charlie(long j5, d0 d0Var, Nd.h hVar) {
        return this.purple.charlie(j5, d0Var, hVar);
    }

    @Override // vf.AbstractC3220y
    public final void green(Nd.h hVar, Runnable runnable) {
        Runnable magenta;
        this.teal.alpha(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yellow;
        if (atomicIntegerFieldUpdater.get(this) < this.silver && navy() && (magenta = magenta()) != null) {
            try {
                this.red.green(this, new be.g(1, this, magenta, false));
            } catch (Throwable th) {
                atomicIntegerFieldUpdater.decrementAndGet(this);
                throw th;
            }
        }
    }

    @Override // vf.AbstractC3220y
    public final AbstractC3220y jade(int i4) {
        f.alpha(i4);
        if (i4 >= this.silver) {
            return this;
        }
        return super.jade(i4);
    }

    public final Runnable magenta() {
        while (true) {
            Runnable runnable = (Runnable) this.teal.delta();
            if (runnable == null) {
                synchronized (this.white) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yellow;
                    atomicIntegerFieldUpdater.decrementAndGet(this);
                    if (this.teal.charlie() == 0) {
                        return null;
                    }
                    atomicIntegerFieldUpdater.incrementAndGet(this);
                }
            } else {
                return runnable;
            }
        }
    }

    public final boolean navy() {
        synchronized (this.white) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yellow;
            if (atomicIntegerFieldUpdater.get(this) >= this.silver) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // vf.AbstractC3220y
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.red);
        sb2.append(".limitedParallelism(");
        return Q0.c.quebec(sb2, this.silver, ')');
    }

    @Override // vf.ai
    public final void uniform(long j5, C3207k c3207k) {
        this.purple.uniform(j5, c3207k);
    }
}
