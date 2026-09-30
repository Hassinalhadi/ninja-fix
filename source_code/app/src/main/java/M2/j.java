package M2;

import kotlinx.coroutines.CoroutineExceptionHandler;
import vf.C3221z;

/* loaded from: classes3.dex */
public final class j extends Nd.a implements CoroutineExceptionHandler {
    public final /* synthetic */ k alpha;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public j(k kVar) {
        super(r0);
        C3221z c3221z = C3221z.alpha;
        this.alpha = kVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(Nd.h hVar, Throwable th) {
        this.alpha.getClass();
    }
}
