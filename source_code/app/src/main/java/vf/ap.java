package vf;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes2.dex */
public final class ap implements aq {
    public final ScheduledFuture alpha;

    public ap(ScheduledFuture scheduledFuture) {
        this.alpha = scheduledFuture;
    }

    @Override // vf.aq
    public final void dispose() {
        this.alpha.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.alpha + ']';
    }
}
