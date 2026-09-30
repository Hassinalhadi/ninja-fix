package bd;

import E5.p;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes3.dex */
public final class h implements Executor {
    public final Executor purple;
    public final ArrayDeque alpha = new ArrayDeque();
    public final F6.b red = new F6.b(14, this);
    public int silver = 1;
    public long teal = 0;

    public h(Executor executor) {
        executor.getClass();
        this.purple = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.alpha) {
            int i4 = this.silver;
            if (i4 != 4 && i4 != 3) {
                long j5 = this.teal;
                p pVar = new p(runnable, 2);
                this.alpha.add(pVar);
                this.silver = 2;
                try {
                    this.purple.execute(this.red);
                    if (this.silver == 2) {
                        synchronized (this.alpha) {
                            try {
                                if (this.teal == j5 && this.silver == 2) {
                                    this.silver = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.alpha) {
                        try {
                            int i5 = this.silver;
                            boolean z2 = true;
                            if ((i5 != 1 && i5 != 2) || !this.alpha.removeLastOccurrence(pVar)) {
                                z2 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z2) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.alpha.add(runnable);
        }
    }
}
