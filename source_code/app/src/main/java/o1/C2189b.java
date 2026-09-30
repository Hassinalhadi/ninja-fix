package o1;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.ResultKt;
import vf.C3207k;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2189b extends AtomicBoolean implements OutcomeReceiver {
    public final C3207k alpha;

    public C2189b(C3207k c3207k) {
        super(false);
        this.alpha = c3207k;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            C3207k c3207k = this.alpha;
            Result.Companion companion = Result.INSTANCE;
            c3207k.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.alpha.resumeWith(Result.m206constructorimpl(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
