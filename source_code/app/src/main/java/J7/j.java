package J7;

import E5.p;
import V5.x;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import s6.E;

/* loaded from: classes2.dex */
public final class j implements Executor {
    public static final Logger white = Logger.getLogger(j.class.getName());
    public final Executor alpha;
    public final ArrayDeque purple = new ArrayDeque();
    public int red = 1;
    public long silver = 0;
    public final E teal = new E(this);

    public j(Executor executor) {
        x.hotel(executor);
        this.alpha = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x.hotel(runnable);
        synchronized (this.purple) {
            int i4 = this.red;
            if (i4 != 4 && i4 != 3) {
                long j5 = this.silver;
                p pVar = new p(runnable, 1);
                this.purple.add(pVar);
                this.red = 2;
                try {
                    this.alpha.execute(this.teal);
                    if (this.red == 2) {
                        synchronized (this.purple) {
                            try {
                                if (this.silver == j5 && this.red == 2) {
                                    this.red = 3;
                                }
                            } finally {
                            }
                        }
                        return;
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.purple) {
                        try {
                            int i5 = this.red;
                            boolean z2 = true;
                            if ((i5 != 1 && i5 != 2) || !this.purple.removeLastOccurrence(pVar)) {
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
            this.purple.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.alpha + "}";
    }
}
