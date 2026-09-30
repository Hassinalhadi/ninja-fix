package J8;

/* loaded from: classes2.dex */
public final class y implements M8.b {
    public final M8.c alpha;
    public final Kd.a bravo;
    public final M8.c charlie;
    public final Kd.a delta;

    public y(M8.c cVar, Kd.a aVar, M8.c cVar2, Kd.a aVar2) {
        this.alpha = cVar;
        this.bravo = aVar;
        this.charlie = cVar2;
        this.delta = aVar2;
    }

    @Override // Kd.a
    public final Object get() {
        return new p((B7.g) this.alpha.alpha, (N8.j) this.bravo.get(), (Nd.h) this.charlie.alpha, (D) this.delta.get());
    }
}
