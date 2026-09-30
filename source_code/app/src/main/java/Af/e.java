package Af;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import vf.AbstractC3220y;
import vf.C3215t;
import vf.ad;
import vf.al;
import vf.ay;
import vf.b0;

/* loaded from: classes2.dex */
public final class e extends al implements Pd.d, Nd.c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f65a = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final AbstractC3220y silver;
    public final Pd.c teal;
    public Object white;
    public final Object yellow;

    public e(AbstractC3220y abstractC3220y, Pd.c cVar) {
        super(-1);
        this.silver = abstractC3220y;
        this.teal = cVar;
        this.white = f.alpha;
        this.yellow = f.lima(cVar.getContext());
    }

    @Override // vf.al
    public final Nd.c charlie() {
        return this;
    }

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        return this.teal;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.teal.getContext();
    }

    @Override // vf.al
    public final Object india() {
        Object obj = this.white;
        this.white = f.alpha;
        return obj;
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        Object c3215t;
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            c3215t = obj;
        } else {
            c3215t = new C3215t(m207exceptionOrNullimpl, false);
        }
        Pd.c cVar = this.teal;
        Nd.h context = cVar.getContext();
        AbstractC3220y abstractC3220y = this.silver;
        if (f.india(abstractC3220y, context)) {
            this.white = c3215t;
            this.red = 0;
            f.hotel(abstractC3220y, cVar.getContext(), this);
            return;
        }
        ay alpha = b0.alpha();
        if (alpha.purple >= 4294967296L) {
            this.white = c3215t;
            this.red = 0;
            alpha.navy(this);
            return;
        }
        alpha.peach(true);
        try {
            Nd.h context2 = cVar.getContext();
            Object mike = f.mike(context2, this.yellow);
            try {
                cVar.resumeWith(obj);
                do {
                } while (alpha.purple());
            } finally {
                f.foxtrot(context2, mike);
            }
        } catch (Throwable th) {
            try {
                golf(th);
            } finally {
                alpha.magenta(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.silver + ", " + ad.beige(this.teal) + ']';
    }
}
