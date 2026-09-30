package t6;

import java.util.Collection;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class Y1 {
    public static Collection alpha(Xe.p pVar, Xe.f fVar, int i4) {
        if ((i4 & 1) != 0) {
            fVar = Xe.f.mike;
        }
        Xe.n.alpha.getClass();
        return pVar.alpha(fVar, Xe.l.bravo);
    }

    public static /* synthetic */ boolean bravo(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, s6.A a6, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(a6, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(a6) != obj && atomicReferenceFieldUpdater.get(a6) != obj) {
                return false;
            }
        }
        return true;
    }
}
