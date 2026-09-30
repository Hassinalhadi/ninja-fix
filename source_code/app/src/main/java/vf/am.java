package vf;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class am {
    public static final void alpha(C3207k c3207k, Nd.c cVar, boolean z2) {
        Object foxtrot;
        h0 h0Var;
        Object obj = C3207k.yellow.get(c3207k);
        Throwable echo = c3207k.echo(obj);
        if (echo != null) {
            Result.Companion companion = Result.INSTANCE;
            foxtrot = ResultKt.createFailure(echo);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            foxtrot = c3207k.foxtrot(obj);
        }
        Object m206constructorimpl = Result.m206constructorimpl(foxtrot);
        if (z2) {
            Intrinsics.charlie(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            Af.e eVar = (Af.e) cVar;
            Pd.c cVar2 = eVar.teal;
            Nd.h context = cVar2.getContext();
            Object mike = Af.f.mike(context, eVar.yellow);
            if (mike != Af.f.charlie) {
                h0Var = AbstractC3218w.charlie(cVar2, context, mike);
            } else {
                h0Var = null;
            }
            try {
                cVar2.resumeWith(m206constructorimpl);
                if (h0Var != null && !h0Var.d()) {
                    return;
                }
                Af.f.foxtrot(context, mike);
                return;
            } catch (Throwable th) {
                if (h0Var == null || h0Var.d()) {
                    Af.f.foxtrot(context, mike);
                }
                throw th;
            }
        }
        cVar.resumeWith(m206constructorimpl);
    }
}
