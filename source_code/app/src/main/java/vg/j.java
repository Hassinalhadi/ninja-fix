package vg;

import java.util.concurrent.CompletableFuture;

/* loaded from: classes2.dex */
public final class j extends CompletableFuture {
    public final y alpha;

    public j(y yVar) {
        this.alpha = yVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        if (z2) {
            this.alpha.cancel();
        }
        return super.cancel(z2);
    }
}
