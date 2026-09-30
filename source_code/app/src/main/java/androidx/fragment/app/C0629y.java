package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0629y extends ah.b {
    public final /* synthetic */ AtomicReference alpha;

    public C0629y(AtomicReference atomicReference) {
        this.alpha = atomicReference;
    }

    @Override // ah.b
    public final void alpha(Object obj) {
        ah.b bVar = (ah.b) this.alpha.get();
        if (bVar != null) {
            bVar.alpha(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }

    @Override // ah.b
    public final void bravo() {
        ah.b bVar = (ah.b) this.alpha.getAndSet(null);
        if (bVar != null) {
            bVar.bravo();
        }
    }
}
