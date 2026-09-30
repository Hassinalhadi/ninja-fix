package bd;

import J2.t;
import V0.k;
import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import t6.AbstractC3003i;

/* renamed from: bd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableScheduledFutureC0749b implements RunnableScheduledFuture {
    public final AtomicReference alpha = new AtomicReference(null);
    public final long purple;
    public final Callable red;
    public final k silver;

    public RunnableScheduledFutureC0749b(Handler handler, long j5, Callable callable) {
        this.purple = j5;
        this.red = callable;
        this.silver = AbstractC3003i.alpha(new t(false, (Object) this, (Object) handler, (Object) callable));
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return this.silver.cancel(z2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.silver.purple.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.purple - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.silver.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.silver.purple.isDone();
    }

    @Override // java.util.concurrent.RunnableScheduledFuture
    public final boolean isPeriodic() {
        return false;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        V0.h hVar = (V0.h) this.alpha.getAndSet(null);
        if (hVar != null) {
            try {
                hVar.bravo(this.red.call());
            } catch (Exception e) {
                hVar.delta(e);
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.silver.purple.get(j5, timeUnit);
    }
}
