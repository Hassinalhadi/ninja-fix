package s6;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes2.dex */
public final class G extends AbstractOwnableSynchronizer implements Runnable {
    public final K alpha;

    public /* synthetic */ G(K k6) {
        this.alpha = k6;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.alpha.toString();
    }
}
