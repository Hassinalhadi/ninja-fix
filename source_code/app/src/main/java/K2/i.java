package K2;

import androidx.lifecycle.RunnableC0643m;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements Executor {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final Object red;
    public Object silver;
    public final Object teal;

    public /* synthetic */ i(Executor executor, G6.a aVar, G6.b bVar, G6.h hVar) {
        this.alpha = 2;
        this.red = executor;
        this.teal = aVar;
        this.silver = bVar;
        this.purple = hVar;
    }

    private final void alpha(Runnable runnable) {
        synchronized (this.purple) {
            try {
                ((ArrayDeque) this.red).add(new be.g(5, this, runnable));
                if (((Runnable) this.silver) == null) {
                    delta();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void bravo(Runnable runnable) {
        synchronized (this.purple) {
            try {
                ((ArrayDeque) this.red).add(new A8.g(22, this, runnable));
                if (((Runnable) this.silver) == null) {
                    delta();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void echo() {
        synchronized (this.purple) {
            try {
                Runnable runnable = (Runnable) ((ArrayDeque) this.red).poll();
                this.silver = runnable;
                if (runnable != null) {
                    ((androidx.appcompat.app.n) this.teal).execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean charlie() {
        boolean z2;
        synchronized (this.purple) {
            z2 = !((ArrayDeque) this.red).isEmpty();
        }
        return z2;
    }

    public void delta() {
        switch (this.alpha) {
            case 0:
                Runnable runnable = (Runnable) ((ArrayDeque) this.red).poll();
                this.silver = runnable;
                if (runnable != null) {
                    ((ExecutorService) this.teal).execute(runnable);
                    return;
                }
                return;
            case 1:
                echo();
                return;
            default:
                synchronized (this.purple) {
                    Object poll = ((ArrayDeque) this.red).poll();
                    Runnable runnable2 = (Runnable) poll;
                    this.silver = runnable2;
                    if (poll != null) {
                        ((Executor) this.teal).execute(runnable2);
                    }
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        switch (this.alpha) {
            case 0:
                alpha(command);
                return;
            case 1:
                bravo(command);
                return;
            case 2:
                try {
                    ((Executor) this.red).execute(command);
                    return;
                } catch (RuntimeException e) {
                    if (((G6.l) ((G6.a) this.teal)).alpha.india()) {
                        ((G6.b) this.silver).alpha();
                    } else {
                        ((G6.h) this.purple).alpha(e);
                    }
                    throw e;
                }
            default:
                Intrinsics.echo(command, "command");
                synchronized (this.purple) {
                    ((ArrayDeque) this.red).offer(new RunnableC0643m(command, this));
                    if (((Runnable) this.silver) == null) {
                        delta();
                    }
                }
                return;
        }
    }

    public i(Executor executor) {
        this.alpha = 3;
        Intrinsics.echo(executor, "executor");
        this.teal = executor;
        this.red = new ArrayDeque();
        this.purple = new Object();
    }

    public i(ExecutorService executorService) {
        this.alpha = 0;
        this.teal = executorService;
        this.red = new ArrayDeque();
        this.purple = new Object();
    }

    public i(androidx.appcompat.app.n nVar) {
        this.alpha = 1;
        this.purple = new Object();
        this.red = new ArrayDeque();
        this.teal = nVar;
    }
}
