package vf;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;

/* loaded from: classes2.dex */
public abstract class al extends Cf.i {
    public int red;

    public al(int i4) {
        super(0L, false);
        this.red = i4;
    }

    public void bravo(CancellationException cancellationException) {
    }

    public abstract Nd.c charlie();

    public Throwable echo(Object obj) {
        C3215t c3215t;
        if (obj instanceof C3215t) {
            c3215t = (C3215t) obj;
        } else {
            c3215t = null;
        }
        if (c3215t == null) {
            return null;
        }
        return c3215t.alpha;
    }

    public Object foxtrot(Object obj) {
        return obj;
    }

    public final void golf(Throwable th) {
        ad.uniform(charlie().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object india();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r4 = (vf.I) r5.get(vf.H.alpha);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        h0 h0Var;
        try {
            Nd.c charlie = charlie();
            Intrinsics.charlie(charlie, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Af.e eVar = (Af.e) charlie;
            Pd.c cVar = eVar.teal;
            Object obj = eVar.yellow;
            Nd.h context = cVar.getContext();
            Object mike = Af.f.mike(context, obj);
            I i4 = null;
            if (mike != Af.f.charlie) {
                h0Var = AbstractC3218w.charlie(cVar, context, mike);
            } else {
                h0Var = null;
            }
            try {
                Nd.h context2 = cVar.getContext();
                Object india = india();
                Throwable echo = echo(india);
                if (echo == null) {
                    int i5 = this.red;
                    boolean z2 = true;
                    if (i5 != 1 && i5 != 2) {
                        z2 = false;
                    }
                }
                if (i4 != null && !i4.echo()) {
                    CancellationException quebec = i4.quebec();
                    bravo(quebec);
                    Result.Companion companion = Result.INSTANCE;
                    cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(quebec)));
                } else if (echo != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(echo)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    cVar.resumeWith(Result.m206constructorimpl(foxtrot(india)));
                }
                if (h0Var == null || h0Var.d()) {
                    Af.f.foxtrot(context, mike);
                }
            } catch (Throwable th) {
                if (h0Var == null || h0Var.d()) {
                    Af.f.foxtrot(context, mike);
                }
                throw th;
            }
        } catch (DispatchException e) {
            ad.uniform(charlie().getContext(), e.getCause());
        } catch (Throwable th2) {
            golf(th2);
        }
    }
}
