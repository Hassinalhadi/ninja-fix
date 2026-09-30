package s6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class at extends t6.X1 {
    public final AtomicReferenceFieldUpdater alpha;
    public final AtomicReferenceFieldUpdater bravo;
    public final AtomicReferenceFieldUpdater charlie;
    public final AtomicReferenceFieldUpdater delta;
    public final AtomicReferenceFieldUpdater echo;

    public at(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.alpha = atomicReferenceFieldUpdater;
        this.bravo = atomicReferenceFieldUpdater2;
        this.charlie = atomicReferenceFieldUpdater3;
        this.delta = atomicReferenceFieldUpdater4;
        this.echo = atomicReferenceFieldUpdater5;
    }

    @Override // t6.X1
    public final as bravo(A a6) {
        return (as) this.delta.getAndSet(a6, as.delta);
    }

    @Override // t6.X1
    public final az charlie(A a6) {
        return (az) this.charlie.getAndSet(a6, az.charlie);
    }

    @Override // t6.X1
    public final void delta(az azVar, az azVar2) {
        this.bravo.lazySet(azVar, azVar2);
    }

    @Override // t6.X1
    public final void echo(az azVar, Thread thread) {
        this.alpha.lazySet(azVar, thread);
    }

    @Override // t6.X1
    public final boolean foxtrot(A a6, as asVar, as asVar2) {
        return t6.Y1.bravo(this.delta, a6, asVar, asVar2);
    }

    @Override // t6.X1
    public final boolean golf(A a6, Object obj, Object obj2) {
        return t6.Y1.bravo(this.echo, a6, obj, obj2);
    }

    @Override // t6.X1
    public final boolean hotel(A a6, az azVar, az azVar2) {
        return t6.Y1.bravo(this.charlie, a6, azVar, azVar2);
    }
}
