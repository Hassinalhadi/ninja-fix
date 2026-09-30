package P7;

import B2.s;
import G6.q;
import O7.k;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s6.V4;

/* loaded from: classes2.dex */
public final class b implements Executor {
    public final ExecutorService alpha;
    public final Object purple = new Object();
    public q red = V4.echo(null);

    public b(ExecutorService executorService) {
        this.alpha = executorService;
    }

    public final q alpha(Runnable runnable) {
        q foxtrot;
        synchronized (this.purple) {
            foxtrot = this.red.foxtrot(this.alpha, new s(20, runnable));
            this.red = foxtrot;
        }
        return foxtrot;
    }

    public final q bravo(k kVar) {
        q foxtrot;
        synchronized (this.purple) {
            foxtrot = this.red.foxtrot(this.alpha, new s(19, kVar));
            this.red = foxtrot;
        }
        return foxtrot;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.alpha.execute(runnable);
    }
}
