package z8;

import A0.z;
import B8.j;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.ws.RealWebSocket;
import u8.C3146a;

/* loaded from: classes2.dex */
public final class f {
    public static final C3146a foxtrot = C3146a.delta();
    public final ScheduledExecutorService alpha;
    public final ConcurrentLinkedQueue bravo;
    public final Runtime charlie;
    public ScheduledFuture delta;
    public long echo;

    public f() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Runtime runtime = Runtime.getRuntime();
        this.delta = null;
        this.echo = -1L;
        this.alpha = newSingleThreadScheduledExecutor;
        this.bravo = new ConcurrentLinkedQueue();
        this.charlie = runtime;
    }

    public final void alpha(Timer timer) {
        synchronized (this) {
            try {
                this.alpha.schedule(new e(this, timer, 1), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                foxtrot.foxtrot("Unable to collect Memory Metric: " + e.getMessage());
            }
        }
    }

    public final synchronized void bravo(long j5, Timer timer) {
        this.echo = j5;
        try {
            this.delta = this.alpha.scheduleAtFixedRate(new e(this, timer, 0), 0L, j5, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            foxtrot.foxtrot("Unable to start collecting Memory Metrics: " + e.getMessage());
        }
    }

    public final C8.d charlie(Timer timer) {
        if (timer == null) {
            return null;
        }
        long charlie = timer.charlie() + timer.alpha;
        C8.c uniform = C8.d.uniform();
        uniform.india();
        C8.d.sierra((C8.d) uniform.purple, charlie);
        Runtime runtime = this.charlie;
        int bravo = j.bravo((z.echo(5) * (runtime.totalMemory() - runtime.freeMemory())) / RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        uniform.india();
        C8.d.tango((C8.d) uniform.purple, bravo);
        return (C8.d) uniform.golf();
    }
}
