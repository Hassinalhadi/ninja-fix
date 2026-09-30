package B2;

import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class m implements Runnable {
    public final com.google.common.util.concurrent.e alpha;
    public final C3207k purple;

    public m(com.google.common.util.concurrent.e eVar, C3207k c3207k) {
        this.alpha = eVar;
        this.purple = c3207k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.e eVar = this.alpha;
        boolean isCancelled = eVar.isCancelled();
        C3207k c3207k = this.purple;
        if (isCancelled) {
            c3207k.delta(null);
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(aq.bravo(eVar)));
        } catch (ExecutionException e) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable cause = e.getCause();
            Intrinsics.checkNotNull(cause);
            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(cause)));
        }
    }
}
