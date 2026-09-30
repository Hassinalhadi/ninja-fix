package Af;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class k {
    public static final /* synthetic */ AtomicReferenceFieldUpdater alpha = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new m(8, false);

    public final boolean alpha(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            int alpha2 = mVar.alpha(runnable);
            if (alpha2 == 0) {
                return true;
            }
            if (alpha2 != 1) {
                if (alpha2 == 2) {
                    return false;
                }
            } else {
                m charlie = mVar.charlie();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, charlie) && atomicReferenceFieldUpdater.get(this) == mVar) {
                }
            }
        }
    }

    public final void bravo() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar.bravo()) {
                return;
            }
            m charlie = mVar.charlie();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, charlie) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }

    public final int charlie() {
        m mVar = (m) alpha.get(this);
        mVar.getClass();
        long j5 = m.foxtrot.get(mVar);
        return (((int) ((j5 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j5))) & 1073741823;
    }

    public final Object delta() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            Object delta = mVar.delta();
            if (delta != m.golf) {
                return delta;
            }
            m charlie = mVar.charlie();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, charlie) && atomicReferenceFieldUpdater.get(this) == mVar) {
            }
        }
    }
}
