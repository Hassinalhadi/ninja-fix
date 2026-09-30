package A2;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.WorkerParameters;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3003i;

/* loaded from: classes3.dex */
public abstract class y {
    private Context mAppContext;
    private final AtomicInteger mStopReason = new AtomicInteger(-256);
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    public y(Context context, WorkerParameters workerParameters) {
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.foxtrot;
    }

    public abstract com.google.common.util.concurrent.e getForegroundInfoAsync();

    public final UUID getId() {
        return this.mWorkerParams.alpha;
    }

    public final j getInputData() {
        return this.mWorkerParams.bravo;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.delta.red;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.echo;
    }

    public final int getStopReason() {
        return this.mStopReason.get();
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.charlie;
    }

    public L2.a getTaskExecutor() {
        return this.mWorkerParams.hotel;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.delta.alpha;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.delta.purple;
    }

    public am getWorkerFactory() {
        return this.mWorkerParams.india;
    }

    public final boolean isStopped() {
        if (this.mStopReason.get() != -256) {
            return true;
        }
        return false;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final com.google.common.util.concurrent.e setForegroundAsync(n nVar) {
        K2.o oVar = this.mWorkerParams.kilo;
        Context applicationContext = getApplicationContext();
        UUID id2 = getId();
        L2.c cVar = oVar.alpha;
        F4.b bVar = new F4.b(oVar, id2, nVar, applicationContext, 1);
        K2.i iVar = cVar.alpha;
        Intrinsics.echo(iVar, "<this>");
        return AbstractC3003i.alpha(new p(iVar, "setForegroundAsync", bVar, 1));
    }

    public com.google.common.util.concurrent.e setProgressAsync(j jVar) {
        K2.p pVar = this.mWorkerParams.juliet;
        getApplicationContext();
        UUID id2 = getId();
        L2.c cVar = pVar.bravo;
        Ac.l lVar = new Ac.l(pVar, id2, jVar, 6);
        K2.i iVar = cVar.alpha;
        Intrinsics.echo(iVar, "<this>");
        return AbstractC3003i.alpha(new p(iVar, "updateProgress", lVar, 1));
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract com.google.common.util.concurrent.e startWork();

    public final void stop(int i4) {
        if (this.mStopReason.compareAndSet(-256, i4)) {
            onStopped();
        }
    }
}
