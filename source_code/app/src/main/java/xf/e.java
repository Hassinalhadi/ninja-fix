package xf;

import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import s2.InterfaceC2596d;
import s6.J6;
import vf.C3207k;
import vf.InterfaceC3206j;
import vf.ad;
import vf.j0;

/* loaded from: classes2.dex */
public class e implements i {
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int alpha;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater purple = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater red = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater silver = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater teal = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater white = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater yellow = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14132a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14133b = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14134c = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");

    public e(int i4) {
        long j5;
        this.alpha = i4;
        if (i4 >= 0) {
            m mVar = g.alpha;
            if (i4 != 0) {
                if (i4 != Integer.MAX_VALUE) {
                    j5 = i4;
                } else {
                    j5 = Long.MAX_VALUE;
                }
            } else {
                j5 = 0;
            }
            this.bufferEnd$volatile = j5;
            this.completedExpandBuffersAndPauseFlag$volatile = silver.get(this);
            m mVar2 = new m(0L, null, this, 3);
            this.sendSegment$volatile = mVar2;
            this.receiveSegment$volatile = mVar2;
            if (zulu()) {
                mVar2 = g.alpha;
                Intrinsics.charlie(mVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
            }
            this.bufferEndSegment$volatile = mVar2;
            this._closeCause$volatile = g.sierra;
            return;
        }
        throw new IllegalArgumentException(av.q.delta(i4, "Invalid channel capacity: ", ", should be >=0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object beige(e eVar, Pd.c cVar) {
        c cVar2;
        int i4;
        m mVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i5 = cVar2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                cVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                c cVar3 = cVar2;
                Object obj = cVar3.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = cVar3.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                        return ((l) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                m mVar2 = (m) yellow.get(eVar);
                while (!eVar.whiskey()) {
                    long andIncrement = red.getAndIncrement(eVar);
                    long j5 = g.bravo;
                    long j6 = andIncrement / j5;
                    int i10 = (int) (andIncrement % j5);
                    if (mVar2.charlie != j6) {
                        m papa = eVar.papa(j6, mVar2);
                        if (papa == null) {
                            continue;
                        } else {
                            mVar = papa;
                        }
                    } else {
                        mVar = mVar2;
                    }
                    e eVar2 = eVar;
                    Object crimson = eVar2.crimson(mVar, i10, andIncrement, null);
                    if (crimson != g.mike) {
                        if (crimson == g.oscar) {
                            if (andIncrement < eVar2.tango()) {
                                mVar.bravo();
                            }
                            eVar = eVar2;
                            mVar2 = mVar;
                        } else {
                            if (crimson == g.november) {
                                cVar3.red = 1;
                                Object black = eVar2.black(mVar, i10, andIncrement, cVar3);
                                if (black == aVar) {
                                    return aVar;
                                }
                                return black;
                            }
                            mVar.bravo();
                            return crimson;
                        }
                    } else {
                        throw new IllegalStateException("unexpected");
                    }
                }
                return new j(eVar.quebec());
            }
        }
        cVar2 = new c(eVar, cVar);
        c cVar32 = cVar2;
        Object obj2 = cVar32.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = cVar32.red;
        if (i4 == 0) {
        }
    }

    public static final m charlie(e eVar, long j5, m mVar) {
        Object alpha;
        e eVar2;
        eVar.getClass();
        m mVar2 = g.alpha;
        f fVar = f.alpha;
        loop0: while (true) {
            alpha = Af.b.alpha(mVar, j5, fVar);
            if (!Af.f.delta(alpha)) {
                Af.r bravo = Af.f.bravo(alpha);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = white;
                    Af.r rVar = (Af.r) atomicReferenceFieldUpdater.get(eVar);
                    if (rVar.charlie >= bravo.charlie) {
                        break loop0;
                    }
                    if (!bravo.juliet()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, rVar, bravo)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != rVar) {
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
        boolean delta = Af.f.delta(alpha);
        AtomicLongFieldUpdater atomicLongFieldUpdater = red;
        if (delta) {
            eVar.xray();
            if (mVar.charlie * g.bravo < atomicLongFieldUpdater.get(eVar)) {
                mVar.bravo();
                return null;
            }
        } else {
            m mVar3 = (m) Af.f.bravo(alpha);
            long j6 = mVar3.charlie;
            if (j6 > j5) {
                long j7 = g.bravo * j6;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = purple;
                    long j10 = atomicLongFieldUpdater2.get(eVar);
                    long j11 = 1152921504606846975L & j10;
                    if (j11 >= j7) {
                        eVar2 = eVar;
                        break;
                    }
                    eVar2 = eVar;
                    if (atomicLongFieldUpdater2.compareAndSet(eVar2, j10, j11 + (((int) (j10 >> 60)) << 60))) {
                        break;
                    }
                    eVar = eVar2;
                }
                if (j6 * g.bravo < atomicLongFieldUpdater.get(eVar2)) {
                    mVar3.bravo();
                }
            } else {
                return mVar3;
            }
        }
        return null;
    }

    public static boolean coral(Object obj) {
        if (obj instanceof InterfaceC3206j) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return g.alpha((InterfaceC3206j) obj, Unit.INSTANCE, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public static final void delta(e eVar, Object obj, C3207k c3207k) {
        eVar.getClass();
        Throwable sierra = eVar.sierra();
        Result.Companion companion = Result.INSTANCE;
        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(sierra)));
    }

    public static final int echo(e eVar, m mVar, int i4, Object obj, long j5, Object obj2, boolean z2) {
        eVar.getClass();
        mVar.november(i4, obj);
        if (z2) {
            return eVar.cyan(mVar, i4, obj, j5, obj2, z2);
        }
        Object lima = mVar.lima(i4);
        if (lima == null) {
            if (eVar.golf(j5)) {
                if (mVar.kilo(i4, null, g.delta)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.kilo(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (lima instanceof j0) {
            mVar.november(i4, null);
            if (eVar.bronze(lima, obj)) {
                mVar.oscar(i4, g.india);
                return 0;
            }
            Af.t tVar = g.kilo;
            if (mVar.foxtrot.getAndSet((i4 * 2) + 1, tVar) != tVar) {
                mVar.mike(i4, true);
                return 5;
            }
            return 5;
        }
        return eVar.cyan(mVar, i4, obj, j5, obj2, z2);
    }

    public static void uniform(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = teal;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) == 0) {
            return;
        }
        do {
        } while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0);
    }

    @Override // xf.t
    public final Object alpha() {
        m mVar;
        j0 j0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = red;
        long j5 = atomicLongFieldUpdater.get(this);
        long j6 = purple.get(this);
        if (victor(j6, true)) {
            return new j(quebec());
        }
        long j7 = j6 & 1152921504606846975L;
        k kVar = l.bravo;
        if (j5 >= j7) {
            return kVar;
        }
        Object obj = g.kilo;
        m mVar2 = (m) yellow.get(this);
        while (!whiskey()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = g.bravo;
            long j11 = andIncrement / j10;
            int i4 = (int) (andIncrement % j10);
            if (mVar2.charlie != j11) {
                m papa = papa(j11, mVar2);
                if (papa == null) {
                    continue;
                } else {
                    mVar = papa;
                }
            } else {
                mVar = mVar2;
            }
            Object crimson = crimson(mVar, i4, andIncrement, obj);
            m mVar3 = mVar;
            if (crimson == g.mike) {
                if (obj instanceof j0) {
                    j0Var = (j0) obj;
                } else {
                    j0Var = null;
                }
                if (j0Var != null) {
                    j0Var.alpha(mVar3, i4);
                }
                emerald(andIncrement);
                mVar3.india();
                return kVar;
            }
            if (crimson == g.oscar) {
                if (andIncrement < tango()) {
                    mVar3.bravo();
                }
                mVar2 = mVar3;
            } else {
                if (crimson != g.november) {
                    mVar3.bravo();
                    return crimson;
                }
                throw new IllegalStateException("unexpected");
            }
        }
        return new j(quebec());
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void amber(long j5, m mVar) {
        m mVar2;
        m mVar3;
        while (mVar.charlie < j5 && (mVar3 = (m) mVar.charlie()) != null) {
            mVar = mVar3;
        }
        while (true) {
            if (!mVar.delta() || (mVar2 = (m) mVar.charlie()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14132a;
                    Af.r rVar = (Af.r) atomicReferenceFieldUpdater.get(this);
                    if (rVar.charlie < mVar.charlie) {
                        if (!mVar.juliet()) {
                            break;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, rVar, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != rVar) {
                                if (mVar.foxtrot()) {
                                    mVar.echo();
                                }
                            }
                        }
                        if (rVar.foxtrot()) {
                            rVar.echo();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            mVar = mVar2;
        }
    }

    public final Object azure(Nd.c cVar, Object obj) {
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        Throwable sierra = sierra();
        Result.Companion companion = Result.INSTANCE;
        c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(sierra)));
        Object sierra2 = c3207k.sierra();
        if (sierra2 == Od.a.alpha) {
            return sierra2;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object black(m mVar, int i4, long j5, Pd.c cVar) {
        d dVar;
        int i5;
        m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.red;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                dVar.red = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = dVar.alpha;
                Od.a aVar = Od.a.alpha;
                i5 = dVar.red;
                if (i5 == 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    dVar.red = 1;
                    C3207k tango = ad.tango(J6.delta(dVar));
                    try {
                        s sVar = new s(tango);
                        Object crimson = crimson(mVar, i4, j5, sVar);
                        if (crimson == g.mike) {
                            sVar.alpha(mVar, i4);
                        } else if (crimson == g.oscar) {
                            if (j5 < tango()) {
                                mVar.bravo();
                            }
                            m mVar3 = (m) yellow.get(this);
                            while (true) {
                                if (whiskey()) {
                                    Result.Companion companion = Result.INSTANCE;
                                    tango.resumeWith(Result.m206constructorimpl(new l(new j(quebec()))));
                                    break;
                                }
                                long andIncrement = red.getAndIncrement(this);
                                long j6 = g.bravo;
                                long j7 = andIncrement / j6;
                                int i11 = (int) (andIncrement % j6);
                                if (mVar3.charlie != j7) {
                                    m papa = papa(j7, mVar3);
                                    if (papa != null) {
                                        mVar2 = papa;
                                    }
                                } else {
                                    mVar2 = mVar3;
                                }
                                Object crimson2 = crimson(mVar2, i11, andIncrement, sVar);
                                m mVar4 = mVar2;
                                if (crimson2 == g.mike) {
                                    sVar.alpha(mVar4, i11);
                                    break;
                                }
                                if (crimson2 == g.oscar) {
                                    if (andIncrement < tango()) {
                                        mVar4.bravo();
                                    }
                                    mVar3 = mVar4;
                                } else if (crimson2 != g.november) {
                                    mVar4.bravo();
                                    tango.hotel(new l(crimson2), null);
                                } else {
                                    throw new IllegalStateException("unexpected");
                                }
                            }
                        } else {
                            mVar.bravo();
                            tango.hotel(new l(crimson), null);
                        }
                        obj = tango.sierra();
                        Od.a aVar2 = Od.a.alpha;
                        if (obj == aVar) {
                            return aVar;
                        }
                    } catch (Throwable th) {
                        tango.amber();
                        throw th;
                    }
                }
                return ((l) obj).alpha;
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.alpha;
        Od.a aVar3 = Od.a.alpha;
        i5 = dVar.red;
        if (i5 == 0) {
        }
        return ((l) obj2).alpha;
    }

    public final void blue(j0 j0Var, boolean z2) {
        Throwable sierra;
        if (j0Var instanceof InterfaceC3206j) {
            Nd.c cVar = (Nd.c) j0Var;
            Result.Companion companion = Result.INSTANCE;
            if (z2) {
                sierra = romeo();
            } else {
                sierra = sierra();
            }
            cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(sierra)));
            return;
        }
        if (j0Var instanceof s) {
            C3207k c3207k = ((s) j0Var).alpha;
            Result.Companion companion2 = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(new l(new j(quebec()))));
            return;
        }
        if (j0Var instanceof b) {
            b bVar = (b) j0Var;
            C3207k c3207k2 = bVar.purple;
            Intrinsics.checkNotNull(c3207k2);
            bVar.purple = null;
            bVar.alpha = g.lima;
            Throwable quebec = bVar.red.quebec();
            if (quebec == null) {
                Result.Companion companion3 = Result.INSTANCE;
                c3207k2.resumeWith(Result.m206constructorimpl(Boolean.FALSE));
                return;
            } else {
                Result.Companion companion4 = Result.INSTANCE;
                c3207k2.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(quebec)));
                return;
            }
        }
        throw new IllegalStateException(("Unexpected waiter: " + j0Var).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x01a6, code lost:
    
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c0, code lost:
    
        delta(r1, r4, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018a A[RETURN] */
    @Override // xf.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bravo(Nd.c cVar, Object obj) {
        int echo;
        Object m206constructorimpl;
        Object sierra;
        Od.a aVar;
        Object obj2;
        e eVar;
        m mVar;
        int i4;
        int i5;
        boolean z2;
        e eVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = white;
        m mVar2 = (m) atomicReferenceFieldUpdater.get(eVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = purple;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(eVar2);
            long j5 = andIncrement & 1152921504606846975L;
            boolean victor = eVar2.victor(andIncrement, false);
            int i10 = g.bravo;
            long j6 = i10;
            long j7 = j5 / j6;
            int i11 = (int) (j5 % j6);
            if (mVar2.charlie != j7) {
                m charlie = charlie(eVar2, j7, mVar2);
                if (charlie == null) {
                    if (victor) {
                        Object azure = azure(cVar, obj);
                        if (azure == Od.a.alpha) {
                            return azure;
                        }
                    }
                } else {
                    mVar2 = charlie;
                }
            }
            int echo2 = echo(eVar2, mVar2, i11, obj, j5, null, victor);
            if (echo2 != 0) {
                if (echo2 == 1) {
                    break;
                }
                if (echo2 != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = red;
                    if (echo2 != 3) {
                        if (echo2 != 4) {
                            if (echo2 == 5) {
                                mVar2.bravo();
                            }
                        } else {
                            if (j5 < atomicLongFieldUpdater2.get(eVar2)) {
                                mVar2.bravo();
                            }
                            Object azure2 = azure(cVar, obj);
                            if (azure2 == Od.a.alpha) {
                                return azure2;
                            }
                        }
                    } else {
                        C3207k tango = ad.tango(J6.delta(cVar));
                        Object obj3 = obj;
                        try {
                            echo = echo(eVar2, mVar2, i11, obj3, j5, tango, false);
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            if (echo != 0) {
                                if (echo != 1) {
                                    if (echo != 2) {
                                        if (echo != 4) {
                                            String str = "unexpected";
                                            if (echo == 5) {
                                                mVar2.bravo();
                                                m mVar3 = (m) atomicReferenceFieldUpdater.get(eVar2);
                                                while (true) {
                                                    long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(eVar2);
                                                    long j10 = andIncrement2 & 1152921504606846975L;
                                                    boolean victor2 = eVar2.victor(andIncrement2, false);
                                                    int i12 = g.bravo;
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater;
                                                    long j11 = i12;
                                                    String str2 = str;
                                                    long j12 = j10 / j11;
                                                    int i13 = (int) (j10 % j11);
                                                    if (mVar3.charlie != j12) {
                                                        m charlie2 = charlie(eVar2, j12, mVar3);
                                                        if (charlie2 == null) {
                                                            if (victor2) {
                                                                break;
                                                            }
                                                            atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                            str = str2;
                                                        } else {
                                                            i4 = i12;
                                                            i5 = i13;
                                                            z2 = victor2;
                                                            mVar = charlie2;
                                                        }
                                                    } else {
                                                        mVar = mVar3;
                                                        i4 = i12;
                                                        i5 = i13;
                                                        z2 = victor2;
                                                    }
                                                    int echo3 = echo(eVar2, mVar, i5, obj3, j10, tango, z2);
                                                    Object obj4 = obj3;
                                                    eVar = eVar2;
                                                    m mVar4 = mVar;
                                                    int i14 = i5;
                                                    obj2 = obj4;
                                                    if (echo3 != 0) {
                                                        if (echo3 != 1) {
                                                            if (echo3 != 2) {
                                                                if (echo3 != 3) {
                                                                    if (echo3 != 4) {
                                                                        if (echo3 == 5) {
                                                                            mVar4.bravo();
                                                                        }
                                                                        mVar3 = mVar4;
                                                                        eVar2 = eVar;
                                                                        atomicLongFieldUpdater = atomicLongFieldUpdater3;
                                                                        str = str2;
                                                                        obj3 = obj2;
                                                                    } else if (j10 < atomicLongFieldUpdater2.get(eVar)) {
                                                                        mVar4.bravo();
                                                                    }
                                                                } else {
                                                                    throw new IllegalStateException(str2);
                                                                }
                                                            } else if (z2) {
                                                                mVar4.india();
                                                            } else {
                                                                tango.alpha(mVar4, i14 + i4);
                                                            }
                                                        } else {
                                                            Result.Companion companion = Result.INSTANCE;
                                                            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                                                            break;
                                                        }
                                                    } else {
                                                        mVar4.bravo();
                                                        Result.Companion companion2 = Result.INSTANCE;
                                                        m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                throw new IllegalStateException("unexpected");
                                            }
                                        } else {
                                            obj2 = obj3;
                                            eVar = eVar2;
                                            if (j5 < atomicLongFieldUpdater2.get(eVar)) {
                                                mVar2.bravo();
                                            }
                                        }
                                        delta(eVar, obj2, tango);
                                    } else {
                                        tango.alpha(mVar2, i11 + i10);
                                    }
                                    sierra = tango.sierra();
                                    aVar = Od.a.alpha;
                                    if (sierra != aVar) {
                                        sierra = Unit.INSTANCE;
                                    }
                                    if (sierra == aVar) {
                                        return sierra;
                                    }
                                } else {
                                    Result.Companion companion3 = Result.INSTANCE;
                                    m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                                }
                            } else {
                                mVar2.bravo();
                                Result.Companion companion4 = Result.INSTANCE;
                                m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                            }
                            tango.resumeWith(m206constructorimpl);
                            sierra = tango.sierra();
                            aVar = Od.a.alpha;
                            if (sierra != aVar) {
                            }
                            if (sierra == aVar) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            tango.amber();
                            throw th;
                        }
                    }
                } else if (victor) {
                    mVar2.india();
                    Object azure3 = azure(cVar, obj);
                    if (azure3 == Od.a.alpha) {
                        return azure3;
                    }
                }
            } else {
                mVar2.bravo();
                break;
            }
        }
    }

    public final boolean bronze(Object obj, Object obj2) {
        if (obj instanceof s) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.alpha(((s) obj).alpha, new l(obj2), null);
        }
        if (obj instanceof b) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            b bVar = (b) obj;
            C3207k c3207k = bVar.purple;
            Intrinsics.checkNotNull(c3207k);
            bVar.purple = null;
            bVar.alpha = obj2;
            Boolean bool = Boolean.TRUE;
            bVar.red.getClass();
            return g.alpha(c3207k, bool, null);
        }
        if (obj instanceof InterfaceC3206j) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            return g.alpha((InterfaceC3206j) obj, obj2, null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final Object crimson(m mVar, int i4, long j5, Object obj) {
        Object lima = mVar.lima(i4);
        AtomicReferenceArray atomicReferenceArray = mVar.foxtrot;
        AtomicLongFieldUpdater atomicLongFieldUpdater = purple;
        if (lima == null) {
            if (j5 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return g.november;
                }
                if (mVar.kilo(i4, lima, obj)) {
                    oscar();
                    return g.mike;
                }
            }
        } else if (lima == g.delta && mVar.kilo(i4, lima, g.india)) {
            oscar();
            Object obj2 = atomicReferenceArray.get(i4 * 2);
            mVar.november(i4, null);
            return obj2;
        }
        while (true) {
            Object lima2 = mVar.lima(i4);
            if (lima2 != null && lima2 != g.echo) {
                if (lima2 == g.delta) {
                    if (mVar.kilo(i4, lima2, g.india)) {
                        oscar();
                        Object obj3 = atomicReferenceArray.get(i4 * 2);
                        mVar.november(i4, null);
                        return obj3;
                    }
                } else {
                    Af.t tVar = g.juliet;
                    if (lima2 == tVar) {
                        return g.oscar;
                    }
                    if (lima2 == g.hotel) {
                        return g.oscar;
                    }
                    if (lima2 == g.lima) {
                        oscar();
                        return g.oscar;
                    }
                    if (lima2 != g.golf && mVar.kilo(i4, lima2, g.foxtrot)) {
                        boolean z2 = lima2 instanceof v;
                        if (z2) {
                            lima2 = ((v) lima2).alpha;
                        }
                        if (coral(lima2)) {
                            mVar.oscar(i4, g.india);
                            oscar();
                            Object obj4 = atomicReferenceArray.get(i4 * 2);
                            mVar.november(i4, null);
                            return obj4;
                        }
                        mVar.oscar(i4, tVar);
                        mVar.india();
                        if (z2) {
                            oscar();
                        }
                        return g.oscar;
                    }
                }
            } else if (j5 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (mVar.kilo(i4, lima2, g.hotel)) {
                    oscar();
                    return g.oscar;
                }
            } else {
                if (obj == null) {
                    return g.november;
                }
                if (mVar.kilo(i4, lima2, obj)) {
                    oscar();
                    return g.mike;
                }
            }
        }
    }

    public final int cyan(m mVar, int i4, Object obj, long j5, Object obj2, boolean z2) {
        while (true) {
            Object lima = mVar.lima(i4);
            if (lima == null) {
                if (golf(j5) && !z2) {
                    if (mVar.kilo(i4, null, g.delta)) {
                        break;
                    }
                } else if (z2) {
                    if (mVar.kilo(i4, null, g.juliet)) {
                        mVar.india();
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (mVar.kilo(i4, null, obj2)) {
                        return 2;
                    }
                }
            } else if (lima == g.echo) {
                if (mVar.kilo(i4, lima, g.delta)) {
                    break;
                }
            } else {
                Af.t tVar = g.kilo;
                if (lima == tVar) {
                    mVar.november(i4, null);
                    return 5;
                }
                if (lima == g.hotel) {
                    mVar.november(i4, null);
                    return 5;
                }
                if (lima == g.lima) {
                    mVar.november(i4, null);
                    xray();
                    return 4;
                }
                mVar.november(i4, null);
                if (lima instanceof v) {
                    lima = ((v) lima).alpha;
                }
                if (bronze(lima, obj)) {
                    mVar.oscar(i4, g.india);
                    return 0;
                }
                if (mVar.foxtrot.getAndSet((i4 * 2) + 1, tVar) != tVar) {
                    mVar.mike(i4, true);
                }
                return 5;
            }
        }
        return 1;
    }

    public final void emerald(long j5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        boolean z2;
        e eVar = this;
        if (!eVar.zulu()) {
            while (true) {
                atomicLongFieldUpdater = silver;
                if (atomicLongFieldUpdater.get(eVar) > j5) {
                    break;
                } else {
                    eVar = this;
                }
            }
            int i4 = g.charlie;
            int i5 = 0;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = teal;
                if (i5 < i4) {
                    long j6 = atomicLongFieldUpdater.get(eVar);
                    if (j6 != (4611686018427387903L & atomicLongFieldUpdater2.get(eVar)) || j6 != atomicLongFieldUpdater.get(eVar)) {
                        i5++;
                    } else {
                        return;
                    }
                } else {
                    while (true) {
                        long j7 = atomicLongFieldUpdater2.get(eVar);
                        if (atomicLongFieldUpdater2.compareAndSet(eVar, j7, (j7 & 4611686018427387903L) + 4611686018427387904L)) {
                            break;
                        } else {
                            eVar = this;
                        }
                    }
                    while (true) {
                        long j10 = atomicLongFieldUpdater.get(eVar);
                        long j11 = atomicLongFieldUpdater2.get(eVar);
                        long j12 = j11 & 4611686018427387903L;
                        if ((j11 & 4611686018427387904L) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (j10 == j12 && j10 == atomicLongFieldUpdater.get(eVar)) {
                            break;
                        }
                        if (!z2) {
                            atomicLongFieldUpdater2.compareAndSet(this, j11, 4611686018427387904L + j12);
                        }
                        eVar = this;
                    }
                    while (true) {
                        long j13 = atomicLongFieldUpdater2.get(eVar);
                        if (atomicLongFieldUpdater2.compareAndSet(eVar, j13, j13 & 4611686018427387903L)) {
                            return;
                        } else {
                            eVar = this;
                        }
                    }
                }
            }
        }
    }

    @Override // xf.t
    public final void foxtrot(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        juliet(cancellationException, true);
    }

    public final boolean golf(long j5) {
        if (j5 >= silver.get(this) && j5 >= red.get(this) + this.alpha) {
            return false;
        }
        return true;
    }

    public final boolean hotel(Throwable th) {
        return juliet(th, false);
    }

    @Override // xf.t
    public final Object india(Nd.c cVar) {
        m mVar;
        Throwable th;
        m mVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
        m mVar3 = (m) atomicReferenceFieldUpdater.get(this);
        while (!whiskey()) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = red;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j5 = g.bravo;
            long j6 = andIncrement / j5;
            int i4 = (int) (andIncrement % j5);
            if (mVar3.charlie != j6) {
                m papa = papa(j6, mVar3);
                if (papa == null) {
                    continue;
                } else {
                    mVar = papa;
                }
            } else {
                mVar = mVar3;
            }
            Object crimson = crimson(mVar, i4, andIncrement, null);
            Af.t tVar = g.mike;
            if (crimson != tVar) {
                Af.t tVar2 = g.oscar;
                if (crimson == tVar2) {
                    if (andIncrement < tango()) {
                        mVar.bravo();
                    }
                    mVar3 = mVar;
                } else if (crimson == g.november) {
                    C3207k tango = ad.tango(J6.delta(cVar));
                    e eVar = this;
                    try {
                        Object crimson2 = eVar.crimson(mVar, i4, andIncrement, tango);
                        if (crimson2 == tVar) {
                            tango.alpha(mVar, i4);
                        } else {
                            if (crimson2 == tVar2) {
                                if (andIncrement < tango()) {
                                    mVar.bravo();
                                }
                                m mVar4 = (m) atomicReferenceFieldUpdater.get(this);
                                while (true) {
                                    if (whiskey()) {
                                        Result.Companion companion = Result.INSTANCE;
                                        tango.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(romeo())));
                                        break;
                                    }
                                    C3207k c3207k = tango;
                                    try {
                                        long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                        long j7 = g.bravo;
                                        long j10 = andIncrement2 / j7;
                                        int i5 = (int) (andIncrement2 % j7);
                                        if (mVar4.charlie != j10) {
                                            try {
                                                m papa2 = papa(j10, mVar4);
                                                if (papa2 == null) {
                                                    tango = c3207k;
                                                } else {
                                                    mVar2 = papa2;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                tango = c3207k;
                                                tango.amber();
                                                throw th;
                                            }
                                        } else {
                                            mVar2 = mVar4;
                                        }
                                        crimson2 = eVar.crimson(mVar2, i5, andIncrement2, c3207k);
                                        m mVar5 = mVar2;
                                        tango = c3207k;
                                        if (crimson2 == g.mike) {
                                            tango.alpha(mVar5, i5);
                                            break;
                                        }
                                        if (crimson2 == g.oscar) {
                                            if (andIncrement2 < tango()) {
                                                mVar5.bravo();
                                            }
                                            eVar = this;
                                            mVar4 = mVar5;
                                        } else if (crimson2 != g.november) {
                                            mVar5.bravo();
                                        } else {
                                            throw new IllegalStateException("unexpected");
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        tango = c3207k;
                                        th = th;
                                        tango.amber();
                                        throw th;
                                    }
                                }
                            } else {
                                mVar.bravo();
                            }
                            tango.hotel(crimson2, null);
                        }
                        Object sierra = tango.sierra();
                        Od.a aVar = Od.a.alpha;
                        return sierra;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    mVar.bravo();
                    return crimson;
                }
            } else {
                throw new IllegalStateException("unexpected");
            }
        }
        Throwable romeo = romeo();
        int i10 = Af.s.alpha;
        throw romeo;
    }

    @Override // xf.t
    public final b iterator() {
        return new b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r6.compareAndSet(r12, r5, r13) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r6.get(r12) == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r14 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r3.compareAndSet(r4, r5, (3 << 60) + (r5 & 1152921504606846975L)) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        xray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        r13 = xf.e.f14134c;
        r14 = r13.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        r0 = xf.g.quebec;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r13.compareAndSet(r12, r14, r0) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r13.get(r12) == r14) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000a, code lost:
    
        if (r14 != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0081, code lost:
    
        if (r14 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        kotlin.jvm.internal.x.echo(1, r14);
        r13 = (kotlin.jvm.functions.Function1) r14;
        ((kotlin.jvm.functions.Function1) r14).invoke(quebec());
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0079, code lost:
    
        r0 = xf.g.romeo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
    
        r5 = r3.get(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004c, code lost:
    
        r5 = r3.get(r12);
        r13 = (int) (r5 >> 60);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r13 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0055, code lost:
    
        if (r13 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0058, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0067, code lost:
    
        if (r3.compareAndSet(r4, r5, (r7 << 60) + r13) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (((int) (r5 >> 60)) != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x005e, code lost:
    
        r13 = r5 & 1152921504606846975L;
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x002f, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0024, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = xf.g.alpha;
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3.compareAndSet(r4, r5, (r5 & 1152921504606846975L) + (1 << 60)) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        r5 = xf.g.sierra;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r6 = xf.e.f14133b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean juliet(Throwable th, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = purple;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x008f, code lost:
    
        r1 = (xf.m) ((Af.c) Af.c.bravo.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m kilo(long j5) {
        Object obj;
        long j6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2 = f14132a.get(this);
        m mVar = (m) white.get(this);
        if (mVar.charlie > ((m) obj2).charlie) {
            obj2 = mVar;
        }
        m mVar2 = (m) yellow.get(this);
        if (mVar2.charlie > ((m) obj2).charlie) {
            obj2 = mVar2;
        }
        Af.c cVar = (Af.c) obj2;
        loop0: while (true) {
            cVar.getClass();
            Object obj3 = Af.c.alpha.get(cVar);
            Af.t tVar = Af.b.alpha;
            obj = null;
            if (obj3 == tVar) {
                break;
            }
            Af.c cVar2 = (Af.c) obj3;
            if (cVar2 == null) {
                do {
                    atomicReferenceFieldUpdater = Af.c.alpha;
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, tVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        m mVar3 = (m) cVar;
        if (yankee()) {
            m mVar4 = mVar3;
            loop2: do {
                int i4 = g.bravo - 1;
                while (true) {
                    if (-1 >= i4) {
                        break;
                    }
                    j6 = (mVar4.charlie * g.bravo) + i4;
                    if (j6 < red.get(this)) {
                        break loop2;
                    }
                    while (true) {
                        Object lima = mVar4.lima(i4);
                        if (lima != null && lima != g.echo) {
                            if (lima == g.delta) {
                                break loop2;
                            }
                        } else if (mVar4.kilo(i4, lima, g.lima)) {
                            mVar4.india();
                            break;
                        }
                    }
                    i4--;
                }
            } while (mVar4 != null);
            j6 = -1;
            if (j6 != -1) {
                lima(j6);
            }
        }
        loop5: for (m mVar5 = mVar3; mVar5 != null; mVar5 = (m) ((Af.c) Af.c.bravo.get(mVar5))) {
            for (int i5 = g.bravo - 1; -1 < i5; i5--) {
                if ((mVar5.charlie * g.bravo) + i5 < j5) {
                    break loop5;
                }
                while (true) {
                    Object lima2 = mVar5.lima(i5);
                    if (lima2 != null && lima2 != g.echo) {
                        if (lima2 instanceof v) {
                            if (mVar5.kilo(i5, lima2, g.lima)) {
                                obj = Af.f.echo(obj, ((v) lima2).alpha);
                                mVar5.mike(i5, true);
                                break;
                            }
                        } else {
                            if (!(lima2 instanceof j0)) {
                                break;
                            }
                            if (mVar5.kilo(i5, lima2, g.lima)) {
                                obj = Af.f.echo(obj, lima2);
                                mVar5.mike(i5, true);
                                break;
                            }
                        }
                    } else if (mVar5.kilo(i5, lima2, g.lima)) {
                        mVar5.india();
                        break;
                    }
                }
            }
        }
        if (obj != null) {
            if (!(obj instanceof ArrayList)) {
                blue((j0) obj, true);
                return mVar3;
            }
            ArrayList arrayList = (ArrayList) obj;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                blue((j0) arrayList.get(size), true);
            }
        }
        return mVar3;
    }

    public final void lima(long j5) {
        m mVar = (m) yellow.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = red;
            long j6 = atomicLongFieldUpdater.get(this);
            if (j5 < Math.max(this.alpha + j6, silver.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j6, 1 + j6)) {
                long j7 = g.bravo;
                long j10 = j6 / j7;
                int i4 = (int) (j6 % j7);
                if (mVar.charlie != j10) {
                    m papa = papa(j10, mVar);
                    if (papa != null) {
                        mVar = papa;
                    }
                }
                m mVar2 = mVar;
                if (crimson(mVar2, i4, j6, null) == g.oscar) {
                    if (j6 < tango()) {
                        mVar2.bravo();
                    }
                } else {
                    mVar2.bravo();
                }
                mVar = mVar2;
            }
        }
    }

    @Override // xf.u
    public Object mike(Object obj) {
        boolean z2;
        j0 j0Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = purple;
        long j5 = atomicLongFieldUpdater.get(this);
        boolean z10 = false;
        long j6 = 1152921504606846975L;
        if (victor(j5, false)) {
            z2 = false;
        } else {
            z2 = !golf(j5 & 1152921504606846975L);
        }
        k kVar = l.bravo;
        if (z2) {
            return kVar;
        }
        InterfaceC2596d interfaceC2596d = g.juliet;
        m mVar = (m) white.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = andIncrement & j6;
            boolean victor = victor(andIncrement, z10);
            int i4 = g.bravo;
            long j10 = i4;
            long j11 = j7 / j10;
            int i5 = (int) (j7 % j10);
            if (mVar.charlie != j11) {
                m charlie = charlie(this, j11, mVar);
                if (charlie == null) {
                    if (victor) {
                        return new j(sierra());
                    }
                    z10 = false;
                    j6 = 1152921504606846975L;
                } else {
                    mVar = charlie;
                }
            }
            int echo = echo(this, mVar, i5, obj, j7, interfaceC2596d, victor);
            if (echo != 0) {
                if (echo != 1) {
                    if (echo != 2) {
                        if (echo != 3) {
                            if (echo != 4) {
                                if (echo == 5) {
                                    mVar.bravo();
                                }
                                z10 = false;
                                j6 = 1152921504606846975L;
                            } else {
                                if (j7 < red.get(this)) {
                                    mVar.bravo();
                                }
                                return new j(sierra());
                            }
                        } else {
                            throw new IllegalStateException("unexpected");
                        }
                    } else {
                        if (victor) {
                            mVar.india();
                            return new j(sierra());
                        }
                        if (interfaceC2596d instanceof j0) {
                            j0Var = (j0) interfaceC2596d;
                        } else {
                            j0Var = null;
                        }
                        if (j0Var != null) {
                            j0Var.alpha(mVar, i5 + i4);
                        }
                        mVar.india();
                        return kVar;
                    }
                } else {
                    return Unit.INSTANCE;
                }
            } else {
                mVar.bravo();
                return Unit.INSTANCE;
            }
        }
    }

    @Override // xf.t
    public final Object november(zf.t tVar) {
        return beige(this, tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x00bd, code lost:
    
        if ((r0.addAndGet(r15, r4 - r8) & 4611686018427387904L) != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00c6, code lost:
    
        if ((r0.get(r15) & 4611686018427387904L) == 0) goto L144;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void oscar() {
        Object alpha;
        if (zulu()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14132a;
        m mVar = (m) atomicReferenceFieldUpdater.get(this);
        loop0: while (true) {
            long andIncrement = silver.getAndIncrement(this);
            long j5 = andIncrement / g.bravo;
            if (tango() <= andIncrement) {
                if (mVar.charlie < j5 && mVar.charlie() != null) {
                    amber(j5, mVar);
                }
                uniform(this);
                return;
            }
            if (mVar.charlie != j5) {
                f fVar = f.alpha;
                while (true) {
                    alpha = Af.b.alpha(mVar, j5, fVar);
                    if (!Af.f.delta(alpha)) {
                        Af.r bravo = Af.f.bravo(alpha);
                        while (true) {
                            Af.r rVar = (Af.r) atomicReferenceFieldUpdater.get(this);
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
                    } else {
                        break;
                    }
                }
                m mVar2 = null;
                if (Af.f.delta(alpha)) {
                    xray();
                    amber(j5, mVar);
                    uniform(this);
                } else {
                    m mVar3 = (m) Af.f.bravo(alpha);
                    long j6 = mVar3.charlie;
                    if (j6 > j5) {
                        long j7 = j6 * g.bravo;
                        if (silver.compareAndSet(this, 1 + andIncrement, j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = teal;
                        } else {
                            uniform(this);
                        }
                    } else {
                        mVar2 = mVar3;
                    }
                }
                if (mVar2 == null) {
                    continue;
                } else {
                    mVar = mVar2;
                }
            }
            int i4 = (int) (andIncrement % g.bravo);
            Object lima = mVar.lima(i4);
            boolean z2 = lima instanceof j0;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = red;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !mVar.kilo(i4, lima, g.golf)) {
                while (true) {
                    Object lima2 = mVar.lima(i4);
                    if (lima2 instanceof j0) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (mVar.kilo(i4, lima2, new v((j0) lima2))) {
                                break loop0;
                            }
                        } else if (mVar.kilo(i4, lima2, g.golf)) {
                            if (coral(lima2)) {
                                mVar.oscar(i4, g.delta);
                                break;
                            } else {
                                mVar.oscar(i4, g.juliet);
                                mVar.india();
                            }
                        }
                    } else if (lima2 != g.juliet) {
                        if (lima2 == null) {
                            if (mVar.kilo(i4, lima2, g.echo)) {
                                break loop0;
                            }
                        } else {
                            if (lima2 == g.delta || lima2 == g.hotel || lima2 == g.india || lima2 == g.kilo || lima2 == g.lima) {
                                break loop0;
                            }
                            if (lima2 != g.foxtrot) {
                                throw new IllegalStateException(("Unexpected cell state: " + lima2).toString());
                            }
                        }
                    } else {
                        break;
                    }
                }
            } else if (coral(lima)) {
                mVar.oscar(i4, g.delta);
                break;
            } else {
                mVar.oscar(i4, g.juliet);
                mVar.india();
                uniform(this);
            }
        }
        uniform(this);
    }

    public final m papa(long j5, m mVar) {
        Object alpha;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j6;
        m mVar2 = g.alpha;
        f fVar = f.alpha;
        loop0: while (true) {
            alpha = Af.b.alpha(mVar, j5, fVar);
            if (!Af.f.delta(alpha)) {
                Af.r bravo = Af.f.bravo(alpha);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
                    Af.r rVar = (Af.r) atomicReferenceFieldUpdater.get(this);
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
        if (Af.f.delta(alpha)) {
            xray();
            if (mVar.charlie * g.bravo < tango()) {
                mVar.bravo();
                return null;
            }
        } else {
            m mVar3 = (m) Af.f.bravo(alpha);
            boolean zulu = zulu();
            long j7 = mVar3.charlie;
            if (!zulu && j5 <= silver.get(this) / g.bravo) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14132a;
                    Af.r rVar2 = (Af.r) atomicReferenceFieldUpdater2.get(this);
                    if (rVar2.charlie >= j7) {
                        break;
                    }
                    if (!mVar3.juliet()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, rVar2, mVar3)) {
                        if (atomicReferenceFieldUpdater2.get(this) != rVar2) {
                            if (mVar3.foxtrot()) {
                                mVar3.echo();
                            }
                        }
                    }
                    if (rVar2.foxtrot()) {
                        rVar2.echo();
                    }
                }
            }
            if (j7 > j5) {
                long j10 = j7 * g.bravo;
                do {
                    atomicLongFieldUpdater = red;
                    j6 = atomicLongFieldUpdater.get(this);
                    if (j6 >= j10) {
                        break;
                    }
                } while (!atomicLongFieldUpdater.compareAndSet(this, j6, j10));
                if (j7 * g.bravo < tango()) {
                    mVar3.bravo();
                }
            } else {
                return mVar3;
            }
        }
        return null;
    }

    public final Throwable quebec() {
        return (Throwable) f14133b.get(this);
    }

    public final Throwable romeo() {
        Throwable quebec = quebec();
        if (quebec == null) {
            return new ClosedReceiveChannelException("Channel was closed");
        }
        return quebec;
    }

    public final Throwable sierra() {
        Throwable quebec = quebec();
        if (quebec == null) {
            return new ClosedSendChannelException("Channel was closed");
        }
        return quebec;
    }

    public final long tango() {
        return purple.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x019d, code lost:
    
        r16 = r7;
        r3 = (xf.m) r3.charlie();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a6, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String toString() {
        boolean z2;
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i4 = (int) (purple.get(this) >> 60);
        if (i4 != 2) {
            if (i4 == 3) {
                sb2.append("cancelled,");
            }
        } else {
            sb2.append("closed,");
        }
        sb2.append("capacity=" + this.alpha + ',');
        sb2.append("data=[");
        int i5 = 0;
        boolean z10 = true;
        List listOf = CollectionsKt.listOf(yellow.get(this), white.get(this), f14132a.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOf) {
            if (((m) obj) != g.alpha) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                long j5 = ((m) next).charlie;
                do {
                    Object next2 = it.next();
                    long j6 = ((m) next2).charlie;
                    if (j5 > j6) {
                        next = next2;
                        j5 = j6;
                    }
                } while (it.hasNext());
            }
            m mVar = (m) next;
            long j7 = red.get(this);
            long tango = tango();
            loop2: while (true) {
                int i10 = g.bravo;
                int i11 = i5;
                while (true) {
                    if (i11 >= i10) {
                        break;
                    }
                    long j10 = (mVar.charlie * g.bravo) + i11;
                    if (j10 >= tango && j10 >= j7) {
                        break loop2;
                    }
                    Object lima = mVar.lima(i11);
                    boolean z11 = z10;
                    Object obj2 = mVar.foxtrot.get(i11 * 2);
                    if (lima instanceof InterfaceC3206j) {
                        if (j10 < j7 && j10 >= tango) {
                            str = "receive";
                        } else if (j10 < tango && j10 >= j7) {
                            str = "send";
                        } else {
                            str = "cont";
                        }
                    } else if (lima instanceof s) {
                        str = "receiveCatching";
                    } else if (lima instanceof v) {
                        str = "EB(" + lima + ')';
                    } else if (!Intrinsics.areEqual(lima, g.foxtrot) && !Intrinsics.areEqual(lima, g.golf)) {
                        if (lima != null && !Intrinsics.areEqual(lima, g.echo) && !Intrinsics.areEqual(lima, g.india) && !Intrinsics.areEqual(lima, g.hotel) && !Intrinsics.areEqual(lima, g.kilo) && !Intrinsics.areEqual(lima, g.juliet) && !Intrinsics.areEqual(lima, g.lima)) {
                            str = lima.toString();
                        }
                        i11++;
                        z10 = z11;
                    } else {
                        str = "resuming_sender";
                    }
                    if (obj2 != null) {
                        sb2.append("(" + str + ',' + obj2 + "),");
                    } else {
                        sb2.append(str + ',');
                    }
                    i11++;
                    z10 = z11;
                }
                z10 = z2;
                i5 = 0;
            }
            if (StringsKt.green(sb2) == ',') {
                Intrinsics.delta(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
            }
            sb2.append(Constants.AES_SUFFIX);
            return sb2.toString();
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x00a2, code lost:
    
        r0 = (xf.m) ((Af.c) Af.c.bravo.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean victor(long j5, boolean z2) {
        j0 j0Var;
        int i4 = (int) (j5 >> 60);
        if (i4 != 0 && i4 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = red;
            if (i4 != 2) {
                if (i4 == 3) {
                    m kilo = kilo(1152921504606846975L & j5);
                    Object obj = null;
                    loop0: do {
                        int i5 = g.bravo - 1;
                        while (true) {
                            if (-1 >= i5) {
                                break;
                            }
                            long j6 = (kilo.charlie * g.bravo) + i5;
                            while (true) {
                                Object lima = kilo.lima(i5);
                                if (lima == g.india) {
                                    break loop0;
                                }
                                if (lima == g.delta) {
                                    if (j6 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    if (kilo.kilo(i5, lima, g.lima)) {
                                        kilo.november(i5, null);
                                        kilo.india();
                                        break;
                                    }
                                } else if (lima != g.echo && lima != null) {
                                    if (!(lima instanceof j0) && !(lima instanceof v)) {
                                        Af.t tVar = g.golf;
                                        if (lima == tVar || lima == g.foxtrot) {
                                            break loop0;
                                        }
                                        if (lima != tVar) {
                                            break;
                                        }
                                    } else {
                                        if (j6 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        if (lima instanceof v) {
                                            j0Var = ((v) lima).alpha;
                                        } else {
                                            j0Var = (j0) lima;
                                        }
                                        if (kilo.kilo(i5, lima, g.lima)) {
                                            obj = Af.f.echo(obj, j0Var);
                                            kilo.november(i5, null);
                                            kilo.india();
                                            break;
                                        }
                                    }
                                } else if (kilo.kilo(i5, lima, g.lima)) {
                                    kilo.india();
                                    break;
                                }
                            }
                            i5--;
                        }
                    } while (kilo != null);
                    if (obj != null) {
                        if (!(obj instanceof ArrayList)) {
                            blue((j0) obj, false);
                        } else {
                            ArrayList arrayList = (ArrayList) obj;
                            for (int size = arrayList.size() - 1; -1 < size; size--) {
                                blue((j0) arrayList.get(size), false);
                            }
                        }
                    }
                } else {
                    throw new IllegalStateException(ao.ad.zulu(i4, "unexpected close status: ").toString());
                }
            } else {
                kilo(1152921504606846975L & j5);
                if (z2) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
                        m mVar = (m) atomicReferenceFieldUpdater.get(this);
                        long j7 = atomicLongFieldUpdater.get(this);
                        if (tango() <= j7) {
                            break;
                        }
                        long j10 = g.bravo;
                        long j11 = j7 / j10;
                        if (mVar.charlie != j11 && (mVar = papa(j11, mVar)) == null) {
                            if (((m) atomicReferenceFieldUpdater.get(this)).charlie < j11) {
                                break;
                            }
                        } else {
                            mVar.bravo();
                            int i10 = (int) (j7 % j10);
                            while (true) {
                                Object lima2 = mVar.lima(i10);
                                if (lima2 != null && lima2 != g.echo) {
                                    if (lima2 == g.delta) {
                                        break;
                                    }
                                    if (lima2 != g.juliet) {
                                        if (lima2 != g.lima) {
                                            if (lima2 != g.india) {
                                                if (lima2 != g.hotel) {
                                                    if (lima2 == g.golf) {
                                                        break;
                                                    }
                                                    if (lima2 != g.foxtrot && j7 == atomicLongFieldUpdater.get(this)) {
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (mVar.kilo(i10, lima2, g.hotel)) {
                                    oscar();
                                    break;
                                }
                            }
                            red.compareAndSet(this, j7, j7 + 1);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean whiskey() {
        return victor(purple.get(this), true);
    }

    public final boolean xray() {
        return victor(purple.get(this), false);
    }

    public boolean yankee() {
        return false;
    }

    public final boolean zulu() {
        long j5 = silver.get(this);
        if (j5 != 0 && j5 != Long.MAX_VALUE) {
            return false;
        }
        return true;
    }
}
