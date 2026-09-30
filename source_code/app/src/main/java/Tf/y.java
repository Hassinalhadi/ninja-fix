package Tf;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y extends as {
    public as alpha;

    public y(as delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.alpha = delegate;
    }

    @Override // Tf.as
    public final void awaitSignal(Condition condition) {
        Intrinsics.echo(condition, "condition");
        this.alpha.awaitSignal(condition);
    }

    @Override // Tf.as
    public final as clearDeadline() {
        return this.alpha.clearDeadline();
    }

    @Override // Tf.as
    public final as clearTimeout() {
        return this.alpha.clearTimeout();
    }

    @Override // Tf.as
    public final long deadlineNanoTime() {
        return this.alpha.deadlineNanoTime();
    }

    @Override // Tf.as
    public final boolean hasDeadline() {
        return this.alpha.hasDeadline();
    }

    @Override // Tf.as
    public final void throwIfReached() {
        this.alpha.throwIfReached();
    }

    @Override // Tf.as
    public final as timeout(long j5, TimeUnit unit) {
        Intrinsics.echo(unit, "unit");
        return this.alpha.timeout(j5, unit);
    }

    @Override // Tf.as
    public final long timeoutNanos() {
        return this.alpha.timeoutNanos();
    }

    @Override // Tf.as
    public final void waitUntilNotified(Object monitor) {
        Intrinsics.echo(monitor, "monitor");
        this.alpha.waitUntilNotified(monitor);
    }

    @Override // Tf.as
    public final as deadlineNanoTime(long j5) {
        return this.alpha.deadlineNanoTime(j5);
    }
}
