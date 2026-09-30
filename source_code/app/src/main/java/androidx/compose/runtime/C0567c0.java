package androidx.compose.runtime;

import kotlinx.coroutines.CoroutineExceptionHandler;
import vf.C3221z;

/* renamed from: androidx.compose.runtime.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0567c0 extends Nd.a implements CoroutineExceptionHandler {
    public final /* synthetic */ androidx.compose.runtime.tooling.c alpha;
    public final /* synthetic */ C0569d0 purple;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0567c0(androidx.compose.runtime.tooling.c cVar, C0569d0 c0569d0) {
        super(r0);
        C3221z c3221z = C3221z.alpha;
        this.alpha = cVar;
        this.purple = c0569d0;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(Nd.h hVar, Throwable th) {
        androidx.compose.runtime.tooling.c cVar = this.alpha;
        C0569d0 c0569d0 = this.purple;
        androidx.compose.runtime.tooling.b.alpha(th, new Yb.F(7, cVar, c0569d0));
        c0569d0.getClass();
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c0569d0.alpha.get(C3221z.alpha);
        if (coroutineExceptionHandler != null) {
            coroutineExceptionHandler.handleException(hVar, th);
            return;
        }
        throw th;
    }
}
