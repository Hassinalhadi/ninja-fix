package Bf;

import Af.f;
import Nd.c;
import Xd.l;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlinx.coroutines.DispatchException;
import s6.J6;
import vf.AbstractC3197a;

/* loaded from: classes2.dex */
public abstract class a {
    public static final void alpha(c cVar, Throwable th) {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        cVar.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final void bravo(c cVar, AbstractC3197a abstractC3197a) {
        try {
            c delta = J6.delta(cVar);
            Result.Companion companion = Result.INSTANCE;
            f.golf(delta, Result.m206constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            alpha(abstractC3197a, th);
            throw null;
        }
    }

    public static final void charlie(l lVar, AbstractC3197a abstractC3197a, AbstractC3197a abstractC3197a2) {
        try {
            c delta = J6.delta(J6.alpha(abstractC3197a, abstractC3197a2, lVar));
            Result.Companion companion = Result.INSTANCE;
            f.golf(delta, Result.m206constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            alpha(abstractC3197a2, th);
            throw null;
        }
    }
}
