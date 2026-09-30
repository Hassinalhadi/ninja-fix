package A2;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AtomicBoolean purple;

    public /* synthetic */ r(AtomicBoolean atomicBoolean, int i4) {
        this.alpha = i4;
        this.purple = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                this.purple.set(true);
                return;
            default:
                this.purple.set(true);
                return;
        }
    }
}
