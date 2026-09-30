package H0;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes3.dex */
public final class p extends Nd.a implements CoroutineExceptionHandler {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Nd.g gVar, int i4) {
        super(gVar);
        this.alpha = i4;
    }

    private final void beige(Nd.h hVar, Throwable th) {
    }

    private final void green(Nd.h hVar, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(Nd.h hVar, Throwable th) {
        int i4 = this.alpha;
    }
}
