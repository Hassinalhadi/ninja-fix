package P7;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import s6.V4;

/* loaded from: classes2.dex */
public final class f {
    public static final e delta = new Object();
    public final b alpha;
    public final b bravo;
    public final b charlie;

    public f(ExecutorService backgroundExecutorService, ExecutorService blockingExecutorService) {
        Intrinsics.echo(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.echo(blockingExecutorService, "blockingExecutorService");
        this.alpha = new b(backgroundExecutorService);
        this.bravo = new b(backgroundExecutorService);
        V4.echo(null);
        this.charlie = new b(blockingExecutorService);
    }

    public static final void alpha() {
        e.alpha(new c(0, delta, e.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 0), d.purple);
    }
}
