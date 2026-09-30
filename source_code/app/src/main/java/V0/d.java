package V0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t6.AbstractC2998h;

/* loaded from: classes3.dex */
public final class d extends AbstractC2998h {
    public final AtomicReferenceFieldUpdater alpha;
    public final AtomicReferenceFieldUpdater bravo;
    public final AtomicReferenceFieldUpdater charlie;
    public final AtomicReferenceFieldUpdater delta;
    public final AtomicReferenceFieldUpdater echo;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.alpha = atomicReferenceFieldUpdater;
        this.bravo = atomicReferenceFieldUpdater2;
        this.charlie = atomicReferenceFieldUpdater3;
        this.delta = atomicReferenceFieldUpdater4;
        this.echo = atomicReferenceFieldUpdater5;
    }

    @Override // t6.AbstractC2998h
    public final boolean alpha(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.delta;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // t6.AbstractC2998h
    public final boolean bravo(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.echo;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // t6.AbstractC2998h
    public final boolean charlie(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.charlie;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // t6.AbstractC2998h
    public final void delta(f fVar, f fVar2) {
        this.bravo.lazySet(fVar, fVar2);
    }

    @Override // t6.AbstractC2998h
    public final void echo(f fVar, Thread thread) {
        this.alpha.lazySet(fVar, thread);
    }
}
