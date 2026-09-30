package Cf;

import Af.t;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class a extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f927b = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f928a;
    public final m alpha;
    private volatile int indexInArray;

    @Nullable
    private volatile Object nextParkedWorker;
    public final Ref.ObjectRef purple;
    public b red;
    public long silver;
    public long teal;
    public int white;
    private volatile /* synthetic */ int workerCtl$volatile;
    public boolean yellow;

    public a(c cVar, int i4) {
        this.f928a = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.alpha = new m();
        this.purple = new Ref.ObjectRef();
        this.red = b.silver;
        this.nextParkedWorker = c.f932d;
        int nanoTime = (int) System.nanoTime();
        this.white = nanoTime == 0 ? 42 : nanoTime;
        foxtrot(i4);
    }

    public final i alpha(boolean z2) {
        i echo;
        i echo2;
        c cVar;
        long j5;
        b bVar = this.red;
        b bVar2 = b.alpha;
        i iVar = null;
        m mVar = this.alpha;
        boolean z10 = true;
        c cVar2 = this.f928a;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.f930b;
            do {
                cVar = this.f928a;
                j5 = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j5) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.bravo;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.purple) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != iVar2) {
                                break;
                            }
                        }
                        iVar = iVar2;
                    }
                    int i4 = m.delta.get(mVar);
                    int i5 = m.charlie.get(mVar);
                    while (true) {
                        if (i4 == i5 || m.echo.get(mVar) == 0) {
                            break;
                        }
                        i5--;
                        i charlie = mVar.charlie(i5, true);
                        if (charlie != null) {
                            iVar = charlie;
                            break;
                        }
                    }
                    if (iVar == null) {
                        i iVar3 = (i) cVar2.white.delta();
                        if (iVar3 == null) {
                            return india(1);
                        }
                        return iVar3;
                    }
                    return iVar;
                }
            } while (!c.f930b.compareAndSet(cVar, j5, j5 - 4398046511104L));
            this.red = b.alpha;
        }
        if (z2) {
            if (delta(cVar2.alpha * 2) != 0) {
                z10 = false;
            }
            if (z10 && (echo2 = echo()) != null) {
                return echo2;
            }
            mVar.getClass();
            i iVar4 = (i) m.bravo.getAndSet(mVar, null);
            if (iVar4 == null) {
                iVar4 = mVar.bravo();
            }
            if (iVar4 != null) {
                return iVar4;
            }
            if (!z10 && (echo = echo()) != null) {
                return echo;
            }
        } else {
            i echo3 = echo();
            if (echo3 != null) {
                return echo3;
            }
        }
        return india(3);
    }

    public final int bravo() {
        return this.indexInArray;
    }

    public final Object charlie() {
        return this.nextParkedWorker;
    }

    public final int delta(int i4) {
        int i5 = this.white;
        int i10 = i5 ^ (i5 << 13);
        int i11 = i10 ^ (i10 >> 17);
        int i12 = i11 ^ (i11 << 5);
        this.white = i12;
        int i13 = i4 - 1;
        if ((i13 & i4) == 0) {
            return i12 & i13;
        }
        return (i12 & LottieConstants.IterateForever) % i4;
    }

    public final i echo() {
        int delta = delta(2);
        c cVar = this.f928a;
        if (delta == 0) {
            i iVar = (i) cVar.teal.delta();
            if (iVar != null) {
                return iVar;
            }
            return (i) cVar.white.delta();
        }
        i iVar2 = (i) cVar.white.delta();
        if (iVar2 != null) {
            return iVar2;
        }
        return (i) cVar.teal.delta();
    }

    public final void foxtrot(int i4) {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f928a.silver);
        sb2.append("-worker-");
        if (i4 == 0) {
            valueOf = "TERMINATED";
        } else {
            valueOf = String.valueOf(i4);
        }
        sb2.append(valueOf);
        setName(sb2.toString());
        this.indexInArray = i4;
    }

    public final void golf(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean hotel(b bVar) {
        boolean z2;
        b bVar2 = this.red;
        if (bVar2 == b.alpha) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            c.f930b.addAndGet(this.f928a, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.red = bVar;
        }
        return z2;
    }

    public final i india(int i4) {
        int i5;
        boolean z2;
        long j5;
        i iVar;
        long j6;
        long j7;
        int i10;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f930b;
        c cVar = this.f928a;
        int i11 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i11 < 2) {
            return null;
        }
        int delta = delta(i11);
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        while (i12 < i11) {
            int i13 = delta + 1;
            if (i13 > i11) {
                i13 = 1;
            }
            a aVar = (a) cVar.yellow.bravo(i13);
            if (aVar != null && aVar != this) {
                m mVar = aVar.alpha;
                if (i4 == 3) {
                    iVar = mVar.bravo();
                    j5 = 0;
                } else {
                    mVar.getClass();
                    int i14 = m.delta.get(mVar);
                    int i15 = m.charlie.get(mVar);
                    if (i4 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    while (true) {
                        if (i14 != i15) {
                            j5 = 0;
                            if (!z2 || m.echo.get(mVar) != 0) {
                                int i16 = i14 + 1;
                                iVar = mVar.charlie(i14, z2);
                                if (iVar != null) {
                                    break;
                                }
                                i14 = i16;
                            } else {
                                break;
                            }
                        } else {
                            j5 = 0;
                            break;
                        }
                    }
                    iVar = iVar2;
                }
                Ref.ObjectRef objectRef = this.purple;
                if (iVar != null) {
                    objectRef.alpha = iVar;
                    i5 = i13;
                    j7 = -1;
                    j6 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.bravo;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j6 = -1;
                            break;
                        }
                        j6 = -1;
                        if (iVar3.purple) {
                            i10 = 1;
                        } else {
                            i10 = 2;
                        }
                        if ((i10 & i4) == 0) {
                            break;
                        }
                        k.foxtrot.getClass();
                        i5 = i13;
                        long nanoTime = System.nanoTime() - iVar3.alpha;
                        long j11 = k.bravo;
                        if (nanoTime < j11) {
                            j7 = j11 - nanoTime;
                            iVar2 = null;
                            break;
                        }
                        do {
                            iVar2 = null;
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar3, null)) {
                                objectRef.alpha = iVar3;
                                j7 = -1;
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar3);
                        i13 = i5;
                        iVar2 = null;
                    }
                    j7 = -2;
                    i5 = i13;
                }
                if (j7 == j6) {
                    i iVar4 = (i) objectRef.alpha;
                    objectRef.alpha = iVar2;
                    return iVar4;
                }
                if (j7 > j5) {
                    j10 = Math.min(j10, j7);
                }
            } else {
                i5 = i13;
            }
            i12++;
            delta = i5;
            iVar2 = null;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = 0;
        }
        this.teal = j10;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z2;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j5;
        int i4;
        long j6;
        boolean z10;
        loop0: while (true) {
            boolean z11 = false;
            while (true) {
                c cVar = this.f928a;
                cVar.getClass();
                if (c.f931c.get(cVar) != 1) {
                    b bVar = this.red;
                    b bVar2 = b.teal;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i alpha = alpha(this.yellow);
                    if (alpha != null) {
                        this.teal = 0L;
                        this.silver = 0L;
                        if (this.red == b.red) {
                            this.red = b.purple;
                        }
                        boolean z12 = alpha.purple;
                        c cVar2 = this.f928a;
                        if (z12) {
                            if (hotel(b.purple) && !cVar2.papa() && !cVar2.juliet(c.f930b.get(cVar2))) {
                                cVar2.papa();
                            }
                            cVar2.getClass();
                            try {
                                alpha.run();
                            } catch (Throwable th) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                            }
                            c.f930b.addAndGet(cVar2, -2097152L);
                            if (this.red != bVar2) {
                                this.red = b.silver;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                alpha.run();
                            } catch (Throwable th2) {
                                Thread currentThread2 = Thread.currentThread();
                                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
                            }
                        }
                    } else {
                        this.yellow = false;
                        if (this.teal != 0) {
                            if (!z11) {
                                z11 = true;
                            } else {
                                hotel(b.red);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.teal);
                                this.teal = 0L;
                                break;
                            }
                        } else {
                            Object obj = this.nextParkedWorker;
                            t tVar = c.f932d;
                            if (obj != tVar) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            long j7 = 2097151;
                            if (!z2) {
                                c cVar3 = this.f928a;
                                cVar3.getClass();
                                if (this.nextParkedWorker == tVar) {
                                    do {
                                        atomicLongFieldUpdater = c.f929a;
                                        j5 = atomicLongFieldUpdater.get(cVar3);
                                        i4 = this.indexInArray;
                                        this.nextParkedWorker = cVar3.yellow.bravo((int) (j5 & 2097151));
                                    } while (!atomicLongFieldUpdater.compareAndSet(cVar3, j5, ((2097152 + j5) & (-2097152)) | i4));
                                }
                            } else {
                                f927b.set(this, -1);
                                while (this.nextParkedWorker != c.f932d) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f927b;
                                    if (atomicIntegerFieldUpdater.get(this) == -1) {
                                        c cVar4 = this.f928a;
                                        cVar4.getClass();
                                        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.f931c;
                                        if (atomicIntegerFieldUpdater2.get(cVar4) == 1) {
                                            break;
                                        }
                                        b bVar3 = this.red;
                                        b bVar4 = b.teal;
                                        if (bVar3 == bVar4) {
                                            break;
                                        }
                                        hotel(b.red);
                                        Thread.interrupted();
                                        if (this.silver == 0) {
                                            j6 = j7;
                                            this.silver = System.nanoTime() + this.f928a.red;
                                        } else {
                                            j6 = j7;
                                        }
                                        LockSupport.parkNanos(this.f928a.red);
                                        if (System.nanoTime() - this.silver >= 0) {
                                            this.silver = 0L;
                                            c cVar5 = this.f928a;
                                            synchronized (cVar5.yellow) {
                                                try {
                                                    if (atomicIntegerFieldUpdater2.get(cVar5) == 1) {
                                                        z10 = true;
                                                    } else {
                                                        z10 = false;
                                                    }
                                                    if (!z10) {
                                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f930b;
                                                        if (((int) (atomicLongFieldUpdater2.get(cVar5) & j6)) > cVar5.alpha) {
                                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                                int i5 = this.indexInArray;
                                                                foxtrot(0);
                                                                cVar5.golf(this, i5, 0);
                                                                int andDecrement = (int) (atomicLongFieldUpdater2.getAndDecrement(cVar5) & j6);
                                                                if (andDecrement != i5) {
                                                                    Object bravo = cVar5.yellow.bravo(andDecrement);
                                                                    Intrinsics.checkNotNull(bravo);
                                                                    a aVar = (a) bravo;
                                                                    cVar5.yellow.charlie(i5, aVar);
                                                                    aVar.foxtrot(i5);
                                                                    cVar5.golf(aVar, andDecrement, i5);
                                                                }
                                                                cVar5.yellow.charlie(andDecrement, null);
                                                                this.red = bVar4;
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    throw th3;
                                                }
                                            }
                                        }
                                        j7 = j6;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        hotel(b.teal);
    }
}
