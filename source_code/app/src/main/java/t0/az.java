package t0;

import android.view.Choreographer;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class az implements Choreographer.FrameCallback {
    public final /* synthetic */ C3207k alpha;
    public final /* synthetic */ Function1 purple;

    public az(C3207k c3207k, androidx.compose.runtime.D d4, Function1 function1) {
        this.alpha = c3207k;
        this.purple = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j5) {
        Object m206constructorimpl;
        Function1 function1 = this.purple;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(function1.invoke(Long.valueOf(j5)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        this.alpha.resumeWith(m206constructorimpl);
    }
}
