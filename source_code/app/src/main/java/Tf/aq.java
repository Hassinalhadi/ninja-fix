package Tf;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aq extends as {
    @Override // Tf.as
    public final as deadlineNanoTime(long j5) {
        return this;
    }

    @Override // Tf.as
    public final void throwIfReached() {
    }

    @Override // Tf.as
    public final as timeout(long j5, TimeUnit unit) {
        Intrinsics.echo(unit, "unit");
        return this;
    }
}
