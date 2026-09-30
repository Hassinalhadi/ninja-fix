package vf;

import Yb.C0331t0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import s6.AbstractC2689j6;
import s6.AbstractC2832z6;
import s6.B0;
import s6.J6;
import td.C3117a;

/* loaded from: classes2.dex */
public abstract class ad {
    public static final Af.t alpha = new Af.t("RESUME_TOKEN", 0);
    public static final Af.t bravo = new Af.t("REMOVED_TASK", 0);
    public static final Af.t charlie = new Af.t("CLOSED_EMPTY", 0);
    public static final Af.t delta = new Af.t("COMPLETING_ALREADY", 0);
    public static final Af.t echo = new Af.t("COMPLETING_WAITING_CHILDREN", 0);
    public static final Af.t foxtrot = new Af.t("COMPLETING_RETRY", 0);
    public static final Af.t golf = new Af.t("TOO_LATE_TO_CANCEL", 0);
    public static final Af.t hotel = new Af.t("SEALED", 0);
    public static final as india = new as(false);
    public static final as juliet = new as(true);

    public static final CancellationException alpha(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final Object amber(Nd.h hVar, Xd.l lVar) {
        ay ayVar;
        Nd.h alpha2;
        long pink;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3215t c3215t;
        Thread currentThread = Thread.currentThread();
        Nd.g gVar = Nd.d.alpha;
        Nd.e eVar = (Nd.e) hVar.get(gVar);
        Nd.i iVar = Nd.i.alpha;
        if (eVar == null) {
            ayVar = b0.alpha();
            alpha2 = AbstractC3218w.alpha(iVar, hVar.plus(ayVar), true);
            Cf.e eVar2 = ao.alpha;
            if (alpha2 != eVar2 && alpha2.get(gVar) == null) {
                alpha2 = alpha2.plus(eVar2);
            }
        } else {
            if (eVar instanceof ay) {
            }
            ayVar = (ay) b0.alpha.get();
            alpha2 = AbstractC3218w.alpha(iVar, hVar, true);
            Cf.e eVar3 = ao.alpha;
            if (alpha2 != eVar3 && alpha2.get(gVar) == null) {
                alpha2 = alpha2.plus(eVar3);
            }
        }
        C3202f c3202f = new C3202f(alpha2, currentThread, ayVar);
        c3202f.b(ac.alpha, c3202f, lVar);
        ay ayVar2 = c3202f.teal;
        if (ayVar2 != null) {
            int i4 = ay.teal;
            ayVar2.peach(false);
        }
        while (true) {
            if (ayVar2 != null) {
                try {
                    pink = ayVar2.pink();
                } catch (Throwable th) {
                    if (ayVar2 != null) {
                        int i5 = ay.teal;
                        ayVar2.magenta(false);
                    }
                    throw th;
                }
            } else {
                pink = Long.MAX_VALUE;
            }
            atomicReferenceFieldUpdater = P.alpha;
            if (!(atomicReferenceFieldUpdater.get(c3202f) instanceof D)) {
                break;
            }
            LockSupport.parkNanos(c3202f, pink);
            if (Thread.interrupted()) {
                c3202f.victor(new InterruptedException());
            }
        }
        if (ayVar2 != null) {
            int i10 = ay.teal;
            ayVar2.magenta(false);
        }
        Object black = black(atomicReferenceFieldUpdater.get(c3202f));
        if (black instanceof C3215t) {
            c3215t = (C3215t) black;
        } else {
            c3215t = null;
        }
        if (c3215t == null) {
            return black;
        }
        throw c3215t.alpha;
    }

    public static final String beige(Nd.c cVar) {
        Object m206constructorimpl;
        if (cVar instanceof Af.e) {
            return ((Af.e) cVar).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(cVar + '@' + romeo(cVar));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m207exceptionOrNullimpl(m206constructorimpl) != null) {
            m206constructorimpl = cVar.getClass().getName() + '@' + romeo(cVar);
        }
        return (String) m206constructorimpl;
    }

    public static final Object black(Object obj) {
        E e;
        D d4;
        if (obj instanceof E) {
            e = (E) obj;
        } else {
            e = null;
        }
        if (e != null && (d4 = e.alpha) != null) {
            return d4;
        }
        return obj;
    }

    public static final Object blue(Nd.h hVar, Xd.l lVar, Nd.c cVar) {
        Nd.h alpha2;
        Object black;
        Nd.h context = cVar.getContext();
        if (!((Boolean) hVar.fold(Boolean.FALSE, new ud.f(2))).booleanValue()) {
            alpha2 = context.plus(hVar);
        } else {
            alpha2 = AbstractC3218w.alpha(context, hVar, false);
        }
        oscar(alpha2);
        if (alpha2 == context) {
            Af.q qVar = new Af.q(cVar, alpha2);
            black = B0.bravo(qVar, true, qVar, lVar);
        } else {
            Nd.d dVar = Nd.d.alpha;
            if (Intrinsics.areEqual(alpha2.get(dVar), context.get(dVar))) {
                h0 h0Var = new h0(cVar, alpha2);
                Nd.h hVar2 = h0Var.red;
                Object mike = Af.f.mike(hVar2, null);
                try {
                    Object bravo2 = B0.bravo(h0Var, true, h0Var, lVar);
                    Af.f.foxtrot(hVar2, mike);
                    black = bravo2;
                } catch (Throwable th) {
                    Af.f.foxtrot(hVar2, mike);
                    throw th;
                }
            } else {
                Af.q qVar2 = new Af.q(cVar, alpha2);
                Bf.a.charlie(lVar, qVar2, qVar2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ak.teal;
                    int i4 = atomicIntegerFieldUpdater.get(qVar2);
                    if (i4 != 0) {
                        if (i4 == 2) {
                            black = black(P.alpha.get(qVar2));
                            if (black instanceof C3215t) {
                                throw ((C3215t) black).alpha;
                            }
                        } else {
                            throw new IllegalStateException("Already suspended");
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(qVar2, 0, 1)) {
                        black = Od.a.alpha;
                        break;
                    }
                }
            }
        }
        Od.a aVar = Od.a.alpha;
        return black;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vf.q, vf.P] */
    public static C3213q bravo() {
        ?? p4 = new P(true);
        p4.jade(null);
        return p4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Nd.h, Nd.a, vf.k0] */
    public static final Object bronze(Pd.c cVar) {
        Af.e eVar;
        boolean z2;
        Object obj;
        boolean z10;
        Nd.h context = cVar.getContext();
        oscar(context);
        Nd.c delta2 = J6.delta(cVar);
        if (delta2 instanceof Af.e) {
            eVar = (Af.e) delta2;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            obj = Unit.INSTANCE;
        } else {
            AbstractC3220y abstractC3220y = eVar.silver;
            if (Af.f.india(abstractC3220y, context)) {
                eVar.white = Unit.INSTANCE;
                eVar.red = 1;
                abstractC3220y.green(context, eVar);
            } else {
                ?? aVar = new Nd.a(k0.purple);
                Nd.h plus = context.plus(aVar);
                Unit unit = Unit.INSTANCE;
                eVar.white = unit;
                eVar.red = 1;
                abstractC3220y.green(plus, eVar);
                if (aVar.alpha) {
                    ay alpha2 = b0.alpha();
                    kotlin.collections.l lVar = alpha2.silver;
                    if (lVar != null) {
                        z2 = lVar.isEmpty();
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        if (alpha2.purple >= 4294967296L) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            eVar.white = unit;
                            eVar.red = 1;
                            alpha2.navy(eVar);
                            obj = Od.a.alpha;
                        } else {
                            alpha2.peach(true);
                            try {
                                eVar.run();
                                do {
                                } while (alpha2.purple());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.INSTANCE;
                }
            }
            obj = Od.a.alpha;
        }
        if (obj == Od.a.alpha) {
            return obj;
        }
        return Unit.INSTANCE;
    }

    public static final C3117a charlie(Nd.h hVar) {
        if (hVar.get(H.alpha) == null) {
            hVar = hVar.plus(delta());
        }
        return new C3117a(hVar);
    }

    public static J delta() {
        return new J(null);
    }

    public static final C3117a echo() {
        a0 foxtrot2 = foxtrot();
        Cf.e eVar = ao.alpha;
        return new C3117a(AbstractC2832z6.charlie(foxtrot2, Af.n.alpha));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vf.a0, vf.J] */
    public static a0 foxtrot() {
        return new J(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [vf.a, vf.ah] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static ah golf(ab abVar, Nd.h hVar, Xd.l lVar, int i4) {
        ac acVar;
        ?? r32;
        ac acVar2 = ac.purple;
        if ((i4 & 1) != 0) {
            hVar = Nd.i.alpha;
        }
        if ((i4 & 2) != 0) {
            acVar = ac.alpha;
        } else {
            acVar = acVar2;
        }
        Nd.h bravo2 = AbstractC3218w.bravo(abVar, hVar);
        if (acVar == acVar2) {
            r32 = new Q(bravo2, lVar);
        } else {
            r32 = new AbstractC3197a(bravo2, true, true);
        }
        r32.b(acVar, r32, lVar);
        return r32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object hotel(Collection collection, Pd.i iVar) {
        if (collection.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ag[] agVarArr = (ag[]) collection.toArray(new ag[0]);
        C3201e c3201e = new C3201e(agVarArr);
        C3207k c3207k = new C3207k(1, J6.delta(iVar));
        c3207k.tango();
        int length = agVarArr.length;
        C3199c[] c3199cArr = new C3199c[length];
        for (int i4 = 0; i4 < length; i4++) {
            Z z2 = agVarArr[i4];
            z2.start();
            C3199c c3199c = new C3199c(c3201e, c3207k);
            c3199c.white = victor(z2, true, c3199c);
            c3199cArr[i4] = c3199c;
        }
        C3200d c3200d = new C3200d(c3199cArr);
        for (int i5 = 0; i5 < length; i5++) {
            C3199c c3199c2 = c3199cArr[i5];
            c3199c2.getClass();
            C3199c.f13996a.set(c3199c2, c3200d);
        }
        if (c3207k.lima()) {
            c3200d.bravo();
        } else {
            c3207k.whiskey(c3200d);
        }
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void india(Pd.c cVar) {
        aj ajVar;
        int i4;
        if (cVar instanceof aj) {
            aj ajVar2 = (aj) cVar;
            int i5 = ajVar2.purple;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                ajVar2.purple = i5 - RecyclerView.UNDEFINED_DURATION;
                ajVar = ajVar2;
                Object obj = ajVar.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = ajVar.purple;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    ajVar.purple = 1;
                    C3207k c3207k = new C3207k(1, J6.delta(ajVar));
                    c3207k.tango();
                    if (c3207k.sierra() == aVar) {
                        return;
                    }
                }
                throw new KotlinNothingValueException();
            }
        }
        ajVar = new Pd.c(cVar);
        Object obj2 = ajVar.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = ajVar.purple;
        if (i4 == 0) {
        }
        throw new KotlinNothingValueException();
    }

    public static final void juliet(Nd.h hVar, CancellationException cancellationException) {
        I i4 = (I) hVar.get(H.alpha);
        if (i4 != null) {
            i4.foxtrot(cancellationException);
        }
    }

    public static final void kilo(ab abVar, CancellationException cancellationException) {
        I i4 = (I) abVar.charlie().get(H.alpha);
        if (i4 != null) {
            i4.foxtrot(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + abVar).toString());
        }
    }

    public static final Object lima(I i4, Pd.i iVar) {
        i4.foxtrot(null);
        Object gray = i4.gray(iVar);
        if (gray == Od.a.alpha) {
            return gray;
        }
        return Unit.INSTANCE;
    }

    public static final Object mike(Xd.l lVar, Nd.c cVar) {
        Af.q qVar = new Af.q(cVar, cVar.getContext());
        Object bravo2 = B0.bravo(qVar, true, qVar, lVar);
        Od.a aVar = Od.a.alpha;
        return bravo2;
    }

    public static final Object november(long j5, Nd.c cVar) {
        if (j5 <= 0) {
            return Unit.INSTANCE;
        }
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        if (j5 < Long.MAX_VALUE) {
            quebec(c3207k.teal).uniform(j5, c3207k);
        }
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    public static final void oscar(Nd.h hVar) {
        I i4 = (I) hVar.get(H.alpha);
        if (i4 != null && !i4.echo()) {
            throw i4.quebec();
        }
    }

    public static final AbstractC3220y papa(Executor executor) {
        if (executor instanceof an) {
        }
        return new C3194A(executor);
    }

    public static final ai quebec(Nd.h hVar) {
        ai aiVar;
        Nd.f fVar = hVar.get(Nd.d.alpha);
        if (fVar instanceof ai) {
            aiVar = (ai) fVar;
        } else {
            aiVar = null;
        }
        if (aiVar == null) {
            return af.alpha;
        }
        return aiVar;
    }

    public static final String romeo(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final I sierra(Nd.h hVar) {
        I i4 = (I) hVar.get(H.alpha);
        if (i4 != null) {
            return i4;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final C3207k tango(Nd.c cVar) {
        C3207k c3207k;
        C3207k c3207k2;
        if (!(cVar instanceof Af.e)) {
            return new C3207k(1, cVar);
        }
        Af.e eVar = (Af.e) cVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Af.e.f65a;
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            Af.t tVar = Af.f.bravo;
            c3207k = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(eVar, tVar);
                c3207k2 = null;
                break;
            }
            if (obj instanceof C3207k) {
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar, obj, tVar)) {
                    if (atomicReferenceFieldUpdater.get(eVar) != obj) {
                        break;
                    }
                }
                c3207k2 = (C3207k) obj;
                break loop0;
            }
            if (obj != tVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c3207k2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C3207k.yellow;
            Object obj2 = atomicReferenceFieldUpdater2.get(c3207k2);
            if ((obj2 instanceof C3214s) && ((C3214s) obj2).delta != null) {
                c3207k2.papa();
            } else {
                C3207k.white.set(c3207k2, 536870911);
                atomicReferenceFieldUpdater2.set(c3207k2, C3198b.alpha);
                c3207k = c3207k2;
            }
            if (c3207k != null) {
                return c3207k;
            }
        }
        return new C3207k(2, cVar);
    }

    public static final void uniform(Nd.h hVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) hVar.get(C3221z.alpha);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(hVar, th);
            } else {
                Af.f.charlie(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC2689j6.charlie(runtimeException, th);
                th = runtimeException;
            }
            Af.f.charlie(hVar, th);
        }
    }

    public static final aq victor(I i4, boolean z2, K k6) {
        if (i4 instanceof P) {
            return ((P) i4).lavender(z2, k6);
        }
        return i4.papa(k6.juliet(), z2, new C0331t0(1, k6, K.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 20));
    }

    public static final boolean whiskey(Nd.h hVar) {
        I i4 = (I) hVar.get(H.alpha);
        if (i4 != null) {
            return i4.echo();
        }
        return true;
    }

    public static final boolean xray(ab abVar) {
        I i4 = (I) abVar.charlie().get(H.alpha);
        if (i4 != null) {
            return i4.echo();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [vf.a, vf.Y] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public static final Y yankee(ab abVar, Nd.h hVar, ac acVar, Xd.l lVar) {
        ?? r22;
        Nd.h bravo2 = AbstractC3218w.bravo(abVar, hVar);
        acVar.getClass();
        if (acVar == ac.purple) {
            r22 = new S(bravo2, lVar);
        } else {
            r22 = new AbstractC3197a(bravo2, true, true);
        }
        r22.b(acVar, r22, lVar);
        return r22;
    }

    public static /* synthetic */ Y zulu(ab abVar, Nd.h hVar, ac acVar, Xd.l lVar, int i4) {
        if ((i4 & 1) != 0) {
            hVar = Nd.i.alpha;
        }
        if ((i4 & 2) != 0) {
            acVar = ac.alpha;
        }
        return yankee(abVar, hVar, acVar, lVar);
    }
}
