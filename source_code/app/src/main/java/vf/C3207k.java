package vf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;

/* renamed from: vf.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3207k extends al implements InterfaceC3206j, Pd.d, j0 {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Nd.c silver;
    public final Nd.h teal;
    public static final /* synthetic */ AtomicIntegerFieldUpdater white = AtomicIntegerFieldUpdater.newUpdater(C3207k.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater yellow = AtomicReferenceFieldUpdater.newUpdater(C3207k.class, Object.class, "_state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13998a = AtomicReferenceFieldUpdater.newUpdater(C3207k.class, Object.class, "_parentHandle$volatile");

    public C3207k(int i4, Nd.c cVar) {
        super(i4);
        this.silver = cVar;
        this.teal = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C3198b.alpha;
    }

    public static Object black(W w4, Object obj, int i4, Xd.m mVar) {
        InterfaceC3205i interfaceC3205i;
        if (obj instanceof C3215t) {
            return obj;
        }
        if (i4 != 1 && i4 != 2) {
            return obj;
        }
        if (mVar == null && !(w4 instanceof InterfaceC3205i)) {
            return obj;
        }
        if (w4 instanceof InterfaceC3205i) {
            interfaceC3205i = (InterfaceC3205i) w4;
        } else {
            interfaceC3205i = null;
        }
        return new C3214s(obj, interfaceC3205i, mVar, (CancellationException) null, 16);
    }

    public static void yankee(W w4, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + w4 + ", already has " + obj).toString());
    }

    @Override // vf.j0
    public final void alpha(Af.r rVar, int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = white;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        whiskey(rVar);
    }

    public final void amber() {
        Af.e eVar;
        Nd.c cVar = this.silver;
        Throwable th = null;
        if (cVar instanceof Af.e) {
            eVar = (Af.e) cVar;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Af.e.f65a;
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            Af.t tVar = Af.f.bravo;
            if (obj != tVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, null)) {
                    if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                }
                th = (Throwable) obj;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, this)) {
                if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                    break;
                }
            }
        }
        if (th != null) {
            papa();
            delta(th);
        }
    }

    public final void azure(Object obj, int i4, Xd.m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                Object black = black((W) obj2, obj, i4, mVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, black)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!xray()) {
                    papa();
                }
                quebec(i4);
                return;
            }
            if (obj2 instanceof C3208l) {
                C3208l c3208l = (C3208l) obj2;
                c3208l.getClass();
                if (C3208l.charlie.compareAndSet(c3208l, 0, 1)) {
                    if (mVar != null) {
                        mike(mVar, c3208l.alpha, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void beige(AbstractC3220y abstractC3220y, Unit unit) {
        Af.e eVar;
        AbstractC3220y abstractC3220y2;
        int i4;
        Nd.c cVar = this.silver;
        if (cVar instanceof Af.e) {
            eVar = (Af.e) cVar;
        } else {
            eVar = null;
        }
        if (eVar != null) {
            abstractC3220y2 = eVar.silver;
        } else {
            abstractC3220y2 = null;
        }
        if (abstractC3220y2 == abstractC3220y) {
            i4 = 4;
        } else {
            i4 = this.red;
        }
        azure(unit, i4, null);
    }

    public final Af.t blue(Object obj, Xd.m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof W;
            Af.t tVar = ad.alpha;
            if (z2) {
                Object black = black((W) obj2, obj, this.red, mVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, black)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!xray()) {
                    papa();
                }
                return tVar;
            }
            boolean z10 = obj2 instanceof C3214s;
            return null;
        }
    }

    @Override // vf.al
    public final void bravo(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof W)) {
                if (!(obj instanceof C3215t)) {
                    if (obj instanceof C3214s) {
                        C3214s c3214s = (C3214s) obj;
                        if (c3214s.echo == null) {
                            C3214s alpha = C3214s.alpha(c3214s, null, cancellationException, 15);
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, alpha)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj) {
                                    cancellationException2 = cancellationException;
                                }
                            }
                            InterfaceC3205i interfaceC3205i = c3214s.bravo;
                            if (interfaceC3205i != null) {
                                juliet(interfaceC3205i, cancellationException);
                            }
                            Xd.m mVar = c3214s.charlie;
                            if (mVar != null) {
                                mike(mVar, cancellationException, c3214s.alpha);
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException("Must be called at most once");
                    }
                    cancellationException2 = cancellationException;
                    C3214s c3214s2 = new C3214s(obj, (InterfaceC3205i) null, (Xd.m) null, cancellationException2, 14);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3214s2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                    cancellationException = cancellationException2;
                } else {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed");
            }
        }
    }

    @Override // vf.al
    public final Nd.c charlie() {
        return this.silver;
    }

    @Override // vf.InterfaceC3206j
    public final boolean delta(Throwable th) {
        Throwable th2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z2 = false;
            if (!(obj instanceof W)) {
                return false;
            }
            if ((obj instanceof InterfaceC3205i) || (obj instanceof Af.r)) {
                z2 = true;
            }
            if (th == null) {
                th2 = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                th2 = th;
            }
            C3215t c3215t = new C3215t(th2, z2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3215t)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            W w4 = (W) obj;
            if (w4 instanceof InterfaceC3205i) {
                juliet((InterfaceC3205i) obj, th);
            } else if (w4 instanceof Af.r) {
                november((Af.r) obj, th);
            }
            if (!xray()) {
                papa();
            }
            quebec(this.red);
            return true;
        }
    }

    @Override // vf.al
    public final Throwable echo(Object obj) {
        Throwable echo = super.echo(obj);
        if (echo != null) {
            return echo;
        }
        return null;
    }

    @Override // vf.al
    public final Object foxtrot(Object obj) {
        if (obj instanceof C3214s) {
            return ((C3214s) obj).alpha;
        }
        return obj;
    }

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        Nd.c cVar = this.silver;
        if (cVar instanceof Pd.d) {
            return (Pd.d) cVar;
        }
        return null;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.teal;
    }

    @Override // vf.InterfaceC3206j
    public final void hotel(Object obj, Xd.m mVar) {
        azure(obj, this.red, mVar);
    }

    @Override // vf.al
    public final Object india() {
        return yellow.get(this);
    }

    @Override // vf.InterfaceC3206j
    public final boolean isCancelled() {
        return yellow.get(this) instanceof C3208l;
    }

    public final void juliet(InterfaceC3205i interfaceC3205i, Throwable th) {
        try {
            interfaceC3205i.alpha(th);
        } catch (Throwable th2) {
            ad.uniform(this.teal, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // vf.InterfaceC3206j
    public final Af.t kilo(Object obj, Xd.m mVar) {
        return blue(obj, mVar);
    }

    @Override // vf.InterfaceC3206j
    public final boolean lima() {
        return !(yellow.get(this) instanceof W);
    }

    public final void mike(Xd.m mVar, Throwable th, Object obj) {
        Nd.h hVar = this.teal;
        try {
            mVar.invoke(th, obj, hVar);
        } catch (Throwable th2) {
            ad.uniform(hVar, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void november(Af.r rVar, Throwable th) {
        Nd.h hVar = this.teal;
        int i4 = white.get(this) & 536870911;
        if (i4 != 536870911) {
            try {
                rVar.hotel(i4, hVar);
                return;
            } catch (Throwable th2) {
                ad.uniform(hVar, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
                return;
            }
        }
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    @Override // vf.InterfaceC3206j
    public final void oscar(Object obj) {
        quebec(this.red);
    }

    public final void papa() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13998a;
        aq aqVar = (aq) atomicReferenceFieldUpdater.get(this);
        if (aqVar == null) {
            return;
        }
        aqVar.dispose();
        atomicReferenceFieldUpdater.set(this, V.alpha);
    }

    public final void quebec(int i4) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        boolean z2;
        boolean z10;
        do {
            atomicIntegerFieldUpdater = white;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i10 = i5 >> 29;
            if (i10 != 0) {
                if (i10 == 1) {
                    Nd.c cVar = this.silver;
                    boolean z11 = false;
                    if (i4 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2 && (cVar instanceof Af.e)) {
                        if (i4 != 1 && i4 != 2) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        int i11 = this.red;
                        if (i11 == 1 || i11 == 2) {
                            z11 = true;
                        }
                        if (z10 == z11) {
                            Af.e eVar = (Af.e) cVar;
                            AbstractC3220y abstractC3220y = eVar.silver;
                            Nd.h context = eVar.teal.getContext();
                            if (Af.f.india(abstractC3220y, context)) {
                                Af.f.hotel(abstractC3220y, context, this);
                                return;
                            }
                            ay alpha = b0.alpha();
                            if (alpha.purple >= 4294967296L) {
                                alpha.navy(this);
                                return;
                            }
                            alpha.peach(true);
                            try {
                                am.alpha(this, cVar, true);
                                do {
                                } while (alpha.purple());
                            } finally {
                                try {
                                    return;
                                } finally {
                                }
                            }
                            return;
                        }
                    }
                    am.alpha(this, cVar, z2);
                    return;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl != null) {
            obj = new C3215t(m207exceptionOrNullimpl, false);
        }
        azure(obj, this.red, null);
    }

    public Throwable romeo(P p4) {
        return p4.quebec();
    }

    public final Object sierra() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        boolean xray = xray();
        do {
            atomicIntegerFieldUpdater = white;
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    if (xray) {
                        amber();
                    }
                    Object obj = yellow.get(this);
                    if (!(obj instanceof C3215t)) {
                        int i10 = this.red;
                        if (i10 == 1 || i10 == 2) {
                            I i11 = (I) this.teal.get(H.alpha);
                            if (i11 != null && !i11.echo()) {
                                CancellationException quebec = i11.quebec();
                                bravo(quebec);
                                throw quebec;
                            }
                        }
                        return foxtrot(obj);
                    }
                    throw ((C3215t) obj).alpha;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        if (((aq) f13998a.get(this)) == null) {
            uniform();
        }
        if (xray) {
            amber();
        }
        return Od.a.alpha;
    }

    public final void tango() {
        aq uniform = uniform();
        if (uniform != null && lima()) {
            uniform.dispose();
            f13998a.set(this, V.alpha);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(zulu());
        sb2.append('(');
        sb2.append(ad.beige(this.silver));
        sb2.append("){");
        Object obj = yellow.get(this);
        if (obj instanceof W) {
            str = "Active";
        } else if (obj instanceof C3208l) {
            str = "Cancelled";
        } else {
            str = "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(ad.romeo(this));
        return sb2.toString();
    }

    public final aq uniform() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        I i4 = (I) this.teal.get(H.alpha);
        if (i4 == null) {
            return null;
        }
        aq victor = ad.victor(i4, true, new C3209m(this, 0));
        do {
            atomicReferenceFieldUpdater = f13998a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, victor)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return victor;
    }

    public final void victor(Function1 function1) {
        whiskey(new C3204h(1, function1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b9, code lost:
    
        yankee(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00bc, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void whiskey(W w4) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yellow;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3198b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w4)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            Throwable th = null;
            if ((obj instanceof InterfaceC3205i) || (obj instanceof Af.r)) {
                break;
            }
            if (obj instanceof C3215t) {
                C3215t c3215t = (C3215t) obj;
                c3215t.getClass();
                if (C3215t.bravo.compareAndSet(c3215t, 0, 1)) {
                    if (obj instanceof C3208l) {
                        if (((C3215t) obj) == null) {
                            c3215t = null;
                        }
                        if (c3215t != null) {
                            th = c3215t.alpha;
                        }
                        if (w4 instanceof InterfaceC3205i) {
                            juliet((InterfaceC3205i) w4, th);
                            return;
                        } else {
                            Intrinsics.charlie(w4, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            november((Af.r) w4, th);
                            return;
                        }
                    }
                    return;
                }
                yankee(w4, obj);
                throw null;
            }
            if (obj instanceof C3214s) {
                C3214s c3214s = (C3214s) obj;
                if (c3214s.bravo == null) {
                    if (w4 instanceof Af.r) {
                        return;
                    }
                    Intrinsics.charlie(w4, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    InterfaceC3205i interfaceC3205i = (InterfaceC3205i) w4;
                    Throwable th2 = c3214s.echo;
                    if (th2 != null) {
                        juliet(interfaceC3205i, th2);
                        return;
                    }
                    C3214s alpha = C3214s.alpha(c3214s, interfaceC3205i, null, 29);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, alpha)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    return;
                }
                yankee(w4, obj);
                throw null;
            }
            if (w4 instanceof Af.r) {
                return;
            }
            Intrinsics.charlie(w4, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            C3214s c3214s2 = new C3214s(obj, (InterfaceC3205i) w4, (Xd.m) null, (CancellationException) null, 28);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3214s2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean xray() {
        if (this.red == 2) {
            Nd.c cVar = this.silver;
            Intrinsics.charlie(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (Af.e.f65a.get((Af.e) cVar) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String zulu() {
        return "CancellableContinuation";
    }
}
