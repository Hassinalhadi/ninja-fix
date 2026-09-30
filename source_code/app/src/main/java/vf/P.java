package vf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import s6.AbstractC2689j6;
import s6.AbstractC2832z6;
import s6.J6;

/* loaded from: classes2.dex */
public class P implements I, X {
    public static final /* synthetic */ AtomicReferenceFieldUpdater alpha = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater purple = AtomicReferenceFieldUpdater.newUpdater(P.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public P(boolean z2) {
        as asVar;
        if (z2) {
            asVar = ad.juliet;
        } else {
            asVar = ad.india;
        }
        this._state$volatile = asVar;
    }

    public static C3211o ochre(Af.j jVar) {
        while (jVar.hotel()) {
            Af.j charlie = jVar.charlie();
            if (charlie == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Af.j.purple;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (Af.j) obj;
                    if (!jVar.hotel()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = charlie;
            }
        }
        while (true) {
            jVar = jVar.golf();
            if (!jVar.hotel()) {
                if (jVar instanceof C3211o) {
                    return (C3211o) jVar;
                }
                if (jVar instanceof T) {
                    return null;
                }
            }
        }
    }

    public static String silver(Object obj) {
        if (obj instanceof N) {
            N n5 = (N) obj;
            if (n5.charlie()) {
                return "Cancelling";
            }
            if (N.purple.get(n5) != 1) {
                return "Active";
            }
            return "Completing";
        }
        if (obj instanceof D) {
            if (((D) obj).echo()) {
                return "Active";
            }
            return "New";
        }
        if (obj instanceof C3215t) {
            return "Cancelled";
        }
        return "Completed";
    }

    public final void amber(D d4, Object obj) {
        C3215t c3215t;
        Throwable th;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
        InterfaceC3210n interfaceC3210n = (InterfaceC3210n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC3210n != null) {
            interfaceC3210n.dispose();
            atomicReferenceFieldUpdater.set(this, V.alpha);
        }
        CompletionHandlerException completionHandlerException = null;
        if (obj instanceof C3215t) {
            c3215t = (C3215t) obj;
        } else {
            c3215t = null;
        }
        if (c3215t != null) {
            th = c3215t.alpha;
        } else {
            th = null;
        }
        if (d4 instanceof K) {
            try {
                ((K) d4).kilo(th);
                return;
            } catch (Throwable th2) {
                ivory(new CompletionHandlerException("Exception in completion handler " + d4 + " for " + this, th2));
                return;
            }
        }
        T foxtrot = d4.foxtrot();
        if (foxtrot != null) {
            foxtrot.bravo(new Af.h(1), 1);
            Object obj2 = Af.j.alpha.get(foxtrot);
            Intrinsics.charlie(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (Af.j jVar = (Af.j) obj2; !Intrinsics.areEqual(jVar, foxtrot); jVar = jVar.golf()) {
                if (jVar instanceof K) {
                    try {
                        ((K) jVar).kilo(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            AbstractC2689j6.charlie(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVar + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                ivory(completionHandlerException);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable black(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        P p4 = (P) ((X) obj);
        Object obj2 = alpha.get(p4);
        CancellationException cancellationException2 = null;
        if (obj2 instanceof N) {
            cancellationException = ((N) obj2).bravo();
        } else if (obj2 instanceof C3215t) {
            cancellationException = ((C3215t) obj2).alpha;
        } else if (!(obj2 instanceof D)) {
            cancellationException = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
        }
        if (cancellationException instanceof CancellationException) {
            cancellationException2 = cancellationException;
        }
        if (cancellationException2 == null) {
            return new JobCancellationException("Parent job is ".concat(silver(obj2)), cancellationException, p4);
        }
        return cancellationException2;
    }

    public final Object coral(N n5, Object obj) {
        C3215t c3215t;
        Throwable emerald;
        Object obj2;
        Throwable th = null;
        if (obj instanceof C3215t) {
            c3215t = (C3215t) obj;
        } else {
            c3215t = null;
        }
        if (c3215t != null) {
            th = c3215t.alpha;
        }
        synchronized (n5) {
            n5.charlie();
            ArrayList<Throwable> delta = n5.delta(th);
            emerald = emerald(n5, delta);
            if (emerald != null && delta.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(delta.size()));
                for (Throwable th2 : delta) {
                    if (th2 != emerald && th2 != emerald && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        AbstractC2689j6.charlie(emerald, th2);
                    }
                }
            }
        }
        if (emerald != null && emerald != th) {
            obj = new C3215t(emerald, false);
        }
        if (emerald != null && (xray(emerald) || indigo(emerald))) {
            Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C3215t.bravo.compareAndSet((C3215t) obj, 0, 1);
        }
        peach(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
        if (obj instanceof D) {
            obj2 = new E((D) obj);
        } else {
            obj2 = obj;
        }
        while (!atomicReferenceFieldUpdater.compareAndSet(this, n5, obj2) && atomicReferenceFieldUpdater.get(this) == n5) {
        }
        amber(n5, obj);
        return obj;
    }

    @Override // vf.I
    public final aq crimson(Function1 function1) {
        return lavender(true, new ar(1, function1));
    }

    public final Object cyan() {
        Object obj = alpha.get(this);
        if (!(obj instanceof D)) {
            if (!(obj instanceof C3215t)) {
                return ad.black(obj);
            }
            throw ((C3215t) obj).alpha;
        }
        throw new IllegalStateException("This job has not completed yet");
    }

    @Override // vf.I
    public boolean echo() {
        Object obj = alpha.get(this);
        if ((obj instanceof D) && ((D) obj).echo()) {
            return true;
        }
        return false;
    }

    public final Throwable emerald(N n5, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (!n5.charlie()) {
                return null;
            }
            return new JobCancellationException(yankee(), null, this);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    @Override // Nd.h
    public final Object fold(Object obj, Xd.l lVar) {
        return lVar.invoke(obj, this);
    }

    @Override // vf.I
    public void foxtrot(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(yankee(), null, this);
        }
        whiskey(cancellationException);
    }

    public boolean fuchsia() {
        return true;
    }

    @Override // Nd.h
    public final Nd.f get(Nd.g gVar) {
        return AbstractC2832z6.alpha(this, gVar);
    }

    @Override // Nd.f
    public final Nd.g getKey() {
        return H.alpha;
    }

    public boolean gold() {
        return this instanceof C3213q;
    }

    @Override // vf.I
    public final InterfaceC3210n golf(P p4) {
        C3215t c3215t;
        C3215t c3215t2;
        C3211o c3211o = new C3211o(p4);
        c3211o.silver = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof as) {
                as asVar = (as) obj;
                if (asVar.alpha) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3211o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                plum(asVar);
            } else {
                boolean z2 = obj instanceof D;
                V v4 = V.alpha;
                Throwable th = null;
                if (z2) {
                    T foxtrot = ((D) obj).foxtrot();
                    if (foxtrot == null) {
                        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        purple((K) obj);
                    } else if (!foxtrot.bravo(c3211o, 7)) {
                        boolean bravo = foxtrot.bravo(c3211o, 3);
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof N) {
                            th = ((N) obj2).bravo();
                        } else {
                            if (obj2 instanceof C3215t) {
                                c3215t2 = (C3215t) obj2;
                            } else {
                                c3215t2 = null;
                            }
                            if (c3215t2 != null) {
                                th = c3215t2.alpha;
                            }
                        }
                        c3211o.kilo(th);
                        if (bravo) {
                            break loop0;
                        }
                        return v4;
                    }
                } else {
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C3215t) {
                        c3215t = (C3215t) obj3;
                    } else {
                        c3215t = null;
                    }
                    if (c3215t != null) {
                        th = c3215t.alpha;
                    }
                    c3211o.kilo(th);
                    return v4;
                }
            }
        }
        return c3211o;
    }

    @Override // vf.I
    public final Object gray(Pd.c cVar) {
        Object obj;
        do {
            obj = alpha.get(this);
            if (!(obj instanceof D)) {
                ad.oscar(cVar.getContext());
                return Unit.INSTANCE;
            }
        } while (red(obj) < 0);
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        c3207k.whiskey(new C3204h(2, ad.victor(this, true, new C3209m(c3207k, 1))));
        Object sierra = c3207k.sierra();
        Od.a aVar = Od.a.alpha;
        if (sierra != aVar) {
            sierra = Unit.INSTANCE;
        }
        if (sierra == aVar) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [vf.T, Af.j] */
    public final T green(D d4) {
        T foxtrot = d4.foxtrot();
        if (foxtrot == null) {
            if (d4 instanceof as) {
                return new Af.j();
            }
            if (d4 instanceof K) {
                purple((K) d4);
                return null;
            }
            throw new IllegalStateException(("State should have list: " + d4).toString());
        }
        return foxtrot;
    }

    public boolean indigo(Throwable th) {
        return false;
    }

    @Override // vf.I
    public final boolean isCancelled() {
        Object obj = alpha.get(this);
        if (!(obj instanceof C3215t)) {
            if (!(obj instanceof N) || !((N) obj).charlie()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void ivory(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void jade(I i4) {
        V v4 = V.alpha;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = purple;
        if (i4 == null) {
            atomicReferenceFieldUpdater.set(this, v4);
            return;
        }
        i4.start();
        InterfaceC3210n golf = i4.golf(this);
        atomicReferenceFieldUpdater.set(this, golf);
        if (!(alpha.get(this) instanceof D)) {
            golf.dispose();
            atomicReferenceFieldUpdater.set(this, v4);
        }
    }

    public Object juliet() {
        return cyan();
    }

    public final aq lavender(boolean z2, K k6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v4;
        boolean z10;
        Throwable th;
        C3215t c3215t;
        boolean bravo;
        N n5;
        Throwable th2;
        k6.silver = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = alpha;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z11 = obj instanceof as;
            v4 = V.alpha;
            z10 = true;
            th = null;
            if (z11) {
                as asVar = (as) obj;
                if (asVar.alpha) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k6)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                plum(asVar);
            } else if (obj instanceof D) {
                D d4 = (D) obj;
                T foxtrot = d4.foxtrot();
                if (foxtrot == null) {
                    Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    purple((K) obj);
                } else {
                    if (k6.juliet()) {
                        if (d4 instanceof N) {
                            n5 = (N) d4;
                        } else {
                            n5 = null;
                        }
                        if (n5 != null) {
                            th2 = n5.bravo();
                        } else {
                            th2 = null;
                        }
                        if (th2 == null) {
                            bravo = foxtrot.bravo(k6, 5);
                        } else if (z2) {
                            k6.kilo(th2);
                            return v4;
                        }
                    } else {
                        bravo = foxtrot.bravo(k6, 1);
                    }
                    if (bravo) {
                        break;
                    }
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return k6;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C3215t) {
                c3215t = (C3215t) obj2;
            } else {
                c3215t = null;
            }
            if (c3215t != null) {
                th = c3215t.alpha;
            }
            k6.kilo(th);
        }
        return v4;
    }

    public boolean lime() {
        return this instanceof C3202f;
    }

    public final boolean magenta(Object obj) {
        Object teal;
        do {
            teal = teal(alpha.get(this), obj);
            if (teal == ad.delta) {
                return false;
            }
            if (teal == ad.echo) {
                return true;
            }
        } while (teal == ad.foxtrot);
        romeo(teal);
        return true;
    }

    public final Object maroon(Object obj) {
        Object teal;
        C3215t c3215t;
        do {
            teal = teal(alpha.get(this), obj);
            if (teal == ad.delta) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                if (obj instanceof C3215t) {
                    c3215t = (C3215t) obj;
                } else {
                    c3215t = null;
                }
                if (c3215t != null) {
                    th = c3215t.alpha;
                }
                throw new IllegalStateException(str, th);
            }
        } while (teal == ad.foxtrot);
        return teal;
    }

    @Override // Nd.h
    public final Nd.h minusKey(Nd.g gVar) {
        return AbstractC2832z6.bravo(this, gVar);
    }

    public String navy() {
        return getClass().getSimpleName();
    }

    public final void olive(T t5, Throwable th) {
        t5.bravo(new Af.h(4), 4);
        Object obj = Af.j.alpha.get(t5);
        Intrinsics.charlie(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (Af.j jVar = (Af.j) obj; !Intrinsics.areEqual(jVar, t5); jVar = jVar.golf()) {
            if ((jVar instanceof K) && ((K) jVar).juliet()) {
                try {
                    ((K) jVar).kilo(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        AbstractC2689j6.charlie(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + jVar + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            ivory(completionHandlerException);
        }
        xray(th);
    }

    public void orange(Throwable th) {
    }

    @Override // vf.I
    public final aq papa(boolean z2, boolean z10, Function1 function1) {
        K arVar;
        if (z2) {
            arVar = new G(function1);
        } else {
            arVar = new ar(1, function1);
        }
        return lavender(z10, arVar);
    }

    public void peach(Object obj) {
    }

    public void pink() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [vf.T, Af.j] */
    public final void plum(as asVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? jVar = new Af.j();
        C3196C c3196c = jVar;
        if (!asVar.alpha) {
            c3196c = new C3196C(jVar);
        }
        do {
            atomicReferenceFieldUpdater = alpha;
            if (atomicReferenceFieldUpdater.compareAndSet(this, asVar, c3196c)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == asVar);
    }

    @Override // Nd.h
    public final Nd.h plus(Nd.h hVar) {
        return AbstractC2832z6.charlie(this, hVar);
    }

    public final void purple(K k6) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Af.j jVar = new Af.j();
        k6.getClass();
        Af.j.purple.set(jVar, k6);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = Af.j.alpha;
        atomicReferenceFieldUpdater2.set(jVar, k6);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(k6) != k6) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(k6, k6, jVar)) {
                if (atomicReferenceFieldUpdater2.get(k6) != k6) {
                    break;
                }
            }
            jVar.delta(k6);
        }
        Af.j golf = k6.golf();
        do {
            atomicReferenceFieldUpdater = alpha;
            if (atomicReferenceFieldUpdater.compareAndSet(this, k6, golf)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == k6);
    }

    @Override // vf.I
    public final CancellationException quebec() {
        Object obj = alpha.get(this);
        CancellationException cancellationException = null;
        if (obj instanceof N) {
            Throwable bravo = ((N) obj).bravo();
            if (bravo != null) {
                String concat = getClass().getSimpleName().concat(" is cancelling");
                if (bravo instanceof CancellationException) {
                    cancellationException = (CancellationException) bravo;
                }
                if (cancellationException == null) {
                    if (concat == null) {
                        concat = yankee();
                    }
                    cancellationException = new JobCancellationException(concat, bravo, this);
                }
                return cancellationException;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (!(obj instanceof D)) {
            if (obj instanceof C3215t) {
                Throwable th = ((C3215t) obj).alpha;
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    return new JobCancellationException(yankee(), th, this);
                }
                return cancellationException;
            }
            return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final int red(Object obj) {
        boolean z2 = obj instanceof as;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = alpha;
        if (z2) {
            if (!((as) obj).alpha) {
                as asVar = ad.juliet;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, asVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        return -1;
                    }
                }
                pink();
                return 1;
            }
            return 0;
        }
        if (obj instanceof C3196C) {
            T t5 = ((C3196C) obj).alpha;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, t5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            pink();
            return 1;
        }
        return 0;
    }

    public void romeo(Object obj) {
    }

    public void sierra(Object obj) {
        romeo(obj);
    }

    @Override // vf.I
    public final boolean start() {
        int red;
        do {
            red = red(alpha.get(this));
            if (red == 0) {
                return false;
            }
        } while (red != 1);
        return true;
    }

    public final Object tango(Nd.c cVar) {
        Object obj;
        int i4 = 2;
        do {
            obj = alpha.get(this);
            if (!(obj instanceof D)) {
                if (!(obj instanceof C3215t)) {
                    return ad.black(obj);
                }
                throw ((C3215t) obj).alpha;
            }
        } while (red(obj) < 0);
        L l10 = new L(J6.delta(cVar), this);
        l10.tango();
        l10.whiskey(new C3204h(i4, ad.victor(this, true, new ar(i4, l10))));
        Object sierra = l10.sierra();
        Od.a aVar = Od.a.alpha;
        return sierra;
    }

    public final Object teal(Object obj, Object obj2) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        N n5;
        boolean z2;
        C3215t c3215t;
        if (!(obj instanceof D)) {
            return ad.delta;
        }
        Throwable th = null;
        if (((obj instanceof as) || (obj instanceof K)) && !(obj instanceof C3211o) && !(obj2 instanceof C3215t)) {
            D d4 = (D) obj;
            if (obj2 instanceof D) {
                obj3 = new E((D) obj2);
            } else {
                obj3 = obj2;
            }
            do {
                atomicReferenceFieldUpdater = alpha;
                if (atomicReferenceFieldUpdater.compareAndSet(this, d4, obj3)) {
                    peach(obj2);
                    amber(d4, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == d4);
            return ad.foxtrot;
        }
        D d9 = (D) obj;
        T green = green(d9);
        if (green == null) {
            return ad.foxtrot;
        }
        if (d9 instanceof N) {
            n5 = (N) d9;
        } else {
            n5 = null;
        }
        if (n5 == null) {
            n5 = new N(green, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (n5) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = N.purple;
                if (atomicIntegerFieldUpdater.get(n5) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return ad.delta;
                }
                atomicIntegerFieldUpdater.set(n5, 1);
                if (n5 != d9) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = alpha;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, d9, n5)) {
                        if (atomicReferenceFieldUpdater2.get(this) != d9) {
                            return ad.foxtrot;
                        }
                    }
                }
                boolean charlie = n5.charlie();
                if (obj2 instanceof C3215t) {
                    c3215t = (C3215t) obj2;
                } else {
                    c3215t = null;
                }
                if (c3215t != null) {
                    n5.alpha(c3215t.alpha);
                }
                Throwable bravo = n5.bravo();
                if (!charlie) {
                    th = bravo;
                }
                objectRef.alpha = th;
                if (th != null) {
                    olive(green, th);
                }
                C3211o ochre = ochre(green);
                if (ochre != null && white(n5, ochre, obj2)) {
                    return ad.echo;
                }
                green.bravo(new Af.h(2), 2);
                C3211o ochre2 = ochre(green);
                if (ochre2 != null && white(n5, ochre2, obj2)) {
                    return ad.echo;
                }
                return coral(n5, obj2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(navy() + '{' + silver(alpha.get(this)) + '}');
        sb2.append('@');
        sb2.append(ad.romeo(this));
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0 = vf.ad.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 != vf.ad.echo) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0109, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r0 = teal(r0, new vf.C3215t(black(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0 == vf.ad.foxtrot) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r0 != vf.ad.delta) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r4 = vf.P.alpha.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if ((r4 instanceof vf.N) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if ((r4 instanceof vf.D) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        r1 = black(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
    
        r5 = (vf.D) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (gold() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r5.echo() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d1, code lost:
    
        r5 = teal(r4, new vf.C3215t(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
    
        if (r5 == vf.ad.delta) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r5 == vf.ad.foxtrot) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = vf.P.alpha.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r4).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00af, code lost:
    
        r6 = green(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
    
        if (r6 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b6, code lost:
    
        r7 = new vf.N(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        r4 = vf.P.alpha;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        if (r4.compareAndSet(r9, r5, r7) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof vf.D) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
    
        if (r4.get(r9) == r5) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c3, code lost:
    
        olive(r6, r1);
        r10 = vf.ad.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fc, code lost:
    
        r10 = vf.ad.golf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0052, code lost:
    
        r5 = (vf.N) r4;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0060, code lost:
    
        if (vf.N.silver.get(r5) != vf.ad.hotel) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0065, code lost:
    
        if (r5 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0067, code lost:
    
        r10 = vf.ad.golf;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0069, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r5 = ((vf.N) r4).charlie();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof vf.N) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0074, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0076, code lost:
    
        r1 = black(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007d, code lost:
    
        ((vf.N) r4).alpha(r1);
        r10 = ((vf.N) r4).bravo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x008a, code lost:
    
        if (r5 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008c, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008d, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0090, code lost:
    
        olive(((vf.N) r4).alpha, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0097, code lost:
    
        r10 = vf.ad.delta;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0064, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r1 = (vf.N) r0;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x007b, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009b, code lost:
    
        throw r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        if (r0 != vf.ad.delta) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        if (r0 != vf.ad.echo) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010c, code lost:
    
        if (r0 != vf.ad.golf) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (vf.N.purple.get(r1) != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010f, code lost:
    
        romeo(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0112, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean victor(Object obj) {
        Object obj2 = ad.delta;
    }

    public void whiskey(CancellationException cancellationException) {
        victor(cancellationException);
    }

    public final boolean white(N n5, C3211o c3211o, Object obj) {
        while (ad.victor(c3211o.teal, false, new M(this, n5, c3211o, obj)) == V.alpha) {
            c3211o = ochre(c3211o);
            if (c3211o == null) {
                return false;
            }
        }
        return true;
    }

    public final boolean xray(Throwable th) {
        if (!lime()) {
            boolean z2 = th instanceof CancellationException;
            InterfaceC3210n interfaceC3210n = (InterfaceC3210n) purple.get(this);
            if (interfaceC3210n != null && interfaceC3210n != V.alpha) {
                if (!interfaceC3210n.alpha(th) && !z2) {
                    return false;
                }
                return true;
            }
            return z2;
        }
        return true;
    }

    public String yankee() {
        return "Job was cancelled";
    }

    public boolean zulu(Throwable th) {
        if (!(th instanceof CancellationException)) {
            if (victor(th) && fuchsia()) {
                return true;
            }
            return false;
        }
        return true;
    }
}
