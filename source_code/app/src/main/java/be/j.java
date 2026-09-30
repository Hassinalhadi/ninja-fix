package be;

import androidx.appcompat.widget.P0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import t6.AbstractC3066u3;

/* loaded from: classes3.dex */
public class j implements com.google.common.util.concurrent.e {
    public static final j red = new j(0, null);
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ j(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        return false;
    }

    @Override // com.google.common.util.concurrent.e
    public final void foxtrot(Runnable runnable, Executor executor) {
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            AbstractC3066u3.delta("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return this.purple;
            default:
                throw new ExecutionException((Throwable) this.purple);
        }
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
        switch (this.alpha) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(super.toString());
                sb2.append("[status=SUCCESS, result=[");
                return P0.emerald(sb2, this.purple, "]]");
            default:
                return super.toString() + "[status=FAILURE, cause=[" + ((Throwable) this.purple) + "]]";
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
