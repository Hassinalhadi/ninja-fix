package Pd;

/* loaded from: classes2.dex */
public abstract class g extends a {
    public g(Nd.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != Nd.i.alpha) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return Nd.i.alpha;
    }
}
