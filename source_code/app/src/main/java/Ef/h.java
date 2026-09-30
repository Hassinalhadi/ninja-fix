package Ef;

import Af.r;
import Af.t;
import ao.ad;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import vf.InterfaceC3206j;
import vf.j0;

/* loaded from: classes2.dex */
public class h {
    public static final /* synthetic */ AtomicReferenceFieldUpdater charlie = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater delta = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater echo = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater foxtrot = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater golf = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int alpha;
    public final Cb.d bravo;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public h(int i4, int i5) {
        this.alpha = i4;
        if (i4 > 0) {
            if (i5 >= 0 && i5 <= i4) {
                k kVar = new k(0L, null, 2);
                this.head$volatile = kVar;
                this.tail$volatile = kVar;
                this._availablePermits$volatile = i4 - i5;
                this.bravo = new Cb.d(3, this);
                return;
            }
            throw new IllegalArgumentException(ad.zulu(i4, "The number of acquired permits should be in 0..").toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "Semaphore should have at least 1 permit, but had ").toString());
    }

    public final boolean alpha(j0 j0Var) {
        Object alpha;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = echo;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = foxtrot.getAndIncrement(this);
        f fVar = f.alpha;
        long j5 = andIncrement / j.foxtrot;
        loop0: while (true) {
            alpha = Af.b.alpha(kVar, j5, fVar);
            if (!Af.f.delta(alpha)) {
                r bravo = Af.f.bravo(alpha);
                while (true) {
                    r rVar = (r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.charlie >= bravo.charlie) {
                        break loop0;
                    }
                    if (!bravo.juliet()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, bravo)) {
                        if (atomicReferenceFieldUpdater.get(this) != rVar) {
                            if (bravo.foxtrot()) {
                                bravo.echo();
                            }
                        }
                    }
                    if (rVar.foxtrot()) {
                        rVar.echo();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) Af.f.bravo(alpha);
        int i4 = (int) (andIncrement % j.foxtrot);
        AtomicReferenceArray atomicReferenceArray = kVar2.echo;
        while (!atomicReferenceArray.compareAndSet(i4, null, j0Var)) {
            if (atomicReferenceArray.get(i4) != null) {
                t tVar = j.bravo;
                t tVar2 = j.charlie;
                while (!atomicReferenceArray.compareAndSet(i4, tVar, tVar2)) {
                    if (atomicReferenceArray.get(i4) != tVar) {
                        return false;
                    }
                }
                if (j0Var instanceof InterfaceC3206j) {
                    ((InterfaceC3206j) j0Var).hotel(Unit.INSTANCE, this.bravo);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + j0Var).toString());
            }
        }
        j0Var.alpha(kVar2, i4);
        return true;
    }

    public final void bravo() {
        int i4;
        Object alpha;
        boolean z2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = golf;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i5 = this.alpha;
            if (andIncrement < i5) {
                if (andIncrement < 0) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = charlie;
                    k kVar = (k) atomicReferenceFieldUpdater.get(this);
                    long andIncrement2 = delta.getAndIncrement(this);
                    long j5 = andIncrement2 / j.foxtrot;
                    g gVar = g.alpha;
                    while (true) {
                        alpha = Af.b.alpha(kVar, j5, gVar);
                        if (Af.f.delta(alpha)) {
                            break;
                        }
                        r bravo = Af.f.bravo(alpha);
                        while (true) {
                            r rVar = (r) atomicReferenceFieldUpdater.get(this);
                            if (rVar.charlie >= bravo.charlie) {
                                break;
                            }
                            if (!bravo.juliet()) {
                                break;
                            }
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, bravo)) {
                                if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                    if (bravo.foxtrot()) {
                                        bravo.echo();
                                    }
                                }
                            }
                            if (rVar.foxtrot()) {
                                rVar.echo();
                            }
                        }
                    }
                    k kVar2 = (k) Af.f.bravo(alpha);
                    kVar2.bravo();
                    z2 = false;
                    if (kVar2.charlie <= j5) {
                        int i10 = (int) (andIncrement2 % j.foxtrot);
                        t tVar = j.bravo;
                        AtomicReferenceArray atomicReferenceArray = kVar2.echo;
                        Object andSet = atomicReferenceArray.getAndSet(i10, tVar);
                        if (andSet == null) {
                            int i11 = j.alpha;
                            for (int i12 = 0; i12 < i11; i12++) {
                                if (atomicReferenceArray.get(i10) == j.charlie) {
                                    z2 = true;
                                    break;
                                }
                            }
                            t tVar2 = j.bravo;
                            t tVar3 = j.delta;
                            while (true) {
                                if (atomicReferenceArray.compareAndSet(i10, tVar2, tVar3)) {
                                    z2 = true;
                                    break;
                                } else if (atomicReferenceArray.get(i10) != tVar2) {
                                    break;
                                }
                            }
                            z2 = !z2;
                        } else if (andSet != j.echo) {
                            if (andSet instanceof InterfaceC3206j) {
                                InterfaceC3206j interfaceC3206j = (InterfaceC3206j) andSet;
                                t kilo = interfaceC3206j.kilo(Unit.INSTANCE, this.bravo);
                                if (kilo != null) {
                                    interfaceC3206j.oscar(kilo);
                                    z2 = true;
                                    break;
                                    break;
                                }
                            } else {
                                throw new IllegalStateException(("unexpected: " + andSet).toString());
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                do {
                    i4 = atomicIntegerFieldUpdater.get(this);
                    if (i4 <= i5) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i5));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i5).toString());
            }
        } while (!z2);
    }
}
