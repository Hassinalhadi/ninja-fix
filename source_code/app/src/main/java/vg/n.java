package vg;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* loaded from: classes2.dex */
public final class n implements d {
    public final Executor alpha;
    public final d purple;

    public n(Executor executor, d dVar) {
        this.alpha = executor;
        this.purple = dVar;
    }

    @Override // vg.d
    public final void cancel() {
        this.purple.cancel();
    }

    @Override // vg.d
    public final aq execute() {
        return this.purple.execute();
    }

    @Override // vg.d
    public final boolean isCanceled() {
        return this.purple.isCanceled();
    }

    @Override // vg.d
    public final void o(g gVar) {
        this.purple.o(new com.google.android.play.core.integrity.c(this, gVar));
    }

    @Override // vg.d
    public final Request request() {
        return this.purple.request();
    }

    @Override // vg.d
    public final d clone() {
        return new n(this.alpha, this.purple.clone());
    }
}
