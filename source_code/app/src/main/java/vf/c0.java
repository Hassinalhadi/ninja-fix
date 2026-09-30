package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes2.dex */
public final class c0 extends K {
    public static final /* synthetic */ AtomicIntegerFieldUpdater yellow = AtomicIntegerFieldUpdater.newUpdater(c0.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;
    public final Thread teal = Thread.currentThread();
    public aq white;

    public static void mike(int i4) {
        throw new IllegalStateException(("Illegal state " + i4).toString());
    }

    @Override // vf.K
    public final boolean juliet() {
        return true;
    }

    @Override // vf.K
    public final void kilo(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = yellow;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 1 && i4 != 2 && i4 != 3) {
                    mike(i4);
                    throw null;
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 2));
        this.teal.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void lima() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yellow;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        mike(i4);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i4, 1)) {
                aq aqVar = this.white;
                if (aqVar != null) {
                    aqVar.dispose();
                    return;
                }
                return;
            }
        }
    }
}
