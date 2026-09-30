package zf;

/* loaded from: classes2.dex */
public final class ac implements Nd.c, Pd.d {
    public final Nd.c alpha;
    public final Nd.h purple;

    public ac(Nd.c cVar, Nd.h hVar) {
        this.alpha = cVar;
        this.purple = hVar;
    }

    @Override // Pd.d
    public final Pd.d getCallerFrame() {
        Nd.c cVar = this.alpha;
        if (cVar instanceof Pd.d) {
            return (Pd.d) cVar;
        }
        return null;
    }

    @Override // Nd.c
    public final Nd.h getContext() {
        return this.purple;
    }

    @Override // Nd.c
    public final void resumeWith(Object obj) {
        this.alpha.resumeWith(obj);
    }
}
