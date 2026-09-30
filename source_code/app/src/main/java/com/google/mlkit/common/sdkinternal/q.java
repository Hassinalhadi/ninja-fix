package com.google.mlkit.common.sdkinternal;

import V5.x;
import java.util.ArrayDeque;
import java.util.Deque;

/* loaded from: classes2.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Runnable purple;

    public /* synthetic */ q(Runnable runnable, int i4) {
        this.alpha = i4;
        this.purple = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Deque deque = (Deque) j.purple.get();
                x.hotel(deque);
                Runnable runnable = this.purple;
                deque.add(runnable);
                if (deque.size() > 1) {
                    return;
                }
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            default:
                j.purple.set(new ArrayDeque());
                this.purple.run();
                return;
        }
    }
}
