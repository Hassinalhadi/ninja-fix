package J8;

/* loaded from: classes2.dex */
public final class al implements M8.b {
    public final /* synthetic */ int alpha = 1;
    public final Kd.a bravo;
    public final M8.c charlie;

    public al(Kd.a aVar, M8.c cVar) {
        this.bravo = aVar;
        this.charlie = cVar;
    }

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new ak((Nd.h) this.charlie.alpha, (C1.h) this.bravo.get());
            default:
                return new N8.g((C0187b) this.bravo.get(), (Nd.h) this.charlie.alpha);
        }
    }

    public al(M8.c cVar, Kd.a aVar) {
        this.charlie = cVar;
        this.bravo = aVar;
    }
}
