package io.ktor.utils.io;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.J6;
import vf.C3207k;

/* loaded from: classes2.dex */
public final class m implements t, ag {
    public static final /* synthetic */ AtomicReferenceFieldUpdater golf = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater hotel = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_closedCause");
    public final boolean bravo;
    private volatile int flushBufferSize;
    public final Gf.a charlie = new Object();
    public final Object delta = new Object();

    @NotNull
    volatile /* synthetic */ Object suspensionSlot = c.bravo;
    public final Gf.a echo = new Object();
    public final Gf.a foxtrot = new Object();

    @NotNull
    volatile /* synthetic */ Object _closedCause = null;

    /* JADX WARN: Type inference failed for: r1v1, types: [Gf.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [Gf.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [Gf.a, java.lang.Object] */
    public m(boolean z2) {
        this.bravo = z2;
    }

    public final void alpha() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        juliet();
        am amVar = ak.bravo;
        do {
            atomicReferenceFieldUpdater = hotel;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, amVar)) {
                bravo(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    public final void bravo(Throwable th) {
        a aVar;
        if (th != null) {
            aVar = new a(th);
        } else {
            g.alpha.getClass();
            aVar = b.bravo;
        }
        g gVar = (g) golf.getAndSet(this, aVar);
        if (gVar instanceof e) {
            ((e) gVar).alpha(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:11:0x0047->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object charlie(Pd.c cVar) {
        i iVar;
        Od.a aVar;
        int i4;
        m mVar;
        boolean z2;
        boolean z10;
        g gVar;
        Object sierra;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i5 = iVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                iVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = iVar.purple;
                aVar = Od.a.alpha;
                i4 = iVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        mVar = iVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Throwable echo = echo();
                    if (echo == null) {
                        juliet();
                        if (this.flushBufferSize < 1048576) {
                            return Unit.INSTANCE;
                        }
                        mVar = this;
                    } else {
                        throw echo;
                    }
                }
                while (this.flushBufferSize >= 1048576 && this._closedCause == null) {
                    iVar.alpha = mVar;
                    iVar.silver = 1;
                    C3207k c3207k = new C3207k(1, J6.delta(iVar));
                    c3207k.tango();
                    f fVar = new f(c3207k);
                    g gVar2 = (g) mVar.suspensionSlot;
                    z2 = gVar2 instanceof a;
                    if (!z2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = golf;
                        while (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar2, fVar)) {
                            if (atomicReferenceFieldUpdater.get(mVar) != gVar2) {
                                fVar.bravo();
                                break;
                            }
                        }
                    }
                    z10 = gVar2 instanceof f;
                    c cVar2 = c.bravo;
                    if (!z10) {
                        e eVar = (e) gVar2;
                        eVar.alpha(new ConcurrentIOException("write", eVar.charlie()));
                    } else if (gVar2 instanceof e) {
                        ((e) gVar2).bravo();
                    } else if (z2) {
                        fVar.alpha(((a) gVar2).bravo);
                        sierra = c3207k.sierra();
                        Od.a aVar2 = Od.a.alpha;
                        if (sierra == aVar) {
                            return aVar;
                        }
                    } else if (!Intrinsics.areEqual(gVar2, cVar2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (this.flushBufferSize >= 1048576 || this._closedCause != null) {
                        gVar = (g) mVar.suspensionSlot;
                        if (gVar instanceof f) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = golf;
                            while (true) {
                                if (atomicReferenceFieldUpdater2.compareAndSet(mVar, gVar, cVar2)) {
                                    ((e) gVar).bravo();
                                    break;
                                }
                                if (atomicReferenceFieldUpdater2.get(mVar) != gVar) {
                                    break;
                                }
                            }
                        }
                    }
                    sierra = c3207k.sierra();
                    Od.a aVar22 = Od.a.alpha;
                    if (sierra == aVar) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.purple;
        aVar = Od.a.alpha;
        i4 = iVar.silver;
        if (i4 == 0) {
        }
        while (this.flushBufferSize >= 1048576) {
            iVar.alpha = mVar;
            iVar.silver = 1;
            C3207k c3207k2 = new C3207k(1, J6.delta(iVar));
            c3207k2.tango();
            f fVar2 = new f(c3207k2);
            g gVar22 = (g) mVar.suspensionSlot;
            z2 = gVar22 instanceof a;
            if (!z2) {
            }
            z10 = gVar22 instanceof f;
            c cVar22 = c.bravo;
            if (!z10) {
            }
            if (this.flushBufferSize >= 1048576) {
            }
            gVar = (g) mVar.suspensionSlot;
            if (gVar instanceof f) {
            }
            sierra = c3207k2.sierra();
            Od.a aVar222 = Od.a.alpha;
            if (sierra == aVar) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // io.ktor.utils.io.t
    public final void delta(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        am amVar = new am(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = hotel;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, amVar) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        bravo(amVar.alpha(al.alpha));
    }

    @Override // io.ktor.utils.io.t
    public final Throwable echo() {
        am amVar = (am) this._closedCause;
        if (amVar != null) {
            return amVar.alpha(al.alpha);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // io.ktor.utils.io.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(int i4, Pd.c cVar) {
        h hVar;
        Od.a aVar;
        int i5;
        boolean z2;
        m mVar;
        long j5;
        Object sierra;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.teal;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                hVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = hVar.red;
                aVar = Od.a.alpha;
                i5 = hVar.teal;
                z2 = true;
                if (i5 == 0) {
                    if (i5 == 1) {
                        i4 = hVar.alpha;
                        mVar = hVar.purple;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Throwable echo = echo();
                    if (echo == null) {
                        if (this.echo.red >= i4) {
                            return Boolean.TRUE;
                        }
                        mVar = this;
                    } else {
                        throw echo;
                    }
                }
                do {
                    j5 = i4;
                    if (this.flushBufferSize + this.echo.red >= j5 && this._closedCause == null) {
                        hVar.purple = mVar;
                        hVar.alpha = i4;
                        hVar.teal = 1;
                        C3207k c3207k = new C3207k(1, J6.delta(hVar));
                        c3207k.tango();
                        d dVar = new d(c3207k);
                        g gVar = (g) mVar.suspensionSlot;
                        boolean z10 = gVar instanceof a;
                        if (!z10) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = golf;
                            while (!atomicReferenceFieldUpdater.compareAndSet(mVar, gVar, dVar)) {
                                if (atomicReferenceFieldUpdater.get(mVar) != gVar) {
                                    dVar.bravo();
                                    break;
                                }
                            }
                        }
                        boolean z11 = gVar instanceof d;
                        c cVar2 = c.bravo;
                        if (z11) {
                            e eVar = (e) gVar;
                            eVar.alpha(new ConcurrentIOException("read", eVar.charlie()));
                        } else if (gVar instanceof e) {
                            ((e) gVar).bravo();
                        } else if (z10) {
                            dVar.alpha(((a) gVar).bravo);
                            sierra = c3207k.sierra();
                            Od.a aVar2 = Od.a.alpha;
                        } else if (!Intrinsics.areEqual(gVar, cVar2)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.flushBufferSize + this.echo.red >= j5 || this._closedCause != null) {
                            g gVar2 = (g) mVar.suspensionSlot;
                            if (gVar2 instanceof d) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = golf;
                                while (true) {
                                    if (atomicReferenceFieldUpdater2.compareAndSet(mVar, gVar2, cVar2)) {
                                        ((e) gVar2).bravo();
                                        break;
                                    }
                                    if (atomicReferenceFieldUpdater2.get(mVar) != gVar2) {
                                        break;
                                    }
                                }
                            }
                        }
                        sierra = c3207k.sierra();
                        Od.a aVar22 = Od.a.alpha;
                    } else {
                        if (this.echo.red < 1048576) {
                            mike();
                        }
                        if (this.echo.red < j5) {
                            z2 = false;
                        }
                        return Boolean.valueOf(z2);
                    }
                } while (sierra != aVar);
                return aVar;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.red;
        aVar = Od.a.alpha;
        i5 = hVar.teal;
        z2 = true;
        if (i5 == 0) {
        }
        do {
            j5 = i4;
            if (this.flushBufferSize + this.echo.red >= j5) {
            }
            if (this.echo.red < 1048576) {
            }
            if (this.echo.red < j5) {
            }
            return Boolean.valueOf(z2);
        } while (sierra != aVar);
        return aVar;
    }

    @Override // io.ktor.utils.io.t
    public final Gf.a golf() {
        Throwable alpha;
        am amVar = (am) this._closedCause;
        if (amVar != null && (alpha = amVar.alpha(k.alpha)) != null) {
            throw alpha;
        }
        if (this.echo.hotel()) {
            mike();
        }
        return this.echo;
    }

    @Override // io.ktor.utils.io.t
    public final boolean hotel() {
        if (echo() == null) {
            if (!lima() || this.flushBufferSize != 0 || !this.echo.hotel()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:26|27))(3:28|29|(1:31))|11|12|(2:13|(3:22|23|24)(1:15))|19))|34|6|7|(0)(0)|11|12|(2:13|(0)(0))|19) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0045, code lost:
    
        r0 = kotlin.Result.INSTANCE;
        kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object india(Nd.c cVar) {
        j jVar;
        int i4;
        am amVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i5 = jVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                jVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = jVar.alpha;
                Object obj2 = Od.a.alpha;
                i4 = jVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Result.Companion companion = Result.INSTANCE;
                    jVar.red = 1;
                    if (charlie(jVar) == obj2) {
                        return obj2;
                    }
                }
                Result.m206constructorimpl(Unit.INSTANCE);
                amVar = ak.bravo;
                do {
                    atomicReferenceFieldUpdater = hotel;
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, amVar)) {
                        bravo(null);
                        return Unit.INSTANCE;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
                return Unit.INSTANCE;
            }
        }
        jVar = new j(this, cVar);
        Object obj3 = jVar.alpha;
        Object obj22 = Od.a.alpha;
        i4 = jVar.red;
        if (i4 == 0) {
        }
        Result.m206constructorimpl(Unit.INSTANCE);
        amVar = ak.bravo;
        do {
            atomicReferenceFieldUpdater = hotel;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, null, amVar)) {
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return Unit.INSTANCE;
    }

    public final void juliet() {
        if (!this.foxtrot.hotel()) {
            synchronized (this.delta) {
                Gf.a aVar = this.foxtrot;
                int i4 = (int) aVar.red;
                this.charlie.juliet(aVar);
                this.flushBufferSize += i4;
            }
            g gVar = (g) this.suspensionSlot;
            if (gVar instanceof d) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = golf;
                c cVar = c.bravo;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, cVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != gVar) {
                        return;
                    }
                }
                ((e) gVar).bravo();
            }
        }
    }

    public final Gf.a kilo() {
        Throwable alpha;
        if (lima()) {
            am amVar = (am) this._closedCause;
            if (amVar != null && (alpha = amVar.alpha(l.alpha)) != null) {
                throw alpha;
            }
            throw new ClosedWriteChannelException(null, 1, null);
        }
        return this.foxtrot;
    }

    public final boolean lima() {
        if (this._closedCause != null) {
            return true;
        }
        return false;
    }

    public final void mike() {
        synchronized (this.delta) {
            this.charlie.papa(this.echo);
            this.flushBufferSize = 0;
        }
        g gVar = (g) this.suspensionSlot;
        if (gVar instanceof f) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = golf;
            c cVar = c.bravo;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gVar, cVar)) {
                if (atomicReferenceFieldUpdater.get(this) != gVar) {
                    return;
                }
            }
            ((e) gVar).bravo();
        }
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }
}
