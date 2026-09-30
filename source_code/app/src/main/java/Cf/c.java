package Cf;

import A0.z;
import Af.p;
import Af.t;
import androidx.appcompat.widget.P0;
import av.q;
import com.clevertap.android.sdk.Constants;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vf.ad;

/* loaded from: classes2.dex */
public final class c implements Executor, Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f929a = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f930b = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f931c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final t f932d = new t("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int alpha;
    private volatile /* synthetic */ long controlState$volatile;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;
    public final int purple;
    public final long red;
    public final String silver;
    public final f teal;
    public final f white;
    public final p yellow;

    /* JADX WARN: Type inference failed for: r3v14, types: [Cf.f, Af.k] */
    /* JADX WARN: Type inference failed for: r3v15, types: [Cf.f, Af.k] */
    public c(String str, long j5, int i4, int i5) {
        this.alpha = i4;
        this.purple = i5;
        this.red = j5;
        this.silver = str;
        if (i4 >= 1) {
            if (i5 >= i4) {
                if (i5 <= 2097150) {
                    if (j5 > 0) {
                        this.teal = new Af.k();
                        this.white = new Af.k();
                        this.yellow = new p((i4 + 1) * 2);
                        this.controlState$volatile = i4 << 42;
                        return;
                    }
                    throw new IllegalArgumentException(com.google.android.material.datepicker.j.kilo("Idle worker keep alive time ", j5, " must be positive").toString());
                }
                throw new IllegalArgumentException(q.delta(i5, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(z.juliet("Max pool size ", i5, i4, " should be greater than or equals to core pool size ").toString());
        }
        throw new IllegalArgumentException(q.delta(i4, "Core pool size ", " should be at least 1").toString());
    }

    public static /* synthetic */ void foxtrot(c cVar, Runnable runnable, int i4) {
        boolean z2;
        if ((i4 & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        cVar.echo(runnable, false, z2);
    }

    public final int charlie() {
        boolean z2;
        synchronized (this.yellow) {
            try {
                if (f931c.get(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f930b;
                long j5 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j5 & 2097151);
                int i5 = i4 - ((int) ((j5 & 4398044413952L) >> 21));
                if (i5 < 0) {
                    i5 = 0;
                }
                if (i5 >= this.alpha) {
                    return 0;
                }
                if (i4 >= this.purple) {
                    return 0;
                }
                int i10 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i10 > 0 && this.yellow.bravo(i10) == null) {
                    a aVar = new a(this, i10);
                    this.yellow.charlie(i10, aVar);
                    if (i10 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                        int i11 = i5 + 1;
                        aVar.start();
                        return i11;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalArgumentException("Failed requirement.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
    
        if (r1 == null) goto L39;
     */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        a aVar;
        int i4;
        i iVar;
        if (!f931c.compareAndSet(this, 0, 1)) {
            return;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !Intrinsics.areEqual(aVar.f928a, this)) {
            aVar = null;
        }
        synchronized (this.yellow) {
            i4 = (int) (f930b.get(this) & 2097151);
        }
        if (1 <= i4) {
            int i5 = 1;
            while (true) {
                Object bravo = this.yellow.bravo(i5);
                Intrinsics.checkNotNull(bravo);
                a aVar2 = (a) bravo;
                if (aVar2 != aVar) {
                    while (aVar2.getState() != Thread.State.TERMINATED) {
                        LockSupport.unpark(aVar2);
                        aVar2.join(10000L);
                    }
                    m mVar = aVar2.alpha;
                    f fVar = this.white;
                    mVar.getClass();
                    i iVar2 = (i) m.bravo.getAndSet(mVar, null);
                    if (iVar2 != null) {
                        fVar.alpha(iVar2);
                    }
                    while (true) {
                        i bravo2 = mVar.bravo();
                        if (bravo2 == null) {
                            break;
                        } else {
                            fVar.alpha(bravo2);
                        }
                    }
                }
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        this.white.bravo();
        this.teal.bravo();
        while (true) {
            if (aVar != null) {
                iVar = aVar.alpha(true);
            }
            iVar = (i) this.teal.delta();
            if (iVar == null && (iVar = (i) this.white.delta()) == null) {
                break;
            }
            try {
                iVar.run();
            } catch (Throwable th) {
                Thread currentThread2 = Thread.currentThread();
                currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
            }
        }
        if (aVar != null) {
            aVar.hotel(b.teal);
        }
        f929a.set(this, 0L);
        f930b.set(this, 0L);
    }

    public final void echo(Runnable runnable, boolean z2, boolean z10) {
        i jVar;
        long j5;
        a aVar;
        boolean alpha;
        b bVar;
        k.foxtrot.getClass();
        long nanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.alpha = nanoTime;
            jVar.purple = z2;
        } else {
            jVar = new j(runnable, nanoTime, z2);
        }
        boolean z11 = jVar.purple;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f930b;
        if (z11) {
            j5 = atomicLongFieldUpdater.addAndGet(this, 2097152L);
        } else {
            j5 = 0;
        }
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof a) {
            aVar = (a) currentThread;
        } else {
            aVar = null;
        }
        if (aVar == null || !Intrinsics.areEqual(aVar.f928a, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.red) != b.teal && (jVar.purple || bVar != b.purple)) {
            aVar.yellow = true;
            m mVar = aVar.alpha;
            if (z10) {
                jVar = mVar.alpha(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.bravo.getAndSet(mVar, jVar);
                if (iVar == null) {
                    jVar = null;
                } else {
                    jVar = mVar.alpha(iVar);
                }
            }
        }
        if (jVar != null) {
            if (jVar.purple) {
                alpha = this.white.alpha(jVar);
            } else {
                alpha = this.teal.alpha(jVar);
            }
            if (!alpha) {
                throw new RejectedExecutionException(P0.gold(new StringBuilder(), this.silver, " was terminated"));
            }
        }
        if (z11) {
            if (!papa() && !juliet(j5)) {
                papa();
                return;
            }
            return;
        }
        if (papa() || juliet(atomicLongFieldUpdater.get(this))) {
            return;
        }
        papa();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        foxtrot(this, runnable, 6);
    }

    public final void golf(a aVar, int i4, int i5) {
        while (true) {
            long j5 = f929a.get(this);
            int i10 = (int) (2097151 & j5);
            long j6 = (2097152 + j5) & (-2097152);
            if (i10 == i4) {
                if (i5 == 0) {
                    Object charlie = aVar.charlie();
                    while (true) {
                        if (charlie == f932d) {
                            i10 = -1;
                            break;
                        }
                        if (charlie == null) {
                            i10 = 0;
                            break;
                        }
                        a aVar2 = (a) charlie;
                        int bravo = aVar2.bravo();
                        if (bravo != 0) {
                            i10 = bravo;
                            break;
                        }
                        charlie = aVar2.charlie();
                    }
                } else {
                    i10 = i5;
                }
            }
            if (i10 >= 0) {
                if (f929a.compareAndSet(this, j5, i10 | j6)) {
                    return;
                }
            }
        }
    }

    public final boolean juliet(long j5) {
        int i4 = ((int) (2097151 & j5)) - ((int) ((j5 & 4398044413952L) >> 21));
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = this.alpha;
        if (i4 < i5) {
            int charlie = charlie();
            if (charlie == 1 && i5 > 1) {
                charlie();
            }
            if (charlie > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean papa() {
        t tVar;
        int i4;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f929a;
            long j5 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.yellow.bravo((int) (2097151 & j5));
            if (aVar == null) {
                aVar = null;
            } else {
                long j6 = (2097152 + j5) & (-2097152);
                Object charlie = aVar.charlie();
                while (true) {
                    tVar = f932d;
                    if (charlie == tVar) {
                        i4 = -1;
                        break;
                    }
                    if (charlie == null) {
                        i4 = 0;
                        break;
                    }
                    a aVar2 = (a) charlie;
                    i4 = aVar2.bravo();
                    if (i4 != 0) {
                        break;
                    }
                    charlie = aVar2.charlie();
                }
                if (i4 >= 0 && atomicLongFieldUpdater.compareAndSet(this, j5, j6 | i4)) {
                    aVar.golf(tVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f927b.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        int i4;
        ArrayList arrayList = new ArrayList();
        p pVar = this.yellow;
        int alpha = pVar.alpha();
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < alpha; i14++) {
            a aVar = (a) pVar.bravo(i14);
            if (aVar != null) {
                m mVar = aVar.alpha;
                mVar.getClass();
                if (m.bravo.get(mVar) != null) {
                    i4 = (m.charlie.get(mVar) - m.delta.get(mVar)) + 1;
                } else {
                    i4 = m.charlie.get(mVar) - m.delta.get(mVar);
                }
                int ordinal = aVar.red.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    i13++;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                i12++;
                                if (i4 > 0) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(i4);
                                    sb2.append('d');
                                    arrayList.add(sb2.toString());
                                }
                            }
                        } else {
                            i11++;
                        }
                    } else {
                        i10++;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i4);
                        sb3.append(Constants.INAPP_POSITION_BOTTOM);
                        arrayList.add(sb3.toString());
                    }
                } else {
                    i5++;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(i4);
                    sb4.append(Constants.INAPP_POSITION_CENTER);
                    arrayList.add(sb4.toString());
                }
            }
        }
        long j5 = f930b.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.silver);
        sb5.append('@');
        sb5.append(ad.romeo(this));
        sb5.append("[Pool Size {core = ");
        int i15 = this.alpha;
        sb5.append(i15);
        sb5.append(", max = ");
        sb5.append(this.purple);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i5);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.teal.charlie());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.white.charlie());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j5));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j5) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i15 - ((int) ((j5 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
