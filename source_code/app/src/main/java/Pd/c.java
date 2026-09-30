package Pd;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.AbstractC3220y;
import vf.C3207k;

/* loaded from: classes2.dex */
public abstract class c extends a {

    @Nullable
    private final Nd.h _context;

    @Nullable
    private transient Nd.c<Object> intercepted;

    public c(Nd.c cVar, Nd.h hVar) {
        super(cVar);
        this._context = hVar;
    }

    @Override // Nd.c
    @NotNull
    public Nd.h getContext() {
        Nd.h hVar = this._context;
        Intrinsics.checkNotNull(hVar);
        return hVar;
    }

    @NotNull
    public final Nd.c<Object> intercepted() {
        Nd.c<Object> cVar;
        Nd.c<Object> cVar2 = this.intercepted;
        if (cVar2 == null) {
            Nd.e eVar = (Nd.e) getContext().get(Nd.d.alpha);
            if (eVar != null) {
                cVar = new Af.e((AbstractC3220y) eVar, this);
            } else {
                cVar = this;
            }
            this.intercepted = cVar;
            return cVar;
        }
        return cVar2;
    }

    @Override // Pd.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C3207k c3207k;
        Nd.c<Object> cVar = this.intercepted;
        if (cVar != null && cVar != this) {
            Nd.f fVar = getContext().get(Nd.d.alpha);
            Intrinsics.checkNotNull(fVar);
            ((AbstractC3220y) ((Nd.e) fVar)).getClass();
            Af.e eVar = (Af.e) cVar;
            do {
                atomicReferenceFieldUpdater = Af.e.f65a;
            } while (atomicReferenceFieldUpdater.get(eVar) == Af.f.bravo);
            Object obj = atomicReferenceFieldUpdater.get(eVar);
            if (obj instanceof C3207k) {
                c3207k = (C3207k) obj;
            } else {
                c3207k = null;
            }
            if (c3207k != null) {
                c3207k.papa();
            }
        }
        this.intercepted = b.alpha;
    }

    public c(Nd.c cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
