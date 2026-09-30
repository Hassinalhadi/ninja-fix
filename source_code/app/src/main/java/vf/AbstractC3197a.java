package vf;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import s6.J6;

/* renamed from: vf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3197a extends P implements Nd.c, ab {
    public final Nd.h red;

    public AbstractC3197a(Nd.h hVar, boolean z2, boolean z10) {
        super(z10);
        if (z2) {
            jade((I) hVar.get(H.alpha));
        }
        this.red = hVar.plus(this);
    }

    public void a(Object obj) {
    }

    public final void b(ac acVar, AbstractC3197a abstractC3197a, Xd.l lVar) {
        Object invoke;
        int ordinal = acVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        try {
                            Nd.h hVar = this.red;
                            Object mike = Af.f.mike(hVar, null);
                            try {
                                if (!(lVar instanceof Pd.a)) {
                                    invoke = J6.echo(lVar, abstractC3197a, this);
                                } else {
                                    kotlin.jvm.internal.x.echo(2, lVar);
                                    invoke = lVar.invoke(abstractC3197a, this);
                                }
                                Af.f.foxtrot(hVar, mike);
                                if (invoke != Od.a.alpha) {
                                    resumeWith(Result.m206constructorimpl(invoke));
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                Af.f.foxtrot(hVar, mike);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (th instanceof DispatchException) {
                                th = ((DispatchException) th).getCause();
                            }
                            Result.Companion companion = Result.INSTANCE;
                            resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
                            return;
                        }
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Intrinsics.echo(lVar, "<this>");
                J6.delta(J6.alpha(abstractC3197a, this, lVar)).resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                return;
            }
            return;
        }
        Bf.a.charlie(lVar, abstractC3197a, this);
    }

    @Override // vf.ab
    public final Nd.h charlie() {
        return this.red;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.red;
    }

    @Override // vf.P
    public final void ivory(CompletionHandlerException completionHandlerException) {
        ad.uniform(this.red, completionHandlerException);
    }

    @Override // vf.P
    public final void peach(Object obj) {
        if (obj instanceof C3215t) {
            C3215t c3215t = (C3215t) obj;
            Throwable th = c3215t.alpha;
            boolean z2 = true;
            if (C3215t.bravo.get(c3215t) != 1) {
                z2 = false;
            }
            yellow(th, z2);
            return;
        }
        a(obj);
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl != null) {
            obj = new C3215t(m207exceptionOrNullimpl, false);
        }
        Object maroon = maroon(obj);
        if (maroon == ad.echo) {
            return;
        }
        sierra(maroon);
    }

    @Override // vf.P
    public final String yankee() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public void yellow(Throwable th, boolean z2) {
    }
}
