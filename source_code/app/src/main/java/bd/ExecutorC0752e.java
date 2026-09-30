package bd;

import E5.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: bd.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ExecutorC0752e implements Executor {
    public static volatile ExecutorC0752e red;
    public final /* synthetic */ int alpha;
    public final ExecutorService purple;

    public ExecutorC0752e(ExecutorService executorService) {
        this.alpha = 1;
        this.purple = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.alpha) {
            case 0:
                this.purple.execute(runnable);
                return;
            default:
                this.purple.execute(new p(runnable, 0));
                return;
        }
    }

    public ExecutorC0752e() {
        this.alpha = 0;
        this.purple = Executors.newSingleThreadExecutor(new ThreadFactoryC0751d(0));
    }
}
