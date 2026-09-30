package androidx.camera.core.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class M implements N {
    public final AtomicBoolean alpha = new AtomicBoolean(false);
    public final N bravo;

    public M(N n5) {
        this.bravo = n5;
    }

    @Override // androidx.camera.core.impl.N
    public final void alpha(P p4) {
        if (!this.alpha.get()) {
            this.bravo.alpha(p4);
        }
    }

    public final void bravo() {
        this.alpha.set(true);
    }
}
