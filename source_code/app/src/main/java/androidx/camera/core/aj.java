package androidx.camera.core;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class aj extends w {
    public final /* synthetic */ int silver = 1;
    public final Object teal;

    public aj(ar arVar) {
        super(arVar);
        this.teal = new AtomicBoolean(false);
    }

    @Override // androidx.camera.core.w, java.lang.AutoCloseable
    public void close() {
        switch (this.silver) {
            case 1:
                if (!((AtomicBoolean) this.teal).getAndSet(true)) {
                    super.close();
                    return;
                }
                return;
            default:
                super.close();
                return;
        }
    }

    public aj(ar arVar, ak akVar) {
        super(arVar);
        this.teal = new WeakReference(akVar);
        charlie(new ai(0, this));
    }
}
