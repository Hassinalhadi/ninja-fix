package xf;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.JobCancellationException;
import vf.AbstractC3197a;
import vf.ad;

/* loaded from: classes2.dex */
public final class q extends AbstractC3197a implements r, i {
    public final e silver;

    public q(Nd.h hVar, e eVar, boolean z2, boolean z10) {
        super(hVar, z2, z10);
        this.silver = eVar;
    }

    @Override // vf.AbstractC3197a
    public final void a(Object obj) {
        this.silver.hotel(null);
    }

    @Override // xf.t
    public final Object alpha() {
        return this.silver.alpha();
    }

    @Override // xf.u
    public Object bravo(Nd.c cVar, Object obj) {
        return this.silver.bravo(cVar, obj);
    }

    public boolean c(Throwable th) {
        return this.silver.juliet(th, false);
    }

    public final void d(X9.v vVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        e eVar = this.silver;
        eVar.getClass();
        do {
            atomicReferenceFieldUpdater = e.f14134c;
            if (atomicReferenceFieldUpdater.compareAndSet(eVar, null, vVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(eVar) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            Af.t tVar = g.quebec;
            if (obj == tVar) {
                Af.t tVar2 = g.romeo;
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar, tVar, tVar2)) {
                    if (atomicReferenceFieldUpdater.get(eVar) != tVar) {
                        break;
                    }
                }
                vVar.invoke(eVar.quebec());
                return;
            }
            if (obj == g.romeo) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
        }
    }

    @Override // vf.P, vf.I
    public final void foxtrot(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(yankee(), null, this);
        }
        whiskey(cancellationException);
    }

    @Override // xf.t
    public final Object india(Nd.c cVar) {
        return this.silver.india(cVar);
    }

    @Override // xf.t
    public final b iterator() {
        e eVar = this.silver;
        eVar.getClass();
        return new b(eVar);
    }

    @Override // xf.u
    public Object mike(Object obj) {
        return this.silver.mike(obj);
    }

    @Override // xf.t
    public final Object november(zf.t tVar) {
        e eVar = this.silver;
        eVar.getClass();
        Object beige = e.beige(eVar, tVar);
        Od.a aVar = Od.a.alpha;
        return beige;
    }

    @Override // vf.P
    public final void whiskey(CancellationException cancellationException) {
        this.silver.juliet(cancellationException, true);
        victor(cancellationException);
    }

    @Override // vf.AbstractC3197a
    public final void yellow(Throwable th, boolean z2) {
        if (!this.silver.juliet(th, false) && !z2) {
            ad.uniform(this.red, th);
        }
    }
}
