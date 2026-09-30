package androidx.work;

import A2.al;
import A2.ao;
import A2.n;
import A2.x;
import A2.y;
import android.content.Context;
import com.google.common.util.concurrent.e;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t6.AbstractC3003i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\bH\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/work/Worker;", "LA2/y;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lcom/google/common/util/concurrent/e;", "LA2/x;", "startWork", "()Lcom/google/common/util/concurrent/e;", "LA2/n;", "getForegroundInfoAsync", "getForegroundInfo", "()LA2/n;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Worker extends y {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
        super(context, workerParams);
        Intrinsics.echo(context, "context");
        Intrinsics.echo(workerParams, "workerParams");
    }

    public abstract x doWork();

    @NotNull
    public n getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }

    @Override // A2.y
    @NotNull
    public e getForegroundInfoAsync() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.delta(backgroundExecutor, "backgroundExecutor");
        return AbstractC3003i.alpha(new ao(backgroundExecutor, new al(this, 0)));
    }

    @Override // A2.y
    @NotNull
    public final e startWork() {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.delta(backgroundExecutor, "backgroundExecutor");
        return AbstractC3003i.alpha(new ao(backgroundExecutor, new al(this, 1)));
    }
}
