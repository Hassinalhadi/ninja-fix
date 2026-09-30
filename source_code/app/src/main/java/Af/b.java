package Af;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public abstract class b {
    public static final t alpha = new t("CLOSED", 0);

    public static final Object alpha(r rVar, long j5, Xd.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (rVar.charlie >= j5 && !rVar.delta()) {
                return rVar;
            }
            Object obj = c.alpha.get(rVar);
            t tVar = alpha;
            if (obj == tVar) {
                return tVar;
            }
            r rVar2 = (r) ((c) obj);
            if (rVar2 == null) {
                rVar2 = (r) lVar.invoke(Long.valueOf(rVar.charlie + 1), rVar);
                do {
                    atomicReferenceFieldUpdater = c.alpha;
                    if (atomicReferenceFieldUpdater.compareAndSet(rVar, null, rVar2)) {
                        if (rVar.delta()) {
                            rVar.echo();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(rVar) == null);
            }
            rVar = rVar2;
        }
    }
}
