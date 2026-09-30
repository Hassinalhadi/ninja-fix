package J8;

/* loaded from: classes2.dex */
public final class av implements M8.b {
    public final /* synthetic */ int alpha;
    public final Kd.a bravo;
    public final Kd.a charlie;

    public /* synthetic */ av(Kd.a aVar, Kd.a aVar2, int i4) {
        this.alpha = i4;
        this.bravo = aVar;
        this.charlie = aVar2;
    }

    @Override // Kd.a
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return new au((F) this.bravo.get(), (G) this.charlie.get());
            default:
                return new N8.j((N8.o) this.bravo.get(), (N8.o) this.charlie.get());
        }
    }
}
