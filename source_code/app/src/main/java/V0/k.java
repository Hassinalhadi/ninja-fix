package V0;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class k implements com.google.common.util.concurrent.e {
    public final WeakReference alpha;
    public final j purple = new j(this);

    public k(h hVar) {
        this.alpha = new WeakReference(hVar);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        h hVar = (h) this.alpha.get();
        boolean cancel = this.purple.cancel(z2);
        if (cancel && hVar != null) {
            hVar.alpha = null;
            hVar.bravo = null;
            hVar.charlie.juliet(null);
        }
        return cancel;
    }

    @Override // com.google.common.util.concurrent.e
    public final void foxtrot(Runnable runnable, Executor executor) {
        this.purple.foxtrot(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.purple.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.purple.alpha instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.purple.isDone();
    }

    public final String toString() {
        return this.purple.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j5, TimeUnit timeUnit) {
        return this.purple.get(j5, timeUnit);
    }
}
