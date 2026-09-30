package Af;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import vf.W;

/* loaded from: classes2.dex */
public abstract class r extends c implements W {
    public static final /* synthetic */ AtomicIntegerFieldUpdater delta = AtomicIntegerFieldUpdater.newUpdater(r.class, "cleanedAndPointers$volatile");
    public final long charlie;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public r(long j5, r rVar, int i4) {
        super(rVar);
        this.charlie = j5;
        this.cleanedAndPointers$volatile = i4 << 16;
    }

    @Override // Af.c
    public final boolean delta() {
        if (delta.get(this) == golf() && charlie() != null) {
            return true;
        }
        return false;
    }

    public final boolean foxtrot() {
        if (delta.addAndGet(this, -65536) == golf() && charlie() != null) {
            return true;
        }
        return false;
    }

    public abstract int golf();

    public abstract void hotel(int i4, Nd.h hVar);

    public final void india() {
        if (delta.incrementAndGet(this) == golf()) {
            echo();
        }
    }

    public final boolean juliet() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        do {
            atomicIntegerFieldUpdater = delta;
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == golf() && charlie() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
