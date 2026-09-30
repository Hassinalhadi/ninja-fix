package vf;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class ax extends ay implements ai {
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater white = AtomicReferenceFieldUpdater.newUpdater(ax.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater yellow = AtomicReferenceFieldUpdater.newUpdater(ax.class, Object.class, "_delayed$volatile");

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13995a = AtomicIntegerFieldUpdater.newUpdater(ax.class, "_isCompleted$volatile");

    @Override // vf.AbstractC3220y
    public final void beige(Nd.h hVar, Runnable runnable) {
        white(runnable);
    }

    public aq charlie(long j5, d0 d0Var, Nd.h hVar) {
        return af.alpha.charlie(j5, d0Var, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(Runnable runnable) {
        boolean z2;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = white;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f13995a.get(this) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    }
                    break loop0;
                }
                if (obj instanceof Af.m) {
                    Af.m mVar = (Af.m) obj;
                    int alpha = mVar.alpha(runnable);
                    if (alpha == 0) {
                        break;
                    }
                    if (alpha != 1) {
                        if (alpha == 2) {
                            break;
                        }
                    } else {
                        Af.m charlie = mVar.charlie();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, charlie) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    }
                } else {
                    if (obj != ad.charlie) {
                        Af.m mVar2 = new Af.m(8, true);
                        mVar2.alpha((Runnable) obj);
                        mVar2.alpha(runnable);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
            } else {
                break;
            }
        }
        return false;
    }

    public final boolean j() {
        boolean z2;
        aw awVar;
        kotlin.collections.l lVar = this.silver;
        if (lVar != null) {
            z2 = lVar.isEmpty();
        } else {
            z2 = true;
        }
        if (!z2 || ((awVar = (aw) yellow.get(this)) != null && Af.w.bravo.get(awVar) != 0)) {
            return false;
        }
        Object obj = white.get(this);
        if (obj != null) {
            if (obj instanceof Af.m) {
                long j5 = Af.m.foxtrot.get((Af.m) obj);
                if (((int) (1073741823 & j5)) == ((int) ((j5 & 1152921503533105152L) >> 30))) {
                    return true;
                }
                return false;
            }
            if (obj != ad.charlie) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [vf.aw, java.lang.Object] */
    public final void l(long j5, av avVar) {
        boolean z2;
        int charlie;
        Thread olive;
        if (f13995a.get(this) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
        av avVar2 = null;
        if (z2) {
            charlie = 1;
        } else {
            aw awVar = (aw) atomicReferenceFieldUpdater.get(this);
            if (awVar == null) {
                ?? obj = new Object();
                obj.charlie = j5;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, obj) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                Intrinsics.checkNotNull(obj2);
                awVar = (aw) obj2;
            }
            charlie = avVar.charlie(j5, awVar, this);
        }
        if (charlie != 0) {
            if (charlie != 1) {
                if (charlie != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            } else {
                silver(j5, avVar);
                return;
            }
        }
        aw awVar2 = (aw) atomicReferenceFieldUpdater.get(this);
        if (awVar2 != null) {
            synchronized (awVar2) {
                av[] avVarArr = awVar2.alpha;
                if (avVarArr != null) {
                    avVar2 = avVarArr[0];
                }
            }
        }
        if (avVar2 == avVar && Thread.currentThread() != (olive = olive())) {
            LockSupport.unpark(olive);
        }
    }

    @Override // vf.ay
    public final long pink() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Af.t tVar;
        av avVar;
        Runnable runnable;
        long j5;
        if (!purple()) {
            yellow();
            loop0: while (true) {
                atomicReferenceFieldUpdater = white;
                Object obj = atomicReferenceFieldUpdater.get(this);
                tVar = ad.charlie;
                avVar = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Af.m) {
                    Af.m mVar = (Af.m) obj;
                    Object delta = mVar.delta();
                    if (delta != Af.m.golf) {
                        runnable = (Runnable) delta;
                        break;
                    }
                    Af.m charlie = mVar.charlie();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, charlie) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == tVar) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
            }
            runnable = null;
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            kotlin.collections.l lVar = this.silver;
            if (lVar == null || lVar.isEmpty()) {
                j5 = Long.MAX_VALUE;
            } else {
                j5 = 0;
            }
            if (j5 != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof Af.m) {
                        long j6 = Af.m.foxtrot.get((Af.m) obj2);
                        if (((int) (1073741823 & j6)) != ((int) ((j6 & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == tVar) {
                        return Long.MAX_VALUE;
                    }
                }
                aw awVar = (aw) yellow.get(this);
                if (awVar != null) {
                    synchronized (awVar) {
                        av[] avVarArr = awVar.alpha;
                        if (avVarArr != null) {
                            avVar = avVarArr[0];
                        }
                    }
                    if (avVar != null) {
                        long nanoTime = avVar.alpha - System.nanoTime();
                        if (nanoTime >= 0) {
                            return nanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    @Override // vf.ay
    public void shutdown() {
        av avVar;
        b0.alpha.set(null);
        f13995a.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = white;
            Object obj = atomicReferenceFieldUpdater.get(this);
            Af.t tVar = ad.charlie;
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, tVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                        break;
                    }
                }
                break loop0;
            } else {
                if (obj instanceof Af.m) {
                    ((Af.m) obj).bravo();
                    break;
                }
                if (obj != tVar) {
                    Af.m mVar = new Af.m(8, true);
                    mVar.alpha((Runnable) obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                break;
            }
        }
        do {
        } while (pink() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            aw awVar = (aw) yellow.get(this);
            if (awVar != null) {
                synchronized (awVar) {
                    if (Af.w.bravo.get(awVar) > 0) {
                        avVar = awVar.charlie(0);
                    } else {
                        avVar = null;
                    }
                }
                if (avVar != null) {
                    silver(nanoTime, avVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // vf.ai
    public final void uniform(long j5, C3207k c3207k) {
        long j6 = 0;
        if (j5 > 0) {
            if (j5 >= 9223372036854L) {
                j6 = Long.MAX_VALUE;
            } else {
                j6 = 1000000 * j5;
            }
        }
        if (j6 < 4611686018427387903L) {
            long nanoTime = System.nanoTime();
            at atVar = new at(this, j6 + nanoTime, c3207k);
            l(nanoTime, atVar);
            c3207k.whiskey(new C3204h(2, atVar));
        }
    }

    public void white(Runnable runnable) {
        yellow();
        if (d(runnable)) {
            Thread olive = olive();
            if (Thread.currentThread() != olive) {
                LockSupport.unpark(olive);
                return;
            }
            return;
        }
        ae.f13993b.white(runnable);
    }

    public final void yellow() {
        av avVar;
        av avVar2;
        boolean z2;
        aw awVar = (aw) yellow.get(this);
        if (awVar == null || Af.w.bravo.get(awVar) == 0) {
            return;
        }
        long nanoTime = System.nanoTime();
        do {
            synchronized (awVar) {
                try {
                    av[] avVarArr = awVar.alpha;
                    avVar = null;
                    if (avVarArr != null) {
                        avVar2 = avVarArr[0];
                    } else {
                        avVar2 = null;
                    }
                    if (avVar2 != null) {
                        if (nanoTime - avVar2.alpha >= 0) {
                            z2 = d(avVar2);
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            avVar = awVar.charlie(0);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (avVar != null);
    }
}
