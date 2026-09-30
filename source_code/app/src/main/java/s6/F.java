package s6;

import java.util.concurrent.TimeUnit;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class F implements J {
    public final Float alpha;

    static {
        new I(F.class);
    }

    public F(Float f5) {
        this.alpha = f5;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.alpha;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return AbstractC2327c.xray(super.toString(), "[status=SUCCESS, result=[", this.alpha.toString(), "]]");
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.alpha;
    }
}
